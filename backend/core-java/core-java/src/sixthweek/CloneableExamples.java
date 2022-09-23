package sixthweek;

public class CloneableExamples { }

/*----------------------------------------------------------------------------------------------------------------------
    Nesne Klonlanması: Bir nesnenin o anki durumunun (state) kopyasının çıkartılmasına klonlama denir. Klonlama işleminden
    sonra her iki nesne de ayrı nesneler olarak yaşamaya devam ederler.

    Bir nesnenin kopyası kendisi tarafından çıkartılabilir. Çünkü sınıfın private veri elemanları olabilir. Bu
    elemanların da kopyasının çıkartılması gerekir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Cloneable arayüzü: Bu arayüz bir nesnenin klonlanabileceğini belirtir. Bu arayüzü destekleyen sınıflar clone
	isimli bir metodu yazarlar. Aslında Cloneable arayüzü işaretleme arayüzüdür. Maaalesef bu yanlış bir tasarımdır.
	Bu arayüzü destekleyen sınıflar Object sınıfının içerisinde protected olarak bildirilmiş clone metodunu override
	ederler. clone metodu zorunlu olmasa da Cloneable arayüzünü destekleyen sınıflar için public override edilmelidir.
	Bunun prtaikte istisnası yoktur ve olmamalıdır
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Basit bir klonlama işlemi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(10);
//
//        System.out.println("s:");
//        s.foo();
//        System.out.printf("s.x=%d%n", s.getX());
//
//        Sample clone = (Sample) s.clone();
//
//        System.out.println("clone:");
//        clone.foo();
//        System.out.printf("clone.x=%d%n", clone.getX());
//
//        System.out.println("s:");
//        s.foo();
//        System.out.printf("s.x=%d%n", s.getX());
//    }
//}
//
//class Sample implements Cloneable {
//    private final int m_x;
//    private boolean m_flag;
//
//    public Sample(int x)
//    {
//        m_x = x;
//    }
//
//    public int getX() {return m_x;}
//
//    public void foo()
//    {
//        System.out.printf("Before:m_flag=%b%n", m_flag);
//        m_flag = !m_flag;
//        System.out.printf("After:m_flag=%b%n", m_flag);
//    }
//
//    public Object clone()
//    {
//        Sample s = new Sample(m_x);
//
//        s.m_flag = m_flag;
//
//        return s;
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf içerisinde bir referans bildirilmişse kopyalama işlemi iki şekilde yapılabilir: sığ (shallow) kopyalama,
	derin (deep) kopyalama

	Kopyalanacak nesneye ilişin sınıfın içinde bulunan referansa ilişkin nesnenin kopyası çıkartılmıyor ise sığ kopyalama,
	çıkartılıyor ise derin kopyalamadır.

	Derin kopyalama yapabilmek için içerde tutulan referansa ilişkin sınıfın da Cloneable olması gerekir.

	Sınıf tasarımında clone metoduna bakılarak kopyalamanın derin veya sığ olup olmadığı anlaşılamaz. Bu durum
	sınıfın clone metodunun dökümantasyonuna bakılarak anlaşılabilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Basit bir sığ kopyalama (shallow copy) örneği
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A(10);
//        B b = new B(23, a);
//
//        B clone = (B) b.clone();
//
//        System.out.printf("b.a.x=%d%n", b.getA().getX());
//        System.out.printf("clone.a.x=%d%n", clone.getA().getX());
//        System.out.printf("b.y=%d%n", b.getY());
//        System.out.printf("clone.y=%d%n", clone.getY());
//
//        b.getA().setX(45);
//        b.setY(89);
//
//        System.out.println("**************");
//        System.out.printf("b.a.x=%d%n", b.getA().getX());
//        System.out.printf("clone.a.x=%d%n", clone.getA().getX());
//        System.out.printf("b.y=%d%n", b.getY());
//        System.out.printf("clone.y=%d%n", clone.getY());
//    }
//}
//
//class B implements Cloneable {
//    private int m_y;
//    private A m_a;
//
//    public B(int y, A a)
//    {
//        m_y = y;
//        m_a = a;
//    }
//
//    public int getY()
//    {
//        return m_y;
//    }
//
//    public void setY(int y)
//    {
//        m_y = y;
//    }
//
//    public A getA()
//    {
//        return m_a;
//    }
//
//    public void setA(A a)
//    {
//        m_a = a;
//    }
//
//    public Object clone()
//    {
//        B b = new B(m_y, m_a);
//
//        return b;
//    }
//}
//
//class A {
//    private int m_x;
//
//    public A(int x)
//    {
//        m_x = x;
//    }
//
//    public int getX()
//    {
//        return m_x;
//    }
//
//    public void setX(int x)
//    {
//        m_x = x;
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Basit bir derin kopyalama (deep copy) örneği
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A(10);
//        B b = new B(23, a);
//
//        B clone = (B)b.clone();
//
//        System.out.printf("b.a.x=%d%n", b.getA().getX());
//        System.out.printf("clone.a.x=%d%n", clone.getA().getX());
//        System.out.printf("b.y=%d%n", b.getY());
//        System.out.printf("clone.y=%d%n", clone.getY());
//
//        b.getA().setX(45);
//        b.setY(89);
//
//        System.out.println("**************");
//        System.out.printf("b.a.x=%d%n", b.getA().getX());
//        System.out.printf("clone.a.x=%d%n", clone.getA().getX());
//        System.out.printf("b.y=%d%n", b.getY());
//        System.out.printf("clone.y=%d%n", clone.getY());
//    }
//}
//
//class B implements Cloneable {
//    private int m_y;
//    private A m_a;
//
//    public B(int y, A a)
//    {
//        m_y = y;
//        m_a = a;
//    }
//
//    public int getY()
//    {
//        return m_y;
//    }
//
//    public void setY(int y)
//    {
//        m_y = y;
//    }
//
//    public A getA()
//    {
//        return m_a;
//    }
//
//    public void setA(A a)
//    {
//        m_a = a;
//    }
//
//    public Object clone()
//    {
//        B b = new B(m_y, (A)m_a.clone());
//
//        return b;
//    }
//}
//
//class A implements Cloneable {
//    private int m_x;
//
//    public A(int x)
//    {
//        m_x = x;
//    }
//
//    public int getX()
//    {
//        return m_x;
//    }
//
//    public void setX(int x)
//    {
//        m_x = x;
//    }
//    public Object clone()
//    {
//        return new A(m_x);
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
	clone metodu aşağıdaki gibi override edilirse (covariant return type) downcasting yapılmadan da çağrılabilir.
	Ancak bu yaklaşım Java' da çok tercih edilmez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(10);
//
//        System.out.println("s:");
//        s.foo();
//
//        Sample clone = s.clone();
//
//        System.out.println("clone:");
//        clone.foo();
//
//        System.out.println("s:");
//        s.foo();
//    }
//}
//
//class Sample implements Cloneable {
//    private final int m_x;
//    private boolean m_flag;
//
//    public Sample(int x)
//    {
//        m_x = x;
//    }
//
//    public int getX() {return m_x;}
//
//    public void foo()
//    {
//        System.out.printf("Before:m_flag=%b%n", m_flag);
//        m_flag = !m_flag;
//        System.out.printf("After:m_flag=%b%n", m_flag);
//    }
//
//    public Sample clone()
//    {
//        Sample s = new Sample(m_x);
//
//        s.m_flag = m_flag;
//
//        return s;
//    }
//}