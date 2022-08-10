package firstweek.statement;

public class Statement { }

/*----------------------------------------------------------------------------------------------------------------------
	if deyiminin genel biçimi:
	if (<boolean türden ifade>)
		<deyim>
	[
	else
		<deyim>
	]
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        if (val % 2 == 0)
//            System.out.println("Çift");
//        else
//            System.out.println("Tek");
//    }
//}





/*----------------------------------------------------------------------------------------------------------------------
	if deyiminin parantezi sonuna noktalı virgül konması ve oluşabilecek programlama hatası
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        if (val % 2 == 0);
//        val /= 2;
//
//        System.out.printf("val=%d%n", val);
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}





/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte else kısmı içteki if deyimine ait olur (dangling else)
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        if (val > 0) //br
//            if (val % 2 == 0)
//                System.out.println("Pozitif çift");
//            else
//                System.out.println("Pozitif değil");
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki durumda bileşik deyim kullanmaya gerek yoktur. Çünkü if deyimi else kısmı ile birlikte tek bir deyimdir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        if (val > 0)
//            if (val % 2 == 0)
//                System.out.println("Pozitif çift");
//            else
//                System.out.println("Pozitif tek");
//        else
//            System.out.println("Pozitif değil");
//    }
//}














/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki isEven metodunda else kullanımına gerek yoktur. Çünkü return deyimi metodu sonlandırır. Dolayısıyla
	akış return deyimine geldiğinden deyimin aşağına inemez
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        Util.displayStatus(NumberUtil.isEven(val));
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class NumberUtil {
//    public static boolean isEven(int val)
//    {
//        if (val % 2 == 0)
//            return true;
//
//        return false;
//    }
//}
//
//class Util {
//    public static void displayStatus(boolean flag)
//    {
//        if (!flag)
//            System.out.println("Tek");
//        else
//            System.out.println("Çift");
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	isEven metodu aşağıdaki gibi daha profesyonel yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        Util.displayStatus(NumberUtil.isEven(val));
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class NumberUtil {
//    public static boolean isEven(int val)
//    {
//        return val % 2 == 0;
//    }
//}
//
//class Util {
//    public static void displayStatus(boolean flag)
//    {
//        if (!flag)
//            System.out.println("Tek");
//        else
//            System.out.println("Çift");
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte bir tane if deyimi vardır. Bu if deyiminin else kısmında başka if deyimi yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        if (val > 0)
//            System.out.println("Pozitif");
//        else
//        if (val == 0)
//            System.out.println("Sıfır");
//        else
//            System.out.println("Negatif");
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki if deyimi aşağıdaki gibi daha okunabilir olarak yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        if (val > 0)
//            System.out.println("Pozitif");
//        else if (val == 0)
//            System.out.println("Sıfır");
//        else
//            System.out.println("Negatif");
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}




















