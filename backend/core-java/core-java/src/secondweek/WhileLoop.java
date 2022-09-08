package secondweek;

public class WhileLoop {}

    /*----------------------------------------------------------------------------------------------------------------------
	Döngü deyimleri:
	1. while döngü deyimleri
		- Kontrolün başta yapıldığı while döngü deyimi (while döngüsü)
		- Kontrolün sonda yapıldığı while döngü deyimi (do-while döngüsü)
	2. for döngü deyimi
	3. for-each döngü deyimi
----------------------------------------------------------------------------------------------------------------------*/

    /*----------------------------------------------------------------------------------------------------------------------
        Kontrolün başta yapıldığı while döngü deyimi (while döngüsü):

        while (<koşul ifadesi>)
            <deyim>

        koşul ifadesinin boolean türden olması gerekir.
    ----------------------------------------------------------------------------------------------------------------------*/
//    class App {
//        public static void main(String[] args) {
//            java.util.Scanner kb = new java.util.Scanner(System.in);
//            System.out.print("Bir sayı giriniz:");
//            int n = Integer.parseInt(kb.nextLine());
//
//            int i = 0;
//
//            while (i < n) {
//                System.out.printf("i=%d%n", i);
//                ++i;
//            }
//
//            System.out.printf("Döngü sonrası-i:%d%n", i);
//            System.out.println("Tekrar yapıyor musunuz?");
//        }
//    }












/*----------------------------------------------------------------------------------------------------------------------
	while döngüsünde n-kez dönen döngü kalıbı:

	n = 4 -> (döngünün içinde basılacak değerler) 3 -> 2 -> 1 -> 0 ->  (döngü bitiminde n nin değeri) -1
	count: + + + + -> 4
----------------------------------------------------------------------------------------------------------------------*/
//    class App {
//        public static void main(String [] args)
//        {
//            java.util.Scanner kb = new java.util.Scanner(System.in);
//            System.out.print("Bir sayı giriniz:");
//            int n = Integer.parseInt(kb.nextLine());
//
//            while (n-- > 0)
//                System.out.printf("n=%d%n", n);
//
//            System.out.printf("Döngü sonrası-n:%d%n", n);
//            System.out.println("Tekrar yapıyor musunuz?");
//        }
//    }

















/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayıların pozitif ve negatif olanlarının ayrı ayrı
	toplamlarını bulan programı yazınız
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        FindPosNegSumApp.run();
//    }
//}
//
//class FindPosNegSumApp {
//    public static void displayResult(int posSum, int negSum)
//    {
//        if (posSum > 0)
//            System.out.printf("Pozitif sayıların toplamı:%d%n", posSum);
//        else
//            System.out.println("Hiç pozitif sayı girmediniz");
//
//        if (negSum < 0)
//            System.out.printf("Negatif sayıların toplamı:%d%n", negSum);
//        else
//            System.out.println("Hiç negatif sayı girmediniz");
//    }
//
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.println("Sayıları girmeye başlayınız:");
//
//        int posSum = 0, negSum = 0;
//
//        int val;
//
//        while ((val = Integer.parseInt(kb.nextLine())) != 0)
//            if (val > 0)
//                posSum += val;
//            else
//                negSum += val;
//
//        displayResult(posSum, negSum);
//    }
//}















/*----------------------------------------------------------------------------------------------------------------------
	Kontrolün sonda yapıldığı while döngü deyimi (do-while döngüsü):

	do
		<deyim>
	while (<boolean türden ifade>);

	Bu döngü deyiminde akış döngüye geldiğinde kontrol yapılmaz. İlk adımdan sonra kontrol yapılmaya başlanır.
	Yani bu döngü deyiminin en az bir kez çalıştırılacağı garanti altındadır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int n = Integer.parseInt(kb.nextLine());
//
//        int i = 0;
//
//        do {
//            System.out.printf("i=%d%n", i);
//            ++i;
//        } while (i < n);
//
//        System.out.printf("Döngü sonrası:i=%d%n", i);
//    }
//}

























