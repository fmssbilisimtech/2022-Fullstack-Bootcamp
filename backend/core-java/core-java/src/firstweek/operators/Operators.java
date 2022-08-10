package firstweek.operators;

public class Operators { }

/*----------------------------------------------------------------------------------------------------------------------
	Operatörler 3(üç) biçimde sınıflandırılabilir:
	1. İşlevlerine göre sınıflandırma:
		- Aritimetik Operatörler
		- Karşılaştırma operatörleri
		- Mantıksal Operatörler
		- Bitsel Operatörler
		- Özel amaçlı operatörler
	2. Operand sayılarına göre sınıflandırma
		- Tek operandlı (unary)
		- İki operandlı (binary)
		- Üç operandlı (ternary)
	3. Operatörün konumuna göre sınıflandırma:
		- önek operatörler (prefix)
		- araek operatörler (infix)
		- sonek operatörler (postfix)

	Operatörün kısıtı (constraint)
	Operatörün ürettiği değer (product value):
	Operatörün yan etkisi (side effect)
	Operatörün önceliği (precedence):
		a = b + c * d;
		i1: c * d
		i2: b + i1
		i3: a = i2


		a = (b + c) * d;
		i1: b + c
		i2: c * i1
		i3: a = i2

		a = b + c - d //soldan sağa
		i1: b + c
		i2: i1 - d
		i3: a = i2
----------------------------------------------------------------------------------------------------------------------*/



/*----------------------------------------------------------------------------------------------------------------------
	Aritmetik 4 işlem ve mod operatörü (bölme hariç)
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
//        System.out.printf("%d + %d = %d%n", a, b, a + b);
//        System.out.printf("%d - %d = %d%n", a, b, a - b);
//        System.out.printf("%d * %d = %d%n", a, b, a * b);
//        System.out.printf("%d %% %d = %d%n", a, b, a % b);
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Bölme işleminde operandlar tamsayı türündense sonuç tamsayı türünden çıkar. Sonucun noktadan sonraki
	kısmı atılır
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
//        System.out.printf("%d / %d = %d%n", a, b, a / b);
//    }
//}




/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a;
//
//        a = - - - - - - - - - 2;
//
//        System.out.println(a);
//    }
//}





/*----------------------------------------------------------------------------------------------------------------------
	++ operatörü iki şekilde operatörü postfix ve prefix olarak kullanılabilir. Bu operatör nasıl kullanılırsa
	kullanılsın operandının değerini bir artırır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//
//        ++a; // a = a + 1;
//
//        System.out.println(a);
//    }
//}




/*----------------------------------------------------------------------------------------------------------------------
	++ operatörünün prefix kullanımında ürettiği değer (işleme giren değer) artırılmış değerdir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        int b;
//
//        b = ++a;
//
//        System.out.printf("a=%d%n", a); //a=11
//        System.out.printf("b=%d%n", b); //b=11
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	-- operatörü iki şekilde operatörü postfix ve prefix olarak kullanılabilir. Bu operatör nasıl kullanılırsa
	kullanılsın operandının değerini bir azaltır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//
//        --a; // a = a - 1;
//
//        System.out.println(a);
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Derleyici yukarıdan aşağıya ve soldan sağa olmak üzere anlamlı en uzun ifadeyi alacak şekilde atomlarına ayırma
	işlemini yapar
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        int b = 9;
//        int c;
//
//        c = a+++b; //a++ + b
//
//        System.out.printf("a=%d%n", a); //a=11
//        System.out.printf("b=%d%n", b); //b=9
//        System.out.printf("c=%d%n", c); //c=19
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	Karşılaştırma operatörleri karşılaştırmanın sonucuna göre boolean türden değer üretir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci sayıyı giriniz:");
//        int a = Integer.parseInt(kb.nextLine());
//        System.out.print("İkinci sayıyı giriniz:");
//        int b = Integer.parseInt(kb.nextLine());
//
//        boolean result;
//
//        result = a > b;
//
//        System.out.printf("%d > %d -> %b%n", a, b, result);
//
//        result = a <= b;
//
//        System.out.printf("%d <= %d -> %b%n", a, b, result);
//
//        result = a < b;
//
//        System.out.printf("%d < %d -> %b%n", a, b, result);
//
//        result = a >= b;
//
//        System.out.printf("%d >= %d -> %b%n", a, b, result);
//
//        result = a == b;
//
//        System.out.printf("%d == %d -> %b%n", a, b, result);
//
//        result = a != b;
//
//        System.out.printf("%d != %d -> %b%n", a, b, result);
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	Mantıksal VE (AND) operatörü
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        boolean result;
//
//        result = Sample.foo() && Sample.bar();
//
//        System.out.printf("result:%b%n", result);
//    }
//}
//
//class Sample {
//    public static boolean foo()
//    {
//        System.out.println("foo");
//
//        return true;
//    }
//
//    public static boolean bar()
//    {
//        System.out.println("bar");
//
//        return false;
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Mantıksal VEYA (OR) operatörü
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        boolean result;
//
//        result = Sample.bar() || Sample.foo();
//
//        System.out.printf("result:%b%n", result);
//    }
//}
//
//class Sample {
//    public static boolean foo()
//    {
//        System.out.println("foo");
//
//        return true;
//    }
//
//    public static boolean bar()
//    {
//        System.out.println("bar");
//
//        return false;
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Mantıksal operatörler doğru sonuca yani matematiksel olarak yapılacak olursa elde edilecek sonuca en kısa yoldan
	ulaşabilmek için (kısa devre davranışını kullanarak) en soldaki ifadeyi önce yaparlar. Aşağıdaki örnekte
	&& operatörü || operatöründen öncelikli de olsa önce || işlemi yapılır. Ancak && operatörünün önceliği ile
	elde edilecek sonuç değişmez
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        boolean result;
//
//        result = Sample.foo() || Sample.bar() && Sample.tar();
//
//        System.out.printf("result:%b%n", result);
//    }
//}
//
//class Sample {
//    public static boolean foo()
//    {
//        System.out.println("foo");
//
//        return true;
//    }
//
//    public static boolean bar()
//    {
//        System.out.println("bar");
//
//        return false;
//    }
//
//    public static boolean tar()
//    {
//        System.out.println("tar");
//
//        return false;
//    }
//
//}































