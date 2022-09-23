package sixthweek;

import util.ArrayUtil;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Generics { }
/*----------------------------------------------------------------------------------------------------------------------
	Generic kavramı derleme zamanında türden bağımsız kod yazabilmek için tasarlanmıştır. Programcı generic bir tür
	ya da metodu türden bağımsız olarak yazar. Generic sınıf ya da metotları kullanan programcı	da hangi türde
	kullanacağına karar vererek aşağıda anlatılan özelliklere göre daha güvenli ve okunabilir kodlar yazabilir.
	Generic'ler kullanılarak derleme zamanında çok biçimli (compile time polymorphism) kodlar yazılabilmektedir.
	Generic Türler: Generic olabilecek türler şunlardır: Sınıflar, arayüzler
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıf bildiriminde generic parametreler denen isimler kullanılır. Bu isimler açısal parantezler arasında
	virgülle ayrılacak şekilde sınıf isminden sonra yazılır. Generic parametreler değişken isimlendirme kurallarına
	uygun isimlerdir. Bu isimler bildirildikleri sınıf boyunca geçerlidir (class scope, sınıf faaliyet alanı). Generic
	parametre ismi bir tür ismi anlamına gelir
----------------------------------------------------------------------------------------------------------------------*/
//class A<T> { // T generic parametre
//    //...
//    private T m_t;
//}
//
//
//abstract  class B<T, K, L> { //T, K ve L generic parametreler
//    //...
//    public abstract T foo(K k, L l);
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıflar açılım (expansion) ile kullanılabilir. Açılım generic parametrenin türünü belirtir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A<String> a; // A nın String açılımı
//        A<Integer> b; // A nın Integer açılımı
//        A<Boolean> c; // A nın Boolean açılımı
//    }
//}
//
//class A<T> { // T generic parametre
//    //...
//    private T m_t;
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıf açılımsız kullanılırsa generic parametreler Object kabul edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A a; // T Object kabul edilir
//
//    }
//}
//
//class A<T> { // T generic parametre
//    //...
//    private T m_t;
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic açılımlar temel türlerle yapılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A<int> a; // error
//
//    }
//}
//
//class A<T> { // T generic parametre
//    //...
//    private T m_t;
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problem sarmalayan sınıflar ile açılım yapılarak çözülebilir. Yani generic parametre olarak temel türlerin
	kullanılacağı generic bir sınıf (ve metot) için sarmalayan sınıflar açılımda kullanılmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A<Integer> x;
//        A<Boolean> y;
//        A<Float> z;
//        //...
//
//
//    }
//}
//
//class A<T> { // T generic parametre
//    //...
//    private T m_t;
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıflar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A<Boolean, String> a;
//        A<Integer, Boolean> b;
//        //...
//    }
//}
//
//class A<T, K> {
//    //...
//
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıflar türünden nesne yaratılması aşağıdaki gibi yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A<Boolean, String> x = new A<Boolean, String>();
//        A<Integer, Float> y = new A<Integer, Float>();
//
//        //...
//    }
//}
//
//class A<T, K> {
//    //...
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Java 7 ile birlikte new operatörü ile açılım yapılırken türler yazılmayabilir. Ancak açısal parantezler olmalıdır
	(diamond syntax). Şüphesiz olmaması bir sentaks ya da semantic bir hata oluşturmaz. Ancak kesinlikle kullanımı
	tavsiye edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A<Boolean, String> x = new A<>(); //Since Java 7 : Diamond syntax
//        A<Integer, Float> y = new A<>();
//
//        //...
//    }
//}
//
//class A<T, K> {
//    //...
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıflar Object için kullanılacaksa Object açılımı yapılması iyi bir tekniktir. Yani generic sınıflar
	açılımsız kullanılmamalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A<Object> x = new A<>();
//
//        //...
//    }
//}
//
//class A<T> {
//    //...
//
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların generic parametrelerinin kullanımı
----------------------------------------------------------------------------------------------------------------------*/
//abstract class A<T, R> {
//    public abstract R get(T t);
//    //...
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıf generic olmayan bir sınıftan türetilebilir. Bu durumda generic sınıfın her açılımı
	o taban sınıftan türetilmiş olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B<Boolean> bb = new B<>();
//        B<String> bs = new B<>();
//
//        A x;
//
//        x = bs;
//        x = bb;
//
//        //...
//    }
//}
//
//
//class B<T> extends A {
//    //
//}
//
//
//class A {
//    //...
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic olmayan bir sınıf generic bir sınıfın herhangi bir açılımından türetilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B();
//        A<String> a;
//
//        a = b;
//
//        b.foo("ankara");
//        a.foo("istanbul");
//        a.foo(10); //error
//        A<Integer> ai = b; //error
//
//        //...
//    }
//}
//
//class B extends A<String> {
//    //
//}
//
//class A<T> {
//    public void foo(T t)
//    {
//        System.out.println(t);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic olmayan bir sınıf generic bir sınıfın herhangi bir açılımından türetilebilir. Aşağıdaki örnekte
	foo metodu override edilmiş ve taban sınıfın foo metodu da çağrılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B();
//        A<String> a = b;
//
//        a.foo("istanbul");
//
//        //...
//    }
//}
//
//class A<T> {
//    public void foo(T t)
//    {
//        System.out.println(t);
//    }
//}
//class B extends A<String> {
//    public void foo(String str) //override
//    {
//        super.foo(str);
//        System.out.println(str.toUpperCase());
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte derleme zamanında tür kontrolü dolayısıyla error oluşur (type safety)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B();
//        A<String> a = b;
//
//        a.foo("ankara");
//        a.foo(3.4); //error
//
//        //...
//    }
//}
//
//class A<T> {
//    public void foo(T t)
//    {
//        System.out.println(t);
//    }
//}
//
//class B extends A<String> {
//    public void foo(String str)
//    {
//        super.foo(str);
//        System.out.println(str.toUpperCase());
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte generic A sınıfı açılımsız kullanıldığından derleme zamanı tür kontrolü yapılamaz.
	Örneğimiz için foo metoduna double türü geçirildiğinde exception oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B();
//        A a = b;
//
//        a.foo(3.4);
//
//        //...
//    }
//}
//
//class A<T> {
//    public void foo(T t)
//    {
//        System.out.println(t);
//    }
//}
//class B extends A<String> {
//    public void foo(String str)
//    {
//        super.foo(str);
//        System.out.println(str.toUpperCase());
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıf başka bir generic sınıfın bir açılımından türetilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B<String> b = new B<>();
//        A<Integer> a;
//
//        a = b;
//
//        a.foo(10);
//        b.bar("ankara");
//
//        B<Boolean> bb = new B<>();
//
//        a = bb;
//
//        bb.foo(23);
//        bb.bar(true);
//    }
//}
//
//class A<T> {
//    public void foo(T t)
//    {
//        System.out.println(t);
//    }
//}
//
//class B<T> extends A<Integer> {
//    public void bar(T t)
//    {
//        System.out.println(t);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıf başka bir generic sınıftan türetilebilir. Bu durumda türemiş sınıfın her açılımı
	taban sınıfın o açılımından türetilmiş olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B<Integer> b = new B<>();
//        A<Integer> a;
//
//        a = b;
//
//        b.foo(10);
//        b.bar(1);
//
//        B<String> b1 = new B<>();
//        A<String> a1;
//
//        a1 = b1;
//        a1.foo("ankara");
//        b1.bar("istanbul");
//    }
//}
//
//class A<T> {
//    public void foo(T t)
//    {
//        System.out.println(t);
//    }
//}
//
//class B<T> extends A<T> {
//    public void bar(T t)
//    {
//        System.out.println(t);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte K generic parametresi taban sınıf için kullanılmaktadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B<Integer, String> x = new B<>();
//        A<String> y;
//
//        y = x;
//        x.bar(10, "zonguldak");
//        x.foo("ankara");
//        y.foo("izmir");
//
//        //...
//    }
//}
//
//class A<T> {
//    public void foo(T t)
//    {
//        System.out.println(t);
//    }
//}
//
//class B<T, K> extends A<K> {
//    public void bar(T t, K k)
//    {
//        System.out.println(t);
//        System.out.println(k);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte x' in türünden dolayı A<Boolean> açılımına atanamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B<Integer, String> x = new B<>();
//        A<Boolean> y = x; //error
//
//        //...
//    }
//}
//
//class A<T> {
//    public void foo(T t)
//    {
//        System.out.println(t);
//    }
//}
//
//class B<T, K> extends A<K> {
//    public void bar(T t)
//    {
//        System.out.println(t);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	ArrayList sınıfının kullanımı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("ali");
//        names.add("veli");
//        names.add("selami");
//
//        for (String name : names)
//            System.out.println(name.toUpperCase());
//
//        System.out.println("***************");
//
//        for (int i = 0; i < names.size(); ++i) {
//            String str = names.get(i);
//
//            System.out.println(str.toUpperCase());
//        }
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	ArrayList sınıfının kullanımı. Aşağıdaki örnekte foreach döngü deyiminde döngü değişkenine atama yapılmadan önce
	int türüne otomatik kutu açılır. Benzer şekilde add metodu çağrılarında da kutulma yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; ++i)
//            list.add(i * 10); //auto-boxing
//
//        for (int val : list) //auto-unboxing
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte döngü değişkenine atama yapılmadan önce int türüne kutu açıldığı için error ya da exception
	durumu oluşmaz. Yani aslında for-each deyimindeki atama int türünden double türüne doğrudan yapılan atamadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; ++i)
//            list.add(i * 10); //auto-boxing
//
//        for (double val : list) //auto-unboxing
//            System.out.printf("%f%n", val);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki anlatılana göre aşağıdaki for-each döngü deyiminde int türünde short türüne doğrudan atama geçersiz
	olduğundan error oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; ++i)
//            list.add(i * 10); //auto-boxing
//
//        for (short val : list) //auto-unboxing
//            System.out.printf("%f ", val);
//
//        System.out.println();
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Çalışma zamanı sırasında generic bir sınıfın her açılımı aynı türdendir. Yani sınıf generic bile olsa o sınıfa
	ilişkin tek bir tür bulunmaktadır. Arakod içerisinde sadece A sınıfı bulunur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A<String> as = new A<>();
//        A<Integer> ai = new A<>();
//        A<Boolean> ab = new A<>();
//
//        System.out.println(as.getClass().getName());
//        System.out.println(ab.getClass().getName());
//        System.out.println(ai.getClass().getName());
//    }
//}
//
//class A<T> {
//    //...
//}





































/*----------------------------------------------------------------------------------------------------------------------
	ArrayList sınıfının kullanımı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<ArrayList<String>> names = new ArrayList<>();
//        ArrayList<String> nameList = new ArrayList<>();
//
//        nameList.add("Ali");
//        nameList.add("Veli");
//
//        names.add(nameList);
//
//        nameList = new ArrayList<>();
//
//        nameList.add("Ayşe");
//        nameList.add("Fatma");
//        nameList.add("Zeynep");
//
//        names.add(nameList);
//        for (ArrayList<String> nl : names) {
//            for (String name : nl)
//                System.out.printf("%s ", name);
//            System.out.println();
//        }
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
	Generic açılımlarda dizi türü de kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<int[]> list = new ArrayList<>();
//
//        list.add(new int[] {1, 2, 3, 4});
//        list.add(ArrayUtil.getRandomArray(10, 10, 20));
//
//
//        for (int [] a : list) {
//            for (int val : a)
//                System.out.printf("%d ", val);
//
//            System.out.println();
//        }
//
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir arayüzün herhangi bir açılımını implemente eden bir sınıf içerisinde arayüzün metotları açılıma
    uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//
//        s.foo("ankara");
//    }
//}
//
//class Sample implements IX<String> {
//    public void foo(String str)
//    {
//        System.out.println(str.toUpperCase());
//    }
//}
//
//interface IX<T> {
//    void foo(T t);
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir arayüzün herhangi bir açılımını implemente eden bir sınıf içerisinde arayüzün metotları açılıma
    uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        StringToLengthConverter stringToLengthConverter = new StringToLengthConverter();
//        ArrayList<String> cities = new ArrayList<>();
//
//        cities.add("ankara");
//        cities.add("istanbul");
//        cities.add("izmir");
//        cities.add("zonguldak");
//
//        for (String city : cities)
//            System.out.printf("%d ", stringToLengthConverter.convert(city));
//
//        System.out.println();
//    }
//}
//
//
//
//class StringToLengthConverter implements IConverter<String, Integer> {
//    //...
//    public Integer convert(String str)
//    {
//        return str.length();
//    }
//}
//
//interface IConverter<T, R> {
//    R convert(T t);
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Generic arayüzlerin bir kullanımı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Ön yazıyı giriniz:");
//        String prefix = kb.nextLine();
//
//        Random r = new Random();
//        NumToTextConverter numToTextConverter = new NumToTextConverter(prefix);
//
//        while (true) {
//            int val = r.nextInt(1000 + 999) - 999;
//
//            System.out.printf("%d %s%n", val, numToTextConverter.convert(val));
//            if (val == 0)
//                break;
//
//        }
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//
//class NumToTextConverter implements IConverter<Integer, String> {
//    private final String m_prefix;
//
//    public NumToTextConverter(String prefix)
//    {
//        m_prefix = prefix;
//    }
//
//    public String convert(Integer str)
//    {
//        return String.format("%s:%s", m_prefix, NumberUtil.numberToTextTR(str));
//    }
//}
//
//interface IConverter<T, R> {
//    R convert(T t);
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir arayüzü implemente eden bir sınıf içerisinde arayüzün metotları açılıma uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//
//        s.foo("ankara");
//        s.bar(20);
//    }
//}
//
//class Sample implements IX<String>, IY<Integer> {
//    public void foo(String str)
//    {
//        System.out.println(str.toUpperCase());
//    }
//
//    public void bar(Integer i)
//    {
//        System.out.println(i * i);
//    }
//}
//
//interface IX<T> {
//    void foo(T t);
//}
//
//interface IY<T> {
//    void bar(T t);
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir arayüzü implemente eden bir sınıf içerisinde arayüzün metotları açılıma uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample<Boolean> sb = new Sample<>();
//        Sample<Double> sd = new Sample<>();
//
//        sb.foo(true);
//        sb.bar(false);
//
//        sd.foo(3.4);
//        sd.bar(4.5);
//    }
//}
//
//class Sample<T> implements IX<T>, IY<T> {
//    public void foo(T t)
//    {
//        System.out.println("foo:");
//        System.out.println(t);
//    }
//
//    public void bar(T t)
//    {
//        System.out.println("bar:");
//        System.out.println(t);
//    }
//}
//
//interface IX<T> {
//    void foo(T t);
//}
//
//interface IY<T> {
//    void bar(T t);
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir arayüzü implemente eden bir sınıf içerisinde arayüzün metotları açılıma uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample<String, Boolean> ssb = new Sample<>();
//        Sample<Integer, String> sis = new Sample<>();
//
//        ssb.foo(true);
//        ssb.bar("ankara");
//
//        sis.foo("zonguldak");
//        sis.bar(10);
//    }
//}
//
//class Sample<T, K> implements IX<K>, IY<T> {
//    public void foo(K k)
//    {
//        System.out.println("foo:");
//        System.out.println(k);
//    }
//
//    public void bar(T t)
//    {
//        System.out.println("bar:");
//        System.out.println(t);
//    }
//}
//
//interface IX<T> {
//    void foo(T t);
//}
//
//interface IY<T> {
//    void bar(T t);
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir abstract sınıftan türetilen bir sınıf içerisinde taban sınıfın sanal metotları açılıma uygun şekilde
	override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/

//class MyTask extends AsyncTask<String, String, Integer> {
//    public Integer doInBackground(String [] params)
//    {
//        return null;
//    }
//
//    public void onProgressExecute(String [] progresses)
//    {
//        //...
//    }
//
//    public void onPostExecute(Integer result)
//    {
//        //...
//    }
//}
//
//abstract class AsyncTask<Params, Progress, Result> {
//    protected abstract Result doInBackground(Params [] params);
//    public void onProgressExecute(Progress [] progresses)
//    {
//        //...
//    }
//
//    public void onPostExecute(Result result)
//    {
//        //...
//    }
//
//    //...
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf generic bir arayüzün birden fazla açılımını destekleyemez. Çünkü arakodda tüm açılan generic parametrelerin
	türler Object olarak ele alınır
----------------------------------------------------------------------------------------------------------------------*/
//class Sample implements IX<Integer>, IX<String> { //error
//    public void foo(String t)
//    {
//
//    }
//
//    public void foo(Integer t)
//    {
//
//    }
//}
//
//interface IX<T> {
//    void foo(T t);
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnek geçersizdir
----------------------------------------------------------------------------------------------------------------------*/

//class Sample<T> implements IX<Integer>, IY<String> { //error
//    public void foo(String t)
//    {
//
//    }
//
//    public void foo(Integer t)
//    {
//
//    }
//}
//
//interface IX<T> {
//    void foo(T t);
//}
//
//interface IY<T> {
//    void foo(T t);
//}







































/*----------------------------------------------------------------------------------------------------------------------
	Generic parametrelere kısıt (constraint) verilebilir. Bu işlem için extends anahtar sözcüğü kullanılır. Aşağıdaki
	örnekte Mample sınıfı IX arayüzünü destekleyen bir tür ile açılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Mample<Sample> m;
//        Mample<Integer> m1; //error
//        //...
//    }
//}
//
//class Mample<T extends IX> {
//    public void bar(T t)
//    {
//        t.foo();
//    }
//}
//
//class Sample implements IX {
//    public void foo()
//    {
//        System.out.println("Sample.foo");
//    }
//}
//
//interface IX {
//    void foo();
//}






































/*----------------------------------------------------------------------------------------------------------------------
	int türden bir dizi referansı Integer türden bir dizi referansına atanamaz. Aslında sarmalayan sınıf türünden
	dizi ile sarmaladığı sınıf türünden dizi referansları arasında dönüşüm geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Sample<Integer> s = new Sample<>();
//        int [] a = {1, 2, 4};
//
//        s.display(a); //error
//    }
//}
//
//class Sample<T> {
//    //...
//    public void display(T [] a)
//    {
//        for (T t : a)
//            System.out.println(t);
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte String türden dizi ile dispaly çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample<String> s = new Sample<>();
//        String [] cities = {"ankara", "istanbul", "izmir"};
//
//        s.display(cities);
//    }
//}
//
//class Sample<T> {
//    //...
//    public void display(T [] a)
//    {
//        for (T t : a)
//            System.out.println(t);
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
	Generic parametreler temel türler olarak belirlenemeyeceğinden aşağıdaki örnekte int, double ve long türden
	diziler için ayrı sınıflar yazılmıştır. Bu aynı zamanda kutulama işleminin de yapılmamasını sağlar. Çünkü sadece
	generic olan yazılsaydı display metodunu çağıran programcı int türden diziyi Integer türden bir dizi olarak
	oluşturup çağırması gerekirdi. Bu da otomatik kutulama anlamına gelecektir. Üstelik bu kopyalamanın O(n)
	karmaşıklıkta olacağına dikkat ediniz. Bu yaklaşım çok yerde kullanılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample<String> sample = new Sample<>();
//        IntSample intSample = new IntSample();
//        LongSample longSample = new LongSample();
//        DoubleSample doubleSample = new DoubleSample();
//
//        String [] names = {"ali", "veli", "selami"};
//        int [] a = {1, 2, 3, 4};
//        long [] b = {1L, 3L, 6L};
//        double [] c = {1.4, 2.89, -3.78};
//
//        sample.display(names);
//        intSample.display(a);
//        longSample.display(b);
//        doubleSample.display(c);
//    }
//}
//
//class IntSample {
//    //...
//    public void display(int [] a)
//    {
//        for (int val : a)
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//}
//
//class LongSample {
//    //...
//    public void display(long [] a)
//    {
//        for (long val : a)
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//}
//
//class DoubleSample {
//    //....
//    public void display(double [] a)
//    {
//        for (double val : a)
//            System.out.printf("%f ", val);
//
//        System.out.println();
//    }
//}
//
//class Sample<T> {
//    public void display(T [] a)
//    {
//        for (T t : a)
//            System.out.println(t);
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Generic parametreler temel türler olarak belirlenemeyeceğinden aşağıdaki örnekte int, double ve long türden
	diziler için ayrı metotlar yazılmıştır. Bu yaklaşım örnek bazında yukarıdaki yaklaşımdan okunabililik açısından
	daha kötüdür. Bunu genellememek gerekir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample<String> sample = new Sample<>();
//        String [] names = {"ali", "veli", "selami"};
//        int [] a = {1, 2, 3, 4};
//        long [] b = {1L, 3L, 6L};
//        double [] c = {1.4, 2.89, -3.78};
//
//        sample.display(names);
//        sample.display(a);
//        sample.display(b);
//        sample.display(c);
//    }
//}
//
//class Sample<T> {
//    public void display(long [] a)
//    {
//        for (long val : a)
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//
//    public void display(int [] a)
//    {
//        for (int val : a)
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//
//    public void display(double [] a)
//    {
//        for (double val : a)
//            System.out.printf("%f ", val);
//
//        System.out.println();
//    }
//
//    public void display(T [] a)
//    {
//        for (T t : a)
//            System.out.println(t);
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıfın türemiş sınıf açılımı aynı generic sınıfın taban sınıf açılımına doğrudan atanamaz (invariant)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; ++i)
//            list.add(i * 10);
//
//        Sample.display(list); //error
//    }
//}
//
//class Sample {
//    public static void display(ArrayList<Number> list)
//    {
//        for (Number n : list)
//            System.out.println(n);
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıfın türemiş sınıf açılımı aynı generic sınıfın taban sınıf açılımına tür dönüştürme operatörü ile de
	dönüştürülemez (invariant)
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; ++i)
//            list.add(i * 10);
//
//        Sample.display((ArrayList<Number>)list); //error
//    }
//}
//
//class Sample {
//    public static void display(ArrayList<Number> list)
//    {
//        for (Number n : list)
//            System.out.println(n);
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki durum ? extends ile aşağıdaki gibi çözülebilir (covariant)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<Integer> integers = new ArrayList<>();
//
//        for (int i = 0; i < 10; ++i)
//            integers.add(i * 10);
//
//        Sample.display(integers);
//
//        System.out.println("/////////////////");
//        ArrayList<Double> doubles = new ArrayList<>();
//
//        for (double i = 0; i < 1.23; i += 0.1)
//            doubles.add(i);
//
//        Sample.display(doubles);
//    }
//}
//
//class Sample {
//    public static void display(ArrayList<? extends Number> list)
//    {
//        for (Number n : list)
//            System.out.println(n);
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki foo çağrısı geçersizdir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<Number> list = new ArrayList<>();
//
//        Sample.foo(list);
//
//        ArrayList<Object> listObjects = new ArrayList<>();
//
//        Sample.foo(listObjects); //error
//    }
//}
//
//class Sample {
//    public static void foo(ArrayList<Integer> list)
//    {
//        //...
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki foo çağrısı geçersizdir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<Number> list = new ArrayList<>();
//
//        Sample.foo(list);
//
//        ArrayList<Object> listObjects = new ArrayList<>();
//
//        Sample.foo((ArrayList<Integer>)listObjects); //error
//    }
//}
//
//class Sample {
//    public static void foo(ArrayList<Integer> list)
//    {
//        //...
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıda generic açılım contravariant duruma getirilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayList<Number> list = new ArrayList<>();
//
//        Sample.foo(list);
//
//        ArrayList<Object> listObjects = new ArrayList<>();
//
//        Sample.foo(listObjects);
//    }
//}
//
//class Sample {
//    public static void foo(ArrayList<? super Integer> list)
//    {
//        //...
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ? işereti açılımı kullanılmıştır. Bu herhangi bir tür demektir. Ancak Object gibi düşünülmemelidir.
	Bu durumun kullanımı uygulama kursunda ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A<?> a;
//
//        a = new A<>();
//
//        a.foo("ankara"); //error
//        a.bar();
//    }
//}
//
//class A<T> {
//    public void bar()
//    {
//
//    }
//
//    public void foo(T t)
//    {
//        System.out.println(t);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	enum türleri ve exception sınıfları generic olarak bildirilemez
----------------------------------------------------------------------------------------------------------------------*/

//enum A<T> { //error
//    //...
//}
//
//class MyException<T> extends RuntimeException { //error
//    //...
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Generic metotlar:
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Generic metotlar ve çağrılması. Generic metotların çağrısında generic poarametrenin türü geçilen argümana göre
	tespit edilebiliyorsa (type deduction) çağrı açılım yapmadan da yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//
//        s.<String>foo("ankara");
//        s.foo("ankara");
//        s.foo(10);
//        s.foo(true);
//    }
//}
//
//class Sample {
//    public <T> void foo(T t)
//    {
//        System.out.println(t);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
   Aşağıdaki iki çağırmada da String parametreli foo çağrılır.
   Dikkat: Tür belirtilse bile String paramatreli metot çağrılır.
   Bu işlem generic bir işin türe özgü olarak farklılaşması gibi durumlarda kullanılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo("ankara");
//        Sample.<String>foo("ankara");
//        Sample.foo(10);
//        Sample.foo(3.4);
//    }
//}
//
//class Sample {
//    public static void foo(String s)
//    {
//        System.out.println("foo(String)");
//    }
//
//    public static void foo(int val)
//    {
//        System.out.println("foo(int)");
//    }
//
//    public static <T> void foo(T t)
//    {
//        System.out.println("foo(T)");
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların static metotlarında sınıfların generic parametreleri kullanılamaz.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo("ankara");
//        Sample.foo(2.3);
//
//    }
//}
//
//class Sample<T> {
//    public void bar(T t)
//    {
//        System.out.println(t);
//    }
//
//    public static void foo(T t) //error
//    {
//        System.out.println(t);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların static metotlarında sınıfların generic parametreleri kullanılamaz. Bu durumda static
	metotların da generic yapılması gerekir.

	Anahtar Notlar: Generic sınıfların static metotları çağrılırken sadece sınıf ismi
	kullanılabilir. Açılım yapılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo("ankara");
//        Sample.foo(2.3);
//
//        Sample<String> ss = new Sample<>();
//        Sample<Float> sf = new Sample<>();
//
//        ss.bar("ankara");
//        sf.bar(3.4F);
//    }
//}
//
//class Sample<T> {
//    public void bar(T t)
//    {
//        System.out.println(t);
//    }
//
//    public static <K> void foo(K k)
//    {
//        System.out.println(k);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların static metotlarında sınıfların generic parametreleri kullanılamaz. Bu durumda static
	metotların da generic yapılması gerekir. Aşağıdaki örnekte static metodun generic pametresi ile sınıfın generic
	parametresi aynı isimdedir. Bu bir sorun oluşturmaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo("ankara");
//        Sample.foo(2.3);
//
//        Sample<String> s = new Sample<>();
//
//        s.bar("ankara");
//    }
//}
//
//class Sample<T> {
//    public void bar(T t)
//    {
//        System.out.println(t);
//    }
//
//    public static <T> void foo(T t)
//    {
//        System.out.println(t);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların static metotlarında sınıfların generic parametreleri kullanılamaz. Bu durumda static ,
	metotların da generic yapılması gerekir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo("ankara", true);
//        Sample.foo(2.3, 's');
//    }
//}
//
//class Sample<T, K> {
//    //...
//    public void bar(T t, K k)
//    {
//        //...
//    }
//
//    public static <T, K> void foo(T t, K k)
//    {
//        System.out.println(t);
//        System.out.println(k);
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte generic bir sınıfın içerisinde non-static bir metot generic yapılmıştır (member generic)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample<Integer, Float> s;
//
//        s = new Sample<>();
//
//        System.out.printf("Result:%s%n", s.foo(10, 3.4F, "ankara", true));
//        System.out.printf("Result:%c%n", s.foo(10, 3.4F, 'z', 9L));
//    }
//}
//
//class Sample<T, K> {
//    //...
//    public <L, M> L foo(T t, K k, L l, M m)
//    {
//        System.out.println(t);
//        System.out.println(k);
//        System.out.println(l);
//        System.out.println(m);
//
//        return l;
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte generic bar metodunun T ve K parametreli isim olarak sınıfın T ve K parametre isimleriniz gizler
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample<Integer, Float> s;
//
//        s = new Sample<>();
//        s.foo(10, 3.4F);
//        s.bar("ankara", true);
//    }
//}
//
//class Sample<T, K> {
//    //...
//    public void foo(T t, K k)
//    {
//        System.out.println("foo");
//        System.out.println(t);
//        System.out.println(k);
//    }
//
//    public <T, K> void bar(T t, K k)
//    {
//        System.out.println("bar");
//        System.out.println(t);
//        System.out.println(k);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte doInBakground metodunun geri dönüş değerinin olmaması durumu için yazılan MyVoid isimli bir sınıf
	açılımda kullanılmıştır
----------------------------------------------------------------------------------------------------------------------*/
//final class MyVoid {
//    private MyVoid()
//    {}
//}
//
//class MyTask extends AsyncTask<String, String, MyVoid> {
//    public MyVoid doInBackground(String [] params)
//    {
//        return null;
//    }
//
//    public void onProgressExecute(String [] progresses)
//    {
//        //...
//    }
//
//    public void onPostExecute(MyVoid myVoid)
//    {
//        //...
//    }
//}
//
//abstract class AsyncTask<Params, Progress, Result> {
//    protected abstract Result doInBackground(Params [] params);
//    public void onProgressExecute(Progress [] progresses)
//    {
//        //...
//    }
//
//    public void onPostExecute(Result result)
//    {
//        //...
//    }
//
//    //...
//}







































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnekteki gibi durumlar için java.lang paketi içerisinde Void isimli bir sınıf vardır
----------------------------------------------------------------------------------------------------------------------*/

//class YourTask extends AsyncTask<Void, String, Void> {
//    public Void doInBackground(Void [] params)
//    {
//        return null;
//    }
//
//    public void onProgressExecute(String [] progresses)
//    {
//        //...
//    }
//
//    public void onPostExecute(Void result)
//    {
//        //...
//    }
//}
//
//class MyTask extends AsyncTask<String, String, Void> {
//    public Void doInBackground(String [] params)
//    {
//        return null;
//    }
//
//    public void onProgressExecute(String [] progresses)
//    {
//        //...
//    }
//
//    public void onPostExecute(Void result)
//    {
//        //...
//    }
//}
//
//abstract class AsyncTask<Params, Progress, Result> {
//    protected abstract Result doInBackground(Params [] params);
//    public void onProgressExecute(Progress [] progresses)
//    {
//        //...
//    }
//
//    public void onPostExecute(Result result)
//    {
//        //...
//    }
//
//    //...
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte IRunnable parametreli submit metodundan elde edilen IFuture referansı ile get metodu çağrılır
	geri dönüş değeri (yani IFuture'ın açılımına ilişkin tür) kullanılamaz ya da anlamsızdır. Bu durumda IFuture
	? (wildcard) ile açılır. Örnek tamamen konuyu anlatmak içindir. Detaylar önemsizdir. Çalışıtırıldığında tamamı
	yazılmadığı için exception oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ExecutorService executorService = Executors.createExecutorService();
//
//        IFuture<?> runnableFuture = executorService.submit(new MyRunnabble());
//
//        runnableFuture.get();
//
//        IFuture<String> callableFuture = executorService.submit(new MyCallable());
//
//        System.out.printf("Result:%s%n", callableFuture.get());
//    }
//}
//
//class MyCallable implements ICallable<String> {
//    public String call()
//    {
//        String s = "ankara";
//
//        //...
//        return s;
//    }
//}
//
//class MyRunnabble implements IRunnable {
//    //...
//    public void run()
//    {
//        //...
//    }
//}
//
//class Executors {
//    public static ExecutorService createExecutorService()
//    {
//        //....
//        return new ExecutorService();
//    }
//}
//
//class ExecutorService {
//    public IFuture<?> submit(IRunnable runnable)
//    {
//        //...
//        return null; // Öylesine yazıldı. Şüphesiz bir IFuture arayüzünü implemente eden nesnenin referansına geri döner
//    }
//
//    public <T> IFuture<T> submit(ICallable<T> callable)
//    {
//        //...
//        return null; // Öylesine yazıldı. Şüphesiz bir IFuture arayüzünü implemente eden nesnenin referansına geri döner
//    }
//}
//
//interface ICallable<T> {
//    T call();
//}
//
//interface IRunnable {
//    void run();
//}
//
//
//interface IFuture<T> {
//    T get();
//}







































/*----------------------------------------------------------------------------------------------------------------------
	Java'da generic kavrama genel olarak arakoda yansıtılmadığı için aynı paket içerisinde aynı isimde fakat
	farklı sayıda generic parametreye sahip türler bildirilemez
----------------------------------------------------------------------------------------------------------------------*/

//public class Tuple<T> { //error
//    //
//}
//
//class Tuple<T1, T2> { //error
//
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Generic parametre türü new operatörü ile kullanılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class Sample<T> {
//    private T m_t;
//
//    public Sample(int n)
//    {
//        m_t = new T(); //error
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki kuraldan dolayı generic türden dizi de new operatörü ile doğrudan yaratılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class Sample<T> {
//    private T [] m_t;
//
//    public Sample(int n)
//    {
//        m_t = new T[n]; //error
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problem aşağıdaki gibi yapılarak çözülebilir. Aşağıdaki kodda uyarının problem oluturduğu bir durum
	gerçekleşemez. Çünkü Object dizisinin referansı dışarıya Object [] türünden verilmemiştir
----------------------------------------------------------------------------------------------------------------------*/

//class Sample<T> {
//    private T [] m_t;
//    private int m_index;
//
//    public Sample(int n)
//    {
//        m_t = (T []) new Object[n]; //Uyarı önemsiz. Şimdilik görmeyin
//    }
//
//    public boolean add(T value)
//    {
//        if (m_index == m_t.length)
//            return false;
//        m_t[m_index++] = value;
//
//        return true;
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte de Object yaratılmış ve T türüne dönüştürülmüştür
----------------------------------------------------------------------------------------------------------------------*/

//class Sample<T> {
//    private T m_t;
//
//    public Sample(int n)
//    {
//        m_t = (T) new Object(); //Uyarı önemsiz
//    }
//    //...
//}