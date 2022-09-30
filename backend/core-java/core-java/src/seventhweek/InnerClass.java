package seventhweek;

import util.Console;

public class InnerClass {}


/*----------------------------------------------------------------------------------------------------------------------
    Java'da içiçe tür bildirimleri (nested types):
    Java'da içiçe tür bildirimleri yapılabilir. Burada öncelikle sınıf içerisinde sınıf bildirimleri ele alınacaktır.
    Java'da 4(dört) şekilde sınıf içerisinde sınıf bildirimi yapılabilir:
    1. static sınıf bildirimi (nested class)
    2. non-static sınıf bildirimi (inner class)
    3. Yerel sınıflar (local classes)
    4. Anonim sınıflar (anonymous classes)

    Anahtar Notlar: Bunlar dışında Java 8 ile birlikte eklenen ve fonksiyonel programlama tekniğinin Java'da daha gelişmiş
    ve okunabilir olarak yapılabilmesini sağlayan "Lambda ifadeleri ve metot referansları" konusu ileride ele alınacaktır

    Anahtar Notlar: Hiçbir tür içerisinde bulunmayan yani bir paket içerisinde bulunan bir sınıfa "top-level class" denir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    "top-level" sınıflar static olarak bildirilemezler
----------------------------------------------------------------------------------------------------------------------*/

//static class Sample { //error
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıf içerisinde başka bir sttatic olarak bildirilebilir. Bu durumda içteki sınıf dıştaki sınıfın bir
    elemanıdır (member.) Dolayısıyla sınıfın bir elamanı static olabileceğinden (ctor hariç) içteki sınıf da static
    olarak bildirilebilir. Sınıfın tüm elamanlarının erişim belirleyicileri olabildiğine göre içteki sınıfın da
    bildiriminde erişim belirliyiciler kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class A {
//    public static class B {
//        //...
//    }
//
//    private static class C {
//        //...
//    }
//
//    protected static class D {
//        //...
//    }
//
//    static class E {
//        //...
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    static sınıflarında elemanları olabilir. static bir sınıfa ait olduğu sınıf dışından ait olduğu sınıf isme ve nokta
    operatörü ile erişilebilir. Şüphesiz erişim belileryecinin nuna uygun olması gerekir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A.B b = new A.B();
//
//        b.x = 10;
//        b.foo();
//        A.B.tar();
//    }
//}
//
//class A {
//    public static class B {
//        private void bar()
//        {
//            Console.writeLine("A.B.foo");
//        }
//
//        public int x;
//
//        public void foo()
//        {
//            bar();
//            Console.writeLine("A.B.foo");
//        }
//
//        public static void tar()
//        {
//            Console.writeLine("A.B.tar");
//        }
//
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    static sınıflar static elemanlar olduklarından import static bildirimi ile isimleri niteliksiz olarak kullanılabilir.
    Ancak bu durumda "top-level class" gibi erişildiğinden okunabilirliğin bozulmamasına dikkat etmek gerekir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        B b = new B();
//
//        b.x = 10;
//        b.foo();
//        B.tar();
//    }
//}
//
//class A {
//    public static class B {
//        private void bar()
//        {
//            Console.writeLine("A.B.foo");
//        }
//
//        public int x;
//
//        public void foo()
//        {
//            bar();
//            Console.writeLine("A.B.foo");
//        }
//
//        public static void tar()
//        {
//            Console.writeLine("A.B.tar");
//        }
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
    Kapsayan sınıf içerisinde static sınıfının elemanlarına erişilebilir
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        A a = new A();
//
//        a.foo(10);
//    }
//}
//
//class A {
//    public void foo(int a)
//    {
//        B b = new B();
//
//        b.x = a;
//
//        b.bar();
//        B.tar();
//    }
//
//    private static class B {
//        public int x;
//
//        public void bar()
//        {
//            Console.writeLine("A.B.bar");
//            Console.writeLine("x = %d", x);
//        }
//
//        public static void tar()
//        {
//            Console.writeLine("A.B.tar");
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Kapsayan sınıf içerisinde static sınıfının private elemanlarına da erişilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A a = new A();
//
//        a.foo(10);
//    }
//}
//
//class A {
//    public void foo(int a)
//    {
//        B b = new B();
//
//        b.m_x = a;
//
//        b.bar();
//        B.tar();
//    }
//
//    public static class B {
//        private int m_x;
//
//        private void bar()
//        {
//            Console.writeLine("A.B.bar");
//            Console.writeLine("m_x = %d", m_x);
//        }
//
//        public static void tar()
//        {
//            Console.writeLine("A.B.tar");
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    static sınıf içerisinde ait olduğu sınıfın private elemanlarına erişilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A.B b = new A.B();
//
//        b.bar(10);
//    }
//}
//
//class A {
//    private int m_x;
//
//    private void foo(int a)
//    {
//        Console.writeLine("A.foo");
//    }
//
//    public static class B {
//        private int m_x;
//
//        public void bar(int val)
//        {
//            Console.writeLine("A.B.bar");
//            m_x = val;
//            Console.writeLine("B.m_x = %d", m_x);
//
//            A a = new A();
//
//            a.foo(10);
//            a.m_x = 2 * m_x;
//
//            Console.writeLine("A.m_x = %d", a.m_x);
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte bar metodu niteliksiz olarak arandığından A sınıfında bulunue ve problem oluşmaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A.B b = new A.B();
//
//        b.foo(10);
//    }
//}
//
//class A {
//    private static void bar()
//    {
//        Console.writeLine("A.bar");
//    }
//
//    public static class B {
//        public void foo(int val)
//        {
//            Console.writeLine("A.B.foo");
//            bar();
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki durumda B sınıfının foo metodu kendisini çağırdığından exception oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A.B b = new A.B();
//
//        b.foo(10);
//    }
//}
//
//class A {
//    private static void foo(int val)
//    {
//        Console.writeLine("A.foo");
//    }
//
//    public static class B {
//        public void foo(int val)
//        {
//            Console.writeLine("A.B.foo");
//            foo(10);
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki kodda A sınıfının foo metodu aşağıdaki gibi çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A.B b = new A.B();
//
//        b.foo(10);
//    }
//}
//
//class A {
//    private static void foo(int val)
//    {
//        Console.writeLine("A.foo");
//    }
//
//    public static class B {
//        public void foo(int val)
//        {
//            Console.writeLine("A.B.foo");
//            A.foo(10);
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte Android programlamada kullanılan R sınıfı ve içerisinde bulunan static sınıflar simüle
    edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Context context = new Context();
//
//        Toast.makeText(context, R.string.warning, Toast.LENGTH_LONG).show();
//    }
//}
//
//class Context {
//    //...
//}
//
//class Toast {
//    public static final int LENGTH_LONG = 1;
//    public static final int LENGTH_SHORT = -2;
//
//    public static Toast makeText(Context context, int resId, int duration)
//    {
//        ///...
//        return new Toast();
//    }
//
//    public void show()
//    {
//        //...
//    }
//}
//
//class R {
//    public static class id {
//        public static int mainActivityButtonOK = 0x1234;
//        public static int mainActivityTextViewName = 0x12345;
//    }
//
//    public static class drawable {
//        public static final int myShip = 0x1FC0;
//        //...
//    }
//
//    public static class string {
//        public static final int warning = 0x1FC1;
//    }
//
//    //...
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıf içerisinde non-static bildirilmiş bir sınıf olabilir (inner class)
----------------------------------------------------------------------------------------------------------------------*/

//class A {
//    public class B {
//        //...
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
    Bir inner class içerisinde static elemanlar bildirilemez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//
//    }
//}
//
//class A {
//    public class B {
//        public static int a; //error
//        public static void foo() //error
//        {
//            //...
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Bir inner class türünden nesne sınıf dışından static sınıflarda olduğu gibi yaratılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A.B x = new A.B(); //error:
//    }
//}
//
//class A {
//    public class B {
//        //...
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    inner class türünde bir nesne kapsadığı sınıf dışında <referans>.new sentaksı ile yaratılabilir. Burada x kapsayan
    sınıf türünden bir referanstır. Şüphesiz bu referansı bir nesne göstermesi gerekir. Yani inner class türünden nesne
    yaratılabilmesi için kapsayan sınıf türünden bir nesnenin olması gerekir. Daha açık bir ifade ile inner class türünden
    bir nesne, onu kapsayan sınıf türünden bir nesne kullanılarak yaratılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A x = new A();
//        A.B y = x.new B();
//        A.B z = x.new B();
//
//        y.setX(10);
//        z.setX(20);
//
//        Console.writeLine("y.x = %d", y.getX());
//        Console.writeLine("z.x = %d", z.getX());
//    }
//}
//
//class A {
//    public class B {
//        private int m_x;
//        public void setX(int x)
//        {
//            m_x = x;
//        }
//
//        public int getX()
//        {
//            return m_x;
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Anahtar Notlar: static ve non-static sınıflar için derleyici arakod isimlendirmesinde kapsayan sınıf ismini de
    dahil eder. Genel isimlendirme:
    class A {
        [erişim belirleyici] [static] class B {
            //...
        }
    }

    genel bildirimi için B'nin byte kodu A$B.class dosyası biçiminde yaratılır. Burada sınıfın static olmasının ya da
    olmamasının önemi yoktur
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    inner class içerisinde A'nın static metotları da doğrudan çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        A x = new A();
//        A.B y = x.new B();
//
//        y.bar();
//    }
//}
//
//class A {
//    public static void foo()
//    {
//        Console.writeLine("A.foo()");
//    }
//    public class B {
//        public void bar()
//        {
//            foo();
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte A sınıfının foo metodunun çağrılması için sınıf ismi kullanılmıştır. Doğrudan çağırma durumunda
    metot kendisini çağırmış olur (recursion)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A x = new A();
//        A.B y = x.new B();
//
//        y.foo();
//    }
//}
//
//class A {
//    public static void foo()
//    {
//        Console.writeLine("A.foo()");
//    }
//
//    public class B {
//        public void foo()
//        {
//            A.foo();
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    inner class içerisinde kapsayan sınıfın non-static metodu doğrudan çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A x = new A();
//        A.B y = x.new B();
//
//        y.bar();
//    }
//}
//
//class A {
//    public void foo()
//    {
//        Console.writeLine("A.foo()");
//    }
//
//    public class B {
//        public void bar()
//        {
//            foo();
//        }
//    }
//}

