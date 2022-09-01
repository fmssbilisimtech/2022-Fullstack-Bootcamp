package secondweek;

public class MethodOverloading { }

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki foo metotları ayrı sınıflarda olduklarından herhangi bir problem oluşmaz. Bu işlem method overloading
	değildir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo();
//        Mample.foo();
//    }
//}
//
//class Mample {
//    public static void foo()
//    {
//        System.out.println("Mample.foo");
//    }
//}
//
//class Sample {
//    public static void foo()
//    {
//        System.out.println("Sample.foo");
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------

	Method overloading: Bir sınıfın içerisinde bulunan aynı isimli metotlar overload edilmiş olur
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	 Bir metodun erişim belirleyicisinin değiştirilmesinin overload işlemine etkisi yoktur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void foo(int val) //error
//    {
//
//    }
//
//    private static void foo(int val) //error
//    {
//
//    }
//
//}























/*----------------------------------------------------------------------------------------------------------------------
	 Bir metodun static olup olmamasının overload işlemine etkisi yoktur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void foo(int val) //error
//    {
//
//    }
//
//    public void foo(int val) //error
//    {
//
//    }
//
//}
























/*----------------------------------------------------------------------------------------------------------------------
	 Bir metodun geri dönüş tür bilgisinin overload işlemine etkisi yoktur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static int foo(int val) //error
//    {
//
//        return 0;
//    }
//
//    public static void foo(int val) //error
//    {
//
//    }
//
//}























/*----------------------------------------------------------------------------------------------------------------------
	 Bir metodun parametre değişkenlerinin isimlerinin overload işlemine etkisi yoktur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static int foo(int a) //error
//    {
//
//        return 0;
//    }
//
//    public static void foo(int val) //error
//    {
//
//    }
//
//}






















/*----------------------------------------------------------------------------------------------------------------------
	 Bir metodun overload edilebilmesi için metodun parametrik tür bilgisinin ve dizilimlerinin (hepsine birden
	 parametrik yapı denebilir) farklı olması gerekir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public static void foo(int a)
//    {
//    }
//
//    public static void foo(double a)
//    {
//
//    }
//
//    public static void foo(double a, int b)
//    {
//
//    }
//
//    public static void foo(int b, double a)
//    {
//
//    }
//
//}




























/*----------------------------------------------------------------------------------------------------------------------
	 Bir metodun imzası ismi ve parametrik yapı diziliminin tamamıdır.
	 Kural: Bir sınıf içerisinde aynı imzaya sahip birden fazla metot bildirimi geçersizdir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 Bir metot çağrısında derleyicinin hangi metodu çağıracağına karar vermesi sürecine İngilizce olarak
	 "method overload resolution" veya yalnızca "overload resolution" denir.

	 Metot çağrısında argümanlar ile parametrelerinin türlerinin birebir uyumlu olduğu bir metot varsa
	 o metot çağrılır (best match, exact match)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        long b = 34;
//
//        Sample.foo(a, b); //#5 çağrılır (tam uyum)
//    }
//}
//
//class Sample {
//    public static void foo() //#1
//    {
//        System.out.println("foo");
//    }
//
//    public static void foo(int a) //#2
//    {
//        System.out.println("foo, int");
//    }
//
//    public static void foo(int a, int b) //#3
//    {
//        System.out.println("foo, int, int");
//    }
//
//    public static void foo(double a, int b) //#4
//    {
//        System.out.println("foo, double, int");
//    }
//
//    public static void foo(int a, long b) //#5
//    {
//        System.out.println("foo, int, long");
//    }
//
//    public static void bar(int a) //#6
//    {
//        System.out.println("bar, int");
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
        Tam uyum yoksa overload resolution aşağıdaki gibi gerçekleşir:
        1. Aday Metotlar (candidate methods): Çağrılan metot ile aynı isimdeki tüm metotlardır
        2. Uygun metotlar (applicable methods): Argüman sayısı parametre sayısı ile aynı olan ve argümanlardan
        parametrelere otomatik tür dönüşümünün olduğu metotlardır
        3. En uygun metot (the most applicable method): Uygun uygun metotlar arasında en kaliteli dönüşümü
        sunan metot belirlenir.

        En uygun metot öyle bir metottur ki argümanlardan parametrelere dönüşüm yarışa sokulduğunda daha iyi dönüşümü
        veya daha kötü olmayan dönüşümü yapar.

        Dönüşüm kalitesi aşağıdaki gibi belirlenir:
        1. T1 -> T2 ve T1 -> T3 otomatik dönüştürmelerinde T2 veya T3'den birisi T1 ile aynı ise aynı olan dönüşüm kalitelidir
        int -> double
        int -> int *

        2. T1 -> T2 ve T1 -> T3 otomatik dönüştürmelerinde T2 den T3 otomatik dönüşüm var T3 den T2 ye yoksa
        T1->T2 daha kalitelidir.

        int -> long *
        int -> float

        ya da örneğin

        short -> int *
        short -> double

        Bu aşamalardan herhangi bir tanesi gerçekleşemezse error oluşur.
        ----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 1. Aday metotlar: 1, 2, 3, 4, 5
	 2. Uygun metotlar: 3, 4, 5
	 3. En uygun metot: 3
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        short b = 34;
//
//        Sample.foo(a, b); //#3 çağrılır
//    }
//}
//
//class Sample {
//    public static void foo() //#1
//    {
//        System.out.println("foo");
//    }
//
//    public static void foo(int a) //#2
//    {
//        System.out.println("foo, int");
//    }
//
//    public static void foo(int a, int b) //#3
//    {
//        System.out.println("foo, int, int");
//    }
//
//    public static void foo(double a, int b) //#4
//    {
//        System.out.println("foo, double, int");
//    }
//
//    public static void foo(int a, long b) //#5
//    {
//        System.out.println("foo, int, long");
//    }
//
//    public static void bar(int a) //#6
//    {
//        System.out.println("bar, int");
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	 1. Aday metotlar: 1, 2, 3, 4, 5
	 2. Uygun metotlar: 4
	 3. En uygun metot: 4
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        float a = 10;
//        short b = 34;
//
//        Sample.foo(a, b); //#4 çağrılır
//    }
//}
//
//class Sample {
//    public static void foo() //#1
//    {
//        System.out.println("foo");
//    }
//
//    public static void foo(int a) //#2
//    {
//        System.out.println("foo, int");
//    }
//
//    public static void foo(int a, int b) //#3
//    {
//        System.out.println("foo, int, int");
//    }
//
//    public static void foo(double a, int b) //#4
//    {
//        System.out.println("foo, double, int");
//    }
//
//    public static void foo(int a, long b) //#5
//    {
//        System.out.println("foo, int, long");
//    }
//
//    public static void bar(int a) //#6
//    {
//        System.out.println("bar, int");
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
	 1. Aday metotlar: 1, 2, 3, 4, 5
	 2. Uygun metotlar: 4, 5
	 3. En uygun metot: 5
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        float a = 10;
//        short b = 34;
//
//        Sample.foo(a, b); //#5 çağrılır
//    }
//}
//
//class Sample {
//    public static void foo() //#1
//    {
//        System.out.println("foo");
//    }
//
//    public static void foo(int a) //#2
//    {
//        System.out.println("foo, int");
//    }
//
//    public static void foo(int a, int b) //#3
//    {
//        System.out.println("foo, int, int");
//    }
//
//    public static void foo(double a, int b) //#4
//    {
//        System.out.println("foo, double, int");
//    }
//
//    public static void foo(double a, short b) //#5
//    {
//        System.out.println("foo, double, short");
//    }
//
//    public static void bar(int a) //#6
//    {
//        System.out.println("bar, int");
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	 1. Aday metotlar: 1, 2, 3, 4, 5
	 2. Uygun metotlar: 3, 4, 5
	 3. En uygun metot: yok
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        int b = 34;
//
//        Sample.foo(a, b); //error: ambiguity: iki anlamlılık
//    }
//}
//
//class Sample {
//    public static void foo() //#1
//    {
//        System.out.println("foo");
//    }
//
//    public static void foo(int a) //#2
//    {
//        System.out.println("foo, int");
//    }
//
//    public static void foo(int a, long b) //#3
//    {
//        System.out.println("foo, int, long");
//    }
//
//    public static void foo(long a, int b) //#4
//    {
//        System.out.println("foo, long, int");
//    }
//
//    public static void foo(double a, float b) //#5
//    {
//        System.out.println("foo, double, float");
//    }
//
//    public static void bar(int a) //#6
//    {
//        System.out.println("bar, int");
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	 1. Aday metotlar: yok
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        int b = true;
//
//        Sample.fo(a, b); //error: aday metot yok
//    }
//}
//
//class Sample {
//    public static void foo() //#1
//    {
//        System.out.println("foo");
//    }
//
//    public static void foo(int a) //#2
//    {
//        System.out.println("foo, int");
//    }
//
//    public static void foo(int a, long b) //#3
//    {
//        System.out.println("foo, int, long");
//    }
//
//    public static void foo(long a, int b) //#4
//    {
//        System.out.println("foo, long, int");
//    }
//
//    public static void foo(double a, float b) //#5
//    {
//        System.out.println("foo, double, float");
//    }
//
//    public static void bar(int a) //#6
//    {
//        System.out.println("bar, int");
//    }
//}




































