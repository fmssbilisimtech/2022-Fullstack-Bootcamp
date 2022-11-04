/*----------------------------------------------------------------------------------------------------------------------
	Unit sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

public final class Unit<T> {
    private final T m_t;

    public static <T> Unit<T> create(T t)
    {
        return new Unit<>(t);
    }
    public Unit(T t)
    {
        m_t = t;
    }

    public T getT()
    {
        return m_t;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj)
    {
        return m_t.equals(((Unit<T>)obj).m_t);
    }

    @Override
    public String toString()
    {
        return String.format("%s", m_t);
    }
}
