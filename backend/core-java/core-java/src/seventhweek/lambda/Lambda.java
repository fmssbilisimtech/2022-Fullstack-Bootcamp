package seventhweek.lambda;

import util.Console;

public class Lambda { }


/*----------------------------------------------------------------------------------------------------------------------
    Bir arayüzün "bir ve yalnız bir tane" abstract metodu varsa bu arayüzlere "fonksiyonel arayüzler (functional intefaces)"
    denir. Fonksiyonel arayüzler Java 8 ile eklenmiştir
----------------------------------------------------------------------------------------------------------------------*/

//interface IX { //Functional interface
//    void foo();
//    default void bar()
//    {}
//}
//
//interface IY {
//
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Lambda İfadeleri: Java 8 ile eklenen Lambda ifadeleri anonim sınıfların daha gelişmiş biçimi olarak düşünülebilir.
    Lambda İfadelerinin genel biçimleri:
    1. (<değişken listesi>) -> ifade
    2. (<değişken listesi>) -> {...}
    3. <değişken> -> ifade
    4. <değişken> -> {...}
    5. () -> ifade
    6. () -> {...}
    7. (<tür değişken listesi>) -> ifade
    8. (<tür değişken listesi>) -> {...}

    Lambda ifadeleri fonksiyonel arayüz referanslarına atanabilir. Fonksiyonel arayüz referansı dışında error oluşturur
---------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Lambda ifadeleri aslında fonksiyonel arayüzün abstract metodu yerine geçen ifadeyi yazmaktır. Yine derleyici
    arka planda ilgili Lambda ifadesine karşılık gelen kodu üretir (closure)
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IIntBinaryOperator ib = (a, b) -> a * b;
//        IBinaryOperator<String> is = (s1, s2) -> s1 + " " + s2.toUpperCase();
//
//        var x = Console.readInt("Birinci sayıyı giriniz:");
//        var y = Console.readInt("İkinci sayıyı giriniz:");
//
//        Console.writeLine("%d + %d = %d", x, y, ib.applyAsInt(x, y));
//
//        var s1 = Console.read("Adınızı giriniz:");
//        var s2 = Console.read("Soyadınızı giriniz:");
//
//        Console.writeLine(is.apply(s1, s2));
//    }
//}
//
//interface IIntBinaryOperator {
//    int applyAsInt(int x, int y);
//}
//
//interface IBinaryOperator<T> {
//    T apply(T a, T b);
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Lambda ifadelerinin genel biçimlerindeki 2, 4, 6 ve 8 numaralı biçimlerde fonksiyonel arayüzün abstract metodu
    yerine geçen ifadeye ilişkin gövde yazılır. Bu durumda abstract metodun geri dönüş değeri varsa akışın her noktasında
    return deyimi olmalıdır
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IIntBinaryOperator ib = (a, b) -> {
//            Console.writeLine("a = %d, b = %d", a, b);
//
//            return a * b;
//        };
//
//        var x = Console.readInt("Birinci sayıyı giriniz:");
//        var y = Console.readInt("İkinci sayıyı giriniz:");
//
//        Console.writeLine("%d + %d = %d", x, y, ib.applyAsInt(x, y));
//    }
//}
//
//interface IIntBinaryOperator {
//    int applyAsInt(int x, int y);
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Lambda ifadelerinde parametre değişkenlerinin türü abstract metoda göre tespit edildiğinden
    (type deduction, type inference) aşağıdaki örnekte error oluşur. Çünkü xor operatörünün operandlarının
    gerçek sayı olması geçersizdir
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        IDoubleBinaryOperator id = (a, b) -> a ^ b;
//
//        //...
//    }
//}
//
//interface IDoubleBinaryOperator {
//    double applyAsDouble(double x, double y);
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte Lambda ifadesi 3 parametreli olarak verildiğinden error oluşur
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        IDoubleBinaryOperator id = (a, b, c) -> a + b; //error
//
//        //...
//    }
//}
//
//interface IDoubleBinaryOperator {
//    double applyAsDouble(double x, double y);
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Lambda ifadelerinde değişkenlerin türleri bildirilebilir. Nerelerde ihtiyaç olacağı ileride ele alınacaktır
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IIntBinaryOperator ib = (int a, int b) -> a * b;
//
//        var x = Console.readInt("Birinci sayıyı giriniz:");
//        var y = Console.readInt("İkinci sayıyı giriniz:");
//
//        Console.writeLine("%d + %d = %d", x, y, ib.applyAsInt(x, y));
//    }
//}
//
//interface IIntBinaryOperator {
//    int applyAsInt(int x, int y);
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Java 11 ile birlikte Lambda ifadelerinin parametre bildirimlerinde var kullanılabilir
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IIntBinaryOperator ib = (var a, var b) -> a * b;
//
//        var x = Console.readInt("Birinci sayıyı giriniz:");
//        var y = Console.readInt("İkinci sayıyı giriniz:");
//
//        Console.writeLine("%d + %d = %d", x, y, ib.applyAsInt(x, y));
//    }
//}
//
//interface IIntBinaryOperator {
//    int applyAsInt(int x, int y);
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Java 11 ile birlikte Lambda ifadelerinin parametre bildirimlerinde var kullanılabilir
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IConverter<String, Integer> converter = s -> s.length();
//
//        var str = Console.read("Bir yazı giriniz:");
//
//        Console.writeLine(converter.convert(str));
//    }
//}
//
//interface IConverter<T, R> {
//    R convert(T t);
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Lambda ifadeleri callback alan metotlarda fonksiyonel arayüz kullanıldığında daha yalın kodların yazılmasını
    sağlar
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Util.display(s -> s.length(), "ankara");
//        Util.display(s -> Util.countWhitespaces(s), "ankara ");
//    }
//}
//
//class Util {
//    public static void display(IStringToIntConverter converter, String t)
//    {
//        int result = converter.convert(t);
//        //...
//        Console.writeLine(result);
//    }
//
//    public static int countWhitespaces(String s)
//    {
//        int count = 0;
//
//        for (int i = 0; i < s.length(); ++i)
//            if (Character.isWhitespace(s.charAt(i)))
//                ++count;
//
//        return count;
//    }
//}
//
//interface IStringToIntConverter {
//    int convert(String s);
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki örnek anonim sınıf kullanılarak aşağıdaki gibi yapılabilir
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Util.display(new IStringToIntConverter() {
//            public int convert(String s)
//            {
//                return s.length();
//            }
//        }, "ankara");
//
//        Util.display(new IStringToIntConverter() {
//            public int convert(String s)
//            {
//                return Util.countWhitespaces(s);
//            }
//        }, "ankara ");
//    }
//}
//
//class Util {
//    public static void display(IStringToIntConverter converter, String t)
//    {
//        int result = converter.convert(t);
//        //...
//        Console.writeLine(result);
//    }
//
//    public static int countWhitespaces(String s)
//    {
//        int count = 0;
//
//        for (int i = 0; i < s.length(); ++i)
//            if (Character.isWhitespace(s.charAt(i)))
//                ++count;
//
//        return count;
//    }
//}
//
//interface IStringToIntConverter {
//    int convert(String s);
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Lambda ifadeleri de kendisinden önce bildirilen yerel ve parametre değişkenlerini yakalama özelliğine sahiptir.
    Bu yakalama yine "effectively final" olarak yapılır
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var val = Console.readInt("Bir sayı giriniz:");
//
//        Util.display(s -> s.length() - val, "ankara");
//        Util.display(s -> Util.countWhitespaces(s) + val, "ankara ");
//    }
//}
//
//class Util {
//    public static void display(IStringToIntConverter converter, String t)
//    {
//        int result = converter.convert(t);
//        //...
//        Console.writeLine(result);
//    }
//
//    public static int countWhitespaces(String s)
//    {
//        int count = 0;
//
//        for (int i = 0; i < s.length(); ++i)
//            if (Character.isWhitespace(s.charAt(i)))
//                ++count;
//
//        return count;
//    }
//}
//
//interface IStringToIntConverter {
//    int convert(String s);
//}