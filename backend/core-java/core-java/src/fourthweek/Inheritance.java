package fourthweek;

public class Inheritance { }

/*----------------------------------------------------------------------------------------------------------------------
   Türetme (inheritance) kavramı programlamada bir sınıfı genişletmek (extension) için kullanılır. Bu genişletme
   var olan özellikler üzerine ekleme olarak düşünülebilir. Bu ilişkide B sınıfı A sınıfından türetilmişse "B is A"
   cümlesi kullanılır.

   B sınıfı A sınıfından türetilmiş olsun. B sınıfına A sınıfının türemiş sınıfı (derived class) denir. A sınıfına ise
   B sınıfının taban sınıfı (base class) denir. Bu iki terim nesne yönelimli programlama paradigmasına yönelik
   genel terimlerdir. Java'da "base class" yerine "super class", "derived class" yerine ise "sub class" terimleri
   kullanılır.

   Anahtar Notlar: Nesne yönelimli programlamada "base class" yerine Biyoloji'den gelen terim olarak "parent class" da
   denilmektedir. Benzer şekilde "derived class" yerine yine Biyoloji'den gelen "child class" da denilmektedir. Bu terimler
   az kullanılsa da bazı kaynbaklarda görülmektedir.

   Bir dizi türetme söz konusu olabilir. Örneğin C sınıfı B sınıfından, B sınıfı da A sınıfından türetilmiş olabilir.
   Bu durumda C'nin taban sınıfı (super class) dendiğinden doğrudan taban sınıfı (direct super class) olan B anlaşılır.
   C nin dolaylı bir taban sınıfı (indirect super class) A dır. Örneğimizde "C'nin taban sınıfları B ve A'dır" cümlesi
   tamamen doğru değildir. Doğrusu "C nin taban sınıfı B'dir. Dolaylı taban sınıflarından biri A'dır" cümlesidir.

   Java' da bir sınıf birden fazla (doğrudan) taban sınıfa sahip olamaz. Yani Java' da çoklu türetme (multiple inheritance)
   yoktur. Java'da bir sınıf yalnızca tek bir sınıftan türetilir.

   Anahtar Not: Java' da çoklu türetmeyi gerektiği yerlerde kısmi olarak desteklemesini sağlayan "interface" denilen
   bir tür bulunmaktadır. Bu konu ileride ele alınacaktır. Çoklu türetmenin pratikte örneği yoktur. Varolan olan
   örnekler de interface ile yapılabilecek şekildedir

   Türetme kavramı aynı zamanda "bir sınıfın kodlarına dokunmadan o sınıfı genişletmek" anlamına gelir. Bu kavramında
   içinde bulunduğu prensibe nesne yönelimli programlama tekniğinde "Open Closed Principle" denir. Bu prensibin
   İngilizce olarak mottosu "Open for extension closed for modification" dır.
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Java'da türetme extends anahtar sözcüğü ile aşğıdaki gibi yapılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class D extends A {
//    //...
//}
//
//class C extends B {
//    //...
//}
//
//class B extends A {
//    //...
//}
//
//class A {
//    //...
//}





























/*----------------------------------------------------------------------------------------------------------------------
	Taban sınıfın metotları türemiş sınıfa da aktarılır. Aşağıdaki örnekte foo ve bar metotları B sınıfında da vardır.
	Bu kavrama "davranışsal genişletme (behavioral extension)" de denir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B();
//
//        x.foo();
//        x.bar();
//        x.tar();
//    }
//}
//
//class B extends A {
//    public void tar()
//    {
//        System.out.println("B.tar");
//    }
//}
//
//class A {
//    public void foo()
//    {
//        System.out.println("A.foo");
//    }
//
//    public void bar()
//    {
//        System.out.println("A.bar");
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Bir dizi türetme durumu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        C x = new C();
//
//        x.foo();
//        x.bar();
//        x.tar();
//        x.zar();
//    }
//}
//
//class C extends B {
//    public void zar()
//    {
//        System.out.println("C.zar");
//    }
//}
//
//class B extends A {
//    public void tar()
//    {
//        System.out.println("B.tar");
//    }
//}
//
//class A {
//    public void foo()
//    {
//        System.out.println("A.foo");
//    }
//
//    public void bar()
//    {
//        System.out.println("A.bar");
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	Türemiş sınıf referansı ile taban sınıfın non-static bir veri elemanına erişilebilir. Yani taban sınıfın non-static
	veri elemanları da türemiş sınıfa aktarılmış olur. Türemiş sınıf nesnesi içerisinde taban sınıf kadarlık bir bölüm
	bulunmaktadır. Burada nesnesel bir kapsama söz konusudur. Buna göre, türemiş sınıf nesnesinin bellekte kapladığı
	alan "en az taban sınıf nesnesinin bellekte kapladığı alan + türemiş sınıfa eklenen non-static veri elemanlarının
	toplam uzunluğu kadardır"
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B();
//
//        b.x = 10;
//        b.y = 20;
//
//        System.out.printf("b.x=%d%n", b.x);
//        System.out.printf("b.y=%d%n", b.y);
//    }
//}
//
//class B extends A {
//    public int y;
//}
//
//class A {
//    public int x;
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Bir dizi türetme durumu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        C c = new C();
//
//        c.x = 10;
//        c.y = 20;
//        c.z = 34;
//
//        System.out.printf("c.x=%d%n", c.x);
//        System.out.printf("c.y=%d%n", c.y);
//        System.out.printf("c.y=%d%n", c.y);
//    }
//}
//
//class C extends B {
//    public int z;
//}
//
//class B extends A {
//    public int y;
//}
//
//class A {
//    public int x;
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Türemiş sınıf nesnesinin yaratılması aşamasında ctor çağrısından önce taban sınıfın ctor'u çağrılır. Herhangi bir
	belirtme yapılmamışsa taban sınıfın default ctor'u çağrılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B();
//
//        System.out.println("////////////////////");
//
//        B y = new B(12);
//    }
//}
//
//class B extends A {
//    public B()
//    {
//        System.out.println("B.B()");
//    }
//
//    public B(int val)
//    {
//        System.out.println("B.B(int)");
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte A'nın default ctor'u private olduğundan B sınıfının bildiriminde error oluşur
----------------------------------------------------------------------------------------------------------------------*/
//
//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class B extends A {
//    public B() //error
//    {
//        System.out.println("B.B()");
//    }
//
//    public B(int val) //error
//    {
//        System.out.println("B.B(int)");
//    }
//}
//
//class A {
//    private A()
//    {
//        System.out.println("A.A()");
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte A'nın default ctor'u olmadığından B sınıfının bildiriminde error oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class B extends A {
//    public B() //error
//    {
//        System.out.println("B.B()");
//    }
//
//    public B(int val) //error
//    {
//        System.out.println("B.B(int)");
//    }
//}
//
//class A {
//    public A(int a)
//    {
//        System.out.println("A.A(int)");
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Türemiş sınıfı yazan programcı super ctor sentaksı ile türemiş sınıfın istenilen ctor'unun çağrılmasını
	sağlayabilir. super ctor sentaksında hangi ctor'un çağrılacağının belirlenmesi sürecei metot çağrıları iiçin
	kullanılan "overload resolution" kuralları ile aynıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B();
//        System.out.println("//////////////////");
//        B y = new B(10);
//    }
//}
//
//class B extends A {
//    public B()
//    {
//        System.out.println("B.B()");
//    }
//
//    public B(int val)
//    {
//        super(val);
//        System.out.println("B.B(int)");
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(int a)
//    {
//        System.out.println("A.A(int)");
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	super ctor sentaksı ctor'un ilk deyimi olmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B();
//        System.out.println("//////////////////");
//        B y = new B(10);
//    }
//}
//
//class B extends A {
//    public B()
//    {
//        System.out.println("B.B()");
//    }
//
//    public B(int val)
//    {
//        System.out.println("B.B(int)");
//        super(val); //error
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(int a)
//    {
//        System.out.println("A.A(int)");
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
	super ctor sentaksı adından da anlaşılacağı gibi yalnızca ctor'larda kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B();
//        System.out.println("//////////////////");
//        B y = new B(10);
//    }
//}
//
//class B extends A {
//    public B()
//    {
//        System.out.println("B.B()");
//    }
//
//    public B(int val)
//    {
//        super(val);
//        System.out.println("B.B(int)");
//    }
//
//    public void foo()
//    {
//        super(9); //error
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(int a)
//    {
//        System.out.println("A.A(int)");
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	** ile belirtilen super ctor sentaksı default ctor çağrısı demek olduğundan yazılması ya da yazılmamamsı aynı
	anlamdadır. Yani bir sınıfının ctor'unun başına super ctor sentaksı yazmamak derleyicinin super(); şeklindeki
	deyimi kendisinin yerleştirmesi demektir. Bu şekilde düşünülebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B();
//        System.out.println("//////////////////");
//        B y = new B(10);
//    }
//}
//
//class B extends A {
//    public B()
//    {
//        super(); //**: Yazılması yazılmaması ile aynı anlamdadır
//        System.out.println("B.B()");
//    }
//
//    public B(int val)
//    {
//        super(val);
//        System.out.println("B.B(int)");
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(int a)
//    {
//        System.out.println("A.A(int)");
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Bir dizi türetme durumunda taban sınıfın ctor'unun çağrılması
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        C x = new C(10);
//    }
//}
//
//class C extends B {
//    public C(int val)
//    {
//        super(val);
//        System.out.println("C.C(int)");
//    }
//}
//
//class B extends A {
//    public B()
//    {
//        System.out.println("B.B()");
//    }
//
//    public B(int val)
//    {
//        super(val);
//        System.out.println("B.B(int)");
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(int a)
//    {
//        System.out.println("A.A(int)");
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
	Bazı durumlarda bir sınıfın ctor'u içerisinde sınıfın başka bir ctor'unun çağrılması gerekebilir. Bu durumda
	this ctor sentaksı kullanılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new A();
//        System.out.println("////////////");
//        A y = new A(10);
//        System.out.println("////////////");
//        A z = new A(3.4);
//
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(double a)
//    {
//        this();
//        System.out.println("A.A(double)");
//    }
//
//    public A(int a)
//    {
//        this();
//        System.out.println("A.A(int)");
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	Bazı durumlarda bir sınıfın ctor'u içerisinde sınıfın başka bir ctor'unun çağrılması gerekebilir. Bu durumda
	this ctor sentaksı kullanılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new A();
//        System.out.println("////////////");
//        A y = new A(10);
//        System.out.println("////////////");
//        A z = new A(3.4);
//
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(double a)
//    {
//        this();
//        System.out.println("A.A(double)");
//    }
//
//    public A(int a)
//    {
//        this("ankara");
//        System.out.println("A.A(int)");
//    }
//
//    public A(String s)
//    {
//        System.out.println("A.A(String)");
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	this ctor sentaksı da ctor'un ilk deyimi olmak zorundadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new A();
//        System.out.println("////////////");
//        A y = new A(10);
//        System.out.println("////////////");
//        A z = new A(3.4);
//
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(double a)
//    {
//        System.out.println("A.A(double)");
//        this(); //error
//    }
//
//    public A(int a)
//    {
//        this("ankara");
//        System.out.println("A.A(int)");
//    }
//
//    public A(String s)
//    {
//        System.out.println("A.A(String)");
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
	this ve super ctor sentaksları aynı anda bulunamazlar. Böyle bir durumla karşılaşan programcı yazdığı koda
	bakmalıdır. Çünkü iyi bir tasarımın programcıyı bu şekilde bir ihtiyaca sokmaması gerekir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//
//    }
//}
//
//class B extends A {
//    public B(String s)
//    {
//        System.out.println("B.B(String)");
//    }
//
//    public B(int val)
//    {
//        this("ankara");
//        super(val);//error
//    }
//}
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(int a)
//    {
//        System.out.println("A.A(int)");
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	this ctor sentaksında döngüsel durum geçersizdir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//
//    }
//}
//
//
//
//class A {
//    public A() //error
//    {
//        this(0);
//        System.out.println("A.A()");
//    }
//
//    public A(int a) //error
//    {
//        this();
//        System.out.println("A.A(int)");
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki durum da döngüseldir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//
//    }
//}
//
//
//class A {
//    public A()
//    {
//        System.out.println("A.A()");
//    }
//
//    public A(double a)
//    {
//
//        System.out.println("A.A(double)");
//    }
//
//    public A(int a)
//    {
//        this(a);
//        System.out.println("A.A(int)");
//    }
//}
































