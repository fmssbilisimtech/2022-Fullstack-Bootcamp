package eightweek.optional;

import util.Console;
import util.NumberUtil;
import util.StringUtil;

import java.util.*;
import java.util.function.IntPredicate;

public class OptionalJava { }
/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfları:
    Programlamada sıklıkla karşımıza çıkan bir durum vardır: Bir koşul sağlandığında bir bilgiye ihtiyacımız olabilir.
    Ancak koşul sağlanmadığında ise bu bilgiye ihtiyacımız olmaz dolayısıyla bilginin de oluşturulmaması gerekir. Bu
    şekildeki türlere "nullable types" denir. Yani kısacası "optional" kavramı "bir bilgi varsa kullanalım, yoksa kullanmayalım"
    şeklinde bir türdür. İşte optional sınıfları bu bilginin var olup olmadığının test edilebildirği ve var bilginin
    nesne içerisinden elde edilebildiği sınıflardır. Optional sınıfları Java 8 ile eklenmiştir.

    Optional sınıfının empty metodu ile boş bir optional nesnesi yaratılabilir. Optional sınıfının of metodu ile optional
    bir bilgi Optional nesnesine yerleştirilebilir. Optional sınıfının isPresent metodu ile optiona nesnesinin
    içerisinde bilgi olup olmadığı test edilebilir. Tersine isEmpty metodu ile de boş olup olmadığı test edilebilir.
    Bu metotlar temel türler için tasarlanmış optional sınıflarında da vardır. Optional sınıfının get metodu ile Optional
    içerisindeki bilgi (tabii ki kontrolden sonra anlamlı) elde edilebilir. Temel türlere ilişkin optional sınınıflarının
    nesnenin içerisindeki bilgiyi veren metotları getAsXXX biçimindedir
---------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte getRandomPasswordIfSatisfied metodu şifre üretmemesi durumunda null değere dönmektedir. Bu durumda
    metodun geri dönüş değeri bize üretemeyeceği durumda ne döndüreceğini doğrudan anlatmamaktadır. Tabii ki programcı
    dökumandan bakarak null döndürdiğini anlar. Üstelik null döndürdüğü durumun kontrol edilmemesinin gözden kaçtığı bir
    durumda exception oluşur ve programcı bu durumu (farkında olursa)çözmek zorunda kalır. Bu sadece bu tip durumların
    bir senaryosudur. Bir çok senaryo ile karşılaşırız
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            String password = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, r.nextBoolean());
//
//            if (password != null)
//                System.out.printf("Password:%s%n", password.toUpperCase());
//            else
//                System.out.println("Şifre üretelemedi");
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static String getRandomPasswordIfSatisfied(Random r, boolean satisfied)
//    {
//        return satisfied ? StringUtil.getRandomTextTR(r, r.nextInt(10)) : null;
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki olası problemler Optional sınıfı kullanılarak daha yalın hale getirilip çözülebilir
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            Optional<String> passwordOptional = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, r.nextBoolean());
//
//            if (passwordOptional.isPresent()) {
//                String password = passwordOptional.get();
//
//                System.out.printf("Password:%s%n", password.toUpperCase());
//            }
//            else
//                System.out.println("Şifre üretelemedi");
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static Optional<String> getRandomPasswordIfSatisfied(Random r, boolean satisfied)
//    {
//        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, 10)) : Optional.empty();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    OptionalInt sınıfının bir kullanımı
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            OptionalInt optionalInt = RandomNumberGenerator.getRandomNumberIfSatisfied(r, -10, 20);
//
//            if (optionalInt.isPresent()) {
//                var val = optionalInt.getAsInt();
//
//                Console.writeLine("val = %d", val);
//            }
//            else
//                Console.writeLine("Sayı üretilemedi");
//        }
//    }
//}
//
//class RandomNumberGenerator {
//    public static OptionalInt getRandomNumberIfSatisfied(Random r, int min, int max)
//    {
//        return r.nextBoolean() ? OptionalInt.of(r.nextInt(max - min) + min) : OptionalInt.empty();
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfının ofNullable metodu
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            Optional<String> passwordOptional = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, r.nextBoolean());
//
//            if (passwordOptional.isPresent()) {
//                String password = passwordOptional.get();
//
//                System.out.printf("Password:%s%n", password.toUpperCase());
//            }
//            else
//                System.out.println("Şifre üretelemedi");
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static Optional<String> getRandomPasswordIfSatisfied(Random r, boolean satisfied)
//    {
//        String result = satisfied ? StringUtil.getRandomTextTR(r, 10) : null;
//        //...
//        return Optional.ofNullable(result);
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfının orElse metodu
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            Optional<String> passwordOptional = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, r.nextBoolean());
//
//            Console.writeLine("%s", passwordOptional.orElse("Şifre üretilemedi"));
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static Optional<String> getRandomPasswordIfSatisfied(Random r, boolean satisfied)
//    {
//        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, 10)) : Optional.empty();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfının orElseThrow metodu
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            try {
//                Optional<String> passwordOptional = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, false);
//
//                Console.writeLine("%s", passwordOptional.orElseThrow());
//            }
//            catch (NoSuchElementException ignore) {
//                Console.writeLine("Şifre üretilemedi");
//            }
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static Optional<String> getRandomPasswordIfSatisfied(Random r, boolean satisfied)
//    {
//        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, 10)) : Optional.empty();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfının orElseThrow metodu
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            try {
//                Optional<String> passwordOptional = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, r.nextBoolean());
//
//                Console.writeLine("%s", passwordOptional.orElseThrow(() -> new IllegalArgumentException("Koşul geçeklenmedi")));
//            }
//            catch (IllegalArgumentException ex) {
//                Console.writeLine("Şifre üretilemedi:%s", ex.getMessage());
//            }
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static Optional<String> getRandomPasswordIfSatisfied(Random r, boolean satisfied)
//    {
//        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, 10)) : Optional.empty();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfının orElseThrow metodu
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            try {
//                Optional<String> passwordOptional = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, r.nextBoolean());
//
//                Console.writeLine("%s", passwordOptional.orElseThrow(IllegalArgumentException::new));
//            }
//            catch (IllegalArgumentException ignore) {
//                Console.writeLine("Şifre üretilemedi");
//            }
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static Optional<String> getRandomPasswordIfSatisfied(Random r, boolean satisfied)
//    {
//        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, 10)) : Optional.empty();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfının orElseGet metodu
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            Optional<String> passwordOptional = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, r.nextBoolean());
//
//            Console.writeLine("%s", passwordOptional.orElseGet(() -> r.nextInt(100) + ""));
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static Optional<String> getRandomPasswordIfSatisfied(Random r, boolean satisfied)
//    {
//        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, 10)) : Optional.empty();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfının ifPresentOrElse metodu. Bu metot Java 9 ile eklenmiştir
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            Optional<String> passwordOptional = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, r.nextBoolean());
//
//            passwordOptional.ifPresentOrElse(Console::writeLine, () -> Console.writeLine("Şifre üretilemedi")); //Since Java 9
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static Optional<String> getRandomPasswordIfSatisfied(Random r, boolean satisfied)
//    {
//        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, 10)) : Optional.empty();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    OptionalInt sınıfının ifPresentOrElse metodu
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            OptionalInt optionalInt = RandomNumberGenerator.getRandomNumberIfSatisfied(r, -10, 20);
//
//            optionalInt.ifPresentOrElse(val -> Console.writeLine("val = %d", val), () -> Console.writeLine("Sayı üretilemedi"));
//        }
//    }
//}
//
//class RandomNumberGenerator {
//    public static OptionalInt getRandomNumberIfSatisfied(Random r, int min, int max)
//    {
//        return r.nextBoolean() ? OptionalInt.of(r.nextInt(max - min) + min) : OptionalInt.empty();
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfının filter metodu
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            Optional<String> passwordOptional = RandomPasswordGenerator.getRandomPasswordIfSatisfied(r, 5, 10);
//
//            passwordOptional.filter(s -> s.length() > 7).ifPresent(Console::writeLine);
//        }
//    }
//}
//
//class RandomPasswordGenerator {
//    public static Optional<String> getRandomPasswordIfSatisfied(Random r, int min, int max)
//    {
//        return r.nextBoolean() ? Optional.of(StringUtil.getRandomTextTR(r, r.nextInt(max - min) + min)) : Optional.empty();
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
    Bir metodun geri dönüş değerinin optional olması durumu. Aşağıdaki örnekte "exception handling" kullanmadan
    bir yazıyı temel türlere çeviren metotlar yazılmıştır
---------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        var kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        var str = kb.nextLine();
//
//        var optInt = NumberUtil.toInt(str);
//
//        optInt.ifPresentOrElse(val -> Console.writeLine("value = %d", val), () -> Console.writeLine("Geçersiz giriş"));
//    }
//}
//
//class NumberUtil {
//    public static OptionalInt toInt(String str)
//    {
//        return toInt(str, 10);
//    }
//
//    public static OptionalInt toInt(String str, int radix)
//    {
//        OptionalInt result;
//
//        try {
//            result = OptionalInt.of(Integer.parseInt(str, radix));
//        }
//        catch (NumberFormatException ignore) {
//            result = OptionalInt.empty();
//        }
//
//        return result;
//    }
//
//    public static OptionalLong toLong(String str)
//    {
//        return toLong(str, 10);
//    }
//
//    public static OptionalLong toLong(String str, int radix)
//    {
//        OptionalLong result;
//
//        try {
//            result = OptionalLong.of(Long.parseLong(str, radix));
//        }
//        catch (NumberFormatException ignore) {
//            result = OptionalLong.empty();
//        }
//
//        return result;
//    }
//
//    public static OptionalDouble toDouble(String str)
//    {
//        OptionalDouble result;
//
//        try {
//            result = OptionalDouble.of(Double.parseDouble(str));
//        }
//        catch (NumberFormatException ignore) {
//            result = OptionalDouble.empty();
//        }
//
//        return result;
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıfın veri elemanının Optional olması durumu
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var p1 = new Person("Oğuz", "Karan");
//        var p2 = new Person("Ali", "Vefa", "Serçe");
//
//        Console.writeLine(p1.getFullname());
//        Console.writeLine(p2.getFullname());
//        Console.writeLine(p1);
//        Console.writeLine(p2);
//    }
//}
//
//
//class Person {
//    private String m_firstName;
//    private Optional<String> m_middleName;
//    private String m_lastName;
//
//    public Person(String firstName, String lastName)
//    {
//        this(firstName, "", lastName);
//    }
//
//    public Person(String firstName, String middleName, String lastName)
//    {
//        setFirstName(firstName);
//        setMiddleName(middleName);
//        setLastName(lastName);
//    }
//
//    public String getFirstName()
//    {
//        return m_firstName;
//    }
//
//    public void setFirstName(String firstName)
//    {
//        m_firstName = firstName;
//    }
//
//    public Optional<String> getMiddleName()
//    {
//        return m_middleName;
//    }
//
//    public void setMiddleName(String middleName)
//    {
//        m_middleName = middleName == null || middleName.isBlank() ? Optional.empty() : Optional.of(middleName);
//    }
//
//    public String getLastName()
//    {
//        return m_lastName;
//    }
//
//    public void setLastName(String lastName)
//    {
//        m_lastName = lastName;
//    }
//
//    public String getFullname()
//    {
//        return String.format("%s%s %s", m_firstName, m_middleName.map(n -> " " + n).orElse(""), m_lastName.toUpperCase());
//    }
//
//    public String toString()
//    {
//        return getFullname();
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıflarının basit bir kullanımı
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var random = new Random();
//        var min = Console.readInt("min değerini giriniz:");
//        var max = Console.readInt("max değerini giriniz:");
//        var n = Console.readInt("Adım sayısını giriniz:");
//
//        for (int i = 0; i < n; ++i) {
//            var optInt = Util.getNumber(random, min, max, NumberUtil::isPrime);
//
//            Console.writeLine("---------------------------");
//            optInt.ifPresentOrElse(val -> Console.writeLine("Sayı:%d", val), () -> Console.writeLine("Asal sayı üretilemedi"));
//            Console.writeLine("---------------------------");
//        }
//    }
//}
//
//class Util {
//    public static OptionalInt getNumber(Random r, int min, int max, IntPredicate pred)
//    {
//        var val = r.nextInt(max - min) + min;
//
//        return pred.test(val) ? OptionalInt.of(val) : OptionalInt.empty();
//    }
//}