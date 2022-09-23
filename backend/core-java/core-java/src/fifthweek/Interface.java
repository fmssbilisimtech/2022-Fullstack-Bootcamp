package fifthweek;

import util.ArrayUtil;

import java.util.Random;

public class Interface { }
/*----------------------------------------------------------------------------------------------------------------------
    Arayüzler (Interfaces):
	Bilindiği gibi Java'da sınıf ve enum bildirimi bir tür bildirimidir (user defined types). Java' da interface
	anahtar sözcüğü ile arayüz (interface) bildirimi yapılabilmektedir. Arayüz bildirimi de bir tür bildirimidir.

	Arayüzler daha çok abstract sınıflara benzese de şüphesiz farklı özelliklere de sahiptir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	interface ismini diğer tür bildirimlerinden ayırt etmek için biz kendi interface'lerimizin
	ismini "I" ile başlatacağız. Java'daki standart arayüz isimlerinde bu kurala uyulmamıştır
----------------------------------------------------------------------------------------------------------------------*/

//interface X {
//    //...
//}
//
//interface Sample {
//    //...
//}

























/*----------------------------------------------------------------------------------------------------------------------
	interface içerisinde veri elemanı bildirimi yapılabilir. Bu veri elemanları yazılsa da yazılmasa da
	public static ve final olarak bildirilmiş olur. Biz bildirimlerde bu anahtar sözcükleri yazmayacağız.
	Interface içerisinde final olmayan veya public dışında erişim belirleyiciye sahip veya static olmayan
	veri elemanı bildirimi yapılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        System.out.println(X.PI);
//        X.PI = 2.34; //error
//    }
//}
//
//interface X {
//    double PI = 3.14;
//}
//
//interface Y {
//    private int x; //error
//}

























/*----------------------------------------------------------------------------------------------------------------------
	interface içerisinde gövdesiz metotlar olabilir. Bu metotlar yazılsa da yazılmasa da public ve abstract olur.
	Yine biz public ve abstract yazmayacağız
----------------------------------------------------------------------------------------------------------------------*/
//interface X {
//    void foo();
//    int bar(double val);
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Hiç bir abstract metodu olmayan arayüzlere işaretleme arayüzleri (marker interfaces) denir.
	Genel olarak işaretleme arayüzlerinin içerisi boş bırakılır
----------------------------------------------------------------------------------------------------------------------*/
//interface Marker { //marker interface
//
//}
//
//interface X { //marker interface
//    String name = "IX";
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Java 8 ile birlikte interface içerisinde gövdeli (abstract olmayan) non-static metotlar yazılabilir. Bu metotlar
	default anahtar sözcüğü ile bildirilmelidir. Yazılsa da yazılmasa da default metotlar public'dir
----------------------------------------------------------------------------------------------------------------------*/

//interface X {
//    default void foo() //Since Java 8
//    {
//        //...
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Java 8 ile birlikte bir arayüz içerisinde static metotlar olabilir. Şüphesiz static metotlar gövdeli olmalıdır.
	Bu metotlar da yazılsa da yazılmasa da public dir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        X.foo();
//    }
//}
//
//interface X {
//    static void foo() //Since Java 8
//    {
//        System.out.println("foo");
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Java 8 ile birlikte belli koşullar altında arayüzler kullanım anlamında genişletilmiştir. Buna göre içerisinde
	bir ve yalnız bir tane abstract metodu olan arayüzlere fonksiyonel arayüzler (functional interfaces) denir.
	Fonksiyonel arayüzler ile Java'da fonksiyonel programlama daha kolay ve gelişmiş biçimde yapılabilmektedir.
	Aşağıdaki kodda fonksiyonel programlama tekniğine ilişkin bir örnek verilmiştir. Konunun detayı uygulama
	kursunda ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        IntBinaryOperation intBinaryOperator = (a, b) -> a + b; //Integer::sum
//
//        StringConverterUtil.display(String::length, "ankara");
//        System.out.println(intBinaryOperator.applyAsInt(10, 20));
//    }
//}
//
//class StringConverterUtil {
//    public static void display(StringToIntConverter stringToIntConverter, String str)
//    {
//        System.out.println(stringToIntConverter.convert(str));
//    }
//}
//
//interface IntBinaryOperation {
//    int applyAsInt(int a, int b);
//}
//


//interface StringToIntConverter {
//    int convert(String str);
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Java 9 ile birlikte arayüzler içerisinde private metotlar yazılabilir. Şüphesiz bu metotların gövdesi olmalıdır.
	private metotlar için default anahtar sözcüğü kullanılmaz
----------------------------------------------------------------------------------------------------------------------*/

//interface X {
//    private void foo() //Since Java 9
//    {
//        //...
//    }
//
//    default void bar()
//    {
//        foo();
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	interface içerisinde bulunabilen private metotlar static olarak da bildirilebilir
----------------------------------------------------------------------------------------------------------------------*/

//interface X {
//    private static void foo() //Since Java 9
//    {
//        //...
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	interface içerisinde olabilecek elemanlar
----------------------------------------------------------------------------------------------------------------------*/

//interface X {
//    int NUM = 10;
//
//    private void foo() //Since Java 9
//    {
//
//    }
//
//    private static void bar() //Since Java 9
//    {
//
//    }
//
//    default void tar() //Since Java 8
//    {
//
//    }
//
//    static void func() // Since Java 8
//    {
//
//    }
//
//    void zar();
//    void car();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	interface türünden nesne yaratılmaz ve yaratılamaz. interface nesne özelliği olmayan bir tür bildirimidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        X x = new X(); //error
//
//        //...
//    }
//}
//
//interface X {
//    //...
//}

























/*----------------------------------------------------------------------------------------------------------------------
	interface bildiriminde abstract anahtar sözcüğü yazılabilir ancak yazmayacağız
----------------------------------------------------------------------------------------------------------------------*/

//class A implements X {
//    //...
//}
//
//abstract interface X {
//    //...
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf bir arayüzü implements anahtar sözcüğü ile destekler (implementation)
----------------------------------------------------------------------------------------------------------------------*/

//class A implements X {
//    //...
//}
//
//interface X {
//    //...
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf birden fazla arayüzü destekleyebilir. Bu durumda hangi arayüzün listede önce olduğunun hiç bir önemi yoktur
----------------------------------------------------------------------------------------------------------------------*/

//class A implements X, Y, Z {
//
//}
//
//interface X {
//    //...
//}
//
//interface Y {
//    //...
//}
//
//interface Z {
//    //...
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf başka bir sınıftan türetilip istediği kadar arayüzü destekleyebilir. Bu durumda taban sınıf
	listenin başında olmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class B extends A implements X, Y, Z {
//    //..
//}
//
//
//class A {
//
//}
//
//interface X {
//    //...
//}
//
//interface Y {
//    //...
//}
//
//interface Z {
//    //...
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf bir arayüzü destekliyorsa o arayüzün tüm abstract metotlarını override etmelidir. Eğer birini bile override
	etmezse sınıf bildiriminde abstract yazılmalıdır. Yani sınıf abstract olmalıdır
----------------------------------------------------------------------------------------------------------------------*/
//abstract class B implements X {
//    public void foo()
//    {
//        //...
//    }
//}
//
//class A implements X {
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
//interface X {
//    void foo();
//    void bar();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Arayüz referansları taban sınıf referansı gibi kullanılabilir. Böylelikle çok biçimlilik arayüzler ile de
	yapılabilmektedir. Yani arayüzler çoklu türetmeyi (multiple inheritance) kısmi olarak kullanabilme olanağı sağlar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Mample m = new Mample();
//        Sample s = new Sample();
//        TestT t = new TestT();
//
//        m.doWorkForIX(s);
//        m.doWorkForIY(s);
//        m.doWorkForIX(t);
//    }
//}
//
//class Mample {
//    public void doWorkForIX(X x)
//    {
//        x.foo();
//    }
//
//    public void doWorkForIY(Y y)
//    {
//        y.bar();
//    }
//}
//
//class TestT implements X {
//    public void foo()
//    {
//        System.out.println("Test.foo");
//    }
//}
//
// class Sample implements X, Y {
//
//
//    public void foo()
//    {
//        System.out.println("Sample.foo");
//    }
//
//    public void bar()
//    {
//        System.out.println("Sample.bar");
//    }
//}
//
//interface X {
//    void foo();
//}
//
//interface Y {
//    void bar();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Arayüz referansları taban sınıf referansı gibi kullanılabilir. Böylelikle çok biçimlilik arayüzler ile de
	yapılabilmektedir. Yani arayüzler çoklu türetmeyi kısmi olarak kullanabilme olanağı sağlar. Aşağıdaki örnekte
	Test sınıfı IY arayüzünü desteklemediğinde ** ile belirtilen çağrıda error oluşur
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//        Mample m = new Mample();
//        Test t = new Test();
//
//        m.doWorkForIX(s);
//        m.doWorkForIY(s);
//        m.doWorkForIX(t);
//        m.doWorkForIY(t); //** error
//    }
//}
//
//class Mample {
//    public void doWorkForIX(X x)
//    {
//        x.foo();
//    }
//
//    public void doWorkForIY(Y y)
//    {
//        y.bar();
//    }
//}
//
//class Test implements X {
//    public void foo()
//    {
//        System.out.println("Test.foo");
//    }
//
//}
//
//class Sample implements X, Y {
//    public void foo()
//    {
//        System.out.println("Sample.foo");
//    }
//
//    public void bar()
//    {
//        System.out.println("Sample.bar");
//    }
//}
//
//interface X {
//    void foo();
//}
//
//interface Y {
//    void bar();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Birden fazla arayüz içerisinde aynı imzaya ve geri dönüş değerine sahip bir sanal metot varsa ve bir sınıf
	bu iki arayüzü de destekliyorsa bir tane metot ikisi için de override edilmiş olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//        Mample m = new Mample();
//
//        s.foo();
//        m.doWorkForIX(s);
//        m.doWorkForIY(s);
//    }
//}
//
//class Mample {
//    public void doWorkForIX(X x)
//    {
//        x.foo();
//    }
//
//    public void doWorkForIY(Y y)
//    {
//        y.foo();
//    }
//}
//
//class Sample implements X, Y {
//    public void foo()
//    {
//        System.out.println("Sample.foo");
//    }
//
//    public void bar()
//    {
//        System.out.println("Sample.bar");
//    }
//}
//
//interface X {
//    void foo();
//}
//
//interface Y {
//    void foo();
//    void bar();
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf bir arayüzü destekliyorsa o sınıftan türetilmiş bir sınıf da aynı arayüzü destekler. Bu durum
	türemiş sınıf arayüz listesinde belirtilmek zorunda değildir. İstenirse belirtilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B();
//
//        X x = b;
//
//        x.foo();
//    }
//}
//
//class C extends A implements X {
//
//}
//
//class B extends A {
//
//}
//
//class A implements X {
//    public void foo()
//    {
//        System.out.println("A.foo");
//    }
//}
//
//interface X {
//    void foo();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte B sınıfı IX arayüzünün foo metodunu override etmiştir. Şüphesiz B açısından bu metot taban sınıfının
	metodudur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B();
//
//        X x = b;
//
//        x.foo();
//    }
//}
//
//class B extends A {
//    public void foo()
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A implements X {
//    public void foo()
//    {
//        System.out.println("A.foo");
//    }
//}
//
//interface X {
//    void foo();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte foo metodu A sınıfında final yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B();
//
//        X x = b;
//
//        x.foo();
//    }
//}
//
//class B extends A {
//    public void foo() //error
//    {
//
//    }
//}
//
//class A implements X {
//    public final void foo()
//    {
//        System.out.println("A.foo");
//    }
//}
//
//interface X {
//    void foo();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Bir arayüz başka bir arayüzden türetilebilir. Burada extends anahtar sözcüğü kullanılır. Bu durumda türemiş arayüzü
	destekleyen bir sınıf taban arayüzü de desteklemiş olur yani somut sınıf olabilmek için tüm abstract metotları
	override etmesi gerekir. Aşağıdaki örnekte A sınıfı hem IY yi hem de IX'i desteklemiş olur. Arayüz listesinde sadece
	IY yazılması yeterlidir. İstenirse IX de yazılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//
//        Y y = a;
//        X x = a;
//
//        x = y; //upcasting
//
//        System.out.println(x.getClass().getName());
//    }
//}
//
//class B implements Y, X {
//    public void foo()
//    {
//
//    }
//
//    public void bar()
//    {
//
//    }
//}
//
//class A implements Y {
//    public void foo()
//    {
//
//    }
//
//    public void bar()
//    {
//
//    }
//}
//
//interface Y extends X {
//    void bar();
//}
//
//interface X {
//    void foo();
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Arayüzler arasında çoklu türetme (multiple inheritance) yapılabilir. Aşağıdaki örnekte IZ yi destekleyen bir sınıf
	listeye yazılsa da yazılmasa da IX ve IY yi de destekler
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//
//        Z z = a;
//        Y y = a;
//        X x = a;
//        //...
//
//        x = z; //upcasting
//        y = z; //upcasting
//    }
//}
//
//class A implements Z {
//    public void foo()
//    {
//
//    }
//
//    public void bar()
//    {
//
//    }
//
//    public void tar()
//    {
//
//    }
//}
//
//interface Z extends X, Y {
//    void tar();
//}
//
//interface Y  {
//    void foo();
//}
//
//interface X {
//    void bar();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	default metotlar sanaldır. default metotlar da override edilebilir. Bu durumda çok biçimli olarak override edilen
	çağrılır. default metotlar override edilmek zorunda değildir. Aşağıdaki örnekte B sınıfı foo default metodunu
	override etmemiştir, somut sınıf olarak bildirilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        X x = a;
//
//        x.foo();
//        a.foo();
//
//    }
//}
//
//
//
//class A implements X {
//    public void foo()
//    {
//        System.out.println("A.foo");
//    }
//}
//
//interface X {
//    default void foo()
//    {
//        System.out.println("IX.foo");
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
	super referansı taban sınıfı temsil ettiğinden aşağıdaki örnekte taban sınıf da Object olduğundan error oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        X x = new A();
//
//        x.foo();
//    }
//}
//
//class A implements X {
//    public void foo()
//    {
//        System.out.println("A.foo");
//        super.foo(); //error: Burada super referansı Object türündendir
//    }
//}
//
//interface X {
//    default void foo()
//    {
//        System.out.println("IX.foo");
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnek geçerlidir. super.foo() çağrısında B sınfının foo metodu çağrılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        X x = a;
//
//        x.foo();
//    }
//}
//
//class B {
//    public void foo()
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A extends B implements X {
//    public void foo()
//    {
//        System.out.println("A.foo");
//        super.foo(); //Burada super referansı B türündendir
//    }
//}
//
//interface X {
//    default void foo()
//    {
//        System.out.println("IX.foo");
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnek geçerlidir. B den kalıtımla alınan foo metodu A'nın foo metodu olarak ix referansı ile çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        X x = a;
//
//        x.foo();
//    }
//}
//
//class B {
//    public void foo()
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A extends B implements X {
//
//}
//
//interface X {
//    void foo();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte A'da override edilen foo aynı zamanda IX türden referans ile de dinamik olarak çağrılabilir.
	C sınıfı için foo metodu public olarak override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        X x = a;
//
//        x.foo();
//    }
//}
//
//class C extends B implements X { //error: Geçerli olsaydı IX için foo metodunun erişim belirleyicisi düşürülmüş oludu
//
//}
//
//class B {
//    protected void foo()
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A extends B implements X {
//    public void foo()
//    {
//        System.out.println("A.foo");
//    }
//}
//
//
//interface X {
//    void foo();
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnekte sınıfı abstract yaparak da error engellenemez. Buradaki hata IX'in foo metodunun protected olarak
	bırakılmasıdır. Bu da error oluşturur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        X x = a;
//
//        x.foo();
//    }
//}
//
//abstract class C extends B implements X {
//    //...
//}
//
//class B {
//    protected void foo()
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A extends B implements X {
//    public void foo()
//    {
//        System.out.println("A.foo");
//    }
//}
//
//
//interface X {
//    void foo();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki durum geçersizdir. Çünkü bir sınıf içerisinde aynı imzaya sahip birden fazla metot bildirimi yapılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class A implements X, Y {
//    public void foo() //error
//    {
//
//    }
//
//    public int foo() //error
//    {
//        return 10;
//    }
//}
//
//interface X {
//    void foo();
//}
//
//interface Y {
//    int foo();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıfın sanal bir metodu referansa geri dönen bir metot ise, bu metot türemiş sınıfta override edilirken
	geri dönüş değeri olan referansa ilişkin sınıftan türetilmiş bir sınıf geri dönüş değeri olarak yazılabilir.
	Buna İnglizce olarak "covariant return type" denir. Bu kullanım yararlı olsa da Java'da pek tercih edilmez.
	Burada geri dönüş değeri bir interface ise override edilirken geri dönüş değeri bilgisi yerine o interface'i
	implemente eden bir sınıf yazılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class B extends A {
//    public Y foo()
//    {
//        Y y = new Y();
//
//        //...
//        return y;
//    }
//}
//
//class TesTT {
//    public Car getCar(Integer saseNo) {
//
//    }
//}
//
//interface Car{}
//
//class Y extends X {
//
//}
//
//abstract class A {
//    public abstract X foo();
//}
//
//
//
//class X {
//
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Sanal bir metodun geri dönüş değeri Object türündense override edililirken geri dönüş bilgisi yerine istenilen bir
	referans türü yazılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class D implements Factory {
//    public Sample create()
//    {
//        return new Sample();
//    }
//}
//
//class Sample {
//
//}
//
//
//class E implements Factory {
//    public int [] create()
//    {
//        return ArrayUtil.getRandomArray(10, 10, 100);
//    }
//}
//
//class C implements Factory {
//    public Random create()
//    {
//        return new Random();
//    }
//}
//
//class B implements Factory {
//    public String create()
//    {
//        return "ankara";
//    }
//}
//
//interface Factory {
//    Object create();
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki durum covariant return type kuralları dolayısıyla geçerlidir
----------------------------------------------------------------------------------------------------------------------*/

//class A implements X, Y {
//    public String foo()
//    {
//        return "ankara";
//    }
//}
//
//interface X {
//    String foo();
//}
//
//interface Y {
//    Object foo();
//}

























/*----------------------------------------------------------------------------------------------------------------------
    (Abstract) sınıflar ile arayüzler arasındaki farklar: (Maddelerin sırasının önemi yoktur)
    - Arayüzler interface anahtar sözcüğü ile abstract sınıflar ise class anahtar sözcüğü ile bildirilir

    - Arayüzler non-static veri elemanlarına sahip olamaz, abstract sınıflar olabilir

    - Arayüzler nesne özelliği göstermediğinden ctor'ları olamaz, abstract sınıfların olabilir

    - Arayüzlerin abstract metotları public ve abstract yazılmasa da bu şekilde kabul edilir. abstract
    sınıflarda bunlar yazılmalıdır

    - Arayüzlere Java 8 ile birlikte eklenen gövdeli non-static metotlar default anahtar sözcüğü ile yazılmalıdır.
    abstract sınıflarda doğrudan erişim belirleyici ile yazılmalıdır.

    - Arayüzlerin veri elemanları yazılsa da yazılmasa da public, static ve final olur. abstract sınıflarda
    bunlar belirtilmelidir

    - Bir sınıf bir arayüzü implements anahtar sözcüğü ile destekler (implementation), abstract sınıftan
    ise extends anahtar sözcüğü ile türetilebilir. Burada arayüzler için türetme teriminin kullanılmadığına
    dikkat ediniz

    - Bir sınıf istediği kadar arayüzü destekleyebilir, ancak tek bir sınıftan türetilebilir

    - Arayüzler arasında çoklu türetme yapılabilir. Ancak sınıflar arasında çoklu türetme geçersizdir

    - Arayüzler türünden nesne hiç bir şekilde yaratılmaz, abstract sınıf türünden nesne türemiş
    sınıf nesnesi içerisinde otomatik olarak yaratılır.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Bir tür ne zaman interface ne zaman abstract sınıf yapılmalıdır? Programcı buna nasıl karar verecektir?
	Bu durumda yeni başlayanlar için bu sorunun cevabı şöyle özetlenebilir:
	"Önce interface düşünülmeli, interface özellikleri yazacağınız türü karşılamıyorsa (abstract) sınıf tercih edilmelidir"

	interface yapılabildiği yerde abstract sınıf yerine interface yapılması, bu interface'i destekleyen sınıfın başka bir
	sınıftan da türetilmesi olanağı sağlar
----------------------------------------------------------------------------------------------------------------------*/


























/*----------------------------------------------------------------------------------------------------------------------

    Arayüzlerle İlgili Tür Dönüştürmeleri

    Arayüzlerle ilgili tür dönüştürmeleri dört durum olarak ele alınabilir:

    1. Bir sınıf referansının onun desteklediği bir arayüz referansına dönüştürülmesi

    2. Bir arayüz referansının herhangi bir sınıf türüne dönüştürülmesi

    3. Bir arayüz referansının başka bir arayüz referansına dönüştürülmesi

    4. Bir sınıf referansının onun desteklemediği bir arayüz referansına dönüştürülmesi
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	1. Bir sınıf referansının onun desteklediği bir arayüz referansına dönüştürülmesi doğrudan yapılabilir
	Bu durum çok aşikar bir durumdur. Arayüz referansının taban sınıf referansı gibi kullanılmasıdır. Zaten interface'in
	hedeflerinden biri de budur.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//
//        X x = a;
//    }
//}
//
//class A implements X {
//
//}
//
//interface X {
//
//}

























/*----------------------------------------------------------------------------------------------------------------------
	2. Bir arayüz referansının herhangi bir sınıf türüne dönüştürülmesi:
	Bu dönüşüm tür dönüştürme operatörü ile yapılmalıdır. Ancak çalışma zamanı sırasında arayüz referansının dinamik
	türünün dönüştürülecek sınıfı kapsayıp kapsamadığına bakılır. Kapsıyorsa haklı dönüşümdür. Kapsamıyorsa haksız
	dönüşümdür. ClassCastException nesnesi fırlatılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        X x = a;
//
//        B b = (B) x; //Haklı dönüşüm
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class A extends B implements X {
//
//}
//
//class B {
//    //...
//}
//
//interface X {
//
//}


























/*----------------------------------------------------------------------------------------------------------------------
	2. Bir arayüz referansının herhangi bir sınıf türüne dönüştürülmesi:
	Bu dönüşüm tür dönüştürme operatörü ile yapılmalıdır. Ancak çalışma zamanı sırasında arayüz referansının dinamik
	türünün dönüştürülecek sınıfı kapsayıp kapsamadığına bakılır. Kapsıyorsa haklı dönüşümdür. Kapsamıyorsa haksız
	dönüşümdür. ClassCastException nesnesi fırlatılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        X x = a;
//
//        B b = (B) x; //Haksız dönüşüm
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class A implements X {
//
//}
//
//class B {
//    //...
//}
//
//interface X {
//
//}

























/*----------------------------------------------------------------------------------------------------------------------
	3. Bir arayüz referansının başka bir arayüz referansına dönüştürülmesi:
	Bu durum iki şekilde incelenebilir:
	- Kaynak arayüz referansına ilişkin tür hedef arayüz referansına ilişkin türden türetilmişse doğrudan yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        Y y = a;
//        X x;
//
//        x = y; //upcasting
//        //...
//    }
//}
//
//
//class A implements Y {
//
//}
//
//interface Y extends X {
//
//}
//
//interface X {
//
//}

























/*----------------------------------------------------------------------------------------------------------------------
	3. Bir arayüz referansının başka bir arayüz referansına dönüştürülmesi:
	Bu durum iki şekilde incelenebilir:
	- Kaynak arayüz referansına ilişkin tür hedef arayüz referansına ilişkin türden türetilMEmişse tür dönüştürme
	operatörü ile yapılabilir. Bu durumda çalışma zamanı sırasında kaynak arayüz referansının dinamik türünün hedef
	arayüzü destekleyip desteklemediğine bakılır. Destekliyorsa haklı dönüşüdür. Desteklemiyorsa haksız dönüşümdür.
	ClassCastException fırlatılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        Y y = a;
//        X x = (X) y; //Haklı dönüşüm
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//
//class A  implements Y, X {
//
//}
//
//interface Y {
//    //...
//}
//
//interface X {
//    //...
//}
























/*----------------------------------------------------------------------------------------------------------------------
	3. Bir arayüz referansının başka bir arayüz referansına dönüştürülmesi:
	Bu durum iki şekilde incelenebilir:
	- Kaynak arayüz referansına ilişkin tür hedef arayüz referansına ilişkin türden türetilMEmişse tür dönüştürme
	operatörü ile yapılabilir. Bu durumda çalışma zamanı sırasında kaynak arayüz referansının dinamik türünün hedef
	arayüzü destekleyip desteklemediğine bakılır. Destekliyorsa haklı dönüşüdür. Desteklemiyorsa haksız dönüşümdür.
	ClassCastException fırlatılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new A();
//        Y y = a;
//        X x = (X) y; //Haksız dönüşüm
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//
//class A implements Y {
//
//}
//
//interface Y {
//    //...
//}
//
//interface X {
//    //...
//}

























/*----------------------------------------------------------------------------------------------------------------------
	3. Bir arayüz referansının başka bir arayüz referansına dönüştürülmesi:
	Bu durum iki şekilde incelenebilir:
	- Kaynak arayüz referansına ilişkin tür hedef arayüz referansına ilişkin türden türetilMEmişse
	tür dönüştürme operatörü ile yapılabilir. Bu durumda çalışma zamanı sırasında kaynak arayüz referansının
	dinamik türünün hedef arayüzü destekleyip desteklemediğine bakılır. Destekliyorsa haklı dönüşüdür.
	Desteklemiyorsa haksız dönüşümdür. ClassCastException fırlatılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new B();
//        Y y = a;
//        X x = (X) y; //Haklı dönüşüm
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class B extends A implements X {
//
//}
//
//class A implements Y {
//
//}
//
//interface Y {
//
//}
//
//interface X {
//
//}

























/*----------------------------------------------------------------------------------------------------------------------
	3. Bir arayüz referansının başka bir arayüz referansına dönüştürülmesi:
	Bu durum iki şekilde incelenebilir:
	- Kaynak arayüz referansına ilişkin tür hedef arayüz referansına ilişkin türden türetilMEmişse
	tür dönüştürme operatörü ile yapılabilir. Bu durumda çalışma zamanı sırasında kaynak arayüz referansının
	dinamik türünün hedef arayüzü destekleyip desteklemediğine bakılır. Destekliyorsa haklı dönüşüdür.
	Desteklemiyorsa haksız dönüşümdür. ClassCastException fırlatılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new B();
//        Y y = a;
//        X x = (X) y; //Haksız dönüşüm
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class B extends A {
//
//}
//
//class A implements Y {
//
//}
//
//interface Y {
//
//}
//
//interface X {
//
//}

























/*----------------------------------------------------------------------------------------------------------------------
	4. Bir sınıf referansının onun desteklemediği bir arayüz referansına dönüştürülmesi:
	Bu işlem tür dönüştürme operatörü ile yapılabilir. Çalışma zamanı sırasında kaynak referansın
	dinamik türünün hedef arayüzü destekleyip desteklemediğine bakılır. Destekliyorsa haklı dönüşümdür.
	Desteklemiyorsa haksız dönüşümdür. ClassCastException fırlatılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new B();
//        X x = (X) a; //Haklı dönüşüm
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class B extends A implements X {
//
//}
//
//class A {
//
//}
//
//interface X {
//
//}

























/*----------------------------------------------------------------------------------------------------------------------
	4. Bir sınıf referansının onun desteklemediği bir arayüz referansına dönüştürülmesi:
	Bu işlem tür dönüştürme operatörü ile yapılabilir. Çalışma zamanı sırasında kaynak referansın
	dinamik türünün hedef arayüzü destekleyip desteklemediğine bakılır. Destekliyorsa haklı dönüşümdür.
	Desteklemiyorsa haksız dönüşümdür. ClassCastException fırlatılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a = new B();
//        X x = (X)a; //Haksız dönüşüm
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class B extends A {
//
//}
//
//class A {
//
//}
//
//interface X {
//
//}

























