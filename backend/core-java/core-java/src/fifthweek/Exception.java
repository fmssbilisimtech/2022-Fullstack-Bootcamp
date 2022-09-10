package fifthweek;

import util.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class Exception { }
/*----------------------------------------------------------------------------------------------------------------------
    Exception İşlemleri:
    Exception programlamada genel olarak çalışma zamanında oluşan hatalara denir. Ancak bazen bir exeception hata
    durumuna ilişkin olmayabilir. Exception oluştuğunda programın nasıl devam edeceğinin belirlenmesine
    "exception handling" denir. Örneğin, bir yön bulma uygulamasında uygulamanın GPS sensöründen bilgi alamaması
    durumu bir exception durumudur. Bu durumda program bunu kullanıcıya belirterek uygulamanın devam etmesini
    sağlayabilir.

    Java' da exception işlemleri için aşağıdaki anahtar sözcükler kullanılır:
    try, catch, throw, finally, throws

    Bir exception throw anahtar sözcüğü ile fırlatılabilir. throw anahtar sözcüğünün genel biçimi şöyledir:

    throw <referans>;

    throw anahtar sözcüğü bir referans alır. throw anahtar sözcüğünün aldığı referansın Throwable sınıfından doğrudan
    ya da dolaylı olarak türemiş bir sınıf türünden olması gerekir.

    Bir exception fırlatıldığında akış exception'ın fırlatıldığı metottan çıkar.

    Bir exception yakalanamaz ise bu durumda exception ın fırlatıldığı akış (thread) sonlanır.

    Akış exception bakımından ele alınacaksa (handling) try bloğu içerisinde yazılmalıdır. try bloğu
    catch bloğu veya blokları veya tek başına finally bloğu veya catch blokları ve finally bloğu
    ile devam edebilir. try bloğu tek başına olamaz. try bloğu tüm diğer blokları ile birlikte tek bir deyimdir.
    try bloğu ile birlikte bulunan diğer bloklar arasında herhangi bir deyim yazılamaz.

    catch bloğunun parantezi içerisinde yazılan parametreye catch parametresi denir. catch parametresine
    ilişkin türün bir exception sınıfı yani Throwable'dan doğrudan ya da dolaylı olarak türetilmiş
    bir sınıf türünden olması gerekir.

    Exception oluşursa (fırlatılırsa) akış try bloğundan bir daha geri dönmemek üzere (non-resumptive) catch bloklarına
    sıçrar. catch blokları yukarıdan aşağıya switch deyimi gibi teker teker kontrol edilir. Uygun catch bloğu bulunursa
    o catch bloğu çalıştırılır. Uygun catch bloğu fırlatılan exception nesnesinin adresinin (referansının) ilgili catch
    parametresine doğrudan atanabildiği ilk catch bloğudur. Exception yakalanırsa yakalanan catch bloğuna ilişkin kodlar
    çalıştırılır. Kodlar bitince tüm diğer catch blokları atlanarak akış devam eder. Eğer exception hiç yakalanamazsa akış
    çöker. Yani bir catch bloğu çalıştırılırsa diğer catch blokları çalıştırılmaz. try bloğu exception oluşmadan sonlanırsa
    tüm catch blokları atlanarak akış devam eder.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
     Aşağıdaki örnekte MyException sınıfı doğrudan ya da dolaylı olarak Throwable sınıfından türetilmediği için
     throw' a referans olarak verilemez
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val <= 0) {
//            MyException ex = new MyException();
//
//            throw ex; //error
//        }
//
//        //...
//    }
//
//}
//
//class MyException {
//
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Bir exception fırlatılması
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        double val = Double.parseDouble(kb.nextLine());
//
//        System.out.printf("log(%f)=%f%n", val, MathUtil.myLog(val));
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val <= 0) {
//            MyException ex = new MyException();
//
//            throw ex;
//        }
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}


































/*----------------------------------------------------------------------------------------------------------------------
    throw ile o an nesne yaratılarak fırlatılmasına ilişkin ifade çok sık kullanılmaktadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        double val = Double.parseDouble(kb.nextLine());
//
//        System.out.printf("log(%f)=%f%n", val, MathUtil.myLog(val));
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val <= 0)
//            throw new MyException();
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}




































/*----------------------------------------------------------------------------------------------------------------------
    try-catch blokları: Örnekte parseDouble metodunun fırlattığı exception'ın yakalanamadığına dolayısıyla bu exception
    fırlatıldığında akışın sonlandığına dikkat ediniz. Kodu çeşitli sayılarla test ediniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        double val = Double.parseDouble(kb.nextLine());
//
//        try {
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println("My Excepion yakalandı");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val <= 0)
//            throw new MyException();
//
//        return Math.log(val);
//    }
//}
//
//class MyException extends RuntimeException {
//    //...
//}































/*----------------------------------------------------------------------------------------------------------------------
    try-catch blokları: Örnekte parseDouble metodunun fırlattığı exception'ın yakalanamadığına dolayısıyla bu exception
    fırlatıldığında akışın sonlandığına dikkat ediniz. Kodu çeşitli sayılarla test ediniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        double val = Double.parseDouble(kb.nextLine());
//
//        try {
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println("My Exception yakalandı");
//        }
//        catch (YourException ex) {
//            System.out.println("Your Excepion yakalandı");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends RuntimeException {
//    //...
//}


































/*----------------------------------------------------------------------------------------------------------------------
    Taban sınıf parametreli catch bloğu o sınıftan türemiş olan sınıflara ilişkin exception nesnelerini yakalayabilir.
    Bu işlem aslında bir upcasting işlemidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        double val = Double.parseDouble(kb.nextLine());
//
//        try {
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println("My Excepion yakalandı");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends MyException {
//    //...
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Türemiş sınıf exception parametreli catch bloğu taban sınıf parametreli catch bloğundan sonra yazılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        double val = Double.parseDouble(kb.nextLine());
//
//        try {
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println("My Exception yakalandı");
//        }
//        catch (YourException ex) { //error
//            System.out.println("Your Exception yakalandı");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends MyException {
//    //...
//}








































/*----------------------------------------------------------------------------------------------------------------------
    Türemiş sınıf exception parametreli catch bloğu taban sınıf parametreli catch bloğundan önce yazılmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        double val = Double.parseDouble(kb.nextLine());
//
//        try {
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (YourException ex) {
//            System.out.println("Your Exception yakalandı");
//        }
//        catch (MyException ex) {
//            System.out.println("My Exception yakalandı");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends MyException {
//    //...
//}










































/*----------------------------------------------------------------------------------------------------------------------
    Bir kod paraçasının try bloğu içerisine alınması o kod parçasının fırlattığı exception'ın yakalanacağı
    anlamına gelmez. Fırlatma işleminden sonra uygun catch bloğunun bulunması gerekir. Aksi durumda akış sonlanır.
    Bu durumda aslında akış hemen sonlanmaz. Detaylar ileride ele alınacaktır. Aşağıdaki örnekte parseDouble metodunun
    fırlattığı exception nesnesini yakalayabilecek bir catch bloğu bulunamadığından akış sonlanır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (YourException ex) {
//            System.out.println("Your Exception yakalandı");
//        }
//        catch (MyException ex) {
//            System.out.println("My Exception yakalandı");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends MyException {
//    //...
//}






































/*----------------------------------------------------------------------------------------------------------------------
    Throwable parametreli catch bloğu tüm fırlatılan exception nesnelerini yakalayabilir. Şüphesiz Throwable parametreli
    catch bloğunun tüm catch bloklarından sonra yazılması gerekir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (YourException ex) {
//            System.out.println("Your Exception yakalandı");
//        }
//        catch (MyException ex) {
//            System.out.println("My Exception yakalandı");
//        }
//        catch (Throwable ex) {
//            System.out.println("Exception yakalandı");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends MyException {
//    //...
//}













































/*----------------------------------------------------------------------------------------------------------------------
    Bir try bloğu içerisinde bir exception yakalanamaz ise o try bloğunu kapsayan try bloğunun catch bloklarına
    bakılır. Bu işlem uygun catch bloğu bulununcaya veya bulunamayıncaya kadar devam eder. Bulunursa uygun catch bloğu
    çalıştırılır bulunamazsa akış sonlanır. Eğer bir exception try bloğu içerisinde yakalanmışsa kapsayan try bloklarının
    catch bloklarına bakılmaz. Aşağıdaki örneği çeşitli girdiler ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Sample.foo();
//            System.out.println("main:try sonu");
//        }
//        catch (YourException ex) {
//            System.out.println("main:Your Exception yakalandı");
//        }
//        catch (MyException ex) {
//            System.out.println("main:My Exception yakalandı");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class Sample {
//    public static void foo()
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println("foo:My Exception yakalandı");
//        }
//
//        System.out.println("foo sonu");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends RuntimeException {
//    //...
//}








































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte foo metodu MyException fırlatıldığında onu yakalamış ve aynı nesneyi yeniden fırlatmıştır.
    Bu işleme "rethow" denir.

    Aşağıdaki örnekte foo metodu müşteri kodları açısından MyException fırlatmış olur. Bu foo için oluşturulacak
    dökümanda yazılır. foo metodunu yazan açısından ise Myexception hem ilgili try bloğunda işlenmiş hem de aynı exception
    nesnesi müşteri koda fırlatılmış olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Sample.foo();
//            System.out.println("main:try sonu");
//        }
//        catch (YourException ex) {
//            System.out.println("main:Your Exception yakalandı");
//        }
//        catch (MyException ex) {
//            System.out.println("main:My Exception yakalandı");
//        }
//        catch (Throwable ex) {
//            System.out.println("main:Throwable yakalandı");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class Sample {
//    public static void foo()
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println("foo:My Exception yakalandı");
//            throw ex; //rethrow
//        }
//
//        System.out.println("foo sonu");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends RuntimeException {
//    //...
//}





































/*----------------------------------------------------------------------------------------------------------------------
    finally bloğu try bloğundan nasıl çıkılırsa çıkılsın çalıştırılacak bloktur. finally bloğu try bloğunda catch
    blokları ile birlikte olacaksa tüm catch bloklarının sonunda olmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Sample.foo();
//            System.out.println("main:try sonu");
//        }
//        catch (YourException ex) {
//            System.out.println("main:Your Exception yakalandı");
//        }
//        catch (MyException ex) {
//            System.out.println("main:My Exception yakalandı");
//        }
//        finally {
//            System.out.println("main:finally");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class Sample {
//    public static void foo()
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println("foo:My Exception yakalandı");
//        }
//        finally {
//            System.out.println("foo:finally");
//        }
//
//        System.out.println("foo sonu");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends RuntimeException {
//    //...
//}












































/*----------------------------------------------------------------------------------------------------------------------
    finally bloğu try bloğundan nasıl çıkılırsa çıkılsın çalıştırılacak bloktur. finally bloğu try bloğunda catch
    blokları ile birlikte olacaksa tüm catch bloklarının sonunda olmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            double result = Sample.foo();
//
//            System.out.printf("result:%f%n", result);
//        }
//        catch (YourException ex) {
//            System.out.println("main:Your Exception yakalandı");
//        }
//        catch (MyException ex) {
//            System.out.println("main:My Exception yakalandı");
//        }
//        finally {
//            System.out.println("main:finally");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class Sample {
//    public static double foo()
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            return result;
//        }
//        catch (MyException ex) {
//            System.out.println("foo:My Exception yakalandı");
//            throw ex;
//        }
//        finally {
//            System.out.println("foo:finally");
//        }
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends RuntimeException {
//    //...
//}











































/*----------------------------------------------------------------------------------------------------------------------
    try-finally yani catch bloksuz bir try bloğu ile exception nesnesi yakalanmadan ve aynı zamanda exception
    oluşsa da oluşmasa da yapılacak bir işleme yönelik kod yazılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            double result = Sample.foo();
//
//            System.out.printf("result:%f%n", result);
//
//        }
//        catch (YourException ex) {
//            System.out.println("main:Your Exception yakalandı");
//        }
//        catch (MyException ex) {
//            System.out.println("main:My Exception yakalandı");
//        }
//        catch (NumberFormatException ex) {
//            System.out.println("main:NumberFormatException yakalandı");
//        }
//        finally {
//            System.out.println("main:finally");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class Sample {
//    public static double foo()
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//            //...
//            return result;
//        }
//        finally {
//            System.out.println("foo:finally");
//        }
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException();
//
//        if (val == 0)
//            throw new YourException();
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    //...
//}
//
//class YourException extends RuntimeException {
//    //...
//}












































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte return edilmeden önce try yazısı ekleneceğinden çıktı exceptiontryfinally biçiminde olur.
    Aşağıdaki örnete durumun anlaşılması için MutableString sınıfı yazılmıştır. Sınıf daha iyi yazılabilir. Burada
    bu durum gözardı edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        System.out.println(Sample.foo("exception")); //exceptiontryfinally
//    }
//}
//
//
//class Sample {
//    public static MutableString foo(String str)
//    {
//        MutableString mutableString = new MutableString(str);
//
//        try {
//            return mutableString.append("try");
//        }
//        finally {
//            mutableString.append("finally");
//        }
//    }
//}
//
//class MutableString {
//    private String m_str;
//
//    public MutableString(String str)
//    {
//        this.setStr(str);
//    }
//
//    public void setStr(String str)
//    {
//        //...
//        m_str = str;
//    }
//
//    public MutableString append(String str)
//    {
//        m_str += str;
//
//        return this;
//    }
//
//    //...
//
//    public String toString()
//    {
//        return m_str;
//    }
//}









































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        System.out.println(Sample.foo("exception")); //exceptiontry
//    }
//}
//
//
//class Sample {
//    public static String foo(String str)
//    {
//        MutableString mutableString = new MutableString(str);
//
//        try {
//            return mutableString.append("try").toString();
//        }
//        finally {
//            mutableString.append("finally");
//            System.out.printf("In foo:%s%n", mutableString);
//        }
//    }
//}
//
//class MutableString {
//    private String m_str;
//
//    public MutableString(String str)
//    {
//        this.setStr(str);
//    }
//
//    public void setStr(String str)
//    {
//        //...
//        m_str = str;
//    }
//
//    public MutableString append(String str)
//    {
//        m_str += str;
//
//        return this;
//    }
//
//    //...
//
//    public String toString()
//    {
//        return m_str;
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        System.out.println(Sample.foo("exception")); //exceptiontry
//    }
//}
//
//
//class Sample {
//    public static String foo(String str)
//    {
//        try {
//            str += "try";
//
//            return str;
//        }
//        finally {
//            str += "finally";
//            System.out.printf("In foo:%s%n", str);
//        }
//    }
//}













































/*----------------------------------------------------------------------------------------------------------------------
    Exception sınıfları içerisinde tutulan elemanlar ile bilgi taşınabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.printf("Exception message:%s%n", ex.getMessage());
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative");
//
//        if (val == 0)
//            throw new MyException("val can not be zero");
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    private final String m_message;
//
//    public MyException(String message)
//    {
//        m_message = message;
//    }
//
//    public String getMessage() {return m_message;}
//}













































/*----------------------------------------------------------------------------------------------------------------------
    Throwable sınıfı içerisinde exception işlemlerine yönelik bir takım veri elemanları bulunmaktadır. Bunlardan en temel
    olanı mesaja karşılık gelen elemandır. Throwable sınıfından türetilmiş olan sınıflar yani exception sınıfları genel
    olarak String parametreli ctor elemanını yazarlar böylelikle hiyararşik olarak mesaj elemanı Throwable sınıfına
    aktarılmış olur. İsterse programcı başka bilgileri de yazdığı exception sınıfına ekleyebilir. Throwable sınıfının
    getMessage metodu ile mesaj bilgisi elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.printf("Exception message:%s, Error Status:%s%n", ex.getMessage(), ex.getErrorStatus());
//
//            if (ex.getErrorStatus() == MyExceptionStatus.NEGATIVE)
//                System.out.println("Negatif değer kabul edilemez");
//            else
//                System.out.println("Sıfır değeri kabul edilemez");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative", MyExceptionStatus.NEGATIVE);
//
//        if (val == 0)
//            throw new MyException("val can not be zero", MyExceptionStatus.ZERO);
//
//
//        return Math.log(val);
//    }
//}
//
//enum MyExceptionStatus {ZERO, NEGATIVE}
//
//class MyException extends RuntimeException {
//    private final MyExceptionStatus m_errorStatus;
//
//    public MyException(String message, MyExceptionStatus errorStatus)
//    {
//        super(message);
//        m_errorStatus = errorStatus;
//    }
//
//    public MyExceptionStatus getErrorStatus()
//    {
//        return m_errorStatus;
//    }
//}









































/*----------------------------------------------------------------------------------------------------------------------
    getMessage metodu override edilebilir. Böylelikle programcı kendi exception sınıfına özel getMessage yazabilir.
    Aşağıdaki örnekte çok biçimli olarak MyException sınıfının getMessage metodu çağrılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative", MyExceptionStatus.NEGATIVE);
//
//        if (val == 0)
//            throw new MyException("val can not be zero", MyExceptionStatus.ZERO);
//
//
//        return Math.log(val);
//    }
//}
//
//enum MyExceptionStatus {ZERO, NEGATIVE}
//
//class MyException extends RuntimeException {
//    private final MyExceptionStatus m_errorStatus;
//
//    public MyException(String message, MyExceptionStatus errorStatus)
//    {
//        super(message);
//        m_errorStatus = errorStatus;
//    }
//
//    public MyExceptionStatus getErrorStatus()
//    {
//        return m_errorStatus;
//    }
//
//    public String getMessage()
//    {
//        return String.format("Message:%s, Error Status:%s", super.getMessage(), m_errorStatus);
//    }
//}








































/*----------------------------------------------------------------------------------------------------------------------
    Throwable sınıfının parametresiz printStackTrace metodu exception fırlatılması noktalarını bir stack biçiminde
    gösteren detaylı mesajı ekrana basar. Bu metotta basılan yazı akış exception yakalanmadığından dolayı sonlandığında da
    basılan yazı ile neredeyse aynıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative", ErrorStatus.NEGATIVE);
//
//        if (val == 0)
//            throw new MyException("val can not be zero", ErrorStatus.ZERO);
//
//
//        return Math.log(val);
//    }
//}
//
//enum ErrorStatus {ZERO, NEGATIVE}
//
//class MyException extends RuntimeException {
//    private final ErrorStatus m_errorStatus;
//    public MyException(String message, ErrorStatus errorStatus)
//    {
//        super(message);
//        m_errorStatus = errorStatus;
//    }
//
//    public ErrorStatus getErrorStatus()
//    {
//        return m_errorStatus;
//    }
//
//    public String getMessage()
//    {
//        return String.format("Message:%s, Error Status:%s", super.getMessage(), m_errorStatus);
//    }
//}








































/*----------------------------------------------------------------------------------------------------------------------
    Throwable sınıfı içerisinde Throwable türünden bir referans tutulur. Bu referans bir exception sınıfı içerisinde
    başka bir exception referansının tutulabilmesine olanak sağlar. getCause metodu ile içsel olarak tutulan referans
    elde edilebilir. Ayrıca Throwable sınıfının Throwble parametresi de alan ctor elemanı ile bu bilgi nesneye verilebilir
----------------------------------------------------------------------------------------------------------------------*/
//
//class App {
//    public static void main(String [] args)
//    {
//        try {
//            System.out.println(Sample.foo());
//        }
//        catch (WrapperException ex) {
//            System.out.println(ex.getMessage());
//            Throwable cause = ex.getCause();
//
//            if (cause instanceof NumberFormatException)
//                System.out.printf("Cause Message:%s%n", cause.getMessage());
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class Sample {
//    public static double foo()
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            return result;
//        }
//        catch (Throwable ex) {
//            //...
//            throw new WrapperException("foo exception", ex);
//        }
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new WrapperException("val < 0", new MyException("val can not be negative", ErrorStatus.NEGATIVE));
//
//        if (val == 0)
//            throw new WrapperException("val can not be zero");
//
//        return Math.log(val);
//    }
//}
//
//class WrapperException extends RuntimeException {
//    public WrapperException(String message)
//    {
//        super(message);
//    }
//
//    public WrapperException(String message, Throwable cause)
//    {
//        super(message, cause);
//    }
//
//    public String getMessage()
//    {
//        Throwable cause =  getCause();
//
//        return String.format("Message:%s%s",
//                super.getMessage(), cause != null ? ", Cause Message:" + cause.getMessage() : "");
//    }
//}
//
//enum ErrorStatus {ZERO, NEGATIVE}
//
//class MyException extends RuntimeException {
//    private final ErrorStatus m_errorStatus;
//    public MyException(String message, ErrorStatus errorStatus)
//    {
//        super(message);
//        m_errorStatus = errorStatus;
//    }
//
//    public ErrorStatus getErrorStatus()
//    {
//        return m_errorStatus;
//    }
//
//    public String getMessage()
//    {
//        return String.format("Message:%s, Error Status:%s", super.getMessage(), m_errorStatus);
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
    Java'da exception sınıfları kategori olarak iki gruba ayrılır: checked, unchecked
    unchecked exception sınıfları: Bir exception sınıfının türetme hiyararşisi içerisinde Error veya RuntimeException sınıfı
    varsa unchecked exception sınıfıdır.

    checked exception sınıfları: unchecked olmayan exception sınıflarıdır

    Anahtar Notlar: Bir exception sınıfının unchecked veya checked olmasının çalışma zamanı açısından bir önemi yoktur.
    Yani tüm exception sınıfları için exception mekanizmasının çalışma zamanı sırasında aynıdır. Bir exception
    sınıfının checked olması derleme zamanında bir takım özellikleri (detayları) beraberinde getirir.

    Anahtar Notlar: Exception sınıflarının yazımında geleneksel olarak Throwable sınıfından doğrudan türetme yapılmaz

    Anahtar Notlar: Türetme kavramı dolayısıyla bir exception sınıfından türetilen bir başka exception sınıfı
    kategori olarak taban sınıfı ile aynıdır. Yani taban sınıfı checked ise kendisi de checked bir exception
    sınıfı olur
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Checked ve unchecked exception sınıfları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class MyException extends Throwable { //checked
//
//}
//
//class YourException extends Error { //unchecked
//
//}
//
//class OurException extends Exception { //checked
//
//}
//
//class TheirException extends RuntimeException { //unchecked
//
//}
//
//class HisException extends TheirException { //unchecked
//
//}
//
//class HerException extends OurException { //checked
//
//}






























/*----------------------------------------------------------------------------------------------------------------------
    checked bir exception throw edilen metodun içerisinde eğer exception ele alınmayacaksa (handle) throws bildirimi
    yapılmalıdır. Aksi durumda error oluşur. Aşağıdaki kodu inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val) throws MyException
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative");
//
//        if (val == 0)
//            throw new MyException("val can not be zero");
//
//        return Math.log(val);
//    }
//}
//
//class MyException extends Exception {
//    public MyException(String message)
//    {
//        super(message);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    checked bir exception throw edilen metodun içerisinde eğer exception ele alınmayacaksa throws bildirimi
    yapılmalıdır. Aksi durumda error oluşur
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative"); //error
//
//        if (val == 0)
//            throw new MyException("val can not be zero"); //error
//
//        return Math.log(val);
//    }
//}
//
//class MyException extends Exception {
//    public MyException(String message)
//    {
//        super(message);
//    }
//}










































/*----------------------------------------------------------------------------------------------------------------------
    Birden fazla checked exception fırlatılması durumunda exception sınıfları arasında doğrudan ya da dolaylı olarak
    türetme ilişkisi yoksa hepsi birden throws listesine yazılmalıdır.
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val) throws MyException, YourException
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative");
//
//        if (val == 0)
//            throw new YourException("val can not be zero");
//
//        return Math.log(val);
//    }
//}
//
//class MyException extends Exception {
//    public MyException(String message)
//    {
//        super(message);
//    }
//}
//
//class YourException extends Exception {
//    public YourException(String message)
//    {
//        super(message);
//    }
//}








































/*----------------------------------------------------------------------------------------------------------------------
    checked exception fırlatma ihtimali olan bir akışın throws bildirimi yapılmayacaksa try bloğu içerisinde
    olması ve fırlatma ihtimali olan checked exception'ları yakalayabilecek catch bloklarının varolması zorunludur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val); //error
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val) throws MyException, YourException
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative");
//
//        if (val == 0)
//            throw new YourException("val can not be zero");
//
//        return Math.log(val);
//    }
//}
//
//class MyException extends Exception {
//    public MyException(String message)
//    {
//        super(message);
//    }
//}
//
//class YourException extends Exception {
//    public YourException(String message)
//    {
//        super(message);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
    checked exception sınıfı türünden parametreli bir catch bloğunun ait olduğu try bloğunda o checked exception
    türüne ilişkin nesneyi fırlatabilecek bir akış bulunmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = Math.log(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (MyException ex) { //error
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MyException extends Exception {
//    public MyException(String message)
//    {
//        super(message);
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki kural Exception ve Throwable sınıfları için geçerli değildir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            //...
//        }
//        catch (Exception ex) {
//            //...
//        }
//        catch (Throwable ex) {
//            //...
//        }
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
    Bir metodun fırlatabileceği checked exception sınıfları arasında türetme ilişkisi varsa throws listesine
    istenirse yalnızca taban sınıf yazılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = Math.log(val);
//
//            System.out.printf("log(%f)=%f%n", val, result);
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val) throws MyException
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative");
//
//        if (val == 0)
//            throw new YourException("val can not be zero");
//
//
//        return Math.log(val);
//    }
//}
//
//class MyException extends Exception {
//    public MyException(String message)
//    {
//        super(message);
//    }
//}
//
//class YourException extends MyException {
//    public YourException(String message)
//    {
//        super(message);
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    throws bildirimi olan bir metodun override edilmesi durumunda override edilen metotta throws listesinde
    olan exception sınıfları kaldırılabilir. Yani örneğin, hiç throws listesi de yazılmayabilir. throws listesi
    override edilen metotta olacaksa throws listesindeki sınıflar ya taban sınıfın metoduyla aynı olan veya ondan türemiş
    sınıflar türünden olmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class E extends A {
//    public void foo() throws TheirException //error
//    {
//        //...
//    }
//}
//
//class D extends A {
//    public void foo() throws OurException
//    {
//
//    }
//}
//
//class C extends A {
//    public void foo() throws MyException
//    {
//        //...
//    }
//}
//
//class B extends A {
//    public void foo()
//    {
//        //...
//    }
//}
//
//abstract class A {
//    //...
//    public abstract void foo() throws MyException, YourException;
//}
//
//class MyException extends Exception {
//
//}
//
//class OurException extends MyException {
//
//}
//
//class YourException extends Exception {
//
//}
//
//class TheirException extends Exception {
//
//}








































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki problemden dolayı programcı aşağıdaki gibi kodda yöntemini değiştirmelidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void bar() throws YourException
//    {
//        //...
//    }
//}
//class B extends A {
//    public void foo() throws YourException //error
//    {
//        Sample.bar();
//    }
//}
//
//abstract class A {
//    public abstract void foo() throws MyException;
//}
//
//
//class MyException extends Exception {
//
//}
//class YourException extends Exception {
//
//}











































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki problem aşağıdaki gibi çözülebilir. Aşağıdaki kodda unchecked exception içerisine checked bir exceptiom
    referansı (cause) verilmiştir. Bu durumda yukarıdaki hata oluşmaz. Bu çözüm override ettiğimiz metoda ilişkin
    sınıfı bizim tasarlamadığımız durumlarda daha çok karşımıza çıkar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void bar() throws YourException
//    {
//        //...
//    }
//}
//
//class B extends A {
//    public void foo()
//    {
//        try {
//            Sample.bar();
//        }
//        catch (YourException ex) {
//            throw new WrapperException("wrapper", ex);
//        }
//    }
//}
//
//class WrapperException extends RuntimeException {
//    public WrapperException(String message)
//    {
//        super(message);
//    }
//    public WrapperException(String message, Throwable cause)
//    {
//        super(message, cause);
//    }
//
//    public String getMessage()
//    {
//        Throwable cause =  getCause();
//        return String.format("Message:%s%s",
//                super.getMessage(), cause != null ? ", Cause Message:" + cause.getMessage() : "");
//    }
//}
//
//abstract class A {
//    public abstract void foo() throws MyException;
//}
//
//class MyException extends Exception {
//
//}
//
//class YourException extends Exception {
//
//}






































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki problem abstract metodun çok genel bir kullanımı olabilecekse aşağıdaki gibi abstract metodun
    bildirimine throws Exception eklenerek çözülebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void bar() throws YourException
//    {
//        //...
//    }
//}
//
//class B extends A {
//    public void foo() throws YourException
//    {
//        Sample.bar();
//    }
//}
//
//abstract class A {
//    public abstract void foo() throws Exception;
//}
//
//class MyException extends Exception {
//
//}
//
//class YourException extends Exception {
//
//}





























/*----------------------------------------------------------------------------------------------------------------------
    NumberFormatException sınıfı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//
//        try {
//            System.out.print("Bir sayı giriniz:");
//            int val = Integer.parseInt(kb.nextLine());
//
//            System.out.println(val * val);
//        }
//        catch (NumberFormatException ex) {
//            System.out.printf("Message:%s%n", ex.getMessage());
//            System.out.println("Geçersiz formatta sayı girdiniz");
//        }
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
    ClassCastException sınıfı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new A();
//
//        B y = (B)x;
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class A {
//
//}
//
//class B extends A {
//
//}












































/*----------------------------------------------------------------------------------------------------------------------
    NullPointerException sınıfı
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Sample s = null;
//
//        s.foo();
//    }
//}
//
//class Sample {
//    public void foo()
//    {
//        //...
//    }
//}











































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte getRandomArray metodunun döndürdüğü referansın null olması durumunda NullPointerException
    nesnesi fırlatılır. NullPointerException nesnesinin try-catch bloğu ile işlenmesi genel olarak tercih edilmez.
    Akışın bu exception fırlatılması noktasına gelmesi engellenir. Hatta gerekirse başka bir exception fırlatılabilir.
    Örnekte ** ile belirtilen kodu kaldırarak test ediniz
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        Random r = new Random();
//
//        for (int i = 0; i < 5; ++i) {
//            System.out.print("Eleman sayısını giriniz:");
//            int n = Integer.parseInt(kb.nextLine());
//
//            System.out.print("Minimum değeri giriniz:");
//            int min = Integer.parseInt(kb.nextLine());
//
//            System.out.print("Maximun değeri giriniz:");
//            int max = Integer.parseInt(kb.nextLine());
//
//            int [] a = Util.getRandomArray(r, n, min, max);
//
//            if (a == null) continue; //**
//
//            for (int val : a)
//                System.out.printf("%d ", val);
//
//            System.out.println("\n//////////////");
//        }
//    }
//}
//
//class Util {
//    //...
//    public static int [] getRandomArray(Random r, int n, int min, int max)
//    {
//        if (r == null || n <= 0|| min >= max)
//            return null;
//
//        int [] a = new int[n];
//
//        for (int i = 0; i < n; ++i)
//            a[i] = r.nextInt(max - min) + min;
//
//        return a;
//    }
//}
//
//class Sample {
//    public void foo()
//    {
//        //...
//    }
//}








































/*----------------------------------------------------------------------------------------------------------------------
    IllegalArgumentException sınıfı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("min?");
//        int min = Integer.parseInt(kb.nextLine());
//
//        System.out.print("max?");
//        int max = Integer.parseInt(kb.nextLine());
//
//        try {
//            Random r = new Random();
//
//            for (int i = 0; i < 10; ++i)
//                System.out.printf("%d ", RandomUtil.nextInt(r, min, max));
//
//            System.out.println();
//        }
//        catch (IllegalArgumentException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//
//class RandomUtil {
//    public static int nextInt(Random r, int min, int max)
//    {
//        if (r == null)
//            throw new IllegalArgumentException("r can not be null value");
//
//        if (min >= max)
//            throw new IllegalArgumentException(String.format("min must be less than max:min=%d, max=%d", min, max));
//
//        return r.nextInt(max - min) + min;
//    }
//}








































/*----------------------------------------------------------------------------------------------------------------------
    IndexOutOfBoundsException sınıfı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("n?");
//        int n = Integer.parseInt(kb.nextLine());
//
//        System.out.print("start?");
//        int start = Integer.parseInt(kb.nextLine());
//
//        System.out.print("end?");
//        int end = Integer.parseInt(kb.nextLine());
//
//        int [] a = ArrayUtil.getRandomArray(n, 0, 100);
//
//        ArrayUtil.display(2, a);
//        ArrayUtil.display(2, Util.getSubArray(a, start, end));
//    }
//}
//
//class Util {
//    public static int [] getSubArray(int []a, int start, int end) //[start, end)
//    {
//        if (a == null)
//            throw new IllegalArgumentException("a can not be null");
//
//        if (start < 0 || end < 0 || start >= end || start >= a.length || end > a.length)
//            throw new IndexOutOfBoundsException(String.format("Invalid bounds:start=%d, end=%d", start, end));
//
//        int [] res = new int[end - start];
//
//        for (int i = start; i < end; ++i)
//            res[i - start] = a[i];
//
//        return res;
//    }
//}








































/*----------------------------------------------------------------------------------------------------------------------
    ArrayIndexOutOfBoundsException sınıfı
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("n?");
//        int n = Integer.parseInt(kb.nextLine());
//
//        System.out.print("start?");
//        int start = Integer.parseInt(kb.nextLine());
//
//        System.out.print("end?");
//        int end = Integer.parseInt(kb.nextLine());
//
//        int [] a = ArrayUtil.getRandomArray(n, 0, 100);
//
//        ArrayUtil.display(2, a);
//        ArrayUtil.display(2, Util.getSubArray(a, start, end));
//    }
//}
//
//class Util {
//    public static int [] getSubArray(int []a, int start, int end) //[start, end)
//    {
//        if (a == null)
//            throw new IllegalArgumentException("a can not be null");
//
//        if (start < 0 || end < 0 || start >= end || start >= a.length || end > a.length)
//            throw new ArrayIndexOutOfBoundsException(String.format("Invalid bounds:start=%d, end=%d", start, end));
//
//        int [] res = new int[end - start];
//
//        for (int i = start; i < end; ++i)
//            res[i - start] = a[i];
//
//        return res;
//    }
//}








































/*----------------------------------------------------------------------------------------------------------------------
    UnsupportedOperationException sınıfı. Bu sınıf aşağıdaki gibi desteklenmeyen metotların boş bırakılması ya da
    geri dönüş değeri varsa anlamsız return deyimi yazmak yerine tercih edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new B();
//
//        x.foo();
//        //x.bar();
//    }
//}
//
//class B extends A {
//    public void foo()
//    {
//        //...
//    }
//
//    public int bar()
//    {
//        throw new UnsupportedOperationException("bar not supported in B");
//    }
//}
//
//abstract class A {
//    //...
//    public abstract void foo();
//    public abstract int bar();
//}








































/*----------------------------------------------------------------------------------------------------------------------
    Java 7 ile birlikte birden fazla exception için ortak bir iş yapılacaksa | atomu kullanılarak catch bloğu
    yazılabilir. Bu catch bloğu içerisinde iki sınıfın da ancak ortak elemanları kullanılablir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            double result = Sample.foo();
//
//            System.out.printf("result:%f%n", result);
//        }
//        catch (MyException | YourException ex) { //Since Java 7
//            System.out.println("ortak iş");
//            System.out.println(ex.getMessage());
//        }
//        catch (NumberFormatException ex) {
//            System.out.println("main:NumberFormatException yakalandı");
//        }
//        finally {
//            System.out.println("main:finally");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class Sample {
//    public static double foo()
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            return result;
//        }
//        finally {
//            System.out.println("foo:finally");
//        }
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative");
//
//        if (val == 0)
//            throw new YourException("val can not be zero");
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    public MyException(String msg)
//    {
//        super(msg);
//    }
//}
//
//class YourException extends RuntimeException {
//    public YourException(String msg)
//    {
//        super(msg);
//    }
//}









































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki işlem istenildiği kadar exception sınıfı ile yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            double result = Sample.foo();
//
//            System.out.printf("result:%f%n", result);
//        }
//        catch (MyException | YourException | NumberFormatException ex) { //Since Java 7
//            System.out.println("ortak iş");
//            System.out.println(ex.getMessage());
//        }
//        catch (Throwable ex) {
//            System.out.printf("Throwable:%s%n", ex.getMessage());
//        }
//        finally {
//            System.out.println("main:finally");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class Sample {
//    public static double foo()
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            return result;
//        }
//        finally {
//            System.out.println("foo:finally");
//        }
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative");
//
//        if (val == 0)
//            throw new YourException("val can not be zero");
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    public MyException(String msg)
//    {
//        super(msg);
//    }
//}
//
//class YourException extends RuntimeException {
//    public YourException(String msg)
//    {
//        super(msg);
//    }
//}









































/*----------------------------------------------------------------------------------------------------------------------
    Birden fazla exception'ın | atomu yakalanması durumunda exception sınıfları arasında türetme ilişkisi
    olmaması gerekir. Olması durumunda türemiş exception sınıfı taban sınıfı ile birlikte kullanılamaz. Zaten
    türemiş sınıf exception nesnesi taban sınıf parametreli catch bloğu ile yakalanabilir. Java bu durumda gereksiz
    kod yazımını engellemek için error oluşturur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try {
//            double result = Sample.foo();
//
//            System.out.printf("result:%f%n", result);
//        }
//        catch (MyException | YourException | NumberFormatException ex) { //error
//            System.out.println("ortak iş");
//            System.out.println(ex.getMessage());
//        }
//        catch (Throwable ex) {
//            //...
//        }
//        finally {
//            System.out.println("main:finally");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class Sample {
//    public static double foo()
//    {
//        try {
//            Scanner kb = new Scanner(System.in);
//
//            System.out.print("Bir sayı giriniz:");
//            double val = Double.parseDouble(kb.nextLine());
//            double result = MathUtil.myLog(val);
//
//            return result;
//        }
//        finally {
//            System.out.println("foo:finally");
//        }
//    }
//}
//
//class MathUtil {
//    public static double myLog(double val)
//    {
//        if (val < 0)
//            throw new MyException("val can not be negative");
//
//        if (val == 0)
//            throw new YourException("val can not be zero");
//
//
//        return Math.log(val);
//    }
//}
//
//
//class MyException extends RuntimeException {
//    public MyException(String msg)
//    {
//        super(msg);
//    }
//}
//
//class YourException extends MyException {
//    public YourException(String msg)
//    {
//        super(msg);
//    }
//}












