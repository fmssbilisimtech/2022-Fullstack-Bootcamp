package secondweek.loops;

public class ForBreakLoop { }

/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyimi:
	for ([1.kısım]; [2.kısım]; [3.kısım])
		<deyim>

	1.kısım: Akış for döngü deyimine geldiğinde ilk kez ve bir kez yapılacak kısımdır

	2.kısım: for döngü deyimin koşul ifadesidir. Yani buradaki ifadenin boolean türden olması gerekir. Bu ifade
	doğru olduğu sürece döngü yinelenir. Akış for döngü deyimine ilk kez geldiğinde birinci kısım yapıldıktan
	sonra koşul kontrolü yapılır

	3.kısım: Döngünün bir adımı tamamlandığında bir sonraki adıma geçmek için yapacağı kontrolden hemen önce
	yapılacak kısımdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int i;
//
//        for (i = 0; i < 5; ++i)
//            System.out.printf("i=%d%n", i);
//
//        System.out.printf("Döngü sonrası-i=%d%n", i);
//    }
//}


















/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyiminin 1.kısmında değişken bildirimi yapılabilir. Burada bildirilen değişlen yalnızca for döngüsü
	boyunca görülebilirdir.
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        for (int i = 0; i < 5; i++)
//            System.out.printf("i=%d%n", i);
//
//        System.out.printf("Döngü sonrası-i=%d%n", i); //error
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki durum yerel değişkenlerin faaliyet alanı kuralları gereği error oluşturur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int i;
//
//        for (int i = 0; i < 5; i++) //error
//            System.out.printf("i=%d%n", i);
//    }
//}



















/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki durum yerel değişkenlerin faaliyet alanı kuralları gereği geçerlidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        for (int i = 0; i < 5; i++)
//            System.out.printf("Birinci döngü:i=%d%n", i);
//
//        //...
//
//        for (int i = 0; i < 5; i++)
//            System.out.printf("İkinci döngü:i=%d%n", i);
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyimi sonunda yanlışlıkla noktalı virgül konması durumu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        for (int i = 0; i < 5; i++);
//        System.out.println("Merhaba");
//
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyimi ile n-kez dönen döngü kalıbı (dizi uyumlu)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int n = Integer.parseInt(kb.nextLine());
//
//        for (int i = 0; i < n; ++i)
//            System.out.println("Merhaba");
//    }
//}
















/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyiminin ilginç bir kullanımı
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        int sum = 0;
//        int val;
//
//        for (System.out.println("Sayıları girmeye başlayınız:"), System.out.println("Sayı?");
//             (val = Integer.parseInt(kb.nextLine())) != 0; sum += val, System.out.println("Sayı?"))
//            ;
//
//        System.out.printf("Toplam:%d%n", sum);
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyiminin 3.kısmının boş bırakılması durumu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        for (int i = 0; i < 5; ) {
//            System.out.printf("%d ", i);
//        }
//
//        System.out.println();
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı n sayısı için n-inci fibonacci sayısını döndüren getFibonacci
	isimli metodu yazınız:
	Açıklamalar:
		- Fibonacci sayıları:
			0 1 1 2 3 5 8 13 21 ...
		- Metot 1 den küçük n değerleri için -1 değerini döndürecektir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        GetFibonnaciTest.run();
//    }
//}
//
//class GetFibonnaciTest {
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        for (;;) {
//            System.out.printf("Kaçıncı Fibonacci sayısını istiyorsun?");
//            int n = Integer.parseInt(kb.nextLine());
//
//            if (n <= 0)
//                return;
//
//            int val = NumberUtil.getFibonacciNumber(n);
//
//            System.out.printf("%d. fibonacci sayısı:%d%n", n, val);
//        }
//    }
//}
//
//class NumberUtil {
//    public static int getFibonacciNumber(int n)
//    {
//        if (n <= 0)
//            return -1;
//
//        if (n <= 2)
//            return n - 1;
//
//        int prev1 = 1, prev2 = 0, val = 0;
//
//        for (int i = 2; i < n; ++i) {
//            val = prev1 + prev2;
//            prev2 = prev1;
//            prev1 = val;
//        }
//
//        return val;
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	İçiçe döngüler
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        for (int i = 0; i < 3; ++i)
//            for (int k = 3; k >= 0; --k)
//                System.out.printf("(%d, %d)%n", i, k);
//
//    }
//}




















/*----------------------------------------------------------------------------------------------------------------------
	break deyiminin genel biçimi:
	break [etiket ismi];
	break deyimi dendiğindde ilk akla etiketsiz kullanım gelir. Etiketli kullanıma "labeled break" denir.
	break deyimi ilgili döngüyü sonlandırmak için kullanılır
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	break deyiminin etiketsiz kullanımı. Aşağıdaki örnekte klavyeden sıfır girilene kadar alınan sayıların
	toplamı bulunmaktadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        System.out.println("Sayıları girmeye başlayınız:");
//
//        int sum = 0;
//
//        for (;;) {
//            int val = Integer.parseInt(kb.nextLine());
//
//            if (val == 0)
//                break;
//
//            sum += val;
//        }
//
//        System.out.printf("Toplam:%d%n", sum);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Menülerle işlem yapılabilen basit bir iskelet program
	(İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        MenuApp.run();
//    }
//}
//
//class MenuApp {
//    public static void run()
//    {
//        Menu.run();
//    }
//}
//
//class Menu {
//    public static void displayMenu()
//    {
//        System.out.println("1.Ekle");
//        System.out.println("2.Güncelle");
//        System.out.println("3.Sil");
//        System.out.println("4.Listele");
//        System.out.println("5.Çıkış");
//        System.out.print("Seçenek:");
//    }
//
//    public static void doWorkForInsert()
//    {
//        System.out.println("*****************");
//        System.out.println("Ekle seçildi");
//        System.out.println("*****************");
//    }
//
//    public static void doWorkForUpdate()
//    {
//        System.out.println("*****************");
//        System.out.println("Güncelle seçildi");
//        System.out.println("*****************");
//    }
//
//    public static void doWorkForDelete()
//    {
//        System.out.println("*****************");
//        System.out.println("Sil seçildi");
//        System.out.println("*****************");
//    }
//
//    public static void doWorkForList()
//    {
//        System.out.println("*****************");
//        System.out.println("Listele seçildi");
//        System.out.println("*****************");
//    }
//
//    public static void doWork(int option)
//    {
//        if (option == 1)
//            doWorkForInsert();
//        else if (option == 2)
//            doWorkForUpdate();
//        else if (option == 3)
//            doWorkForDelete();
//        else
//            doWorkForList();
//    }
//
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        for (;;) {
//            displayMenu();
//
//            int option = Integer.parseInt(kb.nextLine());
//
//            if (option < 1 || option > 5) {
//                System.out.println("Geçersiz seçenek");
//                continue;
//            }
//
//            if (option == 5)
//                break;
//
//            doWork(option);
//        }
//
//        System.out.println("Tekrar yapınız!!");
//    }
//}






































