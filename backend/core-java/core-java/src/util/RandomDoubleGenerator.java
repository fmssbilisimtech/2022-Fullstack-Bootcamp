/*----------------------------------------------------------------------------------------------------------------------
   RandomDoubleGenerator sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.DoubleSupplier;

public class RandomDoubleGenerator implements Iterable<Double> {
    private final int m_count;
    private final DoubleSupplier m_supplier;

    public RandomDoubleGenerator(int count, double min, double max)
    {
        this(new Random(), count, min, max);
    }

    public RandomDoubleGenerator(Random random, int count, double min, double max)
    {
        this(count, () -> random.nextDouble() * (max - min) + min);
    }

    public RandomDoubleGenerator(int count, DoubleSupplier supplier)
    {
        m_count = count;
        m_supplier = supplier;
    }

    public int getCount()
    {
        return m_count;
    }

    @Override
    public Iterator<Double> iterator()
    {
        return new Iterator<>() {
            private int m_count = -1;

            @Override
            public boolean hasNext()
            {
                return m_count + 1 < RandomDoubleGenerator.this.m_count;
            }

            @Override
            public Double next()
            {
                if (!hasNext())
                    throw new NoSuchElementException("No value to generate");

                ++m_count;
                return m_supplier.getAsDouble();
            }
        };
    }
}
