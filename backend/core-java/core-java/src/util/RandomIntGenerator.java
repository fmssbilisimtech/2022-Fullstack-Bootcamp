/*----------------------------------------------------------------------------------------------------------------------
   RandomIntGenerator sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.IntSupplier;

public class RandomIntGenerator implements Iterable<Integer> {
    private final int m_count;
    private final IntSupplier m_supplier;

    public RandomIntGenerator(int count, int min, int max)
    {
        this(new Random(), count, min, max);
    }

    public RandomIntGenerator(Random random, int count, int min, int max)
    {
        this(count, () -> random.nextInt(max - min) + min);
    }

    public RandomIntGenerator(int count, IntSupplier supplier)
    {
        m_count = count;
        m_supplier = supplier;
    }

    public int getCount()
    {
        return m_count;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<>() {
            private int m_count = -1;

            @Override
            public boolean hasNext()
            {
                return m_count + 1 < RandomIntGenerator.this.m_count;
            }

            @Override
            public Integer next()
            {
                if (!hasNext())
                    throw new NoSuchElementException("No value to generate");

                ++m_count;
                return m_supplier.getAsInt();
            }
        };
    }
}
