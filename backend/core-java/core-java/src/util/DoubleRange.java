/*----------------------------------------------------------------------------------------------------------------------
   DoubleRange sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

import java.util.Iterator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;

public final class DoubleRange implements Iterable<Double> {
    private final double m_min;
    private final double m_max;
    private final DoubleUnaryOperator m_doubleUnaryOperator;

    public DoubleRange(double min, double max, double step)
    {
        this (min, max, (step <= 0 ? (val -> val + 1) : (val -> val + step)));
    }

    public DoubleRange(double min, double max, DoubleUnaryOperator doubleUnaryOperator)
    {
        if (min >= max)
            throw new IllegalArgumentException("Illegal arguments");

        m_min = min;
        m_max = max;
        m_doubleUnaryOperator = doubleUnaryOperator;
    }


    public double getMin()
    {
        return m_min;
    }

    public double getMax()
    {
        return m_max;
    }

    @Override
    public Iterator<Double> iterator()
    {
        return new Iterator<>() {
            private double m_curVal = m_min;

            @Override
            public boolean hasNext()
            {
                return m_curVal < m_max;
            }

            @Override
            public Double next()
            {
                if (!hasNext())
                    throw new IllegalArgumentException("No such value");

                double val = m_curVal;

                m_curVal = m_doubleUnaryOperator.applyAsDouble(m_curVal);

                return val;
            }
        };
    }


    public static DoubleRange of(double s1, double s2, double s3)
    {
        return new DoubleRange(1, 10, s -> 10);
    }
}
