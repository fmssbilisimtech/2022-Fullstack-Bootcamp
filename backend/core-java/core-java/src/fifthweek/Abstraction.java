package fifthweek;

public class Abstraction { }

/*----------------------------------------------------------------------------------------------------------------------
    Bazı durumlarda bir sınıf bir kavramı soyut olarak temsil ediyor olabilir. Bu durumda sınıfın tek başına
    anlamı yoktur. Yani nesne yönelimli programlama bakış açısıyla o sınıf türünden nesnenin anlamı yoktur. Ancak
    o sınıftan türeyen sınıfların nesne olarak anlamı vardır. Bu tarz sınıflara soyut (abstract) sınıflar denir.
    Soyut olmayan sınıflara da somut (concrete) sınıflar denir. Bu tip durumlarda sınıfın soyut (abstract) bildirilmesi
    daha uygundur.Örneğin CompanyApp uygulamasında Employee sınıfı tek başına anlamlı değildir ancak soyut olarak
    "çalışan kavramını" temsil eder. Employee sınıfından türetilen sınıflar nesne olarak anlamlıdır. Yani Employee
    sınıfından türemil olan sınıflar somut (concrete) sınıflardır.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Soyut bir sınıf abstract anahtar sözcüğü ile bildirilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//abstract class Sample {
//    //...
//}
















/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıfın abstract metotları olabilir. abstract metotlar gövdesi olmayan metotlardır. Bu metotlara gövde yazımı
    error oluşturur. abstract metotlar abstract anahtar sözcüğü ile bildirilir. Bu metotlar sanaldır. Dolayısıyla
    override edilebilir. En az bir tane abstract metodu olan bir sınıf abstract olarak bildirilmelidir.
    Aksi durumda error oluşur. Dikkat edilirse abstract bir sınıfın abstract bir metodu olmak zorunda değildir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//abstract class A {
//    public abstract void foo() //error
//    {
//    }
//
//}
//
//class Mample { //error
//    public abstract void bar();
//}
//
//abstract class Sample {
//    public abstract void foo();
//    public abstract void tar();
//
//    public void bar()
//    {}
//}
//
//abstract class Test {
//    //...
//}
















/*----------------------------------------------------------------------------------------------------------------------
    abstract sınıf türünden bir nesne new operatörü ile yaratılamaz. new işlemi sınıf içerisinde de yapılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(); //error
//    }
//}
//
//abstract class Sample {
//    public abstract void foo();
//    public abstract void tar();
//
//    public void bar()
//    {
//        Sample s = new Sample(); //error
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
    abstract sınıfların da non-static veri elemanları olabilir. abstract sınıfların abstract olmayan metotları da
    olabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//abstract class Sample {
//    private int m_x;
//    public abstract void foo();
//    public abstract void tar();
//
//    public void bar()
//    {
//
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    abstract bir sınıftan türetilmiş olan bir sınıf taban sınıfının en az bir tane abstract metodunu override etmezse
    türemiş sınıf da abstract olarak bildirilmek zorundadır. Sınıf içerisinde hiç abstract metot kalmadıysa bu durumda
    sınıf concrete olabilir. Şüphesiz aşağıdaki örnekte E sınıfının A'nın tüm metotlarını override etmiş olmasına
    rağmen conrete olma zorunluluğu yoktur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//abstract class E extends A {
//    public void foo()
//    {
//        //...
//    }
//
//    public void bar()
//    {
//        //...
//    }
//}
//
//class C extends A {
//    public void foo()
//    {
//        //...
//    }
//    public void bar()
//    {
//        //...
//    }
//}
//
//abstract class D extends A {
//    public void foo()
//    {
//        //...
//    }
//}
//
//class B extends A { //error
//    public void foo()
//    {
//        //...
//    }
//}
//
//abstract class A {
//    public abstract void foo();
//    public abstract void bar();
//    //...
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki durumda C sınıfında artık hiç abstract metot kalmadığından concrete olabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class C extends B {
//    public void bar()
//    {
//        //...
//    }
//}
//
//abstract class B extends A {
//    public void foo()
//    {
//        //...
//    }
//}
//
//abstract class A {
//    public abstract void foo();
//    public abstract void bar();
//    //...
//}



























/*----------------------------------------------------------------------------------------------------------------------
    abstract sınıf referanslarının taban sınıf referansı olarak kullanımı anlamlıdır. Bu durumda polymoprhism' de
    abstract sınıflarla yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new C();
//
//        x.foo();
//        x.bar();
//    }
//}
//
//class C extends B {
//    public void bar()
//    {
//        System.out.println("C.bar");
//    }
//}
//
//abstract class B extends A {
//    public void foo()
//    {
//        System.out.println("B.foo");
//    }
//}
//
//abstract class A {
//    public abstract void foo();
//    public abstract void bar();
//}


































/*----------------------------------------------------------------------------------------------------------------------
    abstract sınıflarda ctor olabilir. abstract sınıfların ctor'larının public yapılması anlamsızdır. public yerine
    protected yapılması okunabilirlik açısından daha uygundur. private ve no-modifier erişimcilerin ctor açısından
    anlamı olabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B(10, 20);
//
//        //..
//    }
//}
//
//class B extends A {
//    private int m_y;
//
//    public B(int x, int y)
//    {
//        super(x);
//        m_y = y;
//    }
//
//    public void foo()
//    {
//
//    }
//}
//
//abstract class A {
//    private int m_x;
//
//    private A()
//    {
//        //...
//    }
//
//    protected A(int x)
//    {
//        this();
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
//
//    public abstract void foo();
//}

































/*----------------------------------------------------------------------------------------------------------------------
    CompanyApp örneğindeki Employee sınıfının calculatePayment metodunun abstract yapılması daha uygundur. Ayrıca
    ctor'u da protected yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

// abstract class Employee {
//    private String m_citizenId;
//    private String m_name;
//    private String m_address;
//    //...
//
//    protected Employee(String citizenId, String name, String address)
//    {
//        //...
//        m_citizenId = citizenId;
//        m_name = name;
//        m_address = address;
//    }
//
//    public String getCitizenId()
//    {
//        return m_citizenId;
//    }
//
//    public void setCitizenId(String citizenId)
//    {
//        m_citizenId = citizenId;
//    }
//
//    public String getName()
//    {
//        return m_name;
//    }
//
//    public void setName(String name)
//    {
//        m_name = name;
//    }
//
//    public String getAddress()
//    {
//        return m_address;
//    }
//
//    public void setAddress(String address)
//    {
//        m_address = address;
//    }
//
//    public abstract double calculatePayment();
//    //...
//}
