package sixthweek;

import util.Console;
import util.StringUtil;

import java.util.Arrays;
import java.util.Random;

public class StringBuilderExamples { }
/*----------------------------------------------------------------------------------------------------------------------
    StringBuilder sınıfının append metodu ile sona ekleme yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("ankara").append('-').append("istanbul");
//
//        String str = sb.toString();
//
//
//        Console.writeLine(str);
//    }
//}


















/*----------------------------------------------------------------------------------------------------------------------
    StringBuilder sınıfının reverse metodu
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        StringBuilder sb = new StringBuilder("ankara");
//
//        sb.reverse();
//
//        Console.writeLine(sb.toString());
//    }
//}



















/*----------------------------------------------------------------------------------------------------------------------
    reverse metodu artık StringBuilder kullanılarak daha kolay bir biçimde yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
//public class App {
//    public static void main(String[] args)
//    {
//        for (;;) {
//            String s = Console.read("Bir yazı giriniz:");
//
//            if ("quit".equals(s))
//                break;
//
//            Console.writeLine(Util.reverse(s));
//        }
//    }
//}
//
//class Util {
//    public static String reverse(String str)
//    {
//        return new StringBuilder(str).reverse().toString();
//    }
//}


















/*----------------------------------------------------------------------------------------------------------------------
    StringUtil sınıfının changeCase metodu
----------------------------------------------------------------------------------------------------------------------*/

//public class App {
//    public static void main(String[] args)
//    {
//        ChangeCaseTest.run();
//    }
//}
//
//class ChangeCaseTest {
//    public static void run()
//    {
//        for (;;) {
//            String str = Console.read("Bir yazı giriniz:");
//            if ("elma".equals(str))
//                break;
//
//            Console.writeLine(StringUtil.changeCase(str));
//        }
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
    StringBuilder sınıfının getChars metodu
----------------------------------------------------------------------------------------------------------------------*/

//public class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        StringBuilder text = new StringBuilder(Arrays.toString(StringUtil.getRandomTextsTR(r, 5, 10, 15)));
//
//        Console.writeLine(text.toString());
//
//        char [] c = new char[5];
//
//        text.getChars(2, 7, c, 0);
//
//        for (char ch : c)
//            Console.writeLine(ch);
//    }
//}



















/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı iki yazıdan birincisi içerisinden ikincisinin karakterlerlerinin atılmış
    olduğu yazıyı döndüren squeeze isimli metodu yazınız.
    Örnek: ankara -> ardahan -> k
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        SqueezeTest.run();
//    }
//}
//
//
//class SqueezeTest {
//    public static void run()
//    {
//        for (;;) {
//            String s1 = Console.read("Birinci yazıyı giriniz:");
//
//            if ("elma".equals(s1))
//                break;
//            String s2 = Console.read("İkinci yazıyı giriniz:");
//
//            Console.writeLine(StringUtil.squeeze(s1, s2));
//        }
//    }
//}



















/*----------------------------------------------------------------------------------------------------------------------
    StringBuilder sınıfının setLength metodu ile length azaltılabilir. Bu durumda yazının bazı karakterleri kaybedilmiş
    olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        StringBuilder sb = new StringBuilder("ankara");
//        Console.writeLine("Length:%d", sb.length());
//
//        sb.setLength(3);
//        Console.writeLine("Length:%d", sb.length());
//        Console.writeLine(sb.toString());
//    }
//}



















/*----------------------------------------------------------------------------------------------------------------------
    StringBuilder sınıfının setLength metodu ile length artırılabilir. Bu durumda eklenen karakterler yerine null karakter
    ('\0') yerleştirilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        StringBuilder sb = new StringBuilder("ankara");
//        Console.writeLine("Length:%d", sb.length());
//
//        sb.setLength(10);
//        Console.writeLine(sb.toString());
//        sb.append("istanbul");
//        Console.writeLine("Length:%d", sb.length());
//        Console.writeLine("//////////////////");
//
//        int length = sb.length();
//
//        for (int i = 0; i < length; ++i)
//            if (sb.charAt(i) == '\0')
//                Console.write("%d ", i);
//
//        Console.writeLine();
//    }
//}

