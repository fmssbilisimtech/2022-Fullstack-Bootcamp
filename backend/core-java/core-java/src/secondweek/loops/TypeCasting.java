package secondweek.loops;

public class TypeCasting { }


/*----------------------------------------------------------------------------------------------------------------------
	T1 ve T2 tür ismi olmak üzere T1 türünden T2 türüne yapılan doğrudan atama işlemine T1 türünden T2 türüne
	doğrudan dönüştürme (implicit conversion). Bu atama örneğin:
	T1 a;
	T2 b;

	b = a;

	şeklinde belirtilebilir. Aşağıdaki anlatılan kurallar aksi belirtilmediği sürece tüm atama durumları için
	geçerlidir.

	Yukarıdaki atamada T1 türüne kaynak tür (source type), T2 türüne hedef tür (target type). Java'da bir bir türün
	başka bir türe atanıp atanamayacağına derleme zamanında bakılır. Kaynak türe ilişkin değere yani çalışma zamanında
	atanmayacağına bakılmaz. Zaten çoğu zaman da bakılamaz.

	Java' da genel olarak bilgi kaybına yol açmayacak dönüşümler doğrudan geçerlidir.

	Anahtar Not: Java Language Specification dökümanında uzunluk olarak küçük türden uzunluk olarak büyük türe
	dönüşüme genişletme dönüşümü (widening conversion), büyük türden küçük türe yapılan dönüşüme ise
	daraltma dönüşümü (narrowing conversion) terimleri kullanılmaktadır
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte long türünün içerisindeki değere bakılmaksızın atama geçersiz olduğundan error oluşur
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        long a = 10;
//        int b;
//
//        b = a; //error
//    }
//}











/*----------------------------------------------------------------------------------------------------------------------
	 Küçük tamsayı türünden büyük tamsayı türüne doğrudan atama yapılabilir.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        byte a = 10;
//        int b;
//
//        b = a;
//
//        System.out.printf("a=%d%n", a);
//        System.out.printf("b=%d%n", b);
//
//    }
//}
















/*----------------------------------------------------------------------------------------------------------------------
	 Küçük tamsayı türünden büyük tamsayı türüne yapılan atamalarda küçük tamsayı türüne ilişkin değer
	 pozitif veya sıfır ise sayının eklenen yüksek anlamlı bit'leri sıfır ile beslenir.
	 Eğer sayı negatif ise sayının işaretinin değişmemesi yüksek anlamlı bitler 1(bir) ile beslenir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        short a = Short.parseShort(kb.nextLine());
//        int b;
//
//        b = a;
//
//        System.out.printf("a=%d%n", a);
//        System.out.printf("a=0x%X%n", a);
//        System.out.printf("b=%d%n", b);
//        System.out.printf("b=0x%X%n", b);
//    }
//}














/*----------------------------------------------------------------------------------------------------------------------
	 Hiç bir türden char türüne doğrudan atama yapılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int val = 67;
//        char ch = val; //error
//    }
//}
















/*----------------------------------------------------------------------------------------------------------------------
	 Yukarıdaki kuralın istisnası olarak "char türü sınırları içerisinde kalan int türden bir sabit" char türüne
	 doğrudan atanabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int val = 67;
//        char c1 = 67;
////        char c2 = 70000; //error
////        char c3 = 67L; //error
////        char c4 = val; //error
//        System.out.println(c1);
//    }
//}














/*----------------------------------------------------------------------------------------------------------------------
	 char türünden short türüne doğrudan atama geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        char a = 40000;
//        short b;
//
////        b = a; //error
//        System.out.println(a);
//    }
//}



















/*----------------------------------------------------------------------------------------------------------------------
	 char türünden kendisinden uzunluk olarak büyük türlere doğrudan atama geçerlidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        char a = 'C';
//        int b;
//
//        b = a;
//
//        System.out.printf("b=%d%n", b);
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
	 char türünden kendisinden uzunluk olarak büyük türlere doğrudan atama geçerlidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        char a = 'C';
//        double b;
//
//        b = a;
//
//        System.out.printf("b=%f%n", b);
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
	 Bilindiği gibi Java'da byte ve short türden sabit yoktur. Ancak "sınırlar içerisinde kalan int türden bir sabit"
	 byte/short türüne atanabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        short x = 10;
//        byte y = 30;
//
//
//        x = 40000; //error
//        x = 40L; //error
//
//        int val = 10;
//
//        x = val; //error
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
	 Bütün tamsayı türlerinden gerçek sayı türlerine doğrudan atama geçerlidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        long a = 10;
//        float b;
//
//        b = a;
//        System.out.println(b);
//    }
//}













/*----------------------------------------------------------------------------------------------------------------------
	 Gerçek sayılardan tamsayı türlerine atama geçersizdir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        float a = 10;
//        long b;
//
//        b = a; //error
//    }
//}















/*----------------------------------------------------------------------------------------------------------------------
	 float türünden double türüne doğrudan atama geçerlidir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        float a = 10;
//        double b;
//
//        b = a;
//    }
//}



















/*----------------------------------------------------------------------------------------------------------------------
	Temel türler için doğrudan dönüşüm tablosu:
	byte 	-> short, int, long, float, double
	short 	-> int, long, float, double
	int 	-> long, float, double
	long 	-> float, double
	float 	-> double
	char 	-> int, long, float, double
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 short, byte ve char türlerine "sınırlar içerisinde kalması koşuluyla int türden sabit atanması" detayları
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 short, byte ve char türlerine "sınırlar içerisinde kalması koşuluyla int türden sabit atanması" kuralları
	 metodun geri dönüş değerinin geçici değişkene atanması işleminde de geçerlidir
----------------------------------------------------------------------------------------------------------------------*/




















/*----------------------------------------------------------------------------------------------------------------------
	 İki operandlı bir operatör için derleyici önce operandların türlerine bakar. Operandlar farklı türdense
	 önce ortak türe dönüştürür sonra işlemi yapar. Bu dönüştürmeye işlem öncesi otomatik tür dönüştürmesi denir
	 Bu kuralın özeti "Genel olarak küçük türe ilişkin değer büyük türe dönüştürülür. Sonuç büyük türden elde edilir"
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int a;
//        long b;
//
//        a = 10;
//        b = 30L;
//
//        long c = a + b;
//
//        System.out.printf("c=%d%n", c);
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
	 İşlem öncesinde her iki operand da byte, short ve char türlerindense (yani uzunluk olarak int türünden küçükse)
	 her iki operand da int türüne yükseltilir (integer promotion), sonuç int türden çıkar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        short a, b;
//        short c;
//
//        a = 10;
//        b = 20;
//
//        c = a + b; //error
//    }
//}

















/*----------------------------------------------------------------------------------------------------------------------
	 İşlem öncesinde her iki operand da byte, short ve char türlerindense (yani uzunluk olarak int türünden küçükse)
	 her iki operand da int türüne yükseltilir (integer promotion), sonuç int türden çıkar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        byte a, b;
//        short c;
//
//        a = 10;
//        b = 20;
//
//        c = a + b; //error
//    }
//}
















/*----------------------------------------------------------------------------------------------------------------------
	 Gerçek sayı türleri ve tamsayı türleri işleme sokulduğunda dönüştürme gerçek sayı türüne doğrudur ve sonuç
	 dönüştürülen gerçek sayı türünden çıkar.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        float a;
//        long b;
//
//        a = 3.4F;
//        b = 3;
//
//        float c;
//
//        c = a + b;
//    }
//}
















/*----------------------------------------------------------------------------------------------------------------------
	 char türü diğer türlerle işleme sokulabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        char a = 'C';
//        float b = 3;
//        float c;
//
//        c = a + b;
//
//        System.out.printf("c=%f%n", c);
//    }
//}




















/*----------------------------------------------------------------------------------------------------------------------
	 İşlem öncesi otomatik tür dönüşümü geçici değişken yaratılarak yapılır. Örnekte derleyici aşağıdakine benzer
	 bir kod üretir:
	 long temp = a;
	 long c = temp + b;
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        long b = 20;
//        long c = a + b; //**
//        //...
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	 Tür dönüştürme operatörünün genel biçimi:
	 (<tür ismi>) <operand>

	 Tür dönüştürme operatörü ile yapılan dönüşümlere "explicit conversion" denir. Genel olarak implicit olmayan
	 dönüşümler explicit olarak yapılır. Tür dönüştürme operatörünün kullanılma zorunluğu genel olarak bize
	 "ortada bir problem olabilir. Derleyici bunu doğrudan yapmamızı istemiyor. Benim derleyiciye durumun farkındayım
	 demem gerekiyor" algısı yaratmalıdır.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        int b = 3;
//
//        double c = (double)a / b;
//
//        System.out.printf("c=%f%n", c);
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
	 implicit olarak yapılabilen dönüşümler explicit olarak da yapılabilir. Ancak bunun kullanımı anlamsızdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        long b = (long)a;
//
//        System.out.printf("b=%d%n", b);
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	 Aşağdaki explicit dönüşüme ilişkin maddeler else-if biçiminde değerlendirilmelidir
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	 Dönüştürme sırasında kaynak türün içerisindeki değer hedef türün sınırları içeriisnde kalıyor ise bilgi kaybı
	 oluşmaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        long a;
//        int b;
//
//        a = 234;
//        b = (int)a;
//
//        System.out.printf("b=%d%n", b);
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	 Büyük tamsayı türünden küçük tamsayı türüne yapılan explicit dönüşümde sayının yüksek anlamlı byte değerleri
	 atılır. Elde edilen değer hedef tamsayı türüne atanır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        long a;
//        int b;
//
//        a = 100_000_000_000L;
//        b = (int)a;
//
//        System.out.printf("a=%d%n", a);
//        System.out.printf("a=0x%X%n", a);
//        System.out.printf("b=%d%n", b);
//        System.out.printf("b=0x%X%n", b);
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	 double türünden  float türüne yapılan explicit dönüüşmde bilgi kaybı olabilir. Bu durumda IEEE754 standardına
	 göre yuvarlama kuralları kullanılarak float türünde gösterilebilecek en yakın değer elde edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        double a;
//        float b;
//
//        a = 3.567;
//        b = (float)a;
//
//        System.out.printf("a=%.30f%n", a);
//        System.out.printf("b=%.30f%n", b);
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	 Gerçek sayı türünden tamsayı türüne explicit dönüşüm şu aşamalarla gerçekleşir:
	 - Sayının noktadan sonraki kısmı atılır
	 	- Elde edilen değer hedef türün sınırları içerisinde ise doğrudan hedef türe atanır
	 	- Elde edilen değer hedef türün sınırları içerisinde değilse:
	 		- Hedef tür byte, short, int ve char türlerinden biriyse elde edilen değer int türüne dönüştürülür
	 			- Elde edilen değer int türü sınırları içerisindeyse int türüne dönüşüm kuralları uygulanır. Elde edilen
	 			tamsayılar arasındaki tür dönüştürme kurallarına göre hedef türe dönüştürülür
	 			- Elde edilen değer int türü sınırları içerisinde değilse değerin pozitif ya da negatif olmasına göre
	 			int türünün en büyük veya en küçük değeri alınır ve hedef türe dönüştürülür
	 		- Hedef tür long türü ise elde edilen değer long türüne dönüştürülür
	 			- Elde edilen değer long türü sınırları içerisinde değilse değerin pozitif ya da negatif durumuna göre
	 			long türünün en büyük veya en küçük değeri alınır ve atanır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        double a;
//        int b;
//
//        a = 123.4567;
//
//        b = (int)a;
//
//        System.out.println(b);
//
//    }
//}










