package sixthweek;

import util.ArrayUtil;
import util.Console;

import java.util.Random;

public class VarExamples { }

/*----------------------------------------------------------------------------------------------------------------------
    var anahtar sözcüğü Java 10 ile birlikte dile eklenmiştir. var sonradan eklenen bir sözcük olduğundan derleyici
    kullanıldığı yere göre değişken ismi veya anahtar sözcük olarak algılar. Bu tarz anahtar sözcüklere
    "bağlamsal anahtar sözcükler (contextual keywords)" denir. var yerel değişkenler ve Java 11 ile birlikte ileride
    göreceğimiz Lambda ifadelerinde kullanılabilmektedir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        int var;
//        var a = 10;
//
//        Console.writeLine("a = %d", a);
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    var değişkenlere ilkdeğer (initialize) verilmelidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a; //error
//
//        a = 10;
//
//        Console.writeLine("a = %d", a);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    var değişkenlerin türleri ilkdeğer verilen ifadeden elde edilir. (type deduction, inference) ve değişken
    yaşamı boyunca aynı türdendir. Java'da bir değişkeninin türünün değişmeyeceğini hatırlayınız
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = 10;
//
//        a = 3.4; //error
//
//        Console.writeLine("a = %d", a);
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
    var değişkenlerin türleri ilkdeğer verilen ifadeden elde edilir. (type deduction, inference) ve değişken
    yaşamı boyunca aynı türdendir. Java'da bir değişkeninin türünün değişmeyeceğini hatırlayınız
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var sb = new StringBuilder();
//
//        sb.append("ankara");
//
//        Console.writeLine(sb.toString());
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
    var değişkenler for döngü deyiminde de kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        for (var i = 0; i < 10; ++i)
//            Console.write("i = %d ", i);
//
//        Console.writeLine();
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte derleyici uygun kodu üreterek çalışma zamanı sırasında tür belirlenebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readInt("Bir sayı giriniz:");
//        var b = a > 0 ? 10 : "ankara";
//
//        Console.writeLine("val = %s", b);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte derleyici uygun kodu üreterek çalışma zamanı sırasında tür belirlenebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readInt("Bir sayı giriniz:");
//        var b = a > 0 ? 10 : "ankara";
//
//        b = 20;
//        Console.writeLine("b = %s", b);
//        b = "istanbul";
//
//        Console.writeLine("b = %s", b);
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    var değişkenler for-each döngü deyiminde döngü değişkeni bildiriminde kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var r = new Random();
//        var a = ArrayUtil.getRandomArray(r, 10, 1, 100);
//
//        for (var val : a)
//            Console.write("%d ", val);
//
//        Console.writeLine();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    var değişkenler genel olarak kodu yalınlaştırır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var r = new Random();
//        var a = ArrayUtil.getRandomMatrix(r, 3, 4, 1, 100);
//
//        for (var array : a) {
//            for (var val : array)
//                Console.write("%02d ", val);
//
//            Console.writeLine();
//        }
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    var değişkenler sınıf veri elemanı veya metot parametre değişkenlerinde kullanılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//
//    }
//}
//
//class Sample {
//    private var m_x; //error
//    public static void foo(var x) //error
//    {
//
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    Değişken sayıda argüman alan metotlar (varargs methods) "...(elipsis)" parametre ile yazılır. Elipsis parametresi
    metot açısından bir dizi referansıdır. Çağıran açısından ise hem dizi referansı hem de aynı türden değişken sayıda
    argüman geçmek için kullanılabilir. Metoda varargs paramteresi için argüman olarak bir diz referansı verilmiyorsa
    derleyici çağırma sırasında dizi yaratılmasını sağlayan kodu üretir. varargs parametresine hiç argüman geçilmezse
    bu durumda boş dizi (eleman sayısı sıfır olan dizi) argüman olarak verilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        int [] a = {1, 2, 3, 4};
//
//        Console.writeLine(Util.sum(a));
//        Console.writeLine(Util.sum(10, 20, 30));
//        Console.writeLine(Util.sum(10, 20));
//        Console.writeLine(Util.sum(10, 20, 30, 40, 50));
//        Console.writeLine(Util.sum(10, 20, 30, 40, 50, 60));
//        Console.writeLine(Util.sum());
//    }
//}
//
//class Util {
//    public static int sum(int...a)
//    {
//        int total = 0;
//
//        for (var val : a)
//            total += val;
//
//        return total;
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Elipsis parametresi metodun son parametresi olmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        int [] a = ArrayUtil.getRandomArray(10, 1, 100);
//        Util.display(a);
//        Util.display(10, 20, 30);
//    }
//}
//
//
//class Util {
//    public static void display(int...a, int n) //error
//    {
//        for (var val : a)
//            Console.write("%d ", val);
//
//        Console.writeLine();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Elipsis parametresi metodun son parametresi olmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        int [] a = ArrayUtil.getRandomArray(10, 1, 100);
//        Util.display(3, a);
//        Util.display(1, 20, 30);
//    }
//}
//
//class Util {
//    public static void display(int n, int...a)
//    {
//        String fmt = String.format("%%0%dd ", n);
//
//        for (var val : a)
//            Console.write(fmt, val);
//
//        Console.writeLine();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki kural gereği bir metodun birden fazla elipsis parametresi olamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//
//    }
//}
//
//class Util {
//    public static void foo(double...b, int...a) //error
//    {
//
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Dizi dizileri de varargs parametre olarak yazılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        int [][] a = ArrayUtil.getRandomMatrix(3, 4, 0, 100);
//
//        Util.display(2, a);
//        System.out.println("--------------------");
//
//        int [] b = {1, 2, 3, 4, 5};
//        int [] c = {7, 8, 10, 9};
//        int [] d = {70, 80, 30, 90};
//
//        Util.display(2, b, c, d);
//        Util.display(2);
//    }
//}
//
//class Util {
//    public static void display(int n, int[]...a)
//    {
//        for (var array : a)
//            display(n, array);
//    }
//
//    public static void display(int n, int...a)
//    {
//        String fmt = String.format("%%0%dd ", n);
//
//        for (var val : a)
//            Console.write(fmt, val);
//
//        Console.writeLine();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
   T... parametresi T[] parametresi ile metodun imzasında aynıdır. Aşağıdaki örnekte bir içerisinde aynı imzaya
   sahip birden fazla metot yazılması dolayısıyla error oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//
//    }
//}
//
//class Util {
//    public static int sum(int...a) //error
//    {
//        int total = 0;
//
//        for (var val : a)
//            total += val;
//
//        return total;
//    }
//
//    public static int sum(int[]a) //error
//    {
//        int total = 0;
//
//        for (var val : a)
//            total += val;
//
//        return total;
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
   Aşağıdaki örnekte tam uyum olduğundan int parametreli foo çağrılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample.foo(10);
//    }
//}
//
//class Sample {
//    public static void foo(int a)
//    {
//        Console.writeLine("foo, int");
//    }
//
//    public static void foo(int... a)
//    {
//        Console.writeLine("foo, int...");
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
   Temel türler atasındaki doğrudan dönüşüm varasrgs parametresine göre daha kaliteli kabul edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample.foo(10);
//    }
//}
//
//class Sample {
//    public static void foo(long a)
//    {
//        Console.writeLine("foo, long");
//    }
//
//    public static void foo(int... a)
//    {
//        Console.writeLine("foo, int...");
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
   Aşağıdaki örnek için 2 numaralı foo çağrılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample.foo(10);
//    }
//}
//
//class Sample {
//    public static void foo(long a, int...b) //#1
//    {
//        Console.writeLine("foo, long, int...");
//    }
//
//    public static void foo(int n, int... a) //#2
//    {
//        Console.writeLine("foo, int, int...");
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
   Aşağıdaki örnek için 2 numaralı foo çağrılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample.foo(10, 20);
//    }
//}
//
//class Sample {
//    public static void foo(long a, int...b) //#1
//    {
//        Console.writeLine("foo, long, int...");
//    }
//
//    public static void foo(int n, int... a) //#2
//    {
//        Console.writeLine("foo, int, int...");
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
   Aşağıdaki örnekte ambiguity dolayısıyla error oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample.foo(10, 20); //ambiguity
//    }
//}
//
//class Sample {
//    public static void foo(long a, int...b) //#1
//    {
//        Console.writeLine("foo, long, int...");
//    }
//
//    public static void foo(int n, long... a) //#2
//    {
//        Console.writeLine("foo, int, int...");
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Birden fazla elipsis parametreli metot yazılamacağı için böyle bir durumda elipsis parametresi bir tane olup
    geri kalanlar [] ile bildirilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        int [] a = {1, 2, 3, 4};
//
//        int [] res = Util.join(a, 10, 20, 30, 40, 50, 60);
//
//        ArrayUtil.display(2, res);
//    }
//}
//
//class Util {
//    public static int [] join(int[]a, int... b)
//    {
//        int [] result = new int[a.length + b.length];
//
//        int index = 0;
//
//        for (int val : a)
//            result[index++] = val;
//
//        for (int val : b)
//            result[index++] = val;
//
//        return result;
//    }
//}

