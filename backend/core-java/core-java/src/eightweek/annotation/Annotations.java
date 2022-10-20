package eightweek.annotation;

import util.Console;

import java.lang.annotation.*;

public class Annotations { }

/*----------------------------------------------------------------------------------------------------------------------
    Annotation:
    Annotation'lar modern programlama dillerine gittikçe daha fazla girmeye başlamıştır. Gerçekten, C++, C#, Kotlin,
    Swift gibi dillerde de bu kavram kullanılmaktadır. Java'ya annotation'lar Java 5 ile eklenmiştir. Java'da bir bildirimin
    önüne getirilen ve @ işareti başlatılan kod parçaları bir annotation belirtir. Annotation'ların verilebildiği
    bildirimlerden bazılar şunlardır:
    - Sınıflar
    - Arayüzler
    - Enum class'lar
    - Metotlar
    - Metot parametre değişkenleri
    - Veri elemanları
    - Metotların geri dönüş değerleri
    - Annotation
    - ...
---------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Annotation bildirimi
---------------------------------------------------------------------------------------------------------------------*/

//@interface MyAnnotation {
//    //...
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Bir annotation sınıf Java'da çeşitli bildirimlerin önüne getirilebilir
---------------------------------------------------------------------------------------------------------------------*/
//@MyAnnotation
//class Sample {
//    @YourAnnotation
//    private int m_x;
//
//    @TheirAnnotation
//    @MyAnnotation
//    public void foo(@YourAnnotation int x)
//    {
//    }
//}
//
//@interface MyAnnotation {
//    //...
//}
//
//@interface YourAnnotation {
//    //...
//}
//
//@interface TheirAnnotation{
//
//}










/*----------------------------------------------------------------------------------------------------------------------
    Bir annotation'ın elemanları default değerler alabilir aynı zamanda işaretlme sırasında default değer kullanılabilir.
    Default değeri olmayan elemanların işaretlemede değerlerinin kesinlikle verilmesi gerekir. Aksi durumda error oluşur.
---------------------------------------------------------------------------------------------------------------------*/
//@MyAnnotation(message = "This is a test", value = 20)
//class Sample {
//    @MyAnnotation(message = "This is another test") //value = 0
//    private int m_x;
//
//    @MyAnnotation //message = "", value = 0
//    public void foo(int x)
//    {
//    }
//
//    @MyAnnotation() //message = "", value = 0
//    public void bar(int x)
//    {
//    }
//
//    @YourAnnotation(value = 10)
//    public static class MyClass {
//        //...
//    }
//}
//
//@interface MyAnnotation {
//    String message() default "";
//    int value() default 0;
//}
//
//@interface YourAnnotation {
//    int value();
//}












/*----------------------------------------------------------------------------------------------------------------------
    Bir annotation'ın elemanının ismi value ise (her türden olabilir) işaretleme yaparken yalnızca value elemanına
    değer verilecekse bu durumda "value =" biçiminde kullanılmayabilir. Yani sadece değeri yazılabilir. Dikkat edilirse
    bu kural yalnızca value ismi için ve işaretlemede value'nun tek başına değerinin verilmesi durumunda geçerlidir
---------------------------------------------------------------------------------------------------------------------*/
//@MyAnnotation(value = 20, message = "This is a test")
//class Sample {
//    @MyAnnotation(message = "This is another test") //value = 0
//    private int m_x;
//
//    @MyAnnotation //message = "", value = 0
//    public void foo(int x)
//    {
//    }
//
//    @MyAnnotation(20)
//    public void bar(int x)
//    {
//    }
//
//    @YourAnnotation(10)
//    public static class MyClass {
//        //...
//    }
//}
//
//@interface MyAnnotation {
//    String message() default "";
//    int value() default 0;
//}
//
//@interface YourAnnotation {
//    int value();
//}


















/*----------------------------------------------------------------------------------------------------------------------
    Java'da annotation'lar 3(üç) kategoriye ayrılır: RUNTIME, CLASS, SOURCE

    RUNTIME: Çalışma zamanında da kullanılmak üzere tasarlanmış bir annotation belirtir. Bir annotion'ın çalışma
    zamanında nasıl kullanılacağı (ki aslında bu annotation bilgisi elde etmek demektir) "reflection" konusunda ele
    alınacaktır. Şüphesiz bu annotation arakoda da yazılır.

    CLASS: Derleyici tarafından arakoda yazılsa da çalışma zamanında kullanılamayan annotation'dır.

    SOURCE: Derleyicinin arakoda eklemediği annotation'dır.

    Anahtar Notlar: Yukarıdaki kategorilere "retention policy" denir.
    Bir annotatiın'ın retention policy değeri Retention isimli bir annotation ile belirtilir.

    Bir annotation'ın hangi kategoride olduğu Retention isimli bir başka annotation ile belirlenir. Bir annotation'a
    herhangi bir kategori verilmezse default olarak CLASS kategorisinde olur
---------------------------------------------------------------------------------------------------------------------*/

//@MyAnnotation(value = 20, message = "This is a test")
//class Sample {
//    @MyAnnotation(message = "This is another test") //value = 0
//    private int m_x;
//
//    @MyAnnotation //message = "", value = 0
//    public void foo(int x)
//    {
//    }
//
//    @MyAnnotation(20)
//    public void bar(int x)
//    {
//    }
//
//    @YourAnnotation(10)
//    public static class MyClass {
//        //...
//    }
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@interface MyAnnotation {
//    String message() default "";
//    int value() default 0;
//}
//
//@Retention(RetentionPolicy.SOURCE)
//@interface YourAnnotation {
//    int value();
//}























/*----------------------------------------------------------------------------------------------------------------------
    Bir annotation elemanının türü dizi olabilir. Bu durumda diziye elemanlar küme parantezi ile verilebilir. Eğer
    tek bir eleman verilecekse küme parantezi kullanılmayabilir
---------------------------------------------------------------------------------------------------------------------*/
//@ButtonAnnotation({ButtonStatus.YES, ButtonStatus.NO, ButtonStatus.CANCEL})
//class Window {
//
//}
//
//@ButtonAnnotation(ButtonStatus.OK)
//class DialogBox {
//
//}
//
//enum ButtonStatus {
//    OK, YES, NO, CANCEL
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@interface ButtonAnnotation {
//    ButtonStatus [] value() default ButtonStatus.OK;
//}























/*----------------------------------------------------------------------------------------------------------------------
    Bir annotation'ın hangi bildirimlerin önünde yazılabileceği Target isimli bir annotation ile belirlenebilir.
    Hiç bir belirleme yapılmamışsa annotation tüm bildirimlere konabilir.
---------------------------------------------------------------------------------------------------------------------*/
//@ButtonAnnotation({ButtonStatus.YES, ButtonStatus.NO, ButtonStatus.CANCEL})
//class Window {
//    //...
//}
//
//@ButtonAnnotation(ButtonStatus.OK)
//class DialogBox {
//    @ButtonAnnotation //error
//    public void foo()
//    {
//
//    }
//}
//
//@MyTest("Test class")
//class Test {
//    @MyTest //erro
//    private int m_value;
//    @MyTest("IsPrime method unit test")
//    public void testIsPrimeMethod()
//    {
//
//    }
//}
//
//enum ButtonStatus {
//    OK, YES, NO, CANCEL
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
//@interface ButtonAnnotation {
//    ButtonStatus [] value() default ButtonStatus.OK;
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD, ElementType.TYPE})
//@interface MyTest {
//    String value() default "";
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Override annoation'ı SOURCE ve yalnızca metot bildirimlerinde kullanılabilen bir annotation'dır.Bu annotation herhangi
    bir elemanı yoktur. Bu annotation metodun override edilip edilemeyeceğinin derleme zamanında kontrol edilmesi için
    kullanılır. Eğer metot override edilemeyecek şekilde yazılmışsa error oluşur. Override işleminde kullanılması
    zorunlu değildir. Ancak her zaman kullanılmalıdır. Ayrıca bu annotation okunabilirliği de artırır
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        A x = new B();
//
//        x.foo(10, 20);
//    }
//}
//
//class B extends A {
//    @Override
//    public void foo(double a, long b)
//    {
//        Console.writeLine("B.foo(double, int)");
//    }
//}
//
//class A {
//    public void foo(double a, long b)
//    {
//        Console.writeLine("A.foo(double, int)");
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Override annotation'ı ile işaretlenen bir metodun taban sınıfta veya implemente edilen arayüzde sanal metot karşılığı
    bulunmalıdır. Aksi durumda error oluşur. Aşağıdaki örnekte A sınıfının foo metodunun başlangıçta double ve long türden
    parametreli olduğunu düşünelim. Programcı A'nın foo metodunun parametrik yapısını değiştirirse Override annotation'ı
    ile metodun override edildiği sınıfta error oluşur. Halbuki bu  hikayade Override annotation'ı kullanılmasaydı
    yapılan işlem overload olduğunda herhangi bir derleme problemi oluşmayacaktı. Programcı da durumun farkında
    olamayacaktı.
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        A x = new B();
//
//        x.foo(10, 20);
//    }
//}
//
//class B extends A {
//    @Override //error
//    public void foo(double a, long  b)
//    {
//        Console.writeLine("B.foo(double, int)");
//    }
//}
//
//class A {
//    public void foo(double a, double b)
//    {
//        Console.writeLine("A.foo(double, double)");
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
    Deprecated annotation'ı bir bildirimin (metot, class vs.) deprecated olarak işaretlenmesi için kullanılır. Bu annotation
    bir RUNTIME annaotation'ı olsa da Java derleyicileri tarafından da dikkate edilir. Java derleyicileri deprecated işaretlenmiş
    olan bir bildirimin kullanılması durumunda (örneğin deprecated bir metodun çağrılması durumunda) uyarı (warning)
    mesajı verirler
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample s = new Sample();
//
//        s.foo();
//    }
//}
//
//class Sample {
//    @Deprecated
//    public void foo()
//    {
//        //...
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
    Deprecated annotation'ına Java 9 ile birlikte forRemoval ve since elemanları eklenmiştir. forRemoval default olarak
    false değerindedir. Deprecated işaretlenen bir elemanın ileride silinip silinmeyeceğini belirtmek için kullanılır.
    since elemanı ise String türündendir, default değeri boş string'dir. Genel olarak deprecate olan versiyonu belirtmek
    için kullanılır
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample s = new Sample();
//
//        s.foo();
//    }
//}
//
//class Sample {
//    @Deprecated(since = "MyFramework 1.2.3", forRemoval = true)
//    public void foo()
//    {
//        //...
//    }
//}












/*----------------------------------------------------------------------------------------------------------------------
    FunctionalInterface annotation'ı bir arayüzün fonksiyonel olduğuna yönelik bir işaretlemedir. Bu annotation da
    bir RUNTIME annotation'ı olmasına karşın derleyiciye de bilgi vermek amaçlı kullanılır. Bu annotation ile
    işaretlenmiş bir arayüz içerisinde bir ve yalnız bir tane abstract metot olmalıdır. Aksi durumda error oluşur. Tüm
    fonksiyonel arayüzler bu annotation ile işaretlenir. Bu convention'a JavaSE' de de uyulmuştur. Programcılar da
    uymalıdır. Bu arayüz aynı zamanda okunabilirliği de artırır. Aşağıdaki annotation için fonksiyonel arayüz durumu
    bozulacak herhangi bir işlem error oluşturur
---------------------------------------------------------------------------------------------------------------------*/

//@FunctionalInterface
//interface IBinaryOperation<T, R> {
//    R apply(T t);
//    default void foo()
//    {}
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Inherited annotation'ı yalnızca annotation sınıflara uygulanabilir. Inherited olarak işaretlene bir annotation
    türemiş sınıfa da aktarılmış olur. Bu annotiaon'ın kullanımı "reflection" konusunda ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/

//class B extends A {
//
//}
//
//@MyAnnotation
//class A {
//
//}
//
//@Inherited
////...
//@interface MyAnnotation {
//
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Bir annotation default olarak aynı bildirime birden fazla kez işaretlenemez. Bir annotation'ın aynı bildirimin
    önüne birden fazla getirilmesi için (yani işaretlenmesi için) annoation bildiriminde aşağıdaki adımlardan
    geçilmelidir:
    1. Annotation Repeatable isimli annotation ile işaretlenmelidir. Repeatable annotation'ı bir annotation sınıfın
    class referansını ister. Bu referans en basit şekilde <annotation ismi>.class ifadesi ile verilebilir. Class
    sınıfının detayları reflection konusunda ele alınacatır.

    2. Diğer annotation sınıfın Target değerleri ana annotation'ın target değerlerinden olmalıdır. Ana annotation ekstra
    eleman türleri eklenebilir. Diğer annotation sınıfın value isimli tekrarlanacak annotation dizi türünden elemanı
    olmalıdır.

    Yani aslında aşağıdaki örnek için, Commands annotation'ının target değerleri Command annotation'ının target değerlerinin
    alt kümesi olmalıdır biçiminde düşünülebilir

    Retetion değeri olarak diğer annotation'ın ana annotation'dan daha erişilebilir bir retention'a sahip olması gerek,ir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//
//    }
//}
//
//
//class Sample {
//    @Command("command1")
//    @Command("command2")
//    @Command("command3")
//    public void foo()
//    {
//        //...
//    }
//
//    @Commands({@Command("c1"), @Command("c2"), @Command("c3")})
//    public void bar()
//    {
//        //...
//    }
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD})
//@interface Commands {
//    Command [] value();
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD})
//@Repeatable(Commands.class)
//@interface Command {
//    String value() default "";
//}