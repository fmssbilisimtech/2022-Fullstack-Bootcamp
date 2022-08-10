package firstweek.methods;

public class Return2 { }


/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri başka bir metodun geri dönüş değeri olarak return deyimi ile yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args) {
//        int a = Mample.bar();
//
//        System.out.println(a);
//    }
//}
//
//class Sample {
//    public static int foo() {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        return val * val;
//    }
//}
//
//class Mample {
//    public static int bar() {
//        System.out.println("bar");
//
//        return Sample.foo();
//    }
//}





/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değer olmayan metotlarda (void metot) return zorunlu değildir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo();
//    }
//}
//
//class Sample {
//    public static void foo()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        int square = val * val;
//
//        System.out.println(square);
//
//    }
//}





/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değer olmayan metotlar geri dönüş değeri varmış gibi çağrılamaz
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = Sample.foo(); //error
//    }
//}
//
//class Sample {
//    public static void foo()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        if (val < 0)
//            return;
//
//        System.out.println(val * val);
//    }
//}












