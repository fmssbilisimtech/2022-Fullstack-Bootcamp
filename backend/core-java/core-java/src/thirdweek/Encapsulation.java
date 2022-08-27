package thirdweek;

import util.ArrayUtil;

public class Encapsulation { }


/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın özellikle veri elemanlarının gizlenmesine (yani diğer sınıflardan erişilememesine) nesne yönelimli
	programlama tekniğinde kapsülleme (encapsulation) denir. Bu kavramın geneline veri/bilgi gizleme (data/information hiding)
	denir. Burada temel amaç dışarıyı yani sınıf dışını ilgilendirmeyecek verilerin/bilgilerin dışarıya verilmemesidir.
	Bu kavram gerçek hayattan nesne yönelimli programlamaya aktarılmıştır. Örneğin araba kullanan bir kişi vites değişim
	sırasında teknik olarak vites değişiminin nasıl gerçekleştiğini bilmek zorunda değildir. Bilse bile araba kullanırken
	bunun anlamı yoktur.

	Bu anlamda sınıfı yazan ve sınıfı kullanan bakış açısı farklıdır. Genel olarak sınıfı kullanan kişiye sınıfn müşterisi
	(client), sınıfı yazan kişiye ise hizmet veren (server) denir.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Anahtar Notlar: Programlamada isimlendirme için bazı teknikler kullanılmaktadır. Bu teknikler dışında da isimlendirme
    yapılabilir. Bunlar çok kullanılan tekniklerdir:
    1. Unix stili (snake case): Bu isimlendirmede karakterlerin tamamı küçük harfle yazılır ve birden fala kelimeden oluşan
    isimlerde kelimeler arasına alttire karakteri yerleştirilir. Bu isimlendirme Java'da pek tercih edilmez. Örneğin:
        number_of_invoices, serial_port

    2. Camel case (lower camel case): Bu isimlendirmede kelimeler bitişik yazılır. İlk kelimenin baş harfi küçük, diğer
    kelimelerin baş harfleri büyük olarak yazılır. Geri kalan tüm karakterler de küçük harfle yazılır. Bu isimlendirme
    Java'da genel olarak yerel değişkenlerde, parametre değişkenlerinde ve metot isimlerinde tercih edilir. Örneğin:
        parseInt, nextBoolean, isPrime

    3. Pascal case (upper camel case): Bu isimlendirmede kelimeler bitişik yazılır. Tüm kelimelerin baş haffleri
    büyük harf geri kalan karakterler küçük harfle yazılır. Bu isimlerndirme Java' da genelde sınıf ve benzeri
    türlerde kullanılır. Örneğin:
        Random, String, LottaryApp

    İsimlendirmede bunlardan biri ya da birden fazlası kullanılmak zorunda değildir. Örneğin Java' da genel olarak
    paket isimlerinin tamamı küçük harfle ve bitişik olarak yazılır. Örneğin:
        , java.lang, java.io, java.util
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Nesne yönelimli programlamada sınıfın özellike gizlene (genel olarak private) veri elemanlarının isimlendirilmesine
    yönelik bazı teknikler kullanılmaktadır. Örneğin bazı programcılar private veri elemanları isimlendirmesinde
    (lower) camel case kullanılabilir. Ya da örneğin, private veri elemanları "m_", "d_", "_", "m" gbi önekler alabilir.
    Biz sınıfın private veri elemanları için "m_" önekini kullanacağız. Eğer sınıfın private veri elemanı aynı
    zamanda static "ms_" önekini kullanacağız.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    Bir veri elemanı gizlendiğinde sınıfın müşteri kodlarının bu elemana değer ataması veya bu elemanın değerini
    elde etmesi için public metotlar yazılabilir. Veri elenaanlarına erişip değerine elde etmek için yazılan metotlara
    "get metotları (getters)" denir. Veri elemanına erişip değerini değiştirmeye yarayan metotlara ise "set metotları (setters)"
    denir. Sınıfın bu şekildeki metotlarına "accessors" denir. Tersine get ve set metotlarının veri elemanlarına erişmesi
    gerekmez. Bu durumda metotlar mantıksal olarak yazılır. Bu durum ileride ele alınacaktır.

    Sınıfın set metotlarının isimleri "set" ile başlatılır. get metotları ise "get" ile başlatılır. İstisna olarak
    sınfın get metodu boolean türden bir değere karşılık geliyor ise genel olarak ismi "is" ile başlatılır.
    Sınıfı yazan programcı bu isimlendirmeye aksi bir durum olmadıkça dikkat etmelidir. Birtakım işlem yapan ve uygulamada
    kullanılan ortamlar (framework) veya kütüphaneler (libraries) programcı tarafından yazılmış olan sınıflar için bu şekilde
    isimlendirilen metotları ararlar ve çağırırlar.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki Date sınıfında veriler gizlenmiş ve get, set metotları yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Date date = new Date(10, 9, 1976);
//
//        System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());
//
//        date.setDay(11);
//        date.setMonth(7);
//        date.setYear(1983);
//
//        System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());
//    }
//}
//
//class Date {
//    private int m_day, m_mon, m_year;
//
//    public Date(int day, int mon, int year)
//    {
//        //...
//        m_day = day;
//        m_mon = mon;
//        m_year = year;
//    }
//
//    public int getDay()
//    {
//        return m_day;
//    }
//
//    public void setDay(int val)
//    {
//        //...
//        m_day = val;
//    }
//
//    public int getMonth()
//    {
//        return m_mon;
//    }
//
//    public void setMonth(int val)
//    {
//        //...
//        m_mon = val;
//    }
//
//    public int getYear()
//    {
//        return m_year;
//    }
//
//    public void setYear(int val)
//    {
//        //...
//        m_year = val;
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki Device sınıfında m_isActive veri elemanı için get metodunun ismi "is" ile başlatılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Device device = new Device("test", "192.156.2.123", 50500, true);
//
//        System.out.printf("%s://%s:%d %s", device.getName(), device.getHost(), device.getPort(), device.isActive() ? "Çalışıyor" : "Çalışmıyor");
//    }
//}
//
//class Device {
//    private String m_name;
//    private String m_host;
//    private int m_port;
//    private boolean m_isActive;
//
//    public Device(String name, String host, int port, boolean isActive)
//    {
//        //...
//        m_name = name;
//        m_host = host;
//        m_port = port;
//        m_isActive = isActive;
//    }
//
//    public String getName()
//    {
//        return m_name;
//    }
//
//    public String getHost()
//    {
//        return m_host;
//    }
//
//    public int getPort()
//    {
//        return m_port;
//    }
//
//    public boolean isActive()
//    {
//        return m_isActive;
//    }
//
//    //...
//}









































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki durumlardan en az biri varsa veri elemanı gizlenmelidir:
    - Sınıfın geliştirilmesinde versiyon değiştikçe (ilerledikçe) bir veri elemanın isminin hatta türünün değişmesine
    çok sık ratlanır. Bu durumda eski kodların bu değişimden etkilenmemesi için veri elemanı gizlenmelidir.

    - Bir veri elemanının sınır değerleri olabilir. Bu değerlerin kontrol edilip değiştirilebilmesi için veri elemanı
    gizlenmelidir

    - Bir veri elemanı değiştiğinde başka bir veri elemanının değerinin değişen elemana göre hesaplanması gerekebilir.
    Bu durumda veri elemanları gizlenmelidir

    - Bir veri elemanı değiştiğinde yeni değere göre bir işlem yapılması gerekiyor olabilir. Örneğin veri elemanı
    bir uzak veri tabanı yönetyim sistemine ilişkin yer (adres) bilgisi (url) tutuyor olsun. Bu bilgi değiştikçe eski
    adresten bağlantı kesilip yeni adresteki veritabanı yönetim sistemine bağlanılması gerekiyor olabilir. Bu durumda
    ilgili veri elemanı gizlenmelidir

    - Bazen bir veri elemanının gizlenmesi gerekmese de diğer veri elemanları da gizlendiğinden bütünlük açısından
    gizlenebilir

    Bu durumlar dışında (%3 ile %5 arası rastlanır) sınıfın veri elemanı puıblic yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Aşağdaki örnekte Date sınıfının içsel algoritması değişmesine rağmen müşteri kodları bundan etkilenmemiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Date date = new Date(10, 9, 1976);
//
//        System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());
//
//        date.setDay(11);
//        date.setMonth(7);
//        date.setYear(1983);
//
//        System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());
//    }
//}
//
//class Date {
//    private String m_date;
//
//    public Date(int day, int mon, int year)
//    {
//        //...
//        m_date = String.format("%02d/%02d/%04d", day, mon, year);
//    }
//
//    public int getDay()
//    {
//        return Integer.parseInt(m_date.substring(0, 2));
//    }
//
//    public void setDay(int val)
//    {
//        //...
//        m_date = String.format("%02d/%02d/%04d", val, getMonth(), getYear());
//    }
//
//    public int getMonth()
//    {
//        return Integer.parseInt(m_date.substring(3, 5));
//    }
//
//    public void setMonth(int val)
//    {
//        //...
//        m_date = String.format("%02d/%02d/%04d", getDay(), val, getYear());
//        //...
//    }
//
//    public int getYear()
//    {
//        return Integer.parseInt(m_date.substring(6));
//    }
//
//    public void setYear(int val)
//    {
//        //...
//        m_date = String.format("%02d/%02d/%04d", getDay(), getMonth(), val);
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte dizinin elemanlarının değiştirilmesi ebgellenmemiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(10, 1, 100);
//
//        ArrayUtil.display(s.getA());
//        s.getA()[0] = 106;
//        ArrayUtil.display(s.getA());
//    }
//}
//
//class Sample {
//    private int [] m_a;
//
//    public Sample(int n, int min, int max)
//    {
//        m_a = ArrayUtil.getRandomArray(n, min, max);
//    }
//
//    public int[] getA()
//    {
//        return m_a;
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problem aşağıdaki gibi çözülebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(10, 1, 100);
//
//        int length = s.length();
//
//        for (int i = 0; i < length; ++i)
//            System.out.printf("%d ", s.get(i));
//
//        System.out.println();
//    }
//}
//
//class Sample {
//    private int [] m_a;
//
//    public Sample(int n, int min, int max)
//    {
//        m_a = ArrayUtil.getRandomArray(n, min, max);
//    }
//
//    public int length()
//    {
//        return m_a.length;
//    }
//
//    public int get(int i)
//    {
//        return m_a[i];
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
	Tüm elemanları static olarak bildirilmiş sınıflar türünden nesnelerin anlamı olmayacağından public ctor bu tarz
	sınıflara yazılmaz. Bu durum Java'nın standart sınıfları için de vardır.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ArrayUtil arrayUtil = new ArrayUtil(); //error
//        Math math = new Math(); //error
//
//        //...
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
    Anahtar Notlar: Programlamada o bölge için hiç bir yer ayrılmayan bir adres numarası vardır. Bu adres Java' da null isimli
    bir anahtar sözcük ile temsil edilir. Buna null adres/referans de denir. Bir referansın default değer null değeridir.
    null referans detayları ileride ele alınacaktır.
----------------------------------------------------------------------------------------------------------------------*/































/*----------------------------------------------------------------------------------------------------------------------
	Singleton kalıbı: Öyle bir sınıf olsun ki bu sınıf türünden program boyunca yalnızca bir tane nesne yaratılabilsin
	ve her isteyen aynı nesneyi kullanabilsin. Singleton kalıbının bir çok implementasyonu yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Singleton kalıbının bir implementasyonu (lazy implementation)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//
//        System.out.println(s1 == s2);
//
//        s1.setA(10);
//
//        System.out.println(s2.getA());
//    }
//}
//
//class Singleton {
//    private static Singleton ms_instance;
//    private int m_a;
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
//
//    public int getA()
//    {
//        return m_a;
//    }
//
//    public void setA(int a)
//    {
//        //...
//        m_a = a;
//    }
//}

































