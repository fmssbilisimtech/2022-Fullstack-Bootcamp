package eightweek.methodreference;

public class MethodReference { }

/*----------------------------------------------------------------------------------------------------------------------
    Method reference: Bir metodu referans etmek için kullanılan ifadeye denir. Metot referansına ilişkin ifade de
    fonksiyonel arayüz referansına atanabilir. Metot referansının genel biçimi:

    <isim1>::<isim2>
    isim1 şunlar olabilir: referans tür ismi, referans ismi
    isim2 şunlar olabilir: metot ismi, new anahtar sözcüğü
---------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Metot referansı çeşitleri:
    1. static metot referansı (static method reference)
    2. Bir nesneye ilişkin non-static metot referansı (reference to an instance method of particular object)
    3. Bir türe ilişkin non-static metot referansı (reference to an instance method of any object of a particular type)
    4. ctor referansı (reference to a constructor)
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random random = new Random();
//        IIntBinaryOperator intBinaryOperator = Operation::add; //1 -> Lambda karşılığı: (a, b) -> Operation.add(a, b);
//
//        Console.writeLine(intBinaryOperator.apply(10, 20));
//        Console.writeLine("----------------------------------------------");
//
//        IIntPredicate intPredicate = NumberUtil::isPrime; //1 -> Lambda karşılığı: a -> NumberUtil.isPrime(a);
//        Console.writeLine(intPredicate.test(1_000_003) ? "Asal" : "Asal değil");
//        Console.writeLine("----------------------------------------------");
//
//        IIntSupplier intSupplier = random::nextInt;//2 -> Lambda karşılığı: () -> random.nextInt();
//        Console.writeLine(intSupplier.get());
//        Console.writeLine("----------------------------------------------");
//
//        IIntRandomSupplier intRandomSupplier = Random::nextInt; //3 -> Lambda karşılığı: r -> r.nextInt();
//        Console.writeLine(intRandomSupplier.get(random));
//        Console.writeLine("----------------------------------------------");
//
//        IIntRandomBoundSupplier intRandomBoundSupplier =  Random::nextInt; //3 -> Lambda karşılığı: (r, b) -> r.nextInt(b);
//        Console.writeLine(intRandomBoundSupplier.get(random, 100));
//        Console.writeLine("----------------------------------------------");
//
//        IFactory<Integer, IntValue> integerIntValueIFactory = IntValue::new; //4 -> Lambda Karşılığı: a -> new IntValue(a);
//        IntValue intValue = integerIntValueIFactory.create(10);
//        Console.writeLine("----------------------------------------------");
//
//        IDefaultFactory<IntValue> intValueIDefaultFactory = IntValue::new; //4 -> Lambda Karşılığı: () -> new IntValue();
//        intValue = intValueIDefaultFactory.create();
//        Console.writeLine("----------------------------------------------");
//
//        IStringToIntConverter iStringToIntConverter = String::length; //3 -> Lambda Karşılığı: s -> s.length();
//        Console.writeLine(iStringToIntConverter.convert("ankara"));
//        Console.writeLine("----------------------------------------------");
//
//        IFunction<String, Integer> iStringToIntegerFunction = String::length; //3 -> Lambda Karşılığı: s -> s.length();
//
//        Console.writeLine(iStringToIntegerFunction.apply("ankara"));
//
//        Console.writeLine("----------------------------------------------");
//    }
//}
//
//class Operation {
//    //...
//    public static int add(int a, int b)
//    {
//        return a + b;
//    }
//}
//
//class IntValue {
//    private int m_val;
//
//    public IntValue()
//    {
//        Console.writeLine("IntValue.IntValue()");
//    }
//
//    public IntValue(int val)
//    {
//        Console.writeLine("IntValue.IntValue(int)");
//        m_val = val;
//    }
//
//    //...
//}
//
//interface IFactory<T, R> {
//    R create(T t);
//}
//
//interface IDefaultFactory<R> {
//    R create();
//}
//
//interface IIntRandomBoundSupplier {
//    int get(Random r, int bound);
//}
//
//interface IIntRandomSupplier {
//    int get(Random r);
//}
//
//interface IIntSupplier {
//    int get();
//}
//
//interface IIntPredicate {
//    boolean test(int val);
//}
//
//interface IStringToIntConverter {
//    int convert(String s);
//}
//
//interface IIntBinaryOperator {
//    int apply(int a, int b);
//}
//
//interface IFunction<T, R> {
//    R apply(T t);
//}






























/*----------------------------------------------------------------------------------------------------------------------
    Generic parametreler temel türlerden açılamadığından aşağıdaki örnekte Integer açılımlı kapanış için
    sürekli otomatik kutulama (auto boxing) ve kutuyua açma (auto unboxing) yapılmaktadır. Bu durum generic arayüzler
    için uygulamayı göreli yavaşlatabilir
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        IBinaryOperator<Integer> boi = Integer::sum;
//
//        for (int i = 0; i < 10; ++i) {
//            var a = r.nextInt(100);
//            var b = r.nextInt(100);
//
//            Console.writeLine("a = %d, b = %d", a, b);
//            Console.writeLine(boi.apply(a, b));
//            Console.writeLine("-------------------");
//        }
//
//        Console.writeLine("#####################################");
//
//        IBinaryOperator<String> bos = (s1, s2) -> s1 + " " + s2;
//
//        for (int i = 0; i < 10; ++i) {
//            var s1 = StringUtil.getRandomTextTR(r, 10);
//            var s2 = StringUtil.getRandomTextTR(r, 10);
//            Console.writeLine("s1 = %s, s2 = %s", s1, s2);
//            Console.writeLine(bos.apply(s1, s2));
//            Console.writeLine("-------------------");
//        }
//    }
//}
//
//interface IBinaryOperator<T> {
//    T apply(T a, T b);
//}































/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki problem için IBinaryOperator arayüzünün int türü için de ayrıca tasarlanması (IIntBinaryOperator)
    göreli yavaşlamayı engeller
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        IIntBinaryOperator boi = Integer::sum;
//
//        for (int i = 0; i < 10; ++i) {
//            var a = r.nextInt(100);
//            var b = r.nextInt(100);
//
//            Console.writeLine("a = %d, b = %d", a, b);
//            Console.writeLine(boi.applyAsInt(a, b));
//            Console.writeLine("-------------------");
//        }
//
//        Console.writeLine("#####################################");
//
//        IBinaryOperator<String> bos = (s1, s2) -> s1 + " " + s2;
//
//        for (int i = 0; i < 10; ++i) {
//            var s1 = StringUtil.getRandomTextTR(r, 10);
//            var s2 = StringUtil.getRandomTextTR(r, 10);
//            Console.writeLine("s1 = %s, s2 = %s", s1, s2);
//            Console.writeLine(bos.apply(s1, s2));
//            Console.writeLine("-------------------");
//        }
//    }
//}
//
//interface IIntBinaryOperator {
//    int applyAsInt(int a, int b);
//}
//
//interface IDoubleBinaryOperator {
//    double applyAsDouble(double a, double b);
//}
//
//interface ILongBinaryOperator {
//    long applyAsLong(long a, long b);
//}
//
//interface IBinaryOperator<T> {
//    T apply(T a, T b);
//}































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte callback olarak verilen Lambda ifadelerinin parametrelerine tür yazılmazsa "ambiguity" oluşur.
    Yani hangi metodun çağırlacağına yönelik "en uygun metot (the most applicable method)" bulunamaz
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        RandomGeneratorUtil.display(r, Integer::sum, 10);
//        Console.writeLine("#####################################");
//        RandomGeneratorUtil.display(r, (String s1, String s2) -> s1 + s2, 10);
//    }
//}
//
//class RandomGeneratorUtil {
//    public static void display(Random r, IBinaryOperator<String> bos, int n)
//    {
//        for (int i = 0; i < n; ++i) {
//            var s1 = StringUtil.getRandomTextTR(r, 10);
//            var s2 = StringUtil.getRandomTextTR(r, 10);
//            Console.writeLine("s1 = %s, s2 = %s", s1, s2);
//            Console.writeLine(bos.apply(s1, s2));
//            Console.writeLine("-------------------");
//        }
//    }
//
//    public static void display(Random r, IIntBinaryOperator boi, int n)
//    {
//        for (int i = 0; i < n; ++i) {
//            var a = r.nextInt(100);
//            var b = r.nextInt(100);
//
//            Console.writeLine("a = %d, b = %d", a, b);
//            Console.writeLine(boi.applyAsInt(a, b));
//            Console.writeLine("-------------------");
//        }
//    }
//}
//
//interface IIntBinaryOperator {
//    int applyAsInt(int a, int b);
//}
//
//interface IDoubleBinaryOperator {
//    double applyAsDouble(double a, double b);
//}
//
//interface ILongBinaryOperator {
//    long applyAsLong(long a, long b);
//}
//
//interface IBinaryOperator<T> {
//    T apply(T a, T b);
//}