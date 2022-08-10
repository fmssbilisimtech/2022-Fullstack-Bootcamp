package firstweek.methods;

public class ParameterVariable { }

/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun bildiriminde parantez içerisinde bildirilen değişkenlere parametre değişkenleri denir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void foo(int a, double b) {
//
//    }
//
//    public static void bar(int a) {
//
//    }
//}




/*----------------------------------------------------------------------------------------------------------------------
	Parametre değişkenleri faaliyet alanı bakımından adeta metodun gövdesi (bloğu) başında bildirilen yerel
	değişkenler gibidir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void foo(int a, int b)
//    {
//        double a = 1.3; //error
//
//        System.out.println(a);
//        System.out.println(b);
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun parametrelerine değerler çağrılırken aktarılır. Metot çağrısında parametrelere aktarılan
	ifadelere "argüman" denir . Argümanlardan parametrelere aktarım da bir atama işlemidir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci sayıyı giriniz:");
//        int x = Integer.parseInt(kb.nextLine());
//
//        System.out.print("İkinci sayıyı giriniz:");
//        int y = Integer.parseInt(kb.nextLine());
//
//        Sample.foo(x, y);
//    }
//}
//
//class Sample {
//    public static void foo(int a, int b)
//    {
//        System.out.println(a);
//        System.out.println(b);
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Bir metot kaç parametreliyse o kadar sayıda argüman ile çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci sayıyı giriniz:");
//        int x = Integer.parseInt(kb.nextLine());
//
//        System.out.print("İkinci sayıyı giriniz:");
//        int y = Integer.parseInt(kb.nextLine());
//
//        Sample.foo(x); //error
//        Sample.foo(x, y, 10); //error
//    }
//}
//
//class Sample {
//    public static void foo(int a, int b)
//    {
//        System.out.println(a);
//        System.out.println(b);
//    }
//}











/*----------------------------------------------------------------------------------------------------------------------
	Metot çağrısında argümanlara ilişkin ifadeler önce hesaplanır. Elde edilen değerler ile metot çağrılır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci sayıyı giriniz:");
//        int x = Integer.parseInt(kb.nextLine());
//
//        System.out.print("İkinci sayıyı giriniz:");
//        int y = Integer.parseInt(kb.nextLine());
//
//        Sample.foo(x * 2, y - 3);
//    }
//}
//
//class Sample {
//    public static void foo(int a, int b)
//    {
//        System.out.println(a);
//        System.out.println(b);
//    }
//}









/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri başka bir metoda argüman olarak geçilebilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        CalculateTotalApp.run();
//    }
//}
//
//class CalculateTotalApp {
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.println("Birinci sayıyı giriniz:");
//        int a = Integer.parseInt(kb.nextLine());
//
//        System.out.println("İkinci sayıyı giriniz:");
//        int b = Integer.parseInt(kb.nextLine());
//
//        Util.display(NumberUtil.add(a, b)); //br
//    }
//}
//
//class Util {
//    public static void display(int val)
//    {
//        System.out.println(val);  //br
//    }
//}
//
//class NumberUtil {
//    public static int add(int a, int b)
//    {
//        return a + b;  //br
//    }
//}















