package firstweek.primitives;

//ODEV
public class LiteralsRules { }



/*----------------------------------------------------------------------------------------------------------------------
	 char türden sabitler
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        char ch = ':';
//
//        System.out.println(ch);
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	 Tek tırnak içerisinde özel durumlar dışında birden fazla karakter yazılamaz. Özel durumlar da aslında
	 tek bir karaktere karaktere karşılık gelen sabitin yazılmasıdır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        char ch = 'abcd'; //error
//
//        System.out.println(ch);
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	 Ters bölüden sonra özel karakterler dışında yazılamaz
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        char ch = '\k'; //error
//
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	 Ters bölü karakteri tek tırnak içersine iki tane olarak yazılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        char ch = '\\';
//
//        System.out.println(ch);
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	 Tek tırnak karakter sabiti tek tırnak içerisinde ters bölü ile yazılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        char ch = '\'';
//
//        System.out.println(ch);
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	 İki tırnak karakter sabiti tek tırnak içerisinde iki türlü kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        char ch1 = '\"';
//        char ch2 = '"';
//
//        System.out.println(ch1);
//        System.out.println(ch2);
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	 İki tırnak içerisinde (String atomunda) ter bölü yazılması gereken karakterler anlamlıdır. Aşağıdaki örnekye
	 tab ve line feed karakterleri ile işlem yaopılmış olur
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        System.out.println("C:\test\names.txt");
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	 Yukarıdaki işlem aşağıdaki gibi yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        System.out.println("C:\\test\\names.txt");
//    }
//}









/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki durumda ters bölüden sonra özel karakter kullanılmadığından error oluşur
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        System.out.println("C:\mest\people.txt"); //error
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	İki tırnak karakteri iki tırnak içerisinde ters bölü ile kullanılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        System.out.println("\"ankara\"");
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	İki tırnak karakteri iki tırnak içerisinde ters bölü ile kullanılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        System.out.println("\"ankara");
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	Tek tırnak karakteri iki tırnak içerisinde iki şekilde kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        System.out.println("'ankara\'");
//
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	Tek tırnak karakteri iki tırnak içerisinde iki şekilde kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        System.out.println("'ankara");
//    }
//}





/*----------------------------------------------------------------------------------------------------------------------
	Ters bölü ve u ile bir karakterin sıra numarası hexadecimal olarak tek tırnak içerisinde yazıldığında
	o karakter ilişkin sabit yazılmış olur
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        char ch = '\u0175';
//
//        System.out.println(ch);
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Ters bölü u iki tırnak içerisinde de anlamlıdır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        System.out.println("Merhaba \u0175");
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Bir tamsayı önüne bir ek almadan yazıldığında decimal yazılmış olur
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 67; //decimal sabit
//
//        System.out.println(a);
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	Tamsayı sabitinin önünen sıfır ve x (büyük veya küçük) yazıldığında bu ekten sonra gelen basamaklar hexadimal
	basamaklar olarak yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 0x43;
//
//        System.out.println(a);
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Tamsayı sabitinin önünen sıfır ve x (büyük veya küçük) yazıldığında bu ekten sonra gelen basamaklar hexadimal
	basamaklar olarak yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 0xA; //hexadecimal
//
//        System.out.println(a);
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	Tamsayı sabitinin önünen sıfır  yazıldığında bu ekten sonra gelen basamaklar octal basamaklar olarak yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 012; //octal
//
//        System.out.println(a);
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	Java 7 ile birlikte sabitin başına sıfır ve b (büyük veya küçük) yazıldığından ikilik sistemde basamaklar
	yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 0b1010; //binary
//
//        System.out.println(a);
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	Gerçek sayı sabit sabitlerinin üstel gösterilişi
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        double a = 1.23E23;
//
//        System.out.printf("%f%n", a);
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Gerçek sayı sabit sabitlerinin üstel gösterilişi
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        double a = 123E+23;
//
//        System.out.printf("%f%n", a);
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Gerçek sayı sabit sabitlerinin üstel gösterilişi
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        double a = 123E-23;
//
//        System.out.printf("%.30f%n", a);
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Gerçek sayı sabit sabitlerinin üstel gösterilişi
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        double a = 123e-23;
//
//        System.out.printf("%.30f%n", a);
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Gerçek sayı sabit sabitlerinin üstel gösterilişi
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        double avogadro = 6.02E23;
//
//        System.out.printf("%f%n", avogadro);
//    }
//}






/*----------------------------------------------------------------------------------------------------------------------
	Java 7 ile birlikte bir sabit içerisinde alttire karakteri kullanılabilmektedir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 0x1F_C0;
//
//        System.out.printf("a=%d%n", a);
//        System.out.printf("a=0x%X%n", a);
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Alttire karakteri kullanılabildiği yerde istenildiği kadar yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 1________________________________________0;
//
//        System.out.printf("a=%d%n", a);
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Alttire karakteri kullanılabildiği yerde istenildiği kadar yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        long a = 0x00_00_10_01__A0_00_00_00L;
//
//        System.out.printf("a=%d%n", a);
//    }
//}

















/*----------------------------------------------------------------------------------------------------------------------
	Alttire karakteri sabitin başında ya da sonunda geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = _34;//error
//        int b = 45_;//error
//
//        //...
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Alttire karakteri sayı nokta içeriyosa noktadan önce ya da sonra geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        double a = 3_.14; //error
//        double b = 3._14; //error
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Alttire karakteri sabit sonundaki eklerden önce ya da sonra kullanılamaz
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        long a = 10L_; //error
//        long b = 10_L; //error
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Alttire karakteri sabitin önündeki eklerden önce sonra veya arasında geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        long a = 0x_10; //error
//        long b = 0_x10; //error
//        long b = _0_x10; //error
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Octal sabitler için önek ile sabitin ilk basamağı arasında alttire karakteri geçerlidir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = 0_12;
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
	Octal sabitin önekinden önce alttire yine geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int a = _012; //error
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
	Gerçek sayı sabitlerinin tamsayı kısmının değeri sıfırsa noktadan önce sıfır yazılmayabilir. Aynı durum
	noktadan sonraki kısmı sıfır ise, sıfır yazılmayabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        double a = .1; //0.1
//        double b = 1.; //1.0
//
//        System.out.println(a);
//        System.out.println(b);
//    }
//}


