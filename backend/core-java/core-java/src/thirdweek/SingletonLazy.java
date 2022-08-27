package thirdweek;

public class SingletonLazy { }
/*----------------------------------------------------------------------------------------------------------------------
	Singleton kalıbının bir implementasyonu (lazy implementation)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Singleton s1 = Singleton.getInstance(10);
//        Singleton s2 = Singleton.getInstance(20);
//
//        System.out.println(s1 == s2);
//
//        System.out.println(s1.getA());
//        System.out.println(s2.getA());
//    }
//}
//
//class Singleton {
//    private static Singleton ms_instance;
//    private int m_a;
//
//    private Singleton()
//    {
//    }
//
//    public static Singleton getInstance()
//    {
//        return getInstance(0);
//    }
//
//    public static Singleton getInstance(int a)
//    {
//        if (ms_instance == null)
//            ms_instance = new Singleton();
//
//        ms_instance.m_a = a;
//        return ms_instance;
//    }
//
//    public int getA()
//    {
//        return m_a;
//    }
//
//    public void setA(int a)
//    {
//        //...
//        m_a = a;
//    }
//}
