package thirdweek;

public class SingletonEager { }

/*----------------------------------------------------------------------------------------------------------------------
	Singleton kalıbının bir implementasyonu (eager implementation)
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        Singleton s1 = Singleton.INSTANCE;
//        Singleton s2 = Singleton.INSTANCE;
//
//        System.out.println(s1 == s2);
//
//        s1.setA(10);
//
//        System.out.println(s2.getA());
//    }
//}
//
//class Singleton {
//    public static final Singleton INSTANCE = new Singleton();
//    private int m_a;
//
//    private Singleton()
//    {}
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