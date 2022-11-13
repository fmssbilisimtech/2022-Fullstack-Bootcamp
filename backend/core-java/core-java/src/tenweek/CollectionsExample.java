package tenweek;

import data.camera.CarCameraInfo;
import data.factory.ProductFactory;

import util.*;
import util.collection.FmssArrayList;
import util.collection.FmssStack;
import util.collection.FmssVector;

import java.math.BigDecimal;
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























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte LinkedList sınıfı stack gibi kullanılmıştır. pop metod eğer bağlı liste boş ise
    NoSuchElementException nesnesi fırlatır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        for (int i = 0; i < 10; ++i)
//            linkedList.push(i * 10);
//
//        while (!linkedList.isEmpty())
//            Console.write("%d ", linkedList.pop());
//
//        Console.writeLine();
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    poll, pollFirst ve pollLast metotları liste boş ise null değerine geri dönererler. Bu durumda eğer LinkerList
    içerisinde null da değer olarak tuutuluyorsa listenin boş olup olmadığı buradan anlaşılamaz
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        for (int i = 0; i < 10; ++i)
//            linkedList.push(i * 10);
//
//        linkedList.push(null);
//
//        Integer val;
//
//        while ((val = linkedList.pollFirst()) != null)
//            Console.write("%d ", val);
//
//        Console.writeLine();
//    }
//}







/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte bağlı liste içerisinde null değerler de tutulmuştur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        for (int i = 0; i < 20; ++i)
//            linkedList.addFirst(r.nextBoolean() ? r.nextInt(100) : null);
//
//        while (!linkedList.isEmpty()) {
//            var item = linkedList.pollFirst();
//            Console.writeLine("%s", item);
//        }
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    LinkedList sınıfının for-each ile dolaşılması. Örnekte kutulama yapıldığına dikkat ediniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        for (int i = 0; i < 20; ++i)
//            linkedList.addFirst(r.nextBoolean() ? r.nextInt(100) : null);
//
//        for (var val : linkedList)
//            Console.writeLine("%s", val);
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki örnek için OptionalInt sınıfının kullanımı kutulama maliyetine de ortadan kaldırır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        LinkedList<OptionalInt> linkedList = new LinkedList<>();
//
//        for (int i = 0; i < 20; ++i)
//            linkedList.addFirst(r.nextBoolean() ? OptionalInt.of(r.nextInt(100)) : OptionalInt.empty());
//
//        for (var optInt : linkedList)
//            optInt.ifPresentOrElse(val -> Console.writeLine("%d", val), () -> Console.writeLine("Henüz sayı gelmedi"));
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Collection arayüzünün toArray metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var random = new Random();
//            var factoryOpt = ProductFactory.loadFromTextFile("products-org.csv");
//            if (factoryOpt.isEmpty())
//                return;
//
//            var factory = factoryOpt.get();
//
//            factory.PRODUCTS.forEach(Console::writeLine);
//
//            Console.writeLine("---------------------------------------------------------");
//
//            var products = new ProductInfo[factory.PRODUCTS.size()];
//
//            factory.PRODUCTS.toArray(products);
//            for (var pi : products)
//                Console.writeLine(pi);
//        }
//        catch (Throwable ex) {
//            Console.Error.writeLine(ex.getMessage());
//        }
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Collection arayüzünün toArray metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var random = new Random();
//            var factoryOpt = ProductFactory.loadFromTextFile("products-org.csv");
//            if (factoryOpt.isEmpty())
//                return;
//
//            var factory = factoryOpt.get();
//
//            factory.PRODUCTS.forEach(Console::writeLine);
//
//            Console.writeLine("---------------------------------------------------------");
//
//            var products = factory.PRODUCTS.toArray(new ProductInfo[0]);
//
//            for (var pi : products)
//                Console.writeLine(pi);
//        }
//        catch (Throwable ex) {
//            Console.Error.writeLine(ex.getMessage());
//        }
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Collection arayüzünün toCharArray metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var random = new Random();
//            var factoryOpt = ProductFactory.loadFromTextFile("products-org.csv");
//            if (factoryOpt.isEmpty())
//                return;
//
//            var factory = factoryOpt.get();
//
//            factory.PRODUCTS.forEach(Console::writeLine);
//
//            Console.writeLine("---------------------------------------------------------");
//
//            for (var pi : factory.PRODUCTS.toArray(new ProductInfo[0]))
//                Console.writeLine(pi);
//        }
//        catch (Throwable ex) {
//            Console.Error.writeLine(ex.getMessage());
//        }
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
    Set arayüzünü destekleyen collection sınıflar küme collection sınıflarıdır. Set collection sınıfları genel olarak
    Matematik'teki küme kavramının şu iki özelliğini içeren sınıflardır:
    - Bir kümede elemanın sırasının önemi yoktur. Aslında burada sıra "sort" anlamında değil öncelik sonralık
    ilişkisi anlamındadır. Örneğin Treeset sınıfı elemanları sıralı olarak tutar. Bu durumda hangi sırada eklenirse
    eklensin sıraya dizilir.
    - Bir kümede bir elemandan yalnızca bir tane bulunur. Yani kümede eleman tekrarı olmaz

    Set<T> arayüzü de Collection<T> arayüzünden türetilmiştir. Tüm Set collection sınıfları yukarıdaki ikinci özelliğe
    uygun çalışır. Yani collection içerisinde eleman tekrarı olmaz.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    TreeSet collection sınıfı elemanları sıralı biçimde tutar. Sıralama doğal sıralamadır (natural sort order).
    Bilindigi gibi doğal sıralama artan sırada (ascending) sıralamaktır. TreeSet sınıfı eşitlik karşılaştırması için
    equals metodunu kullanır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        Random r = new Random();
//
//        for (int i = 0; i < 30; ++i) {
//            int val = r.nextInt(100);
//            Console.writeLine("%d -> %b", val, treeSet.add(val));
//        }
//
//        Console.writeLine();
//        Console.writeLine(treeSet);
//        Console.writeLine("Size:%d", treeSet.size());
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
    BigInteger sınıfı da Comparable arayüzünü desteklediğinden aşağıdaki örnekte exception oluşmaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var treeSet = new TreeSet<BigInteger>();
//        Random r = new Random();
//
//        for (int i = 0; i < 10; ++i) {
//            var bi = new BigInteger(128, r);
//
//            treeSet.add(bi);
//        }
//
//        Console.writeLine();
//        Console.writeLine(treeSet);
//        Console.writeLine("Size:%d", treeSet.size());
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıf Comparable arayüzünü desteklemez ise veya desteklese bile farklı bir kritere göre sıralama yapılması
    gerekirse TreeSet sınıfının Comparator arayüzü parametreli ctor'u kullanılabilir. Bu durumda artık TreeSet açılıma
    ilişkin türün Comparable olup olmamasına bakmayacak ve verilen kritere göre sıralamayı callback olarak verilen
    referans ile yapacaktır. Comparator arayüzü eski bir arayüz olmasına karşın doğaı gereği Java 8 ile birlikte
    FunctionalInterface annotation'ı ile işaretlenmiştir.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    TreeSet collection sınıfı elemanları sıralı biçimde tutar. Sıralama doğal sıralamadır (natural sort order).
    Bilindigi gibi doğal sıralama artan sırada sıralamaktır. TreeSet sınıfı eşitlik karşılaştırması için equals metodunu
    kullanır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        TreeSet<Integer> treeSet = new TreeSet<>((a, b) -> b - a);
//        Random r = new Random();
//
//        for (int i = 0; i < 30; ++i) {
//            int val = r.nextInt(100);
//            Console.writeLine("%d -> %b", val, treeSet.add(val));
//        }
//
//        Console.writeLine();
//        Console.writeLine(treeSet);
//        Console.writeLine("Size:%d", treeSet.size());
//    }
//}



/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte Complex nesnelerine ilişkin referanslar bir kümeye eklenmiştir. TreeSet sınıfına sıralama kriteri
    verilerek norma göre sıralama yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        TreeSet<Complex> treeSet = new TreeSet<>((z1, z2) -> Double.compare(z1.getNorm(), z2.getNorm()));
//        Random r = new Random();
//
//        int min = -10, max = 10;
//
//        for (int i = 0; i < 10; ++i) {
//            int a = r.nextInt(max - min + 1) + 1;
//            int b = r.nextInt(max - min + 1) + 1;
//            var z = new Complex(a, b);
//
//            treeSet.add(z);
//        }
//
//        Console.writeLine();
//        Console.writeLine(treeSet);
//        Console.writeLine("Size:%d", treeSet.size());
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte Complex nesnelerine ilişkin referanslar bir kümeye eklenmiştir. TreeSet sınıfına sıralama kriteri
    verilerek gerçek kısmına göre sıralama yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        TreeSet<Complex> treeSet = new TreeSet<>((z1, z2) -> Double.compare(z1.re, z2.re));
//        Random r = new Random();
//
//        int min = -10, max = 10;
//
//        for (int i = 0; i < 10; ++i) {
//            int a = r.nextInt(max - min + 1) + 1;
//            int b = r.nextInt(max - min + 1) + 1;
//            var z = new Complex(a, b);
//
//            treeSet.add(z);
//        }
//
//        Console.writeLine();
//        Console.writeLine(treeSet);
//        Console.writeLine("Size:%d", treeSet.size());
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Comparator arayüzünün comparingDouble metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        TreeSet<Complex> treeSet = new TreeSet<>(Comparator.comparingDouble(Complex::getNorm));
//        Random r = new Random();
//
//        int min = -10, max = 10;
//
//        for (int i = 0; i < 10; ++i) {
//            int a = r.nextInt(max - min + 1) + 1;
//            int b = r.nextInt(max - min + 1) + 1;
//            var z = new Complex(a, b);
//
//            treeSet.add(z);
//        }
//
//        Console.writeLine();
//        Console.writeLine(treeSet);
//        Console.writeLine("Size:%d", treeSet.size());
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Comparator arayüzünün non-static reversed metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        TreeSet<Complex> treeSet = new TreeSet<>(Comparator.comparingDouble(Complex::getNorm).reversed());
//        Random r = new Random();
//
//        int min = -10, max = 10;
//
//        for (int i = 0; i < 10; ++i) {
//            int a = r.nextInt(max - min + 1) + 1;
//            int b = r.nextInt(max - min + 1) + 1;
//            var z = new Complex(a, b);
//
//            treeSet.add(z);
//        }
//
//        Console.writeLine();
//        Console.writeLine(treeSet);
//        Console.writeLine("Size:%d", treeSet.size());
//    }
//}
































/*--------------------------------------------------------------------------------------------------------------------
    NumericLotto sınıfı
---------------------------------------------------------------------------------------------------------------------*/

// class NumericLottery {
//    private final Random m_random;
//
//    public NumericLottery()
//    {
//        m_random = new Random();
//    }
//
//    public NumericLottery(Random r)
//    {
//        m_random = r;
//    }
//
//    public int [] getNumbers()
//    {
//        var set = new TreeSet<Integer>();
//
//        while (set.size() != 6)
//            set.add(m_random.nextInt(49) + 1);
//
//        //int türden diziye çevirme şimdilik bu şekilde yapıldı
//        int [] a = new int[6];
//
//        int i = 0;
//
//        for (var val : set)
//            a[i++] = val;
//
//        return a;
//    }
//
//    public int [][] getNumbers(int n)
//    {
//        int [][] result = new int[n][];
//
//        for (int i = 0; i < n; ++i)
//            result[i] = getNumbers();
//
//        return result;
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    TreeSet sınıfının comparing metodu
    Not: Thread.sleep metodu akışı bekletmek için kullanılmıştır. Detayları bu örnek için önemsizdir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args) throws InterruptedException
//    {
//        var treeSet = new TreeSet<>(Comparator.comparing(CarCameraInfo::getPassDateTime));
//        var factory = new RandomPlateFactory();
//
//        for (int i = 0; i < 10; ++i) {
//            treeSet.add(new CarCameraInfo(factory.getRandomPlate()));
//            Thread.sleep(1000);
//        }
//
//        for (var c : treeSet)
//            Console.writeLine(c);
//    }
//}
//
//class RandomPlateFactory {
//    private final Random m_random;
//
//    public RandomPlateFactory()
//    {
//        this(new Random());
//    }
//    public RandomPlateFactory(Random random)
//    {
//        m_random = random;
//    }
//
//    public String getRandomPlate()
//    {
//        var cityCode = m_random.nextInt(81) + 1;
//        var text = StringUtil.getRandomTextEN(m_random, 3);
//        var number = m_random.nextInt(999) + 1;
//
//        return String.format("%02d %s %d", cityCode, text.toUpperCase(), number);
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    TreeSet sınıfının comparing metodu
    Not: Thread.sleep metodu akışı bekletmek için kullanılmıştır. Detayları bu örnek için önemsizdir
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args) throws InterruptedException
//    {
//        var treeSet = new TreeSet<>(Comparator.comparing(CarCameraInfo::getPlate));
//        var factory = new RandomPlateFactory();
//
//        for (int i = 0; i < 30; ++i) {
//            treeSet.add(new CarCameraInfo(factory.getRandomPlate()));
//            Thread.sleep(1000);
//        }
//
//        for (var c : treeSet)
//            Console.writeLine(c);
//    }
//}
//
//class RandomPlateFactory {
//    private final Random m_random;
//
//    public RandomPlateFactory()
//    {
//        this(new Random());
//    }
//    public RandomPlateFactory(Random random)
//    {
//        m_random = random;
//    }
//
//    public String getRandomPlate()
//    {
//        var cityCode = m_random.nextInt(81) + 1;
//        var text = StringUtil.getRandomTextEN(m_random, 3);
//        var number = m_random.nextInt(999) + 1;
//
//        return String.format("%02d %s %d", cityCode, text.toUpperCase(), number);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    HashSet sınıf hashCode ve equals metodunu kullanarak elemanın varlığını sorgular. Bu durumda aynı elemandan eklenmez.
    Aynı zamanda HashSet sınıfı elemanları sıraya dizmez. Yani HashSet içerisindeki elemanların sırasının önemi yoktur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var hashSet = new HashSet<Integer>();
//
//        var random = new Random();
//
//        for (int i = 0; i < 20; ++i) {
//            int val = random.nextInt(100);
//
//            hashSet.add(val);
//            Console.write("%d ", val);
//        }
//
//        Console.writeLine();
//        Console.writeLine(hashSet);
//        Console.writeLine(hashSet);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    HashSet içerisinde null değer tutulabilir. Şüphesiz bir tane null değer tutulabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var hashSet = new HashSet<>();
//
//        hashSet.add(null);
//        hashSet.add(null);
//
//        Console.writeLine(hashSet);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı bir yazının tüm karakterlerinin farklı olup olmadığını test eden
    areCharactersDistinct isimi metodu yazınız ve test ediniz

    Örnek: xyzt -> true
           abcad -> false
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        for (;;) {
//            var str = Console.read("Bir yazı giriniz:");
//
//            Console.writeLine(Util.areCharactersDistinct(str) ? "Tüm karakterler farklı" : "Tüm karakterler farklı değil");
//
//
//            if ("elma".equals(str))
//                break;
//        }
//    }
//}
//
//class Util {
//    public static boolean areCharactersDistinct(String str)
//    {
//        var hashSet = new HashSet<Character>();
//        var length = str.length();
//
//        for (int i = 0; i < length; ++i)
//            if (!hashSet.add(str.charAt(i)))
//                return false;
//
//        return true;
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte ProductInfo sınıfının hem hashCode metodu hem de equals uygun şekilde override edilmiştir.
    Metotları kaldırarak programı çalıştırıp sonuçları gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var products = new ProductInfo[]{
//                new ProductInfo().setId(10).setName("test"),
//                new ProductInfo().setId(30).setName("mest"),
//                new ProductInfo().setId(10).setName("jest"),
//        };
//
//        var set = new HashSet<ProductInfo>();
//
//        for (var pi : products)
//            set.add(pi);
//
//        Console.writeLine(set);
//    }
//}
//
//
//
// class ProductInfo {
//    private int m_id;
//    private String m_name = "";
//    private int m_stock;
//    private BigDecimal m_cost = BigDecimal.ZERO;
//    private BigDecimal m_price = BigDecimal.ZERO;
//
//    public int getId()
//    {
//        return m_id;
//    }
//
//    public ProductInfo setId(int id)
//    {
//        m_id = id;
//
//        return this;
//    }
//
//    public String getName()
//    {
//        return m_name;
//    }
//
//    public ProductInfo setName(String name)
//    {
//        m_name = name;
//
//        return this;
//    }
//
//    public int getStock()
//    {
//        return m_stock;
//    }
//
//    public ProductInfo setStock(int stock)
//    {
//        m_stock = stock;
//
//        return this;
//    }
//
//    public BigDecimal getCost()
//    {
//        return m_cost;
//    }
//
//    public ProductInfo setCost(BigDecimal cost)
//    {
//        m_cost = cost;
//
//        return this;
//    }
//
//    public BigDecimal getPrice()
//    {
//        return m_price;
//    }
//
//    public ProductInfo setPrice(BigDecimal price)
//    {
//        m_price = price;
//
//        return this;
//    }
//
//    public BigDecimal getTotal()
//    {
//        return m_price.multiply(m_cost);
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return m_id;
//    }
//
//    @Override
//    public boolean equals(Object obj)
//    {
//        if (!(obj instanceof ProductInfo))
//            return false;
//
//        var other = (ProductInfo)obj;
//
//        return other.m_id == m_id;
//    }
//
//    @Override
//    public String toString()
//    {
//        return String.format("[%d]%s-%s * %s = %s", m_id, m_name, m_cost, m_price, this.getTotal());
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Bir collection içerisindeki tüm elemanların tekil (unique) olup olmadığını test eden
    generic bir metot yazınız
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        try {
//            var productFactory = ProductFactory.loadFromTextFile("products-org.csv").get();
//            var products = new ArrayList<ProductInfo>();
//            var random = new Random();
//
//            for (int i = 0; i < 300; ++i) {
//                var product = productFactory.getRandomProduct(random);
//
//                products.add(product);
//            }
//
//            for (var p : products)
//                Console.writeLine(p);
//
//            Console.writeLine(CollectionUtil.areAllDistinct(products));
//        }
//        catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//    }
//}
//
//final class CollectionUtil {
//    private CollectionUtil()
//    {
//    }
//
//    public static <T> boolean areAllDistinct(Collection<? extends T> collection)
//    {
//        return collection.size() == new HashSet<>(collection).size();
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Question: Design a stack that computes the minimum int value in contant time. The push, pop and min methods should
    operate int O(1) time. Amortized constant time allowed for push method
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        CSDMinValueStack stack = new CSDMinValueStack();
//        Random r = new Random();
//
//        for (int i = 0; i < 20; ++i) {
//            int val = r.nextInt(100);
//
//            Console.write("%d ", val);
//
//            stack.push(val);
//        }
//
//        Console.writeLine();
//
//        stack.min().ifPresent(val -> Console.writeLine("Minimum value:%d", val));
//
//        while (!stack.isEmpty())
//            Console.write("%d ", stack.pop());
//
//        Console.writeLine();
//    }
//}
//
//class CSDMinValueStack extends Stack<Integer> {
//    private final Stack<Integer> m_minStack = new Stack<>();
//
//    @Override
//    public Integer push(Integer val)
//    {
//        var minOpt = min();
//
//        if (minOpt.isPresent()) {
//            var minVal = minOpt.getAsInt();
//
//            if (minVal > val)
//                m_minStack.push(val);
//        }
//        else
//            m_minStack.push(val);
//
//        return super.push(val);
//    }
//
//    @Override
//    public Integer pop()
//    {
//        int val = super.pop();
//
//        var minOpt = min();
//
//        if (minOpt.isPresent()) {
//            var minVal = minOpt.getAsInt();
//
//            if (minVal > val)
//                m_minStack.pop();
//        }
//
//        return val;
//    }
//
//    public OptionalInt min()
//    {
//        return m_minStack.isEmpty() ? OptionalInt.empty() : OptionalInt.of(m_minStack.peek());
//    }
//
//    //...
//}


























/*----------------------------------------------------------------------------------------------------------------------
    Soru: Stack kullanarak bir yazıyı ekrana tersten yazdıran printReverse isimli metodu Util sınıfı içerisinde yazınız
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        for (;;) {
//            var str = Console.read("Bir yazı giriniz:");
//
//            Util.printReverse(str);
//
//            if ("elma".equals(str))
//                break;
//        }
//    }
//}
//
//class Util {
//    public static void printReverse(String str)
//    {
//        var charStack = new Stack<Character>();
//        var length = str.length();
//
//        for (var i = 0; i < length; ++i)
//            charStack.push(str.charAt(i));
//
//        while (!charStack.isEmpty())
//            Console.write(charStack.pop());
//
//        Console.writeLine();
//    }
//}



/*----------------------------------------------------------------------------------------------------------------------
    Java'da Map<K, V> arayüzünü destekleyen de bir grup collection sınıf vardır. Bu arayüz herhangi bir arayüzden
    türetilmemiştir. Bu arayüzü destekleyen sınıflara sözlük (dictionary) tarzı collection sınıflar da denir. Bu tarz
    collection sınıflarda bir anahtar ve bir de karşılık geldiği değeri vardır. Anahtar değeri tekil (unique)
    olarak tutulur. Bir anahtar için yeni bir değer verildiğinde ikinci bir anahtar eklenmez eski değer yeni değer
    ile değiştirilir. Bu collection sınıflarda anahtar değeri genellikle küme tarzı collection sınıflar ile tutulur.
    Anahtarın eşitlik karşılaştırması için equals metoduna bakılır. Eğer sınıf hash veri yapısı da kullanıyorsa hashCode
    metodu de eşitlik kriterini belirler.
----------------------------------------------------------------------------------------------------------------------*/


/*----------------------------------------------------------------------------------------------------------------------
    HashMap sınıfının put metodu ile bir anahtara karşılı değer eklenebilir. put metodu anahtar daha önce eklenmişse
    eski değeri ezer yani yeni değeri anahtar için set etmiş olur. Bu durumda eski değere geri döner. Eğer anahtar
    daha önce eklenmemişse null değerine geri döner. Bu collection sınıfların birçoğu null referansı da değer olarak
    tutabilir. Bu durumda put metodunun geri döndürdüğü değerin null olması anahtarın varlığını veya yokluğunu anlamamız için
    kullanılamaz. Şüphesiz collection sınıfa ilişlkin değerin null olmayacağı garanti altındaysa put metodunun geri
    dönüş değerinin null kontrolü anahtarın varlığı veya yokluğunu anlatabilir. null değeri de tutulabildiği durumda
    anahtarın varlığının testi containsKey metodu ile yapılabilir. containsKey metodu anahtarın varlığını yukarıda
    anlatıldığı biçimde test eder. Map arayüzünün keySet metodu ile anahtar değerleri bir set collection'ın referansı
    olarak elde edilebilir. Map arayüzünün get metodu ile bir anahtara karşılık gelen değer elde edilebilir. get metodu
    anahtar map içerisinde yoksa null değere geri döner. Şüphesiz anahtar var ve değeri de null ise de null değere geri
    döner
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        var cityMap = new HashMap<Integer, String>();
//
//        for (;;) {
//            int plate = Console.readInt("Plaka giriniz:");
//
//            if (plate <= 0)
//                break;
//
//            String city = Console.read("Şehir giriniz:");
//
//            if (!cityMap.containsKey(plate))
//                cityMap.put(plate, city);
//            else
//                Console.writeLine("Bu plaka daha önce eklenmiştir");
//        }
//
//        Console.writeLine("Girilen şehirler:");
//        for (var key : cityMap.keySet())
//            Console.writeLine("%d, %s", key, cityMap.get(key));
//    }
//}






























//class App {
//    public static void main(String[] args)
//    {
//        var cityMap = new HashMap<Integer, String>();
//
//        for (;;) {
//            int plate = Console.readInt("Plaka giriniz:");
//
//            if (plate <= 0)
//                break;
//
//            String city = Console.read("Şehir giriniz:");
//
//            if (!cityMap.containsKey(plate))
//                cityMap.put(plate, city);
//            else
//                Console.writeLine("Bu plaka daha önce eklenmiştir");
//        }
//
//        int key = Console.readInt("Aranacak şehir plaka numarasını giriniz:");
//
//        if (cityMap.containsKey(key))
//            Console.writeLine("%d, %s", key, cityMap.get(key));
//        else
//            Console.writeLine("%d plaka numarası bulunamadı");
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    HashMap sınıfı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var countyMap = new HashMap<Integer, ArrayList<String>>();
//        countyMap.put(34, new ArrayList<>());
//        countyMap.get(34).add("Şişli");
//        countyMap.get(34).add("Fatih");
//        countyMap.get(34).add("Beykoz");
//
//        countyMap.put(67, new ArrayList<>());
//        countyMap.get(67).add("Kdz. Ereğli");
//        countyMap.get(67).add("Devrek");
//        countyMap.get(67).add("Merkez");
//        countyMap.get(67).add("Kozlu");
//        countyMap.get(67).add("Kilimli");
//
//
////        for (Integer key : countyMap.keySet()) {
////            Console.write("%d->", key);
////            for (var county : countyMap.get(key))
////                Console.write("%s " , county);
////
////            Console.writeLine();
////        }
//        System.out.println(countyMap.toString());
//
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    HashMap sınıfının values metodu
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        var countyMap = new HashMap<Integer, ArrayList<String>>();
//        countyMap.put(34, new ArrayList<>());
//        countyMap.get(34).add("Şişli");
//        countyMap.get(34).add("Fatih");
//        countyMap.get(34).add("Beykoz");
//
//        countyMap.put(67, new ArrayList<>());
//        countyMap.get(67).add("Kdz. Ereğli");
//        countyMap.get(67).add("Devrek");
//        countyMap.get(67).add("Merkez");
//        countyMap.get(67).add("Kozlu");
//        countyMap.get(67).add("Kilimli");
//
//        for (var counties : countyMap.values()) {
//            for (var county : counties)
//                Console.write("%s ", county);
//
//            Console.writeLine();
//        }
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    TreeMap sınıfı anahtar değerlerini sıralı olarak tutar. ketSet metodu da değerleri sıralı bir Set<T> olarak
    verir. TreeMap için verilen anahtarın türü Comparable arayüzünü destekleyen bir tür olmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var countyMap = new TreeMap<Integer, ArrayList<String>>();
//
//        countyMap.put(67, new ArrayList<>());
//        countyMap.get(67).add("Kdz. Ereğli");
//        countyMap.get(67).add("Devrek");
//        countyMap.get(67).add("Merkez");
//        countyMap.get(67).add("Kozlu");
//        countyMap.get(67).add("Kilimli");
//
//        countyMap.put(34, new ArrayList<>());
//        countyMap.get(34).add("Şişli");
//        countyMap.get(34).add("Fatih");
//        countyMap.get(34).add("Beykoz");
//
//        for (var key : countyMap.keySet()) {
//            Console.write("%d->", key);
//            for (var county : countyMap.get(key))
//                Console.write("%s " , county);
//            Console.writeLine();
//        }
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    TreeMap sınıfının Comparator ile kullanımı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var countyMap = new TreeMap<Integer, ArrayList<String>>(Comparator.reverseOrder());
//
//        countyMap.put(67, new ArrayList<>());
//        countyMap.get(67).add("Kdz. Ereğli");
//        countyMap.get(67).add("Devrek");
//        countyMap.get(67).add("Merkez");
//        countyMap.get(67).add("Kozlu");
//        countyMap.get(67).add("Kilimli");
//
//        countyMap.put(34, new ArrayList<>());
//        countyMap.get(34).add("Şişli");
//        countyMap.get(34).add("Fatih");
//        countyMap.get(34).add("Beykoz");
//
//        for (var key : countyMap.keySet()) {
//            Console.write("%d->", key);
//            for (var county : countyMap.get(key))
//                Console.write("%s " , county);
//            Console.writeLine();
//        }
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
    Bir program içereisinde özdeş yazıların hashCode bilgileri eşittir. hashCode metodunun String sınıfı için nasıl
    override edildiği değişebilir. Ancak aynı yazılar için hep aynı hashCode değeri elde edilir. Farklı yazıların da
    hash kodları farklıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var str1 = Console.read("Bir yazı giriniz:");
//        var str2 = "ankara";
//
//        Console.writeLine("Hash code of %s:%d", str1, str1.hashCode());
//        Console.writeLine("Hash code of %s:%d", str2, str2.hashCode());
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Soru: Parametresi ile aldığı bir yazıların anagram olup olmadığını test eden isAnagram isimli metodu yazınız ve
    test ediniz.

    Tanım: Bir yazının karakterlerinin yerlerinin değiştirilmesiyle ikinci bir yazı elde edilebiliyorsa bu yazılara
    anagram denir.
    Örneğin:
    bartt -> btrat
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        for (;;) {
//            var s1 = Console.read("Birinci yazıyı giriniz:");
//
//            if ("elma".equals(s1))
//                break;
//            var s2 = Console.read("İkinci yazıyı giriniz:");
//
//            Console.writeLine(StringUtil.isAnagram(s1, s2) ? "Anagram" : "Anagram değil");
//        }
//    }
//}
//
//class StringUtil {
//    private static void incrementCounts(HashMap<Character, Integer> charMap, String s)
//    {
//        int length = s.length();
//
//        for (var i = 0; i < length; ++i) {
//            char c = s.charAt(i);
//
//            int count = 1;
//
//            if (charMap.containsKey(c))
//                count = charMap.get(c) + 1;
//
//            charMap.put(c, count);
//        }
//    }
//
//    private static boolean decrementCounts(HashMap<Character, Integer> charMap, String s)
//    {
//        int length = s.length();
//
//        for (var i = 0; i < length; ++i) {
//            char c = s.charAt(i);
//
//            if (!charMap.containsKey(c))
//                return false;
//
//            int count = charMap.get(c) - 1;
//
//            if (count < 0)
//                return false;
//
//            charMap.put(c, count);
//        }
//
//        return true;
//    }
//
//    public static boolean isAnagram(String s1, String s2)
//    {
//        if (s1.isBlank() || s2.isBlank() || s1.length() != s2.length())
//            return false;
//
//        var charMap = new HashMap<Character, Integer>();
//
//        incrementCounts(charMap, s2);
//
//        if (!decrementCounts(charMap, s2))
//            return false;
//
//        for (var count : charMap.values())
//            if (count != 0)
//                return false;
//
//        return true;
//    }
//
//    public static void getRandomTextEN(Random m_random, int i) {
//    }
//}

