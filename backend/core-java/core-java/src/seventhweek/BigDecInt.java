package seventhweek;

import util.Console;
import util.NumberUtil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;

import static java.math.BigInteger.ONE;

public class BigDecInt { }
/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfı genel olarak yuvarlamanın nasıl olacağının belirlenebildiği aynı zamanda çok büyük ve çok küçük
    gerçek sayılar ile çalışabilmek için tasarlanmıştır. Yuvarlamanın nasıl olacağının belirlenebilmesi, yuvarlamanın
    hiç yapılmamasın da belirlenebilmesini sağlar. BigDecimal sınıfı immutable bir sınıftır
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte yuvarlama hatası olmayan gerçek sayı işlemi yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        var a = BigDecimal.valueOf(0.1);
//        var b = BigDecimal.valueOf(0.2);
//        var c = a.add(b);
//
//        Console.writeLine("c = %.20f", c.doubleValue());
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının ONE, TEN ve ZERO veri elemanları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Console.writeLine(BigDecimal.ONE);
//        Console.writeLine(BigDecimal.ZERO);
//        Console.writeLine(BigDecimal.TEN);
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının String parametreli ctor'u
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = new BigDecimal("0.1");
//        var b = new BigDecimal("0.2");
//        var c = a.add(b);
//
//        Console.writeLine("%.20f", c.doubleValue());
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının add, subtract, multiply ve remainder metotları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
//        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");
//
//        Console.writeLine(a.add(b));
//        Console.writeLine(a.subtract(b));
//        Console.writeLine(a.multiply(b));
//        Console.writeLine(a.remainder(b));
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının abs metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Bir sayı giriniz:");
//
//        Console.writeLine(a.abs());
//        Console.writeLine(a);
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının equals metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Birinci sayı giriniz:");
//        var b = Console.readBigDecimal("İkinci sayı giriniz:");
//
//        Console.writeLine(a.equals(b) ? "Eşit" : "Eşit değil");
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    Bigdecimal sınıfının compareTo metodu:
    r = x.compareTo(y); çağrısı için
    1. x < y ise r == -1
    2. x > y ise r == 1
    3. x == y ise r == 0
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Birinci sayı giriniz:");
//        var b = Console.readBigDecimal("İkinci sayı giriniz:");
//
//        Console.writeLine(a.compareTo(b));
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte [start, end) aralığındaki +1 artım değeri ile belirlenen BigDecimal sayıların toplamı bulunmuştur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var start = Console.readBigDecimal("Birinci sayıyı giriniz:");
//        var end = Console.readBigDecimal("İkinci sayıyı giriniz:");
//
//        var sum = BigDecimal.ZERO;
//
//        for (var bd = start; bd.compareTo(end) < 0; bd = bd.add(BigDecimal.ONE))
//            sum = sum.add(bd);
//
//        Console.writeLine("Toplam:%s", sum);
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan BigDecimal sayıların en büyüğünü, en küçüğünü ve toplamlarını
    hesaplayan programı yazınız
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        FindMaxMinTotalApp.run();
//    }
//}
//
//class FindMaxMinTotalApp {
//    private FindMaxMinTotalApp()
//    {
//    }
//
//    private static void calculate(BigDecimal initial)
//    {
//        var min = initial;
//        var max = initial;
//        var sum = initial;
//
//        for (;;) {
//            var val = Console.readBigDecimal("Bir sayı giriniz:");
//            if (val.equals(BigDecimal.ZERO))
//                break;
//
//            if (val.compareTo(min) < 0)
//                min = val;
//
//            if (max.compareTo(val) < 0)
//                max = val;
//
//            sum = sum.add(val);
//        }
//
//        Console.writeLine("En küçük sayı:%s", min);
//        Console.writeLine("En büyük sayı:%s", max);
//        Console.writeLine("Toplam:%s", sum);
//    }
//    public static void run()
//    {
//        var val = Console.readBigDecimal("Bir sayı giriniz:");
//
//        if (!val.equals(BigDecimal.ZERO))
//            calculate(val);
//        else
//            Console.writeLine("Hiç sayı girilmedi");
//
//
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının scale ve RoundingMode parametreli divide metodu
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
//        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");
//        var result = a.divide(b, 30, RoundingMode.HALF_UP);
//
//        Console.writeLine("result = %s", result);
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının scale ve RoundingMode parametreli divide metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
//        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");
//        var result = a.divide(b, 30, RoundingMode.HALF_UP);
//
//        Console.writeLine("result = %s", result);
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının MathContext parametreli divide metodu
----------------------------------------------------------------------------------------------------------------------*/
//
//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
//        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");
//        var mathContext = new MathContext(10);
//        var result = a.divide(b, mathContext);
//
//        Console.writeLine("result = %s", result);
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının MathContext parametreli divide metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
//        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");
//        var mathContext = new MathContext(10);
//        var result = a.divide(b, mathContext);
//
//        Console.writeLine("result = %s", result);
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının remainder metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
//        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");
//        var mathContext = new MathContext(10);
//        var result = a.remainder(b, mathContext);
//
//        Console.writeLine("result = %s", result);
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal sınıfının divideAndRemainder metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
//        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");
//        var mathContext = new MathContext(10);
//        var result = a.divideAndRemainder(b, mathContext);
//
//        Console.writeLine("Bölüm: %s", result[0]);
//        Console.writeLine("Kalan: %s", result[1]);
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Klavyeden BigDecimal türden bir değer isteyiniz. Bu işlemden sonra klavyeden sıfır girilene
    kadar alınan BigDecimal sayıları virgülden sonra yine klavyeden alınan basamak sayısı kadar yukarı yuvarlama modunda
    ilk istenen sayıya bölümlerinin toplamlarını bulan programı yazınız.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        FindTotalApp.run();
//    }
//}
//
//
//class FindTotalApp {
//    private FindTotalApp()
//    {
//    }
//
//    public static void run()
//    {
//        var divisor = Console.readBigDecimal("Bölen sayıyı giriniz:");
//        var total = BigDecimal.ZERO;
//
//        for (;;) {
//            var val = Console.readBigDecimal("Bir sayı giriniz:");
//            if (val.equals(BigDecimal.ZERO))
//                break;
//
//            var precision = Console.readInt("Virgülden sonraki basamak sayısını giriniz:");
//            total = total.add(val.divide(divisor, precision, RoundingMode.HALF_UP));
//        }
//
//        Console.writeLine("Toplam:%s%n", total);
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
    BigInteger sınıfı
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        var a = new BigInteger(Console.read("Birinci sayıyı giriniz:"));
//        var b = new BigInteger(Console.read("İkinci sayıyı giriniz:"));
//        var result = a.add(b);
//
//        Console.writeLine(result);
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    BigInteger sınıfı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = new BigInteger(Console.read("Birinci sayıyı giriniz:"), 16);
//        var b = new BigInteger(Console.read("İkinci sayıyı giriniz:"), 16);
//        var result = a.add(b);
//
//        Console.writeLine(result.toString(16));
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
    BigInteger sınıfının bitCount ve bitLength metotları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readBigInteger("Bir sayı giriniz:");
//
//        Console.writeLine("Bit count:%d", a.bitCount());
//        Console.writeLine("Bit length:%d", a.bitLength());
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    BigInteger sınıfı ile rasgele sayı üretimi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        for (int i = 0; i < 10; ++i) {
//            var n = new BigInteger(128, r); //[0, pow(2, 128) - 1]
//
//            if (r.nextBoolean())
//                n = n.negate();
//
//            Console.writeLine(n);
//        }
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: NumberUtil sınıfı içerisindeki isPrime metodunun BigInteger parametreleri overload'unu yazınız
----------------------------------------------------------------------------------------------------------------------*/

// class IsPrimeBigIntegerTest {
//    private static void run()
//    {
//        BigInteger hundred = BigInteger.valueOf(100);
//
//        for (BigInteger i = ONE; i.compareTo(hundred) <= 0; i = i.add(ONE))
//            if (NumberUtil.isPrime(i))
//                Console.write("%s ", i);
//
//        Console.writeLine();
//        Console.writeLine(NumberUtil.isPrime(BigInteger.valueOf(1_000_003)) ? "Asal" : "Asal değil");
//
//        //Dikkat: Bu işlem oldukça uzun sürecektir
//        var n = new BigInteger("99999999999999999999999999999999999999999");
//
//        for (BigInteger i = new BigInteger("1000000000000000000000"); i.compareTo(n) <= 0; i = i.add(ONE))
//            if (NumberUtil.isPrime(i))
//                Console.writeLine("%s ", i);
//    }
//
//    private IsPrimeBigIntegerTest()
//    {
//    }
//
//    public static void main(String[] args)
//    {
//        run();
//    }
//}





























