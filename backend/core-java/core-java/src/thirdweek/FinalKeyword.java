package thirdweek;

public class FinalKeyword { }

/*----------------------------------------------------------------------------------------------------------------------
	final değişkenler:
	Bir değişkenin final olarak bildirilmesi o değişkenin bir kez değer alabileceği anlamına gelir. Yani final bir
	değişene bir kez atama yapılır. İkinci bir atama error oluşturur. final değişkenler sabit ifadesi olarak ele alınır.
	final yerel değişkenler ve parametre değişkenlerinin Java 8'den itibaren kullanımının anlamı kalmamıştır. Java 8
	öncesindeki kodlarda kullanılması zorunlu olan durumlar vardı. Ancak bu durumlar Java 8 ile birlikte değişti.final
	veri elemanları aynı durum geçerli değildir. final veri elemanlarının kullanılması gereken durumlar vardır.

	final veri elemanları için genel olarak şu kuraldan bahsedilebilir: Veri elemanının final yapılması algoritmik olarak
	geçerliyse kesinklikle yapılmalıdır.
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	final yerel değişkenlere faaliyet alanı boyunca bir kez atama yapılabilir. Genel olarak ilkdeğer verilse de
	faaliyet alanı boyunca tek atama olması koşuluyla istenildiği yerde atama yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        final int a = 10;
//        final double b;
//
//        b = 3.4;
//
//        //...
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun parametre değişkeni final olarak bildirilebilir. Bu durumda metodun final olan parametre değişkenine
	metot içerisinde atama yapılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void foo(final int a, int b)
//    {
//        ++a; //error
//        b--;
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	final ve non-static olarak bildirilen veri elemanlarına default değer atanmaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//
//class Sample {
//    public final int a; //error
//}


























/*----------------------------------------------------------------------------------------------------------------------
	non-static final veri elemanlarına bildirim sırasında değer atanabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//
//        System.out.println(s.a);
//    }
//}
//
//
//class Sample {
//    public final int a = 10;
//}



























