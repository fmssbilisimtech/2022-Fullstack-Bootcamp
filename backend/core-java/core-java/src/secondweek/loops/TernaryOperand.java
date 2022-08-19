package secondweek.loops;

public class TernaryOperand { }
/*----------------------------------------------------------------------------------------------------------------------
	 Koşul operatörünün genel biçimi:

	 <operand1> ? <operand2> : <operand3>

	 operand1: boolean türden ifade
	 Aşağıdaki koşul operatörünün if deyimi karşılığı:
	 if (a > b)
	 	max = a;
	 else
	 	max = b;
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci sayıyı giriniz:");
//        int a = Integer.parseInt(kb.nextLine());
//
//        System.out.print("İkinci sayıyı giriniz:");
//        int b = Integer.parseInt(kb.nextLine());
//
//        int max = a > b ? a : b;
//
//        System.out.printf("max(%d, %d)=%d%n", a, b, max);
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte b + 200 ifadesi koşul operatörünün 3. operandıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci sayıyı giriniz:");
//        int a = Integer.parseInt(kb.nextLine());
//
//        System.out.print("İkinci sayıyı giriniz:");
//        int b = Integer.parseInt(kb.nextLine());
//
//        int result = a > b ? a : b + 200;
//
//        System.out.println(result);
//
//    }
//}


















/*----------------------------------------------------------------------------------------------------------------------
	 Koşul operatörünün ürettiği değer bir işleme sokulabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci sayıyı giriniz:");
//        int a = Integer.parseInt(kb.nextLine());
//
//        System.out.print("İkinci sayıyı giriniz:");
//        int b = Integer.parseInt(kb.nextLine());
//
//        int n = 10;
//
//        int result = n - (a > b ? a : b) + 200;
//
//        System.out.println(result);
//
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Koşul operatörünün opandlarında ilişkin ifade void bir ifade olamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        val % 2 == 0 ? foo() : bar(); //error
//    }
//}
//
//
//class Sample {
//    public static void foo()
//    {
//        System.out.println("foo");
//    }
//
//    public static void bar()
//    {
//        System.out.println("bar");
//    }
//}

























