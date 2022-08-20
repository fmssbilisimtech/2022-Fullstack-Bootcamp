package secondweek.loops;

public class Switch { }

/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminin genel biçimi:
	switch (<ifade>) {
	case <sabit ifadesi>:
		<deyim>
	case <sabit ifadesi>:
		<deyim>
	[
	default:
		<deyim>
	]
	}

	switch deyiminin parantez içerisindeki ifadesi temel türler için tamsayı türlerinden biri veya char olabilir.
	Bunlar dışında bu ifade String veya enum türlerinden de olabilir. Bu türler ileride ele alınacaktır.
	case bölümlerine ilişkin ifadelerin sabit ifadesi olması gerekir.
	switch deyiminde default kısmı olmak zorunda değildir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki switch deyiminin if deyimi karşılığı:
	if (plate == 34)
		System.out.println("İstanbul");
	else if (plate == 6)
		System.out.println("Ankara");
	else if (plate == 35)
		System.out.println("İzmir");
	else
		System.out.println("Geçersiz plaka değeri");
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Plaka numarasını giriniz:");
//        int plate = Integer.parseInt(kb.nextLine());
//
//        switch (plate) {
//            case 34:
//                System.out.println("İstanbul");
//                break;
//            case 6:
//                System.out.println("Ankara");
//                break;
//            case 35:
//                System.out.println("İzmir");
//                break;
//            default:
//                System.out.println("Geçersiz plaka değeri");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}



















/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde default bölüm olmak zorunda değildir.
	Aşağıdaki switch deyiminin if deyimi karşılığı:
	if (plate == 34)
		System.out.println("İstanbul");
	else if (plate == 6)
		System.out.println("Ankara");
	else if (plate == 35)
		System.out.println("İzmir");
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Plaka numarasını giriniz:");
//        int plate = Integer.parseInt(kb.nextLine());
//
//        switch (plate) {
//            case 34:
//                System.out.println("İstanbul");
//                break;
//            case 6:
//                System.out.println("Ankara");
//                break;
//            case 35:
//                System.out.println("İzmir");
//
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde default bölümününm yerinin önemi yoktur. Şüphesiz sona konması daha uygundur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Plaka numarasını giriniz:");
//        int plate = Integer.parseInt(kb.nextLine());
//
//        switch (plate) {
//            case 34:
//                System.out.println("İstanbul");
//
//            case 6:
//                System.out.println("Ankara");
//                break;
//            case 35:
//                System.out.println("İzmir");
//                break;
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde birden fazla aynı değere sahip case bölümü geçersizdir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Plaka numarasını giriniz:");
//        int plate = Integer.parseInt(kb.nextLine());
//
//        switch (plate) {
//            case 34:
//                System.out.println("İstanbul");
//                break;
//            case 6: //error
//                System.out.println("Ankara");
//                break;
//            case 6: //error
//                System.out.println("Ankara");
//                break;
//            case 35:
//                System.out.println("İzmir");
//                break;
//            default:
//                System.out.println("Geçersiz plaka değeri");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde aşağı düşme (fall through) özelliği vardır. Bir case bölümü veya default yakalandığında
	aşağı doğru engelleyen herhangi bir deyim yoksa yukarıdan aşağıya tüm bölümler yapılır. break deyimi
	switch deyimini sonlandırmakta kullanılır. Şüphesiz başka deyimler de aşağı düşmeyi engelleyebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Plaka numarasını giriniz:");
//        int plate = Integer.parseInt(kb.nextLine());
//
//        switch (plate) {
//            case 34:
//                System.out.println("İstanbul");
//            case 6:
//                System.out.println("Ankara");
//            case 35:
//                System.out.println("İzmir");
//                break;
//            default:
//                System.out.println("Geçersiz plaka değeri");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
	switch deyimi char türü için de kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        char option = 'e';
//
//        switch (option) {
//            case 'e':
//            case 'E':
//                System.out.println("Ekle");
//                break;
//            case 's':
//            case 'S':
//                System.out.println("Sil");
//                break;
//            default:
//                System.out.println("Geçersiz seçenek");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
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
//
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        EXIT_MENU:
//        for (;;) {
//            displayMenu();
//
//            int option = Integer.parseInt(kb.nextLine());
//
//            switch (option) {
//                case 1:
//                    doWorkForInsert();
//                    break;
//                case 2:
//                    doWorkForUpdate();
//                    break;
//                case 3:
//                    doWorkForDelete();
//                    break;
//                case 4:
//                    doWorkForList();
//                    break;
//                case 5:
//                    break EXIT_MENU;
//                default:
//                    System.out.println("Geçersiz seçenek");
//            }
//        }
//
//        System.out.println("Tekrar yapınız!!");
//    }
//}


























