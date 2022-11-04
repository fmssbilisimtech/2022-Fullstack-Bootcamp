package nineweek.stream;

import data.factory.ProductFactory;
import data.product.ProductInfo;
import util.*;
import util.collection.FmssArrayList;
import util.collection.FmssStack;
import util.collection.FmssVector;

import java.math.BigInteger;
import java.util.*;

public class CollectionsExample {}

/*----------------------------------------------------------------------------------------------------------------------
    Collection arayüzünün anlamı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var iVec = new Vector<Integer>();
//
//        for (var val : IntRange.of(1, 20))
//            iVec.add(val);
//
//        var dList = new ArrayList<Double>();
//        for (var val : DoubleRange.of(1.3, 5.67, 0.1))
//            dList.add(val);
//
//        var hashSet = new HashSet<Integer>();
//
//        for (int i = 0; i < 10; ++i)
//            hashSet.add(i * 10);
//
//        var bList = new ArrayList<BigInteger>();
//        var random = new Random();
//
//        bList.add(new BigInteger(64, random));
//        bList.add(new BigInteger(64, random));
//        bList.add(new BigInteger(64, random));
//
//        var list = new ArrayList<Number>(iVec);
//
//        list.addAll(hashSet);
//        list.addAll(bList);
//        list.addAll(dList);
//
//        list.iterator().forEachRemaining(Console::writeLine);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
    Collection arayüzünün anlamı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var iVec = new Vector<Integer>();
//
//        for (var val : IntRange.of(1, 20))
//            iVec.add(val);
//
//        var dList = new ArrayList<Double>();
//        for (var val : DoubleRange.of(1.3, 5.67, 0.1))
//            dList.add(val);
//
//        var hashSet = new HashSet<Integer>();
//
//        for (int i = 0; i < 10; ++i)
//            hashSet.add(i * 10);
//
//        var bList = new ArrayList<BigInteger>();
//        var random = new Random();
//
//        bList.add(new BigInteger(64, random));
//        bList.add(new BigInteger(64, random));
//        bList.add(new BigInteger(64, random));
//
//        var sList = new ArrayList<String>();
//
//        for (int i = 0; i < 10; ++i)
//            sList.add(StringUtil.getRandomTextTR(random, 10));
//
//        var list = new ArrayList<Object>(iVec);
//
//        list.addAll(hashSet);
//        list.addAll(bList);
//        list.addAll(dList);
//        list.addAll(sList);
//
//        list.iterator().forEachRemaining(Console::writeLine);
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
    Liste tarzı collection sınıflar (yani List<T>) arayüzünü destekleyen sınıfların indexOf metotları karşılaştırma
    işlemini eğer aranan değer null referans değil ise equals metodunu çağırarak eşitliği belirler. Aşağıdaki örnekte
    dinamik tür String olduğu için String sınıfının equals metodu çağrılarak karşılaştırma yapılır
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        Object obj;
//
//        var names = new ArrayList<String>();
//
//        names.add("Onur Gürsoy");
//        names.add("Bora Şahin");
//        names.add("Taner Genç");
//        names.add("Beyza Yazıcı");
//        names.add("Turgut Karaağaç");
//        names.add("Beyza Yazıcı");
//
//        int index = names.indexOf("Beyza Yazıcı");
//
//        Console.writeLine(index);
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Liste tarzı collection sınıflar (yani List<T>) arayüzünü destekleyen sınıfların indexOf metotları karşılaştırma
    işlemini eğer aranan değer null referans değil ise equals metodunu çağırarak eşitliği belirler. Aşağıdaki örnekte
    dinamik tür String olduğu için String sınıfının equals metodu çağrılarak karşılaştırma yapılır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Object obj;
//
//        var names = new ArrayList<String>();
//
//        names.add("Onur Gürsoy");
//        names.add("Bora Şahin");
//        names.add("Taner Genç");
//        names.add("Beyza Yazıcı");
//        names.add("Turgut Karaağaç");
//        names.add("Beyza Yazıcı");
//
//        int index = names.indexOf("Beyza Yazıcı");
//
//        Console.writeLine(index);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfında capacity kullanılır ancak nasıl büyütüleceği söylenmez. Bu sebeple ArrayList sınıfının
    capacity değerini veren bir metodu yoktur. Dolayısıyla capacity bilgisi gereken kodlarda Vector sınıfı ile örnekler
    yazılacaktır. Vector sınıfı burada anlatılmayan farklılıkları ve capacity bilgisini elde edebilmemiz dışında
    ArrayList ile aynı düşünülebilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının default ctor elemanı capacity değerini 10(on) alarak nesnenin yartılmasını sağlar. Vector
    sınıfının capacity metodu capacity değerini döndürür (ArrayList sınıfının capacity metodu yoktur).
    ArrayList/Vector sınıfının size metodu tutulan eleman sayısı bilgisini döndürür
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector numbers = new Vector();
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//    }
//}

/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının capacity parametreli ctor elemanı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector numbers = new Vector(23);
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının add metodu sona eklemek için kullanılır. Şüphesiz bu metot gerektiğinde capacity
    değerini de uygun şekilde (amortized constant time) büyütür. Vector sınıfının default capacity büyütmesi
    var olan capacity değerinin iki katı olacak şekildedir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector numbers = new Vector(6);
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        for (int i = 0; i < 12; ++i)
//            numbers.add(i * 10);
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        numbers.add(67);
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının index parametreli add metodu araya ekleme yapmak için kullanılabilir. Bu metot
    O(n) karmaşıklıktadır. Bu da sürekli araya eklme yapılan algoritmalarda bu veri yapısının kullanımına dikkat
    edilmelidir. Şüphesiz bu metot gerektiğinde capacity değerini uygun şekilde büyütür
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        Vector numbers = new Vector(6);
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        for (int i = 0; i < 12; ++i)
//            numbers.add(0, i * 10);
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        numbers.add(2, 67);
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının get metodu ile bir indeksteki eleman elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList numbers = new ArrayList(6);
//
//        for (int i = 0; i < 12; ++i)
//            numbers.add(i * 10);
//
//        int size = numbers.size();
//
//        for (int i = 0; i < size; ++i) {
//            int val = (int)numbers.get(i);
//
//            System.out.printf("%d ", val);
//        }
//
//        System.out.println();
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının get metoduna pozitif ya da negatif bakımdan sınırlar dışında bir indeks numarası
    verildiğinde exception oluşur. Burada sınır size (hariç) olarak düşünülmelidir. Capacity değeri yani dizinin
    asıl uzunluğu içsel olarak kullanılır
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int n = Integer.parseInt(kb.nextLine());
//
//        Random r = new Random();
//
//        ArrayList numbers = new ArrayList(10);
//
//        for (int i = 0; i < n; ++i)
//            numbers.add(r.nextInt(100));
//
//        int size = numbers.size();
//
//        int val = (int)numbers.get(5);
//
//        System.out.println(val);
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfı for-each döngü deyimi ile dolaşılabilir (iterable) bir sınıftır. for-each döngü deyiminin
    her adımında içeride tutulan eleman sırasıyla elde edilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        ArrayList numbers = new ArrayList(6);
//
//        for (int i = 0; i < 10; ++i)
//            numbers.add(i * 10);
//
//        for (Object obj : numbers) {
//            int val = (int)obj;
//
//            System.out.printf("%d ", val);
//        }
//
//        System.out.println();
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte quit girilene kadar alınan isimler bir listeye atılmıştır. Bu işlemden sonra liste for-each
    döngü deyimi ile dolaşılarak elemanlar elde edilmiştir
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        ArrayList names = new ArrayList();
//        Scanner kb = new Scanner(System.in);
//
//        for (;;) {
//            System.out.print("İsim giriniz:");
//            String name = kb.nextLine();
//
//            if (name.equals("quit"))
//                break;
//
//            names.add(name);
//        }
//
//        for (Object object : names) {
//            String name = (String)object;
//
//            System.out.println(name.toUpperCase());
//        }
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının isEmpty metodu ile ArrayList'in boş olup olmadığı test edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList names = new ArrayList();
//        Scanner kb = new Scanner(System.in);
//
//        for (;;) {
//            System.out.print("İsim giriniz:");
//            String name = kb.nextLine();
//
//            if (name.equals("quit"))
//                break;
//
//            names.add(name);
//        }
//
//        if (!names.isEmpty()) {
//            for (Object object : names) {
//                String name = (String) object;
//
//                System.out.println(name.toUpperCase());
//            }
//        }
//        else
//            System.out.println("Hiç isim girilmedi");
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Aşağıdaki gibi bir komut yorumlayıcı uygulama yazınız.
    Açıklamalar:
    1. get komutu çalıştırıldığında klavyeden exit girilene kadar alınan yazılar bir ArrayList'e eklenecektir.
    2. join komutu ile Arraylist içerisindeki yazılar join komutu ile alınan yazı ile birleştirilecektir. join komutuna
    hiç yazı verilmezse space karakteri ile yazıları birleştirecektir
    4. CommandPromptApp uygulamasına diğer komutlarla birlikte bu komutlar da eklenecektir
----------------------------------------------------------------------------------------------------------------------*/


































/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının set metodu, birinci parametresi ile aldığı index numarasındaki elemanı ikinci parametresi ile
    aldığı elaman ile değiştirir. Metot eski elemana ilişkin referansı döndürür. Metoda pozitif ya da negatif bakımdan
    sınırlar dışında index numarası gönderildiğinde exception fırlatır.
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        ArrayList numbers = new ArrayList();
//
//        for (int i = 0; i < 20; ++i)
//            numbers.add(i * 10);
//
//        System.out.println("Elements:");
//        for (Object o : numbers) {
//            int val = (int)o;
//
//            System.out.printf("%d ", val);
//        }
//
//        System.out.println();
//
//        int oldValue = (int)numbers.set(2, 67);
//
//        System.out.println("Elements:");
//        for (Object o : numbers) {
//            int val = (int)o;
//
//            System.out.printf("%d ", val);
//        }
//
//        System.out.println();
//        System.out.printf("Old Value:%d%n", oldValue);
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının toString metodu ile ArrayList'in elemanları [] içerisinde virgülle ayrılacak
    şekilde bir String elde edilebilir. Bu String'in oluşturulma detayları ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector numbers = new Vector();
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        for (int i = 0; i < 15; ++i)
//            numbers.add(i * 10);
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        System.out.println(numbers.toString());
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Anahtar Notlar: ArrayList/Vector sınıflarında size değerini azaltan metotlar (genel olarak mantıksal silme işlemi yapanlar)
    capacity değerini değiştirmez
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının clear metodu tüm elemanları siler (listeyi boşaltır)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector numbers = new Vector();
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        for (int i = 0; i < 15; ++i)
//            numbers.add(i * 10);
//
//        System.out.println(numbers.toString());
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        numbers.clear();
//
//        System.out.println(numbers.toString());
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının remove metodu parametresi ile aldığı index numarasına ilişkin elemanı siler. Metot
    sildiği elemana ilişkin referansı döndürür. Metoda pozitif ya da negatif bakımdan sınırlar dışında index numarası
    gönderildiğinde exception fırlatır. Dizide eleman silmek O(n) karmaşıklıktadır. remove metodu da capacity
    değerini değiştirmez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector numbers = new Vector();
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        for (int i = 0; i < 15; ++i)
//            numbers.add(i * 10);
//
//        System.out.println(numbers.toString());
//
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//
//        int oldVal = (int)numbers.remove(3);
//
//        System.out.println(numbers.toString());
//
//        System.out.printf("Old value:%d%n", oldVal);
//        System.out.printf("Capacity:%d%n", numbers.capacity());
//        System.out.printf("Size:%d%n", numbers.size());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının trimToSize metodu capacity değerini size değerine getirir. Bu metodun sürekli
    çağrılmaması gerekir. Çünkü bu metot da O(n) karmaşıklıktadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector passwords = new Vector();
//        Random r = new Random();
//
//        for (int i = 0; i < 15; ++i)
//            passwords.add(StringUtil.getRandomTextTR(r, 10));
//
//        System.out.println(passwords.toString());
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.trimToSize();
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Vector sınıfının trimToSize metodu size sıfır ise capacity değerini de sıfır yapar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector passwords = new Vector();
//
//        Random r = new Random();
//
//        for (int i = 0; i < 15; ++i)
//            passwords.add(StringUtil.getRandomTextTR(r, 10));
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.clear();
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.trimToSize();
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıaki örnekte Vector sınıfının capacity değeri sıfır iken değeri nasıl artırdığı gösterilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector passwords = new Vector();
//        Random r = new Random();
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.trimToSize();
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.add(StringUtil.getRandomTextTR(r, 10));
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.add(StringUtil.getRandomTextTR(r, 10));
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.add(StringUtil.getRandomTextTR(r, 10));
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının ensureCapacity metodu capacity değerini aşağıdaki şekilde değiştirmekte (veya değiştirememekte)
    kullanılabilir:
    - Yeni capacity değeri var olan capacity değerinden küçük veya eşitse değişiklik yopmaz
    - Yeni capacity değeri var olan capacity değerinin artması gereken değerinden küçük veya eşitse artması gereken
    değere çeker
    - Yeni capacity değeri var olan capacity değerinin artması gereken değerinden büyükse yeni capacity değerine çeker
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Vector passwords = new Vector();
//        Random r = new Random();
//
//        for (int i = 0; i < 15; ++i)
//            passwords.add(StringUtil.getRandomTextTR(r, 10));
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.ensureCapacity(17);
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.ensureCapacity(30);
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//
//        passwords.ensureCapacity(87);
//
//        System.out.printf("Size:%d%n", passwords.size());
//        System.out.printf("Capacity:%d%n", passwords.capacity());
//    }
//}















/*----------------------------------------------------------------------------------------------------------------------
    FmssArrayList sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Object obj;
//
//        var names = new FmssArrayList<String>();
//
//        names.add("Onur Gürsoy");
//        names.add("Bora Şahin");
//        names.add("Taner Genç");
//        names.add("Beyza Yazıcı");
//        names.add("Turgut Karaağaç");
//        names.add("Beyza Yazıcı");
//
//        int index = names.indexOf("Beyza Yazıcı");
//
//        Console.writeLine(index);
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
    Liste tarzı collection'lar için equals metodunun anlamı
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Application.run();
//    }
//}
//
//class Application {
//    private static void presentCallback(ProductFactory factory)
//    {
//        try {
//            var products = factory.PRODUCTS;
//            int index = products.indexOf(new ProductInfo().setId(44).setName("\"Potatoes - Instant, Mashed\""));
//
//            if (index != -1) {
//                var p = products.get(index);
//
//                Console.writeLine("Index:%d", index);
//                Console.writeLine(p);
//            }
//            else
//                Console.writeLine("Aranan ürün bulunamadı");
//        }
//        catch (Throwable ex) {
//            Console.Error.writeLine(ex.getMessage());
//        }
//    }
//
//    public static void run()
//    {
//        try {
//            var factory = ProductFactory.loadFromTextFile("products-org.csv");
//
//            factory.ifPresentOrElse(Application::presentCallback, () -> Console.Error.writeLine("No data"));
//        }
//        catch (Throwable ex) {
//            Console.Error.writeLine(ex.getMessage());
//        }
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Vector sınıfının capacity değeri herhangi bir belirtme yapılmazsa büyütülmesi durumunda varolan capacity değerinin
    iki katı olarak olarak alınır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Vector<Integer> iVec = new Vector<>();
//
//        for (int i = 0; i < 10; ++i)
//            iVec.add(i * 10);
//
//        Console.writeLine("Capacity:%d", iVec.capacity());
//
//        iVec.add(200);
//        Console.writeLine("Capacity:%d", iVec.capacity());
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Vector sınıfının capacityIncrement parametreli ctor'u ile capacity artım miktarı belirlenebilir. Bu değer sıfır
    veya negatif olarak verilirse default olarak iki kat artırma uygulanır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Vector<Integer> iVec = new Vector<>(10, 12);
//
//        for (int i = 0; i < 10; ++i)
//            iVec.add(i * 10);
//
//        Console.writeLine("Capacity:%d", iVec.capacity());
//
//        iVec.add(200);
//        Console.writeLine("Capacity:%d", iVec.capacity());
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    FmssVector sınıfı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        FmssVector<Integer> iVec = new FmssVector<>(10, 3);
//
//        for (int i = 0; i < 10; ++i)
//            iVec.add(i * 10);
//
//        Console.writeLine("Capacity:%d", iVec.capacity());
//
//        iVec.add(200);
//        Console.writeLine("Capacity:%d", iVec.capacity());
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    FmssVector sınıfı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Vector<Integer> iVec = new Vector<>();
//
//        for (int i = 0; i < 10; ++i)
//            iVec.add(i * 10);
//
//        FmssVector<Integer> icVec = new FmssVector<>(iVec);
//
//        Console.writeLine("Capacity:%d", icVec.capacity());
//
//        icVec.add(200);
//        Console.writeLine("Capacity:%d", icVec.capacity());
//
//        for (var val : icVec)
//            Console.write("%d ", val);
//
//        Console.writeLine();
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Stack veri yapısı Vector sınıfından türetişmiştir.
    (LIFO: Last In First Out)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < 10; ++i)
//            stack.push(i * 10);
//
//        Console.writeLine("Peek:%d", stack.peek());
//
//        while (!stack.empty())
//            Console.write("%d ", stack.pop());
//
//        Console.writeLine();
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Stack sınıfının pop metodu stack boş ise EmptyStackException nesnesi fırlatır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < 10; ++i)
//            stack.push(i * 10);
//
//        Console.writeLine("Peek:%d", stack.peek());
//
//        try {
//            for (;;)
//                Console.write("%d ", stack.pop());
//        }
//        catch (EmptyStackException ignore) {
//
//        }
//
//        Console.writeLine();
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Stack sınıfının search metodu en üstteki elemanı 1(bir) numradan başlamak üzere bulursa sıra numarasına bulamazsa
    -1 değerine geri döner. Eşitlik kontrolü null değeri aranmıyorsa equals metodu çağrılarak yapılır
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var random = new Random();
//            var factoryOpt = ProductFactory.loadFromTextFile("products-org.csv");
//            var productStack = new Stack<ProductInfo>();
//            if (factoryOpt.isEmpty())
//                return;
//
//            var factory = factoryOpt.get();
//
//            for (int i = 0; i < 1000; ++i)
//                productStack.push(factory.getRandomProduct(random));
//
//            var index = productStack.search(new ProductInfo().setId(44).setName("\"Potatoes - Instant, Mashed\""));
//
//            int i = 0;
//
//            if (index != -1) {
//
//                var p = productStack.get(productStack.size() - index);
//
//                while (!productStack.isEmpty())
//                    Console.writeLine("%d %s", ++i, productStack.pop());
//
//                Console.writeLine("-------------------------------");
//                Console.writeLine("Index:%d%n", index);
//                Console.writeLine(p);
//            }
//            else
//                Console.writeLine("Aranan ürün bulunamadı");
//        }
//        catch (Throwable ex) {
//            Console.Error.writeLine(ex.getMessage());
//        }
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    FmssStack sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var random = new Random();
//            var factoryOpt = ProductFactory.loadFromTextFile("products-org.csv");
//            var productStack = new FmssStack<>();
//            if (factoryOpt.isEmpty())
//                return;
//
//            var factory = factoryOpt.get();
//
//            for (int i = 0; i < 1000; ++i)
//                productStack.push(factory.getRandomProduct(random));
//
//            var index = productStack.search(new ProductInfo().setId(44).setName("\"Potatoes - Instant, Mashed\""));
//
//            int i = 0;
//
//            if (index != -1) {
//                var p = productStack.get(productStack.size() - index);
//
//                while (!productStack.isEmpty())
//                    Console.writeLine("%d %s", ++i, productStack.pop());
//
//                Console.writeLine("-------------------------------");
//                Console.writeLine("Index:%d%n", index);
//                Console.writeLine(p);
//            }
//            else
//                Console.writeLine("Aranan ürün bulunamadı");
//        }
//        catch (Throwable ex) {
//            Console.Error.writeLine(ex.getMessage());
//        }
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    LinkedList sınıfının addFirst metodu
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        for (int i = 0; i < 10; ++i)
//            linkedList.addFirst(i * 10);
//
//        for (var val : linkedList)
//            Console.write("%d ", val);
//
//        Console.writeLine();
//    }
//}






