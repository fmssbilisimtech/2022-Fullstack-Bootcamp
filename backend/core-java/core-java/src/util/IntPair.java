/*----------------------------------------------------------------------------------------------------------------------
	Pair sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

public final class IntPair {
    private final int m_first;
    private final int m_second;

    public static IntPair create(int first, int second)
    {
        return new IntPair(first, second);
    }

    public IntPair(int first, int second)
    {
        m_first = first;
        m_second = second;
    }

    public int getFirst()
    {
        return m_first;
    }

    public int getSecond()
    {
        return m_second;
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof IntPair && m_first == ((IntPair)obj).m_first && m_second == ((IntPair)obj).m_second;
    }

    @Override
    public String toString()
    {
        return String.format("{first : %d, second : %d}", m_first, m_second);
    }
}
