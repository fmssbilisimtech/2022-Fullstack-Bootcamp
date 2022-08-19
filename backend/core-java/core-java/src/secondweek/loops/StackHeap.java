package secondweek.loops;

public class StackHeap { }

// https://www.guru99.com/java-stack-heap.html





/*----------------------------------------------------------------------------------------------------------------------
	Bilindiği bir değişkenin faaliyet alanı derleme zamanına ilişkin bir kavramdır. Bir değişkenin bellekte
	yaratılması ile yok edilmesi arasındaki zamana değişkenin ömrü (storage duration). Bu kavram şüphesiz çalışma
	zamanına ilişkin bir kavramdır. Mantıksal bir ayrı kavramlara olmasalar da, faaliyet alanı ile ömür aynı
	şey değildir.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Yerel değişkenler ve parametre değişkenleri stack alanında yaratılır. Yerel değişkenin ömrü akış bakımından
	bildirildiği yerde yaratılır bildirildiği blok sonunda yok edilir. Parametre değişkenleri ömrü akış bakımından
	metot çağrısında yaratılır metot bittiğinde yok edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        {
//            int a; //Akış buradayken stack'te yaratıldı
//            int b;
//
//            //...
//        } // b ve a yok edildi
//
//        //...
//
//        Sample.foo(10, 20);
//        //..
//        Sample.foo(20, 40);
//    }
//}
//
//
//class Sample {
//    public static void foo(int a, int b)
//    {
//        //...
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın içerindeki bildirimlere sınıfın elemanları (members) denir. Sınıfın bir elemanı eğer
	bir alt programsa buna metot eğer bir değişken ise buna veri elemanı (member variable) denir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf içerisinde tüm metotların dışında herhangi bir yerde bildirilen değişkenlere sınıf veri
	elemanı denir. Sınıf veri elemanları metotlarda olduğu gibi erişim belirleyiciye sahip olabilirler,
	sınıf veri elemanı static veya non-static olarak bildirilebilirler
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    public int a;
//
//    public static void foo()
//    {
//
//    }
//
//    private static double b;
//    double c;
//}




















/*----------------------------------------------------------------------------------------------------------------------
	Sınıf bildirimi bir tür bildirimidir (user defined type)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class Sample {
//    //...
//}
//
//class SerialPort {
//    //...
//}
//
//class Person {
//    //...
//}
//
//class Car {
//    //...
//}























/*----------------------------------------------------------------------------------------------------------------------
	Sınıf bildirimi bir tür bildirimi olduğuna göre sınıf türünden de değişkenler bildirilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s;
//        Mample m;
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
	Java' da türler kategori olarak iki gruba ayrılır: değer türleri (value types), referans türleri (reference types)
	T bir tür ismi olmak üzere T türden bir değişken içerisinde değerin kendisi tutuluyorsa T kategori olarak
	değer türlerine ilişkindir. Eğer T türünden değişkenin içerisinde bir adres bilgisi tutuluyorsa
	T bir referans türüne ilişkindir.
	Tüm temel türler değer türleridir. Temel türler dışında kalan tüm türler (user defined type) referans
	türleridir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf türünden bir değişkene referans değişken ya da referans denir.
	Anahtar Not: Java' da referans terimi adres yerine de kullanılabilir. Örneğin bir nesnenin adresi yerine
	bir nesnenin referansı da doğru bir cümledir. Ancak buradaki referans terimi değişken değil adresi temsil
	eder. Referans değişken (ya da kısaca referans) içerisinde adres (referans) tutabilen bir değişkendir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s; //referans
//        Mample m; //referans
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
	Sınıf türünden bellekte ayrılan bölgelere nesne denir. Nesneler heap de yaratılır. Java' da stack'de nesne
	yaratılamaz. Bir nesneyi yaratmak için new operatörü kullanılır. new operatörü operatör öncelik
	tablosunun birinci seviyesinde ve tek operandlı bir operatördür. Operatörün kullanımının genel biçimi:

		new <referans tür ismi>([argümanlar]);

	new operatörünün ürettiği değer heap de yaratılan nesnenin adresidir (referansıdır). Bu durumda new operatörünün
	değer uygun bir referansa atanabilir. Uygun referans new operatörü kullanılırken yazılan referans türden bir
	değişkendir. Nesneler ilgili sınıf türünün bir örneği kabul edilir ve instance terimi kullanılır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Sample s; //referans
//
//        s = new Sample();
//    }
//}
//
//class Sample {
//    //...
//}























/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın non-static veri elemanları her nesne için ayrıca yaratılır. Sınıfın non-static veri elamanlarına
	sınıf dışından referans ve nokta operatörü ile erişilebilir. Her new işlemi yeni bir nesne yaratmak demektir.
	Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s, k;
//
//        s = new Sample();
//
//        s.x = 10;
//        s.y = false;
//
//        k = new Sample();
//
//        k.x = 20;
//        k.y = true;
//
//        System.out.printf("s.x=%d%n", s.x);
//        System.out.printf("s.y=%b%n", s.y);
//        System.out.printf("k.x=%d%n", k.x);
//        System.out.printf("k.y=%b%n", k.y);
//    }
//}
//
//class Sample {
//    public int x;
//    public boolean y;
//    //...
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Non-static veri elemanlarına nesnenin yaratılması aşamasında default değerler atanır. Default değerler
	mantıksal sıfır değerleridir. Örneğin int türü için sıfırken, boolean türü için false değeridir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s, k;
//
//        s = new Sample();
//
//        System.out.printf("s.x=%d%n", s.x);
//        System.out.printf("s.y=%b%n", s.y);
//    }
//}
//
//class Sample {
//    public int x;
//    public boolean y;
//    //...
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte s değişkenine değer atanmadığı için error oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s;
//
//
//        System.out.printf("s.x=%d%n", s.x);
//        System.out.printf("s.y=%b%n", s.y);
//    }
//}
//
//class Sample {
//    public int x;
//    public boolean y;
//    //...
//}


























/*----------------------------------------------------------------------------------------------------------------------
	 Bir nesnenin belekte kapladığın alan "en az non-static veri elemanının toplam uzunluğu kadardır"
	 Bu durumda aynı türden nesneler için aynı uzunlukta yer ayrılır. Farklı türden nesnelerin farklı veri
	 elemanları olabileceğinden aynı uzunlukta yer ayrılması gerekmez.

	 Türü ne olursa olsun tüm referansların uzunlukları aynıdır. Bu da adreslenebilecek sayıları tutabilecek
	 kadar uzunluktadır. Yani örneğin 64 bit bir işlemci de tüm referanslar 64 bit uzunluktadır.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte her s referansı nesneden kopartılıp yeni bir nesnenin adresi referansı atanmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s;
//
//        s = new Sample();
//
//        s.x = 10;
//        s.y = true;
//
//        s = new Sample();
//
//        System.out.printf("s.x=%d%n", s.x);
//        System.out.printf("s.y=%b%n", s.y);
//    }
//}
//
//class Sample {
//    public int x;
//    public boolean y;
//    //...
//}

































/*----------------------------------------------------------------------------------------------------------------------
	 İki aynı türden referansın birbirine atanması iki referansın da aynı nesneyi göstermeleri demektir. Bu durumda
	 hangi referans ile nesneye erişildiğinin bir önemi yoktur.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s, k;
//
//        s = new Sample();
//
//        s.x = 10;
//        s.y = true;
//
//        k = s;
//
//        System.out.printf("s.x=%d%n", s.x);
//        System.out.printf("s.y=%b%n", s.y);
//
//
//        System.out.printf("k.x=%d%n", k.x);
//        System.out.printf("k.y=%b%n", k.y);
//
//        ++k.x;
//
//        k.y = false;
//
//        System.out.println("////////////////////////");
//        System.out.printf("s.x=%d%n", s.x);
//        System.out.printf("s.y=%b%n", s.y);
//
//        System.out.printf("k.x=%d%n", k.x);
//        System.out.printf("k.y=%b%n", k.y);
//    }
//}
//
//class Sample {
//    public int x;
//    public boolean y;
//    //...
//}

































/*----------------------------------------------------------------------------------------------------------------------
	 Referans parametreli metotlar olabilir. Bu durumda metot içerisinde referans parametresine geçilen adrese
	 ilişkin nesneye erişilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Date birthDate = new Date();
//
//        birthDate.day = 10;
//        birthDate.month = 9;
//        birthDate.year = 1976;
//
//        DateUtil.display(birthDate);
//    }
//}
//
//class DateUtil {
//    public static void display(Date date)
//    {
//        System.out.printf("%02d/%02d/%04d%n", date.day, date.month, date.year);
//    }
//}
//
//class Date {
//    public int day, month, year;
//    //...
//}






































/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte argüman olan değişmez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int a = 10;
//        Sample.foo(a);
//
//        System.out.printf("a=%d%n", a);
//    }
//}
//
//class Sample {
//    public static void foo(int a)
//    {
//        ++a;
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	 Referans parametreli metotlar aldıkları referansa ilişkin nesne üzerinde değişiklik yapabilirler
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Date birthDate = new Date();
//
//        birthDate.day = 10;
//        birthDate.month = 9;
//        birthDate.year = 1976;
//
//
//        DateUtil.display(birthDate);
//        DateUtil.changeDate(birthDate, 11, 7, 1983);
//        DateUtil.display(birthDate);
//    }
//}
//
//class DateUtil {
//    public static void changeDate(Date date, int day, int month, int year)
//    {
//        //...
//        date.day = day;
//        date.month = month;
//        date.year = year;
//    }
//
//    public static void display(Date date)
//    {
//        System.out.printf("%02d/%02d/%04d%n", date.day, date.month, date.year);
//    }
//}
//
//class Date {
//    public int day, month, year;
//    //...
//}







































/*----------------------------------------------------------------------------------------------------------------------
	 Referans geri dönen metotlar ile bir nesnenin referansı metodun geri dönüş değerinden elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Date birthDate = DateUtil.createDate(10,9, 1976);
//
//        DateUtil.display(birthDate);
//        DateUtil.changeDate(birthDate, 11, 7, 1983);
//        DateUtil.display(birthDate);
//    }
//}
//
//class DateUtil {
//    public static Date createDate(int day, int month, int year)
//    {
//        //...
//        Date date = new Date();
//
//        date.day = day;
//        date.month = month;
//        date.year = year;
//
//        return date;
//    }
//
//    public static void changeDate(Date date, int day, int month, int year)
//    {
//        //...
//        date.day = day;
//        date.month = month;
//        date.year = year;
//    }
//
//    public static void display(Date date)
//    {
//        System.out.printf("%02d/%02d/%04d%n", date.day, date.month, date.year);
//    }
//}
//
//class Date {
//    public int day, month, year;
//    //...
//}
























































