package seventhweek;

import util.Console;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class AnonymousClasses { }
/*----------------------------------------------------------------------------------------------------------------------
    Bir metot içerisinde bildirilen sınınıflara yerel (local) sınıflar denir. Farklı metotlar içeriisnde aynı isimde yerel
    sınıf bildirimi yapılabilir.
----------------------------------------------------------------------------------------------------------------------*/
//class Sample {
//    public static void foo()
//    {
//        class A {
//            //...
//        }
//
//        class B {
//            //...
//        }
//    }
//
//
//    public void bar()
//    {
//        class A {
//            //...
//        }
//
//        class X {
//            //...
//        }
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Yerel sınıf isimleri faaliyet alanı bakımından kendi aralarında yerel değişkenler ile aynıdır
----------------------------------------------------------------------------------------------------------------------*/

//class Sample {
//    public static void foo()
//    {
//        class A {
//            //...
//        }
//
//        class A { //error
//
//        }
//    }
//
//
//    public void bar()
//    {
//        class A {
//            //...
//        }
//
//        class X {
//            //...
//        }
//
//        {
//            class X {
//
//            }
//            //....
//        }
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Yerel sınıfların erişim belirleyiciler olmaz. Aynı zamanda yerel bir sınıf static olarak bildirilemez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void foo()
//    {
//        public class A { //error
//            //...
//        }
//
//        static class B { //error
//            //...
//        }
//    }
//
//
//    public void bar()
//    {
//        class A {
//            //...
//        }
//
//        class X {
//            //...
//        }
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Yerel sınıflar blok içerisinde bildirilebilir. Bu durumda şüphesiz faaliyet alanı darltılmış olur
----------------------------------------------------------------------------------------------------------------------*/

//class Sample {
//    public static void foo()
//    {
//        for (int i = 0; i < 10; ++i) {
//            class A {
//                //...
//            }
//            //...
//            A y;
//        }
//
//        A x; //error
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Yerel bir sınıf başka bir sınıftan türetilebilir. Şüphesiz taban sınıf isminin türemiş sınıfın bildirildiği yerde
    görülebilir olması gerekir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//
//    }
//}
//
//class X {
//
//}
//
//class Sample {
//    public static void foo()
//    {
//        class A extends X {
//            //...
//        }
//
//        class B extends A {
//            //...
//        }
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Yerel bir sınıf içerisinde kendisinden önce bildirilen yerel değişkenler ve parametre değişkenlerine erişiebilir (capture)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample.bar(10);
//    }
//}
//
//
//class Sample {
//    public static void bar(int x)
//    {
//        int a = x + 1;
//
//        class A {
//            public void foo()
//            {
//                Console.writeLine("a = %d", a);
//                Console.writeLine("x = %d", x);
//            }
//        }
//
//        A z = new A();
//
//        z.foo();
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Yerel bir sınıf içerisinde kendisinden önce bildirilen yerel değişkenler ve parametre değişkenlerine erişiebilir (capture)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample.foo(10, 20);
//    }
//}
//
//class Sample {
//    public static void foo(int a, int b)
//    {
//        class Util {
//            final int m_value;
//
//            Util(int value)
//            {
//                m_value = value;
//            }
//
//            public boolean isEven()
//            {
//                return a % 2 == 0;
//            }
//
//            public int getTotal()
//            {
//                return m_value + a;
//            }
//        }
//
//        Util util = new Util(b);
//
//        Console.writeLine(util.isEven() ? "Çift" : "Tek");
//        Console.writeLine("Toplam:%d", util.getTotal());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Yakalanan yerel veya parametre değişkenleri (yerel sınıf, anonim sınıf ve lambda ifadeleri) yakandığında yakalanan
    yerde değiştirilemez. Benzer değiştiriliyorsa yakalanamaz. Başka bir deyişle bir yerel değişken veya parametre
    değişkeni yakalandığında faaaliyet alan boyunca hiçbiryerde ikinci bir değer alamaz.

    Aslında bu tanım Java 8 sonrası için geçerlidir. Çünkü Java 8 öncesinde yakalanan yerel veya parametre değişkenlerinin
    zaten final olarak bildirilmeleri zorunluydu. Dolayısıyla değiştirilemezdi. Java 8 ile birlikte yakalanan yerel veya
    parametre değişkenlerine "effectively final" değişkenler denir. Yani, yakalanıyorsa final bildirilmiş gibi olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample.foo(10, 20);
//    }
//}
//
//class Sample {
//    public static void foo(int a, int b)
//    {
//        class Util {
//            final int m_value;
//
//            Util(int value)
//            {
//                m_value = value;
//            }
//
//            public boolean isEven()
//            {
//                return ++a % 2 == 0;
//            }
//
//            public int getTotal()
//            {
//                return m_value + b;
//            }
//        }
//
//        ++b;
//        Util util = new Util(b);
//
//
//        Console.writeLine(util.isEven() ? "Çift" : "Tek");
//        Console.writeLine("Toplam:%d", util.getTotal());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Yakalanan yerel veya parametre değişkenleri (yerel sınıf, anonim sınıf ve lambda ifadeleri) yakandığında yakalanan
    yerde değiştirilemez. Benzer değiştiriliyorsa yakalanamaz. Başka bir deyişle bir yerel değişken veya parametre
    değişkeni yakalandığında faaaliyet alan boyunca hiçbiryerde ikinci bir değer alamaz.

    Aslında bu tanım Java 8 sonrası için geçerlidir. Çünkü Java 8 öncesinde yakalanan yerel veya parametre değişkenlerinin
    zaten final olarak bildirilmeleri zorunluydu. Dolayısıyla değiştirilemezdi. Java 8 ile birlikte yakalanan yerel veya
    parametre değişkenlerine "effectively final" değişkenler denir. Yani, yakalanıyorsa final bildirilmiş gibi olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample.foo(10, 20);
//    }
//}
//
//class Sample {
//    public static void foo(int a, int b)
//    {
//        class Util {
//            final int m_value;
//
//            Util(int value)
//            {
//                m_value = value;
//            }
//
//            public boolean isEven()
//            {
//                return ++a % 2 == 0; //error
//            }
//
//            public int getTotal()
//            {
//                return m_value + b; //error
//            }
//        }
//
//        ++b;
//        Util util = new Util(b);
//
//
//        Console.writeLine(util.isEven() ? "Çift" : "Tek");
//        Console.writeLine("Toplam:%d", util.getTotal());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Anonim sınıflar: Bildirim sırasında programcının isim vermediği sınıflardır.
    Anonim sınıf bildirimi:

    new <tür>([argümanlar]) {
        <bildirimler>
    }

    Anonim sınıf bildirimi hem bir türemiş sınıf bildirimi hem de türemiş sınıf türünden nesne yaratma işlemidir. Yani
    sınıf bildirimi new operatörüne yazılan türden türetilmiş (interface ise implemente edilmiş) olan bir sınıfın bildirimi
    hem de o sınıf türünden nesne yaratılması anlamına gelir. Şüphesiz derleyici anonim sınıfa da bir isim verecektir.
    Bu işlem bir türetme işlemi olduğundan anonim sınıfa ilişkin yaratılan nesnenin referansı (adresi) taban sınıf (veya interface)
    türünden bir referansa atanmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample s1, s2, s3, s4;
//
//        s1 = new Sample() {};
//        s2 = new Sample() {
//            public void foo()
//            {
//                System.out.println("anonim sınıf->foo");
//            }
//        };
//        s3 = new Sample() {};
//        s4= new Sample();
//
//        System.out.println(s1.getClass().getName());
//        System.out.println(s2.getClass().getName());
//        System.out.println(s3.getClass().getName());
//        System.out.println(s4.getClass().getName());
//
//        s1.foo();
//        s2.foo();
//        s3.foo();
//        s4.foo();
//    }
//}
//
//class Sample {
//    public void foo()
//    {
//        System.out.println("Sample.foo");
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Anonim sınıflar içerisinde kendisinden önce bildirilen yerel ve parametre değişkenleri yine "effectively final" olarak
    kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Mample m = new Mample();
//
//        m.bar(10, 20);
//    }
//}
//
//class Mample {
//    public void bar(int a, int b)
//    {
//        Sample s = new Sample() {
//            public void foo()
//            {
//                Console.writeLine(a * b);
//                super.foo();
//            }
//        };
//
//        s.foo();
//    }
//}
//
//class Sample {
//    //...
//    public void foo()
//    {
//        System.out.println("Sample.foo");
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Anonim sınıflar içerisinde (yerel sınıf içerisinde de) anonim sınıfın bildirildiği metodun ait olduğu sınıfın
    veri elemanlarına erişilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Mample m = new Mample(5);
//
//        m.bar(10, 20);
//    }
//}
//
//class Mample {
//    private int m_value;
//
//    public Mample(int value)
//    {
//        m_value = value;
//    }
//
//    public void bar(int a, int b)
//    {
//        Sample s = new Sample() {
//            public void foo()
//            {
//                Console.writeLine(a * b * m_value++);
//                super.foo();
//            }
//        };
//
//        s.foo();
//
//        Console.writeLine("m_value = %d", m_value);
//    }
//    //...
//}
//
//class Sample {
//    //...
//    public void foo()
//    {
//        System.out.println("Sample.foo");
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    java.util.Timer sınıfı periyodik işlerin arka planda yapılması için kullanılan temel sınıflardan biridir. Bu sınıfın
    scheduleXXX isimli metotları ile ayrı bir akış (thread) oluşturulur. schedule metotları parametresi ile aldığı
    TimerTask referansına ilişkin nesne için override edilen run metodu çağırır. Timer sınıfı schedule metotları ile
    verilen periyotta yapılacak işi programcıdan almaktadır. Bu kavrama genel olarak "callback" denir. Timer sınıfına
    ilişkin diğer detaylar ileride alınacktır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var timer = new Timer();
//
//        timer.schedule(new TimerTask() {
//            public void run()
//            {
//                Console.write(".");
//            }
//        }, 0, 1000);
//        //Console.writeLine("main ends");
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Timer sınıfı ile basit bir dijital saat uygulaması
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var timer = new Timer();
//
//        timer.schedule(new TimerTask() {
//            public void run()
//            {
//                var now = LocalDateTime.now();
//
//                Console.write("%s\r", DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(now));
//            }
//        }, 0, 1000);
//    }
//}

/*----------------------------------------------------------------------------------------------------------------------
    Timer sınıfı ile basit bir dijital saat uygulaması. Programı işlemin sisteminin komut yorumlayıcısı ile çalıştırınız
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var timer = new Timer();
//        var message = Console.read("Bir yazı giriniz:");
//
//        timer.schedule(new TimerTask() {
//            public void run()
//            {
//                var now = LocalDateTime.now();
//
//                Console.write("%s:%s\r", message, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(now));
//            }
//        }, 0, 1000);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki kod anonim sınıf kullanılmadan aşağıdaki gibi de yapılabilir. Anonim sınıfta yakalanan yerel değişkenin
    aşağıdaki örnekte nesne yaratılırken verildiğine dikkat ediniz
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        var timer = new Timer();
//        var message = Console.read("Bir yazı giriniz:");
//
//        timer.schedule(new MyTimerTask(message), 0, 1000);
//    }
//}
//
//class MyTimerTask extends TimerTask {
//    private final String m_message;
//
//    public MyTimerTask(String message)
//    {
//        m_message = message;
//    }
//
//    public void run()
//    {
//        var now = LocalDateTime.now();
//
//        Console.write("%s:%s\r", m_message, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(now));
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Timer sınıfının cancel metodu ile timer durdurulabilir. Aşağıdaki örnekte n değişkeni effectively final
    olduğundan m_count gibi ayrı bir veri elemanı tutulmuştur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var n = Console.readInt("Kaç tane nokta basmak istiyorsunuz?");
//        var timer = new Timer();
//
//        timer.schedule(new TimerTask() {
//            private int m_count;
//
//            public void run()
//            {
//                if (m_count++ != n)
//                    Console.write('.');
//                else
//                    timer.cancel();
//            }
//        }, 0, 1000);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Anonim sınıf nesnesi yaratılırken kullanılan ctor ile aslında super ctor sentaksı kullanılmış olur. Aşağıdaki
    anonim sınıf için aşağıdakine benzer bir sınıf yazılır ve bu sınıf türünden nesne yaratılmış olur.
    class App$1 extends Sample {
        public App$1(int val)
        {
            super(val);
        }

        public void foo()
        {

        }
    }
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        Sample s = new Sample(10) {
//            public void foo()
//            {
//                System.out.println("foo");
//            }
//        };
//
//        System.out.println(s.getClass().getName());
//        s.foo();
//    }
//}
//
//
//abstract class Sample {
//    protected Sample(int val)
//    {
//        System.out.println("Sample.Sample(int)");
//    }
//
//    public abstract void foo();
//}
