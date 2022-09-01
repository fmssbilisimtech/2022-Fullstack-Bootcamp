package fourthweek;

import java.util.Random;
import java.util.Scanner;

public class WrapperClass { }


/*----------------------------------------------------------------------------------------------------------------------
	Sarmalayan Sınıflar (wrapper classes): Java'da her temel (built-in) türe karşılık bir sınıf getirilmiştir. Bunun
	nedeni bu sınıfları tanıdıkça anlaşılacaktır. Bu sınıflar sarmalamanın dışında ilgili türe ilişkin yardımcı
	elemanları da barındırırlar. Örneğin Integer sınıfının parseInt metodu bir yazıdan (String) int türden bir değer
	elde etmek için kullanılır. Temel türlere ilişkin sarmalayan sınıflar aşağıdaki gibidir:

	Temel Tür				Sarmalayan Sınıf İsmi
	----------------------------------------------
	short						Short
	int							Integer
	long						Long
	byte						Byte
	double						Double
	float						Float
	char						Character
	boolean						Boolean

	Bu türlerden tamsayı ve gerçek sayı türlerine ilişkin sınıflara nümerik sarmalayan sınıf denebilir.
	Bu sınıflara ilişkin temel özellikler şunlardır:
	- Tamsayı ve gerçek sayı türlerine ilişkin sınıflar (Short, Integer, Long, Byte, Float, Double) Number isimli bir sınıftan
	türetilmiştir. Number sınıfı java.lang paketi içerisindedir. Number sınıfının metotları ileride ele alınacaktır.

	- Sarmalayan sınıflar immutable'dır.

	- Bu sınıflar temel türden değerin heap de tutulması için kullanılır. Bu kavrama kutulama (boxing) denir. Bu konu
	ileride ele alınacaktır.

	- Java 9 ile birlikte sarmalayan sınıfların ctor'ları depracated olmuştur. Java 5 den itibaren zaten kullanılmayan
	bu ctor'lar artık hiç kullanılmamalıdır. Bunun nedeni ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Tamsayı, gerçek sayı ve char türlerine ilişkin sarmalayan sınıfların MIN_VALUE ve MAX_VALUE isimli final static
	veri elemanları vardır. Bu elemanlar ilişkin oldukları temel türdendir. Double ve Float sınıflarının MIN_VALUE
	değerlerinin pozitif olduğuna dikkat ediniz. Bu durum IEEE 754 formatına ilişkindir. double ve float türleri
	için sınırlar aşağıdaki gibi -+ biçimindedir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        System.out.printf("short:[%d, %d]%n", Short.MIN_VALUE, Short.MAX_VALUE);
//        System.out.printf("int:[%d, %d]%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
//        System.out.printf("long:[%d, %d]%n", Long.MIN_VALUE, Long.MAX_VALUE);
//        System.out.printf("byte:[%d, %d]%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
//        System.out.printf("char:[%d, %d]%n", (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);
//        System.out.printf("double:[-+%.325f, -+%f]%n", Double.MIN_VALUE, Double.MAX_VALUE);
//        System.out.printf("float:[-+%.325f, -+%f]%n", Float.MIN_VALUE, Float.MAX_VALUE);
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Boolean sınıfı haricindeki tüm sarmalayan sınıfların SIZE isimli final ve static veri elemanları ilgili
	temel türün bit cinsinden uzunluk bilgisini tutar. Bu eleman okunabilirliği artırmak için ilgili türün
	uzunluğu gerektiğinde kullanılabilir. Java' da temel türlerin uzunluğu sistemden sisteme değişmeyeceğinden
	doğrudan sayısal değerleri de kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        System.out.printf("sizeof(short)=%d bits%n", Short.SIZE);
//        System.out.printf("sizeof(int)=%d bits%n", Integer.SIZE);
//        System.out.printf("sizeof(long)=%d bits%n", Long.SIZE);
//        System.out.printf("sizeof(byte)=%d bits%n", Byte.SIZE);
//        System.out.printf("sizeof(char)=%d bits%n", Character.SIZE);
//        System.out.printf("sizeof(double)=%d bits%n", Double.SIZE);
//        System.out.printf("sizeof(float)=%d bits%n", Float.SIZE);
//    }
//
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Boolean sınıfı haricindeki tüm sarmalayan sınıfların BYTES isimli final ve static veri elemanları ilgili
	temel türün byte cinsinden uzunluk bilgisini tutar. Bu eleman okunabilirliği artırmak için ilgili türün
	uzunluğu gerektiğinde kullanılabilir. Java' da temel türlerin uzunluğu sistemden sisteme değişmeyeceğinden
	doğrudan sayısal değerleri de kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        System.out.printf("sizeof(short)=%d Bytes%n", Short.BYTES);
//        System.out.printf("sizeof(int)=%d Bytes%n", Integer.BYTES);
//        System.out.printf("sizeof(long)=%d Bytes%n", Long.BYTES);
//        System.out.printf("sizeof(byte)=%d Bytes%n", Byte.BYTES);
//        System.out.printf("sizeof(char)=%d Bytes%n", Character.BYTES);
//        System.out.printf("sizeof(double)=%d Bytes%n", Double.BYTES);
//        System.out.printf("sizeof(float)=%d Bytes%n", Float.BYTES);
//    }
//
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Bilindiği gibi nümeric türlerin parseXXX metotları ile bir yazıdan ilgili türe ilişkin değer elde edilebilir.
	Character sınıfı dışında tüm sarmalayan sınıfların parseXXX metotları vardır. Boolean sınıfı dışındaki tüm
	sarmalayan sınıfların pareXXX metotları yazıyı ilgili türe çeviremezse exception fırlatır. Boolean metodunun
	parseBoolean metodu çeviremedği bir yazı için false değerini döndürür. Yani kısaca parseBoolean metodu büyük-küçüğk
	harf duyarsız bir biçimde yazının true olması durumunda true değerini, diğer tüm yazılar için false değerini
	döndürür
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("true veya false giriniz:");
//        boolean flag = Boolean.parseBoolean(kb.nextLine());
//
//        System.out.printf("flag=%b%n", flag);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Integer sınıfının radix (sayı sistemi) parametreli parseInt metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Sayı sistemini giriniz:");
//        int radix = Integer.parseInt(kb.nextLine());
//
//        System.out.printf("%d sayı sistemine uygun bir sayı giriniz:", radix);
//        int val = Integer.parseInt(kb.nextLine(), radix);
//
//        System.out.printf("val=%d%n", val);
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Sarmalayan sınıfların ctor'ları Java 9 ile birlikte deprecated olmuştur. Yani kutulama işlemi için ctor'lar
	kullanılmamalıdır. Zaten ileride anlatılacak sebeplerden dolayı Java 5'den itibaren zaten ctor kullanımı
	tavsiye edilmemektedir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Integer iVal = new Integer(10);
//        Double dVal = new Double(20.2);
//
//        //...
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Kutulama için sarmalayan sınıfların valueOf metotları ctor yerine kullanılmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Integer iVal = Integer.valueOf(10);
//        Double dVal = Double.valueOf(20.2);
//        Boolean bVal = Boolean.valueOf(true);
//
//        //...
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
	Integer sınıfının (aslında tamsayı türlerine ilişkin tüm sarmalayan sınıfların) valueOf metotları [-128, 127]
	aralığındaki değerleri bir önbellekte (cache) tutar. Böylelikle daha efektif bir çalışma sağlanır.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Integer iVal1 = Integer.valueOf(100);
//        Integer iVal2 = Integer.valueOf(100);
//
//        System.out.println(iVal1 == iVal2);
//        //...
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	[-128, 127] aralığı dışında kalan değerler için önbellek kullanılacağı garanti değildir. Bu JDK yazanlara
	bırakılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Integer iVal1 = Integer.valueOf(100);
//        Integer iVal2 = Integer.valueOf(100);
//
//        System.out.println(iVal1 == iVal2);
//        //...
//    }
//}


















/*----------------------------------------------------------------------------------------------------------------------
	Character sınıfı [0, 127] (standart ASCII karkaterleri) aralığındaki karakterlere ilişkin sıra numarasını
	önbellekte tutar. Diğer karakterlere ilişkin sıra numaralarının önbellekte tutulacağının bir garantisi yoktur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Character c1 = Character.valueOf('C');
//        Character c2 = Character.valueOf('C');
//        Character c3 = Character.valueOf('Ş');
//        Character c4 = Character.valueOf('Ş');
//
//        System.out.println(c1 == c2);
//        System.out.println(c3 == c4);
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Number sınıfının xxxValue metotları nümerik sarmalayan sınıflar için ilişkin olduğu temel türe göre tür dönüştürme
	kurallarına uygun olarak çalışır. Yani örneğin, bir int değerin short türüne explicit olarak atanması durumunda elde
	edilen değer Integer sınıfı ile sarmalanmış bir değere ilişkin nesnenin shortValue metodunun döndürdüğü değer ile
	aynıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int val = 200000;
//        Integer iVal = Integer.valueOf(val);
//        short a = (short)val;
//        short b = iVal.shortValue();
//
//        System.out.printf("a=%d%n", a);
//        System.out.printf("b=%d%n", b);
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Kutulama işlemi ile kutulanmış bir değere ilişkin nesnenin referansı da Object referansı ile tutulabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Object object = Integer.valueOf(10);
//
//        System.out.println(object.getClass().getName());
//
//        int val = ((Integer)object).intValue();
//
//        System.out.printf("val=%d%n", val);
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
	Java 5 ile birlikte temel türlere ilişkin sarmalayan sınıf referanslarına ilgili türden bir değer doğrudan
	atanabilmektedir. Bu işlem aslında derleyici tarafından aşağıdaki gibi bir kod üretilmesini sağlar. Yani programcı
	bu atamayı yaptığında derleyici uygun kodu üretir. Bu işleme "auto-boxing (otomatik kutulama)".
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Integer iVal1 = 10; //auto-boxing: Integer.valueOf(10);
//        Integer iVal2 = 10; //auto-boxing: Integer.valueOf(10);
//
//        System.out.println(iVal1 == iVal2);
//
//        Double dVal = 3.4; //auto-boxing: Double.valueOf(3.4);
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Otomatik kutulama Object türü için de geçerlidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Object o = 10;
//
//        System.out.println(o.getClass().getName());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki metot çağrılarında otomatik kutulama yapılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo(10); //auto-boxing
//        Sample.foo('c'); //auto-boxing
//        Sample.foo("ankara"); //upcasting
//        Sample.foo(new Random()); //upcasting
//    }
//}
//
//
//class Sample {
//    public static void foo(Object o)
//    {
//        System.out.println(o.getClass().getName());
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Temel türden bir değer o türe ilişkin sarmalayan sınıf referansına doğrudan atanabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Double d = 10; //error: Integer.valueOf(10);
//
//        //...
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	Java 5 ile birlikte sarmalayan sınıf referansı ilişkin olduğu türe doğrudan atanabilir. Bu durumda yine derleyici
	aşağıdaki gibi kod üretir. Bu işleme "auto unboxing (otomatik kutu açma)" denir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Integer iVal = 10; //auto boxing
//        int a = iVal; //auto unboxing: iVal.intValue();
//
//        System.out.printf("a=%d%n", a);
//
//        Double dVal = 2.3;//auto boxing
//        double b = dVal; //auto unboxing: dVal.doubleValue();
//
//        System.out.printf("b=%f%n", b);
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki durumda error oluşmaz çünkü Derleyicinin ürettiği kodda çağrılan intValue metodunun geri dönüş
	değeri int türdendir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Integer iVal = 10; //auto boxing
//        double a = iVal; //auto unboxing: iVal.intValue();
//
//        System.out.printf("a=%f%n", a);
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Sarmalayan sınıflar immutable olduğundan aşağıdaki örnekte ++ operatörü aslında yeni nesne yaratılıp eski
	nesnenin kopartılması biçiminde yapılmaktadır. Şüphesiz bu işlem de otomatik kutulama ve otomatik kutu açma
	ile kolayca yapılabilmektedir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Integer i = 10;
//
//        ++i; // i = i.intValue() + 1
//
//        int a = i;
//
//        System.out.println(i);
//    }
//}

















/*----------------------------------------------------------------------------------------------------------------------
	++ operatörü ile nesnenin içeriğinin değiştirilmediğinin ispatı
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        Integer i = 10;
//        Integer temp = i;
//
//        ++i;
//
//        System.out.println(i == temp);
//    }
//}































