package fifthweek;

import util.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class NullRef { }

/*----------------------------------------------------------------------------------------------------------------------
    Java'da kullanılmayan bir bytle'lık gözeneğin adresini temsil eden (null address) null isimli bir anahtar
    sözcük bulunur. null bir referansa atanabilir. Bir referansa null atandığında o referansın içerisnde bir adres
    vardır. Ancak bu adres kullanılmadığı için bir nesnenin adresi değildir.

    Anahtar Notlar: Modern sistemlerde null adres olarak sıfır numaralı gözeneğin adresi alınır. Yani bu sistemlerde
    sıfır numaralı adres herhangi bir bölge olarak kullanılmaz. Java programcısı için kullanılmayan adresin hangisi
    olduğu önemsizdir. null sabitinin varlık sebebi zaten bu adresi temsil etmektir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        String s = null;
//        Sample sample = null;
//        Random r = null;
//        int val = null; //error
//    }
//}
//
//class Sample {
//    //..
//}












/*----------------------------------------------------------------------------------------------------------------------
    Bir referansın default değeri null'dır. Hatırlanacağı gibi Singleton kalıbının bir implementasyonunda null'ın
    default değer olup olmamasına göre kod yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        Singleton s = Singleton.getInstance();
//        Singleton k = Singleton.getInstance();
//
//        System.out.println(s == k);
//    }
//}
//
//class Singleton {
//    //...
//    private static Singleton ms_instance;
//
//    private Singleton()
//    {}
//
//    public static Singleton getInstance()
//    {
//        if (ms_instance == null)
//            ms_instance = new Singleton();
//
//        return ms_instance;
//    }
//}




















/*----------------------------------------------------------------------------------------------------------------------
    Bir referansın null olması durumunda o referansın ilişkin olduğu türün elemanlarına erişim durumunda
    exception oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample s = null;
//
//        s.foo();
//    }
//}
//
//class Sample {
//    public void foo()
//    {
//
//    }
//}
















/*----------------------------------------------------------------------------------------------------------------------
    null referans bir referansı nesneden kopartmak için de kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample s = new Sample();
//
//        //...
//
//        Sample k = s;
//
//
//        s = null;
//        //...
//    }
//}
//
//class Sample {
//    public void foo()
//    {
//
//    }
//}




















/*----------------------------------------------------------------------------------------------------------------------
    Bir referansa null atanması o referansın gösterdiği nesnenin garbage collected olacağı anlamına gelmez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample s = new Sample();
//
//        //...
//
//        Sample k = s;
//
//
//        s = null;
//
//        k.foo(10);
//
//        System.out.printf("val:%d%n", k.val);
//    }
//}
//
//class Sample {
//    public int val;
//
//    public void foo(int val)
//    {
//        this.val = val;
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
    null referans bir metodun geri dönüş değerinin referans olması durumunda kontrol amaçlı kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//
//        for (int i = 0; i < 30; ++i) {
//            int n = r.nextInt(30);
//            int[] a = ArrayUtil.getRandomArray(r, n, 1, 100);
//
//            ArrayUtil.display(2, a);
//            Integer result = Utility.max(a);
//
//            if (result != null)
//                System.out.printf("En büyük eleman:%d%n", result);
//            else
//                System.out.println("Boş dizi geçildi");
//            System.out.println("//////////////////////////");
//
//        }
//    }
//}
//
//class Utility {
//    public static Integer max(int [] a)
//    {
//        if (a.length == 0)
//            return null;
//
//        int result = a[0];
//
//        for (int i = 1; i < a.length; ++i)
//            if (result < a[i])
//                result  = a[i];
//
//        return result;
//    }
//}


















/*----------------------------------------------------------------------------------------------------------------------
    Bir metodun referans parametresi için null kontrolü yapılabilir. Bazı durumlarda metodun referans parametresine
    null geçilmesi metodun ilgili referansa ilişkin nesneyi kendisi yaratacağı anlamına geleblir. Aşağıdaki
    örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Scanner kb = new Scanner(System.in);
//
//        for (int i = 0; i < 5; ++i) {
//            System.out.print("min değerini giriniz:");
//            int min = Integer.parseInt(kb.nextLine());
//
//            System.out.print("max değerini giriniz:");
//            int max = Integer.parseInt(kb.nextLine());
//
//            System.out.print("Dizinin eleman sayısını giriniz:");
//            int n = Integer.parseInt(kb.nextLine());
//
//            int[] a = Utility.getRandomArray(null, n, min, max);
//
//            if (a == null) {
//                System.out.println("min ve max değerleri geçersiz değerlerdir");
//                continue;
//            }
//
//            ArrayUtil.display(2, a);
//
//            System.out.println("//////////////////////////");
//        }
//    }
//}
//
//class Utility {
//    public static int [] getRandomArray(Random r, int n, int min, int max)
//    {
//        if (n <= 0 || min >= max)
//            return null;
//
//        if (r == null)
//            r = new Random();
//
//        int [] a = new int[n];
//
//        for (int i = 0; i < n; ++i)
//            a[i] = r.nextInt(max - min) + min;
//
//        return a;
//    }
//}




















/*----------------------------------------------------------------------------------------------------------------------
    null referans aşağıdaki örnekte olduğu gibi derleyicinin "değer atanmamış bir değişkeni kullanıyor olabilirsin"
    error'unu vermemesi için kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int a = Integer.parseInt(kb.nextLine());
//
//        if (a < 1 || a > 3) {
//            System.out.println("Geçersiz değer");
//            System.exit(-1);
//        }
//
//        Unit unit = null;
//
//        switch (a) {
//            case 1:
//                unit = new Unit(23);
//                break;
//            case 2:
//                unit = new Unit(78);
//                break;
//            case 3:
//                unit = new Unit(90);
//                break;
//        }
//
//        System.out.println(unit.getVal());
//    }
//}
//
//class Unit {
//    private final int m_val;
//
//    public Unit(int val)
//    {
//        m_val = val;
//    }
//
//    public int getVal()
//    {
//        return m_val;
//    }
//}
