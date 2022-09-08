package fifthweek;

public class MutableIntApp { }

/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte MutableIntValue sınıfı zincir çağırmaya uygun olarak yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/


class App {
    public static void main(String[] args)
    {
        MutableIntValue mutableIntValue = new MutableIntValue();

        mutableIntValue.setVal(10).add(20).multiply(4).increment();

        System.out.println(mutableIntValue.getVal());
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    MutableIntValue sınıfı
----------------------------------------------------------------------------------------------------------------------*/


 final class MutableIntValue {
    private int m_val;

    public MutableIntValue()
    {}
    public MutableIntValue(int val)
    {
        m_val = val;
    }

    public int getVal()
    {
        return m_val;
    }

    public MutableIntValue setVal(int val)
    {
        m_val = val;

        return this;
    }

    public int compareTo(MutableIntValue other)
    {
        return m_val - other.m_val;
    }

    public MutableIntValue add(int val)
    {
        m_val += val;

        return this;
    }

    public MutableIntValue add(MutableIntValue intValue)
    {
        return this.add(intValue.m_val);
    }

    public MutableIntValue subtract(int val)
    {
        return this.add(-val);
    }

    public MutableIntValue subtract(MutableIntValue intValue)
    {
        return this.subtract(intValue.m_val);
    }


    public MutableIntValue multiply(int val)
    {
        m_val *= val;

        return this;
    }

    public MutableIntValue mul(MutableIntValue intValue)
    {
        return this.multiply(intValue.m_val);
    }

    public MutableIntValue increment()
    {
        return this.add(1);
    }

    public MutableIntValue decrement()
    {
        return this.subtract(1);
    }

    public String toString()
    {
        return m_val + "";
    }
}
