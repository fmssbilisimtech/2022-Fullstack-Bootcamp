/*----------------------------------------------------------------------------------------------------------------------
    IntRangeClosed sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;

public final class IntRangeClosed implements Iterable<Integer> {
    private final int m_min;
    private final int m_max;
    private final IntUnaryOperator m_intUnaryOperator;

    public IntRangeClosed(int min, int max)
    {
        this(min, max, 1);
    }

    public IntRangeClosed(int min, int max, int step)
    {
        this(min, max, (step < 1) ? (val -> val + 1) : (val -> val + step));
    }

    public IntRangeClosed(int min, int max, IntUnaryOperator intUnaryOperator)
    {
        if (min > max)
            throw new IllegalArgumentException("Illegal arguments");

        m_min = min;
        m_max = max;
        m_intUnaryOperator = intUnaryOperator;
    }

    public int getMin()
    {
        return m_min;
    }

    public int getMax()
    {
        return m_max;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<>() {
            private int m_curVal = m_min;

            @Override
            public boolean hasNext()
            {
                return m_curVal <= m_max;
            }

            @Override
            public Integer next()
            {
                if (!hasNext())
                    throw new NoSuchElementException("No such value");

                int val = m_curVal;

                m_curVal = m_intUnaryOperator.applyAsInt(m_curVal);

                return val;
            }
        };
    }
}
