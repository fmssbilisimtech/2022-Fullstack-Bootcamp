package fifthweek;

public class FluentPattern { }

/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıfın metotlarının aynı nesnenin referansı üzerinden zincir biçiminde aşağıdaki gibi çağrılabilmesi
    için sınıfın tasarımında this referansı kullanılmalıdır (fluent pattern)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample s = new Sample();
//
//        s.foo(19).bar(45).tar(3).zar(6).foo(7);
//
//        System.out.println(s.getVal());
//    }
//}
//
//class Sample {
//    private int m_val;
//
//    public int getVal()
//    {
//        return m_val;
//    }
//
//    public Sample foo(int val)
//    {
//        m_val += val;
//
//        return this;
//    }
//
//    public Sample bar(int val)
//    {
//        m_val *= val;
//
//        return this;
//    }
//
//    public Sample tar(int val)
//    {
//        m_val /= val;
//
//        return this;
//    }
//
//    public Sample zar(int val)
//    {
//        foo(-val);
//
//        return this;
//    }
//}
