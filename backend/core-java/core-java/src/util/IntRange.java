package util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;

public class IntRange implements Iterable<Integer> {
    private final int m_min;
    private final int m_max;
    private final IntUnaryOperator m_intUnaryOperator;

    private IntRange(int min, int max, IntUnaryOperator intUnaryOperator)
    {
        if (min > max)
            throw new IllegalArgumentException("Invalid Arguments");

        m_min = min;
        m_max = max;
        m_intUnaryOperator = intUnaryOperator;
    }

    public static IntRange of(int min, int max)
    {
        return of(min, max, 1);
    }


    public static IntRange of(int min, int max, int step)
    {
        return ofClosed(min, max - 1, step);
    }

    public static IntRange of(int min, int max, IntUnaryOperator intUnaryOperator)
    {
        return ofClosed(min, max - 1, intUnaryOperator);
    }

    public static IntRange ofClosed(int min, int max)
    {
        return ofClosed(min, max, 1);
    }

    public static IntRange ofClosed(int min, int max, int step)
    {
        return ofClosed(min, max, (step <= 1) ? (val -> val + 1) : (val -> val + step));
    }

    public static IntRange ofClosed(int min, int max, IntUnaryOperator intUnaryOperator)
    {
        return new IntRange(min, max, intUnaryOperator);
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
            int m_val = m_min;

            @Override
            public boolean hasNext()
            {
                return m_val <= m_max;
            }

            @Override
            public Integer next()
            {
                if (!hasNext())
                    throw new NoSuchElementException("No such value");

                int val = m_val;

                m_val = m_intUnaryOperator.applyAsInt(m_val);

                return val;
            }
        };
    }
}
