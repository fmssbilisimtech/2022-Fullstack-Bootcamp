package nineweek.stream;

import data.factory.*;
import data.people.MaritalStatus;
import data.people.Person;
import data.product.ProductConverter;
import data.product.ProductInfo;
import util.*;
import util.Console;


import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.*;

public class StreamsExamples { }

/*----------------------------------------------------------------------------------------------------------------------
    Stream API: Stream API Java 8 ile eklenmiştir. Java I/O stream'lerden farklıdır. Stream'ler bir veri kaynağı (data source)
    üzerinde çeşitli işlemlerin hızlı ve kolay bir biçimde yapılmasını sağlar. Stream'lerin temel özellikleri şunlardır
    - Stream'ler veri tutmazlar.
    - Stream'ler kaynak veriler üzerinde değişiklik yapmazlar.
    - Stream'ler fonksiyonel programlama tekniğine uygun olarak tasarlanmışlardır. Bu anlamda çeşitli metotlar fonksiyonel
    arayüzler ile callback alacak şekilde tasarlanmıştır
    - Stream'ler bir diziden, bir collection sınıftan veya bir I/O channel'ı kaynak veri olarak kullanabilir. Dolayısıyla
    stream'ler bu kaynaklardan elde edilebilir.
    - Stream API içerisinde çeşitli işlemleri "paralel olaarak" yapabilen "parallel stream"'ler de bulunur

    Stream işlemleri bir zincir (fluent) biçiminde yapılabilir.
    Stream işlemleri (stream operations/operators) iki gruba ayrılır:
    - Ara işlemler (intermediate operations): Terminal işlemi ile çalıştırılan işlemlerdir. Bir terminal işlemi olmadan
    çalıştırılmazlar (lazy evaluation). Ara işlemler bir Stream referansına geri dönerler. Bazı ara işlemler çağrıldıkları
    Stream referansına bazıları ise yeni bir Stream referansına geri dönerler. Burada aslında çalıştıran terminal
    işlemleridir. Yani callback terminal işlemleri sırasında çağrılır
    - Terminal işlemleri (terminal operations): Çağrıldıklarında artık tüm zincir çalıştırılır

    Stream kullanılırken yazılan zincire içsel olarak "stream pipeline" denir. Bir "stream pipeline" sıfır veya daha
    fazla ara işlem, ancak bir tane terminal işlemi içerir.

    Bir stream bir pipeline için kullanılır. Yani bir stream elde edildiğinde açılır ve pipeline tamamlandığında
    kapatılır biçiminde düşüneceğiz.

    Stream referansları (Stream<T>, IntStream vs.) Collection arayüzünün stream isimli metodu ile collection
    sınıftan elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte Stream API kullanılarak klavyeden girilen stok miktarından daha çok olan ürünlerin isimleri
    büyük harfe dönüştürülerek ekrana basılmıştır. Örnek sadece genel Stream API kullanımı için yazılmıştır. Detaylar
    ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products-org.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var stock = Console.readInt("Stok miktarını giriniz:");
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream().filter(pi -> pi.getStock() > stock)
//                    .map(pi -> pi.getName().toUpperCase())
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte Stream API kullanılarak klavyeden girilen bir n sayısı için [1, n] arasındaki sayıların toplamı
    bulunmuştur Örnek sadece genel Stream API kullanımı için yazılmıştır. Detaylar ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        var sum = IntStream.rangeClosed(1, n).sum();
//
//        Console.writeLine("sum = %d", sum);
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte Stream API [0, 255] arasında klavyeden girilen sayı kadar rasgele sayı üretilip ekrana basılmıştır.
    Örnek sadece genel Stream API kullanımı için yazılmıştır. Detaylar ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        var n = Console.readInt("Bir sayı giriniz:");
//        var r = new Random();
//
//        IntStream.generate(() -> r.nextInt(256))
//                .limit(n)
//                .forEach(Console::writeLine);
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzünün forEach metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products-org.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var stock = Console.readInt("Stok miktarını giriniz:");
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream().forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzünün forEach metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products-org.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream().forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
    Java 8 ile birlikte Iterable<T> arayüzüne forEach metodu eklenmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products-org.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Java 8 ile birlikte Iterable<T> arayüzüne forEach metodu eklenmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IntRange.of(10, 20, 2)
//                .forEach(val -> Console.write("%d ", val));
//
//        Console.writeLine();
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzünün filter metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products-org.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream()
//                    .filter(pi -> pi.getName().contains("Split") && pi.getStock() > 400)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
    Bir diziden Stream Arrays sınıfın stream isimli metotları ile elde edilebilir. Aşağıdaki örnekte int türden
    bir dizinin içerisindeki asal sayılar standart output'a yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = factory.getNumbers();
//
//            Arrays.stream(numbers)
//                    .filter(NumberUtil::isPrime)
//                    .forEach(System.out::println);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Bir diziden Stream Stream arayüzlerinin of metotları ile de elde edilebilir. Aşağıdaki örnekte int türden
    bir dizinin içerisindeki asal sayılar standart output'a yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = factory.getNumbers();
//            IntStream.of(numbers)
//                    .filter(NumberUtil::isPrime)
//                    .forEach(p -> Console.write("%d ", p));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
    Bir diziden Stream Stream arayüzlerinin of metotları ile de elde edilebilir. Aşağıdaki örnekte int türden
    bir dizinin içerisindeki çift sayılar standart output'a yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = factory.getNumbers();
//            IntStream.of(numbers).filter(val -> val % 2 == 0).forEach(p -> Console.write("%d ", p));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzünün count metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = factory.getNumbers();
//            var primesCount = IntStream.of(numbers)
//                    .filter(NumberUtil::isPrime)
//                    .count();
//
//            var oddsCount = IntStream.of(numbers)
//                    .filter(val -> val % 2 != 0).count();
//
//
//
//            var evensCount = numbers.length - oddsCount;
//
//            Console.writeLine("Number of primes:%d", primesCount);
//            Console.writeLine("Number of odds:%d", oddsCount);
//            Console.writeLine("Number of evens:%d", evensCount);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte stokta bulunmayan ürünler ekrana bastırılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream()
//                    .filter(pi -> pi.getStock() <= 0)
//                    .map(ProductInfo::getName)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzünün count metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = factory.getNumbers();
//
//            var count = Arrays.stream(numbers).filter(a -> a < 0 && a % 2 == 0).count();
//
//            Console.writeLine("Count: %d", count);
//
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin allMatch metodu tüm elemanlar parametresi aldığı koşulu sağlıyorsa true, en az bir tane
    koşulu sağlamayan eleman varsa false değerine geri döner
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            if (products.stream().allMatch(p -> p.getStock() > 0))
//                Console.writeLine("Tüm ürünler stokta mevcut");
//            else
//                products.stream().filter(p -> p.getStock() <= 0).forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin anyMatch metodu en az bir eleman parametresi aldığı koşulu sağlıyorsa true, hiçbir eleman
    koşulu sağlamıyorsa false değerine geri döner
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products-org.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            if (products.stream().anyMatch(p -> p.getStock() <= 0))
//                products.stream().filter(p -> p.getStock() <= 0).forEach(Console::writeLine);
//            else
//                Console.writeLine("Tüm ürünler stokta mevcut");
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin noneMatch metodu tüm elemanlar parametresi aldığı koşulu sağlamıyorsatrue, en az bir eleman
    koşulu sağlıyor ise false değerine geri döner
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            if (products.stream().noneMatch(p -> p.getStock() <= 0))
//                Console.writeLine("Tüm ürünler stokta mevcut");
//            else
//                products.stream().filter(p -> p.getStock() <= 0).forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin findFirst metotları ile stream'in ilk elemanına ilişkin Optional referansı elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = factory.getNumbers();
//
//            var optInt = Arrays.stream(numbers).filter(NumberUtil::isPrime).findFirst();
//
//            optInt.ifPresentOrElse(p -> Console.writeLine("İlk asal sayı:%d", p), () -> Console.writeLine("Hiç asal sayı yok"));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte stokta bulunmayan ilk ürün elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            var optProduct = products.stream().filter(p -> p.getStock() <= 0).findFirst();
//
//            optProduct.ifPresentOrElse(Console::writeLine, () -> Console.writeLine("Tüm ürünler stokta mevcut"));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin map metotları ile bir Stream'den başka türden bir Stream elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            var count = products.stream()
//                    .filter(p -> p.getTotal().compareTo(new BigDecimal("300000")) < 0)
//                    .count();
//
//            Console.writeLine("Count:%d", count);
//
//            products.stream()
//                    .filter(p -> p.getTotal().compareTo(new BigDecimal("300000")) < 0)
//                    .map(ProductInfo::getName)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin map metotları ile bir Stream'den başka türden bir Stream elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            var count = products.stream()
//                    .filter(p -> p.getTotal().compareTo(new BigDecimal("300000")) < 0)
//                    .map(ProductInfo::getName)
//                    .filter(s -> s.contains("-"))
//                    .count();
//
//            Console.writeLine("Count:%d", count);
//
//            products.stream()
//                    .filter(p -> p.getTotal().compareTo(new BigDecimal("300000")) < 0)
//                    .map(ProductInfo::getName)
//                    .filter(s -> s.contains("-"))
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki örnek aşağıdaki gibi daha etkin olarak da yapılabilirdi. Aslında Java açısından bu örnek çok dfa fark var
    sayılmaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            var count = products.stream()
//                    .filter(p -> p.getTotal().compareTo(new BigDecimal("300000")) < 0 && p.getName().contains("-"))
//                    .map(ProductInfo::getName)
//                    .count();
//
//            Console.writeLine("Count:%d", count);
//
//            products.stream()
//                    .filter(p -> p.getTotal().compareTo(new BigDecimal("300000")) < 0 && p.getName().contains("-"))
//                    .map(ProductInfo::getName)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin mapToXXX metotları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream()
//                    .filter(p -> p.getTotal().compareTo(new BigDecimal("300000")) < 0 && p.getName().contains("-"))
//                    .mapToInt(ProductInfo::getStock)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin map metotları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream()
//                    .filter(p -> p.getTotal().compareTo(new BigDecimal("300000")) < 0 && p.getName().contains("-"))
//                    .map(ProductInfo::getCost)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}











































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin reduce metotları stream içerisindeki elemanlara ilişkin verilen işlemi (callback) yapar ve sonucu optional
    referansı olarak döndürür
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = factory.getNumbers();
//
//            var result = IntStream.of(numbers).reduce((r, a) -> r + a);
//
//            result.ifPresentOrElse(Console::writeLine, () -> Console.writeLine("Stream boş"));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin reduce metotları stream içerisindeki elemanlara ilişkin verilen işlemi (callback) yapar ve sonucu optional
    referansı olarak döndürür
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = factory.getNumbers();
//
//            var result = IntStream.of(numbers).reduce(Integer::sum);
//
//            result.ifPresentOrElse(Console::writeLine, () -> Console.writeLine("Stream boş"));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin reduce metotlarının identity parametreli overload'ları ilk değerden itibaren elemanlarına
    aldığı callback'i uygular. Bu durumda optional dönmesi gerekmez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = factory.getNumbers();
//
//            var result = IntStream.of(numbers).reduce(0, Integer::sum);
//
//            Console.writeLine(result);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte stokta bulunan her bir ürün için kar-zarar durumu hesaplanmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream()
//                    .filter(p -> p.getStock() > 0)
//                    .map(p -> p.getPrice().subtract(p.getCost()).multiply(BigDecimal.valueOf(p.getStock())))
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte toplam kar-zarar durumu hesaplanmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            var result = products.stream()
//                    .filter(p -> p.getStock() > 0)
//                    .map(p -> p.getPrice().subtract(p.getCost()).multiply(BigDecimal.valueOf(p.getStock())))
//                    .reduce(BigDecimal::add);
//
//            result.ifPresentOrElse(Console::writeLine, () -> Console.writeLine("Stokta hiç ürün yok"));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte stokta bulunmayan ürünlerin toplam sayısı bulunmuştur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream()
//                    .filter(p -> p.getStock() < 0)
//                    .mapToInt(ProductInfo::getStock)
//                    .reduce(Integer::sum)
//                    .ifPresentOrElse(Console::writeLine, () -> Console.writeLine("Tüm ürünler stokta mevcut"));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte tedarik edilmemiş ürünlerin her biri için isim ve stok miktarı ProductNameStockDTO
    nesneleri ile elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().PRODUCTS;
//
//            products.stream()
//                    .filter(p -> p.getStock() < 0)
//                    .map(ProductConverter::new)
//                    .map(ProductConverter::toProductStockDTO)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    IntStream sınıfının range metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        IntStream.range(0, n).forEach(i -> Console.write("%d ", i));
//
//        Console.writeLine();
//    }
//}










































/*----------------------------------------------------------------------------------------------------------------------
    IntStream sınıfının rangeClosed metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var n = Console.readInt("Bir sayı giriniz:");
//
//        IntStream.rangeClosed(1, n).forEach(i -> Console.write("%d ", i));
//
//        Console.writeLine();
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte İngilizce alfabedeki karakterler döngü kullanmadan (doğrudan değil) ekrana bastırılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IntStream.range(0, 26).forEach(i -> Console.write("%c", (char)('A' + i)));
//        Console.writeLine();
//        IntStream.range(0, 26).forEach(i -> Console.write("%c", (char)('a' + i)));
//        Console.writeLine();
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte İngilizce alfabedeki karakterler döngü kullanmadan (doğrudan değil) ekrana bastırılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IntStream.range(0, 26).map(i -> 'A' + i).forEach(code -> Console.write("%c", (char)code));
//        Console.writeLine();
//        IntStream.range(0, 26).map(i -> 'a' + i).forEach(code -> Console.write("%c", (char)code));
//        Console.writeLine();
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte İngilizce alfabedeki karakterler döngü kullanmadan (doğrudan değil) ekrana bastırılmıştır.
    Dikkat edilirse mapToObj çağrıldığında boxing ve ekrana çıktısı için de unboxing yapılmaktadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IntStream.range(0, 26).mapToObj(i -> (char)('A' + i)).forEach(ch -> Console.write("%c", ch));
//        Console.writeLine();
//        IntStream.range(0, 26).mapToObj(i -> (char)('a' + i)).forEach(ch -> Console.write("%c", ch));
//        Console.writeLine();
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte klavyeden alınan yazı ile çeşitli işlemler yapılmaktadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var str = Console.read("Bir yazı giriniz:");
//
//        Console.writeLine("Tüm karakterler aralarında space karakteri olacak şekilde ekrana basılıyor:");
//        IntStream.range(0, str.length())
//                .map(str::charAt)
//                .forEach(ch -> Console.write("%c ", (char)ch));
//
//        Console.writeLine();
//
//        Console.writeLine("Tüm karakterler aralarında space karakteri olacak şekilde küçük harf olarak ekrana basılıyor:");
//        IntStream.range(0, str.length())
//                .map(str::charAt)
//                .map(Character::toLowerCase)
//                .forEach(ch -> Console.write("%c ", (char)ch));
//
//        Console.writeLine();
//
//        Console.writeLine("Tüm karakterler aralarında space karakteri olacak şekilde küçük harf olarak ekrana basılıyor:");
//        IntStream.range(0, str.length())
//                .map(i -> Character.toLowerCase(str.charAt(i)))
//                .forEach(ch -> Console.write("%c ", (char)ch));
//
//        Console.writeLine();
//
//        Console.writeLine("Yazı boşluk (whitespace) karakterleri atılmış  bir biçimde ekrana basılıyor");
//
//        IntStream.range(0, str.length())
//                .map(str::charAt)
//                .filter(ch -> !Character.isWhitespace(ch))
//                .forEach(ch -> Console.write("%c", (char)ch));
//
//        Console.writeLine();
//
//        Console.writeLine("Yazı tamamı küçük harf olarak boşluk (whitespace) karakterleri atılmış bir biçimde ekrana basılıyor");
//
//        IntStream.range(0, str.length())
//                .map(str::charAt)
//                .filter(ch -> !Character.isWhitespace(ch))
//                .map(Character::toLowerCase)
//                .forEach(ch -> Console.write("%c", (char)ch));
//
//        Console.writeLine();
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte factorial metodu IntStream kullanılarak yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IntStream.range(0, 11).forEach(n -> Console.writeLine("%d! = %d", n, Util.factorial(n)));
//    }
//}
//
//class Util {
//    public static int factorial(int n)
//    {
//        return n > 1 ? IntStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b) : 1;
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte yazılan isPrime metodunu inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IntStream.rangeClosed(-10, 100).filter(Util::isPrime).forEach(p -> Console.write("%d ", p));
//    }
//}
//
//class Util {
//    public static boolean isPrime(int val)
//    {
//        return val > 1 && IntStream.rangeClosed(2, val / 2).noneMatch(i -> val % i == 0);
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte yazılan isPrime metodunu inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IntStream.rangeClosed(-10, 100).filter(Util::isPrime).forEach(p -> Console.write("%d ", p));
//    }
//}
//
//class Util {
//    public static boolean isPrime(int val)
//    {
//        return val > 1 && IntStream.rangeClosed(2, val / 2).allMatch(i -> val % i != 0);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte int türden bir diziden Integer türden türden bir Stream elde edilmiştir. Örnekte ekrana
    basılması görmezden gelinirse ileride göreceğimiz metotlar yardımızla int türden bir diziden Integer bir dizi de
    elde edilebilir. Örnekte aslında bir kutulama yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = ArrayUtil.getRandomArray(10, 0, 100);
//
//        IntStream.of(a).mapToObj(val -> val).forEach(val -> Console.write("%d ", val)); //auto boxing
//
//        Console.writeLine();
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    Intream, DoubleStream ve LongStream arayüzlerinin boxed metotları kutulam işlemi yaparak Stream referansı döndürür
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = ArrayUtil.getRandomArray(10, 0, 100);
//
//        IntStream.of(a).boxed().forEach(val -> Console.write("%d ", val)); //auto boxing
//
//        Console.writeLine();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte IntStream'den elde edilen değerlerin kareleri Stream<Integer> referansı olarak elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//
//        var a = ArrayUtil.getRandomArray(10, 0, 100);
//
//        IntStream.of(a).forEach(val -> Console.write("%d ", val));
//        Console.writeLine();
//        IntStream.of(a).mapToObj(val -> val * val).forEach(val -> Console.write("%d ", val));
//
//        Console.writeLine();
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    StreamSupport sınıfının stream metoduna Iterable arayüzünün spliterator metodunun geri dönüş verilerel Stream referansı
    elde edilebilir. Metodun ikinci parametresi true geçilirse "paralel stream" biçiminde çalışacak bir referans elde
    edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        StreamSupport.stream(IntRange.of(0, 10).spliterator(), false).forEach(Console::writeLine);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    StreamSupport sınıfının stream metoduna Iterable arayüzünün spliterator metodunun geri dönüş verilerel Stream referansı
    elde edilebilir. Metodun ikinci parametresi true geçilirse "paralel stream" biçiminde çalışacak bir referans elde
    edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products.csv");
//            if (productFactory.isEmpty())
//                return;
//
//            var products = productFactory.get().getProductsAsIterable();
//
//            StreamSupport.stream(products.spliterator(), false)
//                    .filter(p -> p.getStock() < 0)
//                    .map(ProductConverter::new)
//                    .map(ProductConverter::toProductStockDTO)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin generate metotları parametre olarak aldığı supplier'ı kullanarak her adımda değer üretir. Ancak
    bunu sonsuz döngü biçiminde yapar. Belirli sayıda değer elde etmek için limit metodu kullanılabilir.limit metodu
    parametresi aldığı long türden değer kadar elemana yönelik Stream referansına geri döner
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var r = new Random();
//        var n = Console.readLong("Bir sayı giriniz:");
//
//        IntStream.generate(() -> r.nextInt(100)).limit(n).forEach(val -> Console.write("%d ", val));
//
//        Console.writeLine();
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte n tane rasgele üretilmiş sayı içerisinde asal olanlar ekrana bastırılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var r = new Random();
//        var n = Console.readLong("Bir sayı giriniz:");
//
//        IntStream.generate(() -> r.nextInt(100))
//                .limit(n)
//                .filter(NumberUtil::isPrime)
//                .forEach(val -> Console.write("%d ", val));
//
//        Console.writeLine();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte n tane rasgele üretilmiş asaol sayı elde edilmiş ve ekrana bastırılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var r = new Random();
//        var n = Console.readLong("Bir sayı giriniz:");
//
//        IntStream.generate(() -> r.nextInt(100))
//                .filter(NumberUtil::isPrime)
//                .limit(n)
//                .forEach(val -> Console.write("%d ", val));
//
//        Console.writeLine();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    ... numaralı örnekte n tane rasgele üretilmiş long türden asol sayı elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        GeneratePrimesApp.run();
//    }
//}
//
//final class GeneratePrimesApp {
//    private GeneratePrimesApp()
//    {
//    }
//
//    public static void run()
//    {
//        try (var fos = new FileOutputStream("primes.txt", true)) {
//            var r = new Random();
//            var gp = new GeneratePrimes(3, r, fos);
//
//            gp.generate();
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//}
//
//enum OutputStatus {TEXT, BINARY}
//
//class GeneratePrimes {
//    private long m_count;
//    private OutputStream m_outputStream;
//    private OutputStatus m_outputStatus;
//    private Random m_random;
//
//    private void generateForTextForEachCallback(BufferedWriter bw, long val)
//    {
//        try {
//            bw.write(val + "\r\n");
//            bw.flush();
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private void generateForBinaryForEachCallback(DataOutputStream dos, long val)
//    {
//        try {
//            dos.writeLong(val);
//            dos.flush();
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private void generateForText()
//    {
//        var bw = new BufferedWriter(new OutputStreamWriter(m_outputStream, StandardCharsets.UTF_8));
//
//        LongStream.generate(m_random::nextLong)
//                .filter(NumberUtil::isPrime)
//                .limit(m_count)
//                .forEach(val -> generateForTextForEachCallback(bw, val));
//    }
//
//    private void generateForBinary()
//    {
//        var dos = new DataOutputStream(m_outputStream);
//
//        LongStream.generate(m_random::nextLong)
//                .filter(NumberUtil::isPrime)
//                .limit(m_count)
//                .forEach(val -> generateForBinaryForEachCallback(dos, val));
//    }
//
//    public GeneratePrimes(long count, Random random, OutputStream outputStream)
//    {
//        this(count, random, outputStream, OutputStatus.TEXT);
//    }
//
//    public GeneratePrimes(long count, Random random, OutputStream outputStream, OutputStatus outputStatus)
//    {
//        m_count = count;
//        m_random = random;
//        m_outputStream = outputStream;
//        m_outputStatus = outputStatus;
//    }
//
//    //...
//
//    public void generate()
//    {
//        if (m_outputStatus == OutputStatus.BINARY)
//            generateForBinary();
//        else
//            generateForText();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte n-tane rasgele ürün elde edilmiştir. Hiç ürün bulunmaması durumu da kontrol edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = MyProductFactory.loadFromTextFile("products-empty.csv");
//
//            var n = Console.readInt("Bir sayı giriniz:");
//
//            var random = new Random();
//
//            IntStream.range(0, n)
//                    .mapToObj(i -> productFactory.getRandomProduct(random))
//                    .filter(Optional::isPresent)
//                    .map(Optional::get)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    IntStream metodu ile elde edilen stream içerisinde aynı elemandan 1(bir) den fazla bulunmaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var random = new Random();
//        var n = Console.readInt("Bir sayı giriniz:");
//        var a = new int[n];
//
//        IntStream.range(0, n).forEach(i -> a[i] = random.nextInt(100));
//        IntStream.of(a).forEach(val -> Console.write("%d ", val));
//        Console.writeLine();
//        IntStream.of(a).distinct().forEach(val -> Console.write("%d ", val));
//        Console.writeLine();
//    }
//}

































///*----------------------------------------------------------------------------------------------------------------------
//    Stream arayüzünün distinct distinct metodu ile elde edilen stream içerisinde tekrarlı eleman bulunmaz.
//    Dikkat: distinct metodunun açıklamasında doğrudan yazmasa  da metot eşitlik işlemini hashCode kullanarak da yapar.
//    Aşağıdaki örneği ProductInfo sınıfının hashCode ve equals metotlarını kaldırarak çalıştırıp sonucu gözlemleyiniz.
//    distinct metodu tekrarlı değerler arasında eğer kullanılan stream "ordered" ise ilk karşılaştığı değeri verir (stable).
//    Stream "unordered" ilk karşılanı vereceği garanti değildir
//----------------------------------------------------------------------------------------------------------------------*/
//
//
//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = MyProductFactory.loadFromTextFile("products-temp.csv");
//
//
//            var n = Console.readInt("Bir sayı giriniz:");
//            var products = new ArrayList<ProductInfo>();
//
//            var random = new Random();
//
//            IntStream.range(0, n)
//                    .mapToObj(i -> productFactory.getRandomProduct(random))
//                    .filter(Optional::isPresent)
//                    .map(Optional::get)
//                    .forEach(products::add);
//            products.forEach(Console::writeLine);
//
//            Console.writeLine("--------------------");
//
//            products.stream().distinct().forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}
//
































///*----------------------------------------------------------------------------------------------------------------------
//    Aşağıdaki örneği çalıştırıp distict işleminin stable olduğunu gözlemleyiniz
//----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = MyProductFactory.loadFromTextFile("products-temp.csv");
//
//
//            var n = Console.readInt("Bir sayı giriniz:");
//            var products = new ArrayList<ProductInfo>();
//
//            var random = new Random();
//
//            IntStream.range(0, n)
//                    .mapToObj(i -> productFactory.getRandomDiffNameProduct(random))
//                    .filter(Optional::isPresent)
//                    .map(Optional::get)
//                    .forEach(products::add);
//            products.forEach(Console::writeLine);
//
//            Console.writeLine("--------------------");
//
//            products.stream().distinct().forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}








/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte sıralanmış stream'in son n-tane elemanı elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var numberFactory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = numberFactory.getNumbers();
//            var n = Console.readInt("Bir sayı giriniz:");
//
//            Arrays.stream(numbers)
//                    .sorted()
//                    .skip(numbers.length - n)
//                    .forEach(val -> Console.write("%d ", val));
//
//            Console.writeLine();
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte pahalı n-tane ürün satış fiyatına göre küçükten büyüğe sıralanmıştır. ProductInfo sınıfı
    Comparable arayüzünü implemente etmek zorundadır. Aksş durumda aşağıdaki kodda exception oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = MyProductFactory.loadFromTextFile("products.csv");
//            var products = productFactory.PRODUCTS;
//
//            var n = Console.readInt("Bir sayı giriniz:");
//
//            products.stream().sorted().skip(products.size() - n).forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte en pahalı n-tane ürün listelenmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = MyProductFactory.loadFromTextFile("products.csv");
//            var products = productFactory.PRODUCTS;
//
//            var n = Console.readInt("Bir sayı giriniz:");
//
//            products.stream()
//                    .sorted((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()))
//                    .limit(n)
//                    .forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte en pahalı n-tane ürüne ilişkin bir List<T> referansı elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = MyProductFactory.loadFromTextFile("products.csv");
//            var products = productFactory.PRODUCTS;
//
//            var n = Console.readInt("Bir sayı giriniz:");
//
//            List<ProductInfo> list = products.stream()
//                    .sorted((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()))
//                    .limit(n)
//                    .collect(Collectors.toList());
//
//            Console.writeLine(list.getClass().getName());
//            list.forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte en pahalı n-tane ürüne ilişkin bir List<T> referansı elde edilmiştir. Bu List referansının dinamik
    türü "unmodifiable" bir listedir. Elde listeyi değiştirmek (silmek, ekleme yapmak vb.) exception oluşturur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = MyProductFactory.loadFromTextFile("products.csv");
//            var products = productFactory.PRODUCTS;
//
//            var n = Console.readInt("Bir sayı giriniz:");
//
//            List<ProductInfo> list = products.stream()
//                    .sorted((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()))
//                    .limit(n)
//                    .collect(Collectors.toUnmodifiableList());
//
//            Console.writeLine(list.getClass().getName());
//            list.forEach(p -> p.setName(p.getName().toUpperCase()));
//            list.forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte bir IntStream'den büyüktüen küçüğe sıralanmış bir bir dizi elde edilmiştir. Örnekte kutulama
    ve kutu açma yapıldığına dikkat ediniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var numberFactory = NumberFactory.loadFromTextFile(Path.of("numbers.csv"));
//            var numbers = numberFactory.getNumbers();
//            var n = Console.readInt("Bir sayı giriniz:");
//
//            var numArray = Arrays.stream(numbers)
//                    .boxed()
//                    .sorted((a, b) -> b - a)
//                    .limit(n)
//                    .mapToInt(val -> val)
//                    .toArray();
//
//            Arrays.stream(numArray).forEach(val -> Console.write("%d ", val));
//            Console.writeLine();
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte n-tane step miktarı kadar artırım yapan bir stream elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var n = Console.readInt("Bir sayı giriniz:");
//        var step = Console.readInt("Adım sayısını giriniz:");
//
//        IntStream.iterate(0, i -> i + step).limit(n)
//                //.filter(NumberUtil::isPrime)
//                .forEach(i -> Console.write("%d ", i));
//        Console.writeLine();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte n-tane step miktarı kadar artırım yapan bir stream'den dizi elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var n = Console.readInt("Bir sayı giriniz:");
//        var step = Console.readInt("Adım sayısını giriniz:");
//
//        var a = IntStream.iterate(0, i -> i + step).limit(n).toArray();
//
//        IntStream.of(a).forEach(val -> Console.write("%d ", val));
//
//        Console.writeLine();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte [a, b] aralığındaki değerlerden oluşan bir dizi elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readInt("Birinci sayıyı giriniz:");
//        var b = Console.readInt("İkinci sayıyı giriniz:");
//
//        var numbers = IntStream.rangeClosed(a, b).toArray();
//
//        Arrays.stream(numbers).forEach(val -> Console.write("%d ", val));
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte [a, b] aralığındaki step miktarı kadar artarak devam eden değerlerden bir dizi elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readInt("Birinci sayıyı giriniz:");
//        var b = Console.readInt("İkinci sayıyı giriniz:");
//        var s = Console.readInt("Adım miktarını giriniz:");
//
//        var numbers = IntStream.iterate(a, i -> i + s).limit(b - a + 1).filter(val -> val <= b).toArray();
//
//        Arrays.stream(numbers).forEach(val -> Console.write("%d ", val));
//        Console.writeLine();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki örnek aşağıdaki şekilde daha kolay yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var a = Console.readInt("Birinci sayıyı giriniz:");
//        var b = Console.readInt("İkinci sayıyı giriniz:");
//        var s = Console.readInt("Adım miktarını giriniz:");
//
//        var numbers = IntStream.iterate(a, val -> val <= b, i -> i + s).toArray();
//
//        Arrays.stream(numbers).forEach(val -> Console.write("%d ", val));
//        Console.writeLine();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte [-2 * PI, 2 * PI] aralığında sinus fonksiyonun değerleri elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var min = -2 * Math.PI;
//        var max = 2 * Math.PI;
//        var step = 0.03;
//
//        DoubleStream.iterate(min, i -> Double.compare(i, max) <= 0, i -> i + step)
//                .map(Math::sin)
//                .forEach(Console::writeLine);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin concat metotları
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        var n = Console.readInt("Bir sayı giriniz:");
//        var random = new Random();
//        var a = IntStream.iterate(0, i -> i <= n, i -> i + 1).toArray();
//        var b = IntStream.generate(() -> random.nextInt(100)).limit((long)n * 2).toArray();
//        var c = IntStream.concat(IntStream.of(a), IntStream.of(b)).toArray();
//
//        IntStream.of(a).forEach(v -> Console.write("%d ", v));
//        Console.writeLine();
//
//        IntStream.of(b).forEach(v -> Console.write("%d ", v));
//        Console.writeLine();
//
//        IntStream.of(c).forEach(v -> Console.write("%d ", v));
//        Console.writeLine();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzlerinin concat metotları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var n = Console.readInt("Bir sayı giriniz:");
//        var random = new Random();
//        var a = IntStream.iterate(0, i -> i <= n, i -> i + 1).toArray();
//        var b = IntStream.generate(() -> random.nextInt(100)).limit((long)n * 2).toArray();
//        var c = IntStream.rangeClosed(10, 20).toArray();
//        var d = IntStream.concat(IntStream.of(a), IntStream.concat(IntStream.of(b), IntStream.of(c))).toArray();
//
//        IntStream.of(a).forEach(v -> Console.write("%d ", v));
//        Console.writeLine();
//
//        IntStream.of(b).forEach(v -> Console.write("%d ", v));
//        Console.writeLine();
//
//        IntStream.of(c).forEach(v -> Console.write("%d ", v));
//        Console.writeLine();
//
//        IntStream.of(d).forEach(v -> Console.write("%d ", v));
//        Console.writeLine();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte ProductInfo nesneleri için toString metodunun döndürdüğü değerlere ilişkin birleştirme yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var names = NameFactory.loadFromTextFile(Path.of("names-temp.csv")).NAMES;
//            var products = MyProductFactory.loadFromTextFile("products-temp.csv").PRODUCTS;
//
//            var texts = Stream.concat(names.stream(), products.stream()).collect(Collectors.toList());
//
//            texts.forEach(Console::writeLine);
//
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte ProductInfo nesnelerinin isimleri ile birleştirme yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var names = NameFactory.loadFromTextFile(Path.of("names-temp.csv")).NAMES;
//            var products = MyProductFactory.loadFromTextFile("products-temp.csv").PRODUCTS;
//
//            var texts = Stream.concat(products.stream().map(ProductInfo::getName), names.stream())
//                    .collect(Collectors.toList());
//
//            texts.forEach(Console::writeLine);
//
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    StreamUtil sınıfının filter metotları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var products = MyProductFactory.loadFromTextFile("products.csv").PRODUCTS;
//
//            var count = StreamUtil.filter(products.stream(), p -> p.getStock() <= 0, Collectors.counting());
//            var list = StreamUtil.filter(products.stream(), p -> p.getStock() <= 0, Collectors.toList());
//
//            Console.writeLine("Count:%s", count);
//            list.forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    StreamUtil sınıfının filter metotları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var products = MyProductFactory.loadFromTextFile("products.csv").PRODUCTS;
//
//            var count = StreamUtil.filter(products, p -> p.getStock() <= 0, Collectors.counting());
//            var list = StreamUtil.filter(products, p -> p.getStock() <= 0, Collectors.toList());
//
//            Console.writeLine("Count:%s", count);
//            list.forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Collectors sınıfının summingInt metodu.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var products = MyProductFactory.loadFromTextFile("products.csv").PRODUCTS;
//
//            var sum = products.stream()
//                    .filter(p -> p.getStock() > 0)
//                    .collect(Collectors.summingInt(ProductInfo::getStock));
//
//            Console.writeLine("Total stock:%d", sum);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki örnek aşağıdaki gibi de yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var products = MyProductFactory.loadFromTextFile("products.csv").PRODUCTS;
//
//            var sum = products.stream()
//                    .filter(p -> p.getStock() > 0)
//                    .mapToInt(ProductInfo::getStock)
//                    .sum();
//
//            Console.writeLine("Total stock:%d", sum);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    Collectors sınıfının averagingInt metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var products = MyProductFactory.loadFromTextFile("products.csv").PRODUCTS;
//
//            var avg = products.stream()
//                    .filter(p -> p.getStock() > 0)
//                    .collect(Collectors.averagingInt(ProductInfo::getStock));
//
//            Console.writeLine("Average:%f", avg);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
    Stream arayüzünün average metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var products = MyProductFactory.loadFromTextFile("products.csv").PRODUCTS;
//
//            var optAvg = products.stream().filter(p -> p.getStock() > 0).mapToInt(ProductInfo::getStock).average();
//
//            optAvg.ifPresent(avg -> Console.writeLine("Average:%f", avg));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte tüm kişilerin yaşlları ortalaması bulunmuştur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = PersonFactory.loadFromTextFile(Path.of("people.csv"));
//            var people = factory.PEOPLE;
//
//            people.stream()
//                    .mapToDouble(Person::getAge)
//                    .average()
//                    .ifPresentOrElse(avg -> Console.write("%f ", avg), () -> Console.writeLine("Hiç kişi yok"));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte yaş eşik değerinden büyük kişilerin yaşları ortalaması bulunmuştur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = PersonFactory.loadFromTextFile(Path.of("people.csv"));
//            var people = factory.PEOPLE;
//
//            var ageThreshold = Console.readDouble("Yaş eşik değerini giriniz:");
//
//            people.stream()
//                    .mapToDouble(Person::getAge)
//                    .filter(age -> age > ageThreshold)
//                    .average()
//                    .ifPresentOrElse(avg -> Console.write("%f ", avg), () -> Console.writeLine("Hiç kişi yok"));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte yaş eşik değerinden büyük kişilerin yaşları ortalaması bulunmuştur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = PersonFactory.loadFromTextFile(Path.of("people.csv"));
//            var people = factory.PEOPLE;
//
//            var ageThreshold = Console.readDouble("Yaş eşik değerini giriniz:");
//
//            people.stream()
//                    .filter(p -> p.getAge() > ageThreshold)
//                    .mapToDouble(Person::getAge)
//                    .average()
//                    .ifPresentOrElse(avg -> Console.write("%f ", avg), () -> Console.writeLine("Hiç kişi yok"));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Collectors sınıfının partitioningBy metodu ile koşula uyanlar ve uymayanlar bir Map collection'ı olarak
    elde edilebilir. Burada Map'in anahtara ilişkin türü Boolean türdendir. Buna göre koşula uyanlar Map'in
    true anahtarına ilişkin değerde olur, koşula uymayanlar ise false anahtarına ilişkin değerde olur.
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = PersonFactory.loadFromTextFile(Path.of("people.csv"));
//            var people = factory.PEOPLE;
//
//            var ageThreshold = Console.readDouble("Yaş eşik değerini giriniz:");
//
//            Map<Boolean, List<Person>> map = people.stream()
//                    .collect(Collectors.partitioningBy(p -> p.getAge() > ageThreshold));
//
//            Console.writeLine("%.2f yaşından büyük olanlar", ageThreshold);
//            map.get(true).forEach(Console::writeLine);
//            Console.writeLine("--------------------------------");
//            Console.writeLine("%.2f yaşından küçük olanlar", ageThreshold);
//            map.get(false).forEach(Console::writeLine);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Collectors sınıfının groupingBy metodu ile belirli bir sınıflandırıcı (classifier) ile gruplama yapılabilir.
    Aşağıdaki örnekte MaritalStatus enum sınıfına ilişkin değerlere (sabit) göre sınıflandırma yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = PersonFactory.loadFromTextFile(Path.of("people.csv"));
//            var people = factory.PEOPLE;
//
//            Map<MaritalStatus, List<Person>> map = people.stream()
//                    .collect(Collectors.groupingBy(Person::getMaritalStatus));
//
//            if (map.containsKey(MaritalStatus.SINGLE)) {
//                Console.writeLine("Bekar kişiler:");
//                map.get(MaritalStatus.SINGLE).forEach(Console::writeLine);
//            }
//            else
//                Console.writeLine("Hiç bekar kişi yok");
//
//            Console.writeLine("-------------------------------------------------");
//
//            if (map.containsKey(MaritalStatus.MARRIED)) {
//                Console.writeLine("Evli kişiler:");
//                map.get(MaritalStatus.MARRIED).forEach(Console::writeLine);
//            }
//            else
//                Console.writeLine("Hiç evli kişi yok");
//
//            Console.writeLine("-------------------------------------------------");
//
//            if (map.containsKey(MaritalStatus.DIVORCED)) {
//                Console.writeLine("Boşanmış kişiler:");
//                map.get(MaritalStatus.DIVORCED).forEach(Console::writeLine);
//            }
//            else
//                Console.writeLine("Hiç boşanmış kişi yok");
//
//            Console.writeLine("-------------------------------------------------");
//
//            if (map.containsKey(MaritalStatus.WIDOW)) {
//                Console.writeLine("dul kişiler:");
//                map.get(MaritalStatus.WIDOW).forEach(Console::writeLine);
//            }
//            else
//                Console.writeLine("Hiç dul kişi yok");
//
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Collectors sınıfının joining metodu ile yazı birleştirmesi yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = MyProductFactory.loadFromTextFile("products-temp.csv");
//            var products = factory.PRODUCTS;
//
//            var str = products.stream().map(ProductInfo::getName).collect(Collectors.joining());
//
//            Console.writeLine(str);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Collectors sınıfının joining metodu ile yazı birleştirmesi ayraç kullanarak da yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = MyProductFactory.loadFromTextFile("products-temp.csv");
//            var products = factory.PRODUCTS;
//
//            var str = products.stream().map(ProductInfo::getName).collect(Collectors.joining(" :: "));
//
//            Console.writeLine(str);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Colloctors sınıfının joining metodu ile yazı birleştirmesi ayraç, prefix ve suffix kullanılarak yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = MyProductFactory.loadFromTextFile("products-temp.csv");
//            var products = factory.PRODUCTS;
//
//            var str = products.stream().map(ProductInfo::getName).collect(Collectors
//                    .joining(" :: ", "{{", "}}"));
//
//            Console.writeLine(str);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Collectors sınıfının joining metodu ile yazı birleştirmesi ayraç, prefix ve suffix kullanılarak yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var factory = MyProductFactory.loadFromTextFile("products-temp.csv");
//            var products = factory.PRODUCTS;
//
//            var str = products.stream().map(ProductInfo::getName)
//                    .map(s -> "[[" + s + "]]")
//                    .collect(Collectors.joining(" :: ", "{", "}"));
//
//            Console.writeLine(str);
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    System.currentTimeMillis() metodu 01.01.1970 gece yarısı (00:00:00.000) UTC zamanından (epoch time) çağrıldığı
    noktaya kadarki milisaniye sayısına geri döner. Bu durumda bir kod parçasaının ne kadar zaman aldığı aşağıdaki
    gibi basitçe ölçülebilir. Şüphesiz bu ölçümleri yapmanın başka yöntemleri de vardır. Bu metot ile çok basit
    bir biçimde yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var begin = System.currentTimeMillis();
//        Console.writeLine(NumberUtil.isPrime(6584583408148485263L));
//        var end = System.currentTimeMillis();
//
//        var diff = end - begin;
//
//        Console.writeLine("Elapsed Time (sec):%f", diff / 1000.);
//
//        begin = System.currentTimeMillis();
//        Console.writeLine(NumberUtil.isPrime(BigInteger.valueOf(6584583408148485263L)));
//        end = System.currentTimeMillis();
//
//        diff = end - begin;
//
//        Console.writeLine("Elapsed Time (sec):%f", diff / 1000.);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    System.nanoTime() metodu System.currentTimeMillis metoduna göre daha hassas bir ölçüm yapar. JavaSE bunu
    garanti etmiştir. Ancak yine nano saniye mertebesinde hassas bir ölçüm yapmayabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var begin = System.nanoTime();
//        Console.writeLine(NumberUtil.isPrime(6584583408148485263L));
//        var end = System.nanoTime();
//
//        var diff = end - begin;
//
//        Console.writeLine("Elapsed Time (sec):%f", diff / 1_000_000_000.);
//
//        begin = System.nanoTime();
//        Console.writeLine(NumberUtil.isPrime(BigInteger.valueOf(6584583408148485263L)));
//        end = System.nanoTime();
//
//        diff = end - begin;
//
//        Console.writeLine("Elapsed Time (sec):%f", diff / 1_000_000_000.);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
    Basit bir StopWatch sınıfı. DateTimeLib kütüphanesinde bulunmaktadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var stopWatch = new StopWatch();
//
//        stopWatch.start();
//        Console.writeLine(NumberUtil.isPrime(6584583408148485263L));
//        stopWatch.stop();
//
//        Console.writeLine("Elapsed Time (sec):%f", stopWatch.getElapsed() / 1_000_000_000.);
//
//        stopWatch.start();
//        Console.writeLine(NumberUtil.isPrime(BigInteger.valueOf(6584583408148485263L)));
//        stopWatch.stop();
//
//        Console.writeLine("Elapsed Time (sec):%f", stopWatch.getElapsed() / 1_000_000_000.);
//    }
//}
//
//class StopWatch {
//    private long m_start;
//    private long m_stop;
//
//    public long getStart()
//    {
//        return m_start;
//    }
//
//    public long getStop()
//    {
//        return m_stop;
//    }
//
//    public long getElapsed()
//    {
//        return m_stop - m_start;
//    }
//
//    public void start()
//    {
//        m_start = System.nanoTime();
//    }
//
//    public void stop()
//    {
//        m_stop = System.nanoTime();
//    }
//}
































