package firstweek.methods;

public class PrintF { }

/*----------------------------------------------------------------------------------------------------------------------
	System.out.printf metodunun ilk argümanı String atomu olmalıdır. printf metodu bu argüman dışında istenilen
	ve istenildiği kadar argüman alabilir. printf metodunun ilk argümanı olan String atomu içerisinde % karakteri
	ile birlikte anlamlı bazı karakterler kullanılabilir. Kullanılan bu karakterlere format belirleyici (format specifier)
	denir. Format karakterinin yüzde karakteri ile birlikte kullanımına yer tutucu (place holder) denir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Tamsayı türlerinin (short, int, long, byte) decimal formatlanması için d format karakteri kullanılır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int degree = 25;
//
//        System.out.printf("Bugün hava %d derece", degree);
//    }
//}




/*----------------------------------------------------------------------------------------------------------------------
	printf metodu ile x, X, h ve H format karakterleri kullanılarak tamsayı türleri hexadecimal olarak gösterilebilir
	printf metodu yazıyı bastıktan sonra imleci son karakterden sonraya çeker. Alt satırın başına indirmek için
	n format karakteri kullanılabilir

	Tam sayi turlerini arastiriniz
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int val = 10;
//
//        System.out.printf("val=%d%n", val);
//        System.out.printf("val(oct)=%x%n", val);
//        System.out.printf("val(oct)=%X%n", val);
//        System.out.printf("val(hex)=%h%n", val);
//        System.out.printf("val(hex)=%H%n", val);
//    }
//}





/*----------------------------------------------------------------------------------------------------------------------
  	printf metodunda gerçek sayı türleri (double, float) için f format karakteri kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        double val = 2.34;
//
//        System.out.printf("val=%f%n", val);
//    }
//}




/*----------------------------------------------------------------------------------------------------------------------
  	printf metodu ile virgülden sonra kaç basamak gösterileceğinin belirlenmesi
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        double val = 2.345678;
//
//        System.out.printf("val=%.4f%n", val);
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
  	printf metodu ile hizalama yapılması
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int day = 10, mon = 9, year = 1976;
//
//        System.out.printf("%02d/%02d/%04d%n", day, mon, year);
//    }
//}




