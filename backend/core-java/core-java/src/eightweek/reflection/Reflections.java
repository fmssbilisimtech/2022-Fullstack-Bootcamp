package eightweek.reflection;

import util.ArrayUtil;
import util.Console;
import util.StringUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Time;
import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;

public class Reflections { }
/*----------------------------------------------------------------------------------------------------------------------
    Reflection:
    Java derleyicisi arakoda metadata bilgilerini yazar. Örneğin bir sınıf için elemanları, elemanların erişim belirleyicileri,
    isimleri gibi blgiler arakoda yazılır. İşte "reflection" bu bilgilerin çalışma zamnında elde edilip metadata'lar
    ile işlem yapma faaliyetidir. Reflection işlemlerine ilişkin en temel sınıf (hatta işin başladığı sınıf) Class
    isimli sınıftır. Class sınıfı java.lang paketi içerisinde generic olarak bildirilmiş bir sınıftır.

    Java'da çalışma zamanı sırasında her tür için (temel türler de dahil) bir Class nesnesi yaratılır. Şüphesiz
    bu nesneler optime edilmiş bir biçimde yaratılır. Yani gereken kadar nesne yaratılır biçiminde düşünülebilir. Hatta
    bazı durumlarda sadece gerektiğinde yaratılır.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Bir türe ilişkin yaratılmış olan Class nesnesinin referansı 3(üç) şekilde elde edilebilir:
    1. Tür ismi ve nokta operatörü ile birlikte class anahtar sözcüğünün kullanımı (class expression)
    2. Class sınıfının forName isimli static metodunun çağrılması
    3. Object sınıfının getClass isimli metodunun çağrılması

    Şüphesiz her durumda bunlar birbirlerine alternatif değildir.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    1. class expression
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Class<Sample> clsSample = Sample.class;
//        Class<Mample> clsMample = Mample.class;
//        Class<String> clsString = String.class;
//        Class<Integer> clsInteger = Integer.class;
//        Class<Integer> clsInt = int.class;
//        Class<?> clsDouble = double.class;
//        Class<int []> clsIntArray = int[].class;
//
//        //...
//    }
//}
//
//class Sample {
//    //...
//}
//
//class Mample {
//    //...
//}



















/*----------------------------------------------------------------------------------------------------------------------
    Bir türe ilişkin yaratılan Class nesnesi bir tanedir. Yani her tür için çalışma zamanı sırasında bir tane Class
    nesnesi yaratılır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String[] args)
//    {
//        Class<String> clsString1 = String.class;
//        Class<String> clsString2 = String.class;
//
//        System.out.println(clsString1 == clsString2);
//        //...
//    }
//}



















/*----------------------------------------------------------------------------------------------------------------------
    2. Class sınıfının forName isimli metodu ile türün paket ismiyle beraber (fully qualified) yazılması durumunda
    referansı elde edilebilir. Türe ilişkin byte code uygun yerinde değilse ClassNotFounException nesnesi fırlatılır.
    Örnek için 002-SimplePluginApplication projesini inceleyiniz. Projede jar dosyası üretilmesi durumunda plugin
    işlemi daha sonra ele alıncaktır. Örneği jar dosyası üretmeden çalıştırınız. Örnekte komut satırı argümanı olarak
    alınan tür isimlerinin uygun yerlerde byte kodlarının olup olmadığına bakılmaktadır. Bu işlem jar dosyasından
    okunarak da yapılabilir. İleride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/



/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte (daha önce kullanıldığını anıumsayınız) yine bir reflection yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IX ix = new IX() {
//            @Override
//            public void foo()
//            {
//
//            }
//        };
//
//        Class<?> cls = ix.getClass();
//
//        System.out.println(cls.getName());
//    }
//}
//
//
//interface IX {
//    void foo();
//}

























/*----------------------------------------------------------------------------------------------------------------------
    Lambda ifadesine ilişkin derleyici tarafında yazılan türlerin class referanslarına da getClass metodu ile
    erişilebilir. Aşağıdaki örneği çalıştırırak ekran çıktısını gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IX ix = () -> Console.writeLine("This is a test");
//
//        Class<?> cls = ix.getClass();
//
//        System.out.println(cls.getName());
//    }
//}
//
//
//interface IX {
//    void foo();
//}





















/*----------------------------------------------------------------------------------------------------------------------
    Lambda ifadesine ilişkin derleyici tarafında yazılan türlerin class referanslarına da getClass metodu ile
    erişilebilir. Aşağıdaki örneği çalıştırırak ekran çıktısını gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        IX ix1 = () -> Console.writeLine("This is a test");
//        IX ix2 = () -> Console.writeLine("This is another test");
//
//        Class<?> cls1 = ix1.getClass();
//        Class<?> cls2 = ix2.getClass();
//
//        System.out.println(cls1.getName());
//        System.out.println(cls2.getName());
//    }
//}
//
//
//interface IX {
//    void foo();
//}




















/*----------------------------------------------------------------------------------------------------------------------
    Class sınıfının getDeclaredXXXs metotları ile türün tüm elemanlarına erişim belirleyiciden bağımsız olarak
    erişilebilir. Taban sınıfın hiçbir bölümüne bu metotlar ile erişilemez
    Örnek için 003-GetDeclaredViaReflection projesine bakınız
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Class sınıfının getXXXs metotları ile taban sınfın da dahil olmak üzere yalnızca public metotlarına erişilebilir
    Örnek için 004-GetPublicViaReflection projesine bakınız
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Class sınıfının getXXXs getDeclaredXXXs metotlarının sonunda "s" olmayan versiyonları spesifik bir elemana yönelik
    bilgileri elde etmek için kullanılır. Constructor sınıfının newInstance isimli metodu ile ilgili sınıf türünden
    nesne yaratılabilir. Elemanlara yönelik sınıfların (Method, Field, Constructor vb.) setAccessible metotları ile
    eleman erişilebilir hale getirilebilir. Yani bu durumda private bir elemana da çalışma zamanı sırasında
    erişilebilir. Method sınıfının invoke metotları ile Method nesnesine ilişkin metot çağrılabilir. Metot çağrıları
    uygun argümanlar ile yapılmalıdır. Aksi durumda exception oluşur. Reflection konusuna ilişkin metotları fırlattıkları
    exception'ların hemen hepsi "checked exception" sınıflarıdır. Zaten uygulamada hemen hepsinin ele alınması (handle)
    gerekir. invoke metodunun birinci parametresi nesneyi gösteren referans olmalıdır. static metotlar için bu
    parametreye ilişkin argümanın null geçilmesi gerekir
    Örnek için 005-CallNonStaticMethodViaReflection projesine bakınız
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte singleton yazılmış sınıf türünden çalışma zamanı sırasında nesneler taratılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            Class<?> cls = Singleton.class;
//
//            for (int i = 0; i < 10; ++i) {
//                var ctor = cls.getDeclaredConstructor();
//                ctor.setAccessible(true);
//                var obj = ctor.newInstance();
//
//                ctor.setAccessible(false);
//
//                //...
//            }
//        }
//        catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//
//class Singleton {
//    public static final Singleton INSTANCE = new Singleton();
//
//    private int m_x;
//
//    private Singleton()
//    {
//        System.out.println("Singleton.Singleton()");
//    }
//
//    public int getX()
//    {
//        return m_x;
//    }
//
//    public void setX(int x)
//    {
//        //...
//        m_x = x;
//    }
//
//}


















/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte singleton yazılmış sınıf ctor içerisinde reflection ile nesne yaratılması engellese de yine
    reflection kullanarak nesne yaratılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            Class<?> cls = Singleton.class;
//
//            for (int i = 0; i < 10; ++i) {
//                var ctor = cls.getDeclaredConstructor();
//
//                var createdField = cls.getDeclaredField("ms_created");
//
//                createdField.setAccessible(true);
//                createdField.setBoolean(null, false);
//                createdField.setAccessible(false);
//
//                ctor.setAccessible(true);
//                var obj = ctor.newInstance();
//                ctor.setAccessible(false);
//
//                //...
//            }
//        }
//        catch (NoSuchMethodException | InvocationTargetException | InstantiationException
//               | IllegalAccessException | NoSuchFieldException e) {
//            var cause = e.getCause();
//
//            System.out.println(cause == null ? e.getMessage() : cause.getMessage());
//        }
//    }
//}
//
//class Singleton {
//    private static boolean ms_created;
//    public static final Singleton INSTANCE = new Singleton();
//    private int m_x;
//
//    private Singleton()
//    {
//        if (ms_created)
//            throw new UnsupportedOperationException("Object can not created by this way");
//
//        ms_created = true;
//        System.out.println("Singleton.Singleton()");
//    }
//
//    public int getX()
//    {
//        return m_x;
//    }
//
//    public void setX(int x)
//    {
//        //...
//        m_x = x;
//    }
//
//}

























/*----------------------------------------------------------------------------------------------------------------------
    enum türünden nesne reflection kullanılarak da yaratılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        try {
//            Class<?> cls = Singleton.class;
//
//            for (int i = 0; i < 10; ++i) {
//                var ctor = cls.getDeclaredConstructor();
//
//                ctor.setAccessible(true);
//                var obj = ctor.newInstance();
//                ctor.setAccessible(false);
//
//                //...
//            }
//        }
//        catch (NoSuchMethodException | InvocationTargetException | InstantiationException
//               | IllegalAccessException e) {
//            var cause = e.getCause();
//
//            System.out.println(cause == null ? e.getMessage() : cause.getMessage());
//            e.printStackTrace();
//        }
//    }
//}
//
//enum Singleton {
//    INSTANCE;
//    private int m_x;
//
//    Singleton()
//    {}
//
//    public int getX()
//    {
//        return m_x;
//    }
//
//    public void setX(int x)
//    {
//        //...
//        m_x = x;
//    }
//}

























