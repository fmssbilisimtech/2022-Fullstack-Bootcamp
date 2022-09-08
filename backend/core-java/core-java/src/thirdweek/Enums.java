package thirdweek;

import java.time.DayOfWeek;

public class Enums { }

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte move metodunun parametresi int türünden olduğundan parametre değişken ismi ne olduğu ile ilgili
	bilgi verse de ona geçibilecek argümanlar anlaşılamamaktadır. Ayrıca çağırna sırasında geçilen argümanlar da
	ne anlama geldikleri hakkında bilgi vermemektedir. Yani okunabilirlik zayıftır. Şüphesiz move metodu doğru olsa
	çağırma sırasında geçersiz değerler geçilebilir bu da kod yazanın hata yapma olasılığının fazla olduğunu gösterir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        SampleGame sampleGame = new SampleGame();
//
//        sampleGame.run();
//    }
//}
//
//class SampleGame {
//    public void run()
//    {
//        GameObject gameObject = new GameObject();
//
//        //...
//        gameObject.move(1); //top
//        gameObject.move(3); //bottom
//        gameObject.move(2); //left
//        gameObject.move(0); //right
//        gameObject.move(3); //bottom
//    }
//}
//
//class GameObject {
//    public void move(int direction)
//    {
//        //...
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte move metodunun parametresi yine birşey anlatmamaktadır. Argümanlar okunabilirlik açısından
	düzeltilmiştir. Ancak argümanı hem yanlış yazma olasılığı hem de String karşılaştırmasının göreceli yavaş olması
	bu tekniğin de iyi olmadığını göstermektedir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        SampleGame sampleGame = new SampleGame();
//
//        sampleGame.run();
//    }
//}
//
//class SampleGame {
//    public void run()
//    {
//        GameObject gameObject = new GameObject();
//
//        //...
//        gameObject.move("top");
//        gameObject.move("bottom");
//        gameObject.move("left");
//        gameObject.move("right");
//        gameObject.move("botom");
//    }
//}
//
//class GameObject {
//    public void move(String direction)
//    {
//        //...
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnek aşağıdaki gibi bir tasarımla hata yapma olasılığının düşürüldüğü bir biçime getirilebilir.
	Ancak hala göreceli yavaşlık giderilmemiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        SampleGame sampleGame = new SampleGame();
//
//        sampleGame.run();
//    }
//}
//
//class SampleGame {
//    public static final String LEFT = "left";
//    public static final String RIGHT = "right";
//    public static final String TOP = "top";
//    public static final String BOTTOM = "bottom";
//
//    public void run()
//    {
//        GameObject gameObject = new GameObject();
//
//        //...
//        gameObject.move(TOP);
//        gameObject.move(BOTTOM);
//        gameObject.move(LEFT);
//        gameObject.move(RIGHT);
//        gameObject.move(BOTTOM);
//    }
//}
//
//class GameObject {
//    public void move(String direction)
//    {
//        //...
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıda metodun parametresi int yapılmış değerler de final elemanlar olarak belirlenmiştir. Ancak hala parametre
	değişkeni birşey anlatmamakta üstelik int türden olduğu içn ilgisiz değerler de geçilebilmektedir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        SampleGame sampleGame = new SampleGame();
//
//        sampleGame.run();
//    }
//}
//
//class SampleGame {
//    public static final int LEFT = 2;
//    public static final int RIGHT = 0;
//    public static final int TOP = 1;
//    public static final int BOTTOM = 3;
//
//    public void run()
//    {
//        GameObject gameObject = new GameObject();
//
//        //...
//        gameObject.move(TOP);
//        gameObject.move(BOTTOM);
//        gameObject.move(LEFT);
//        gameObject.move(RIGHT);
//        gameObject.move(BOTTOM);
//    }
//}
//
//class GameObject {
//    public void move(int direction)
//    {
//        //...
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problemler aşağıdaki gibi bir tasarımla çözülebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        SampleGame sampleGame = new SampleGame();
//
//        sampleGame.run();
//    }
//}
//
//class Direction {
//    private Direction()
//    {}
//
//    public static final Direction LEFT = new Direction();
//    public static final Direction RIGHT = new Direction();
//    public static final Direction TOP = new Direction();
//    public static final Direction BOTTOM = new Direction();
//}
//
//class SampleGame {
//
//    public void run()
//    {
//        GameObject gameObject = new GameObject();
//
//        //...
//        gameObject.move(Direction.TOP);
//        gameObject.move(Direction.BOTTOM);
//        gameObject.move(Direction.LEFT);
//        gameObject.move(Direction.RIGHT);
//        gameObject.move(Direction.BOTTOM);
//    }
//}
//
//class GameObject {
//    public void move(Direction direction)
//    {
//        //...
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte Direction sınıfına geliştirilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Direction direction = Direction.TOP;
//
//        System.out.println(direction.ordinal());
//
//        int ordinal = 3;
//
//        direction = Direction.values()[ordinal];
//
//        //...
//    }
//}
//
//class Direction {
//    private static final Direction [] DIRECTIONS = {new Direction(0), new Direction(1), new Direction(2), new Direction(3)};
//    private final int m_ordinal;
//    private Direction(int ordinal)
//    {
//        m_ordinal = ordinal;
//    }
//
//    public static final Direction RIGHT = DIRECTIONS[0];
//    public static final Direction TOP = DIRECTIONS[1];
//    public static final Direction LEFT = DIRECTIONS[2];
//    public static final Direction BOTTOM = DIRECTIONS[3];
//
//    public static Direction [] values()
//    {
//        return DIRECTIONS;
//    }
//
//    public int ordinal()
//    {
//        return m_ordinal;
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
	enum anahtar sözcüğü ile bir enum türü (enum class) bildirilebilir. enum türü içerisinde ilk noktalı virgülden önce
	(noktalı virgül zorunlu olmadıkça konmaz) bildirilen isimlere enum sabitleri denir. Bu isimler ilgili enum türünden
	public static ve final olarak bildirilmiş referanslardır. Bu referanslar herbiri ilgili enum türünden yaratılmış olan
	bir nesnenin adresini tutarlar. enum sabitlerinin public static veya final veya tür bilgisi yazılması geçersizdir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//enum Color {
//    RED, GREEN, BLUE
//}
//
//enum DayOfWeek {
//    SUN, MON, TUE, WED, THU, FRI, SAT
//}

























/*----------------------------------------------------------------------------------------------------------------------
	enum türünün ordinal isimli non-static metodu referansa ilişkin nesneyi tutan enum sabitinin sıra numarasını
	döndürür. Ordinal numarası sıfırdan başlar.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Color c = Color.RED;
//
//        System.out.println(c.ordinal());
//
//        DayOfWeek dayOfWeek = DayOfWeek.SAT;
//
//        System.out.println(dayOfWeek.ordinal());
//    }
//}
//
//enum Color {
//    RED, GREEN, BLUE
//}
//
//enum DayOfWeek {
//    SUN, MON, TUE, WED, THU, FRI, SAT
//}





















/*----------------------------------------------------------------------------------------------------------------------
	enum türünün toString metodu ilgili sabitin yazı karşılığını döndürür
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//        DayOfWeek dayOfWeek = DayOfWeek.WED;
//
//        System.out.println(dayOfWeek.toString());
//    }
//}
//
//
//enum DayOfWeek {
//    SUN, MON, TUE, WED, THU, FRI, SAT
//}


















/*----------------------------------------------------------------------------------------------------------------------
	enum türünün static valueOf static metodu ile enum sabitinin yazı karşılından referansı elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        DayOfWeek dayOfWeek = DayOfWeek.valueOf("WED");
//
//        System.out.println(dayOfWeek.toString());
//    }
//}
//
//
//enum DayOfWeek {
//    SUN, MON, TUE, WED, THU, FRI, SAT
//}


















/*----------------------------------------------------------------------------------------------------------------------
	enum türünün values isimli metodu enum sabitlerine ilişkin diziyi döndürür
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        for (DayOfWeek dayOfWeek : DayOfWeek.values())
//            System.out.println(dayOfWeek.toString());
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
	enum türünden nesne new operatörü ile hiç bir yerde (enum içinde bile) yaratılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        DayOfWeek dayOfWeek = new DayOfWeek(); //error
//    }
//}
//
//
//enum DayOfWeek {
//    SUN, MON, TUE, WED, THU, FRI, SAT
//}























/*----------------------------------------------------------------------------------------------------------------------
	enun türüne sabitler dışında metot, veri elemanı ve ctor gibi elemanlar da eklenebilir. Bunun için son sabit
	bildiriminden sonra noktalı virgül konmalı ve elemanlar bildirilmelidir. Eğer enum class'ın hiç bir sabiti
	olmayacaksa (ki bu durum pratikte anlamsızdır) eklenecek diğer elemanlardan önce yine noktalı virgül konmalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//enum Sample {
//    ;
//    private int m_x;
//    public void foo()
//    {
//
//    }
//}
//
//enum Color {
//    RED, GREEN, BLUE;
//    private int m_x;
//    public void foo()
//    {
//
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	enum türlerine ctor yazılabilir. Ancak bu ctor ya private bildirilmelidir ya da hiç bir erişim belirleyici
	yazılmamalıdır. Erişim belirleyici yazılmaması enum sınıflarının ctor'ları için private anlamındadır. Bu durum
	yalnızca ctoriçin geçerlidir. Veri elemanları ve metotlar için sınıflar ile aynıdır. enum sınıfının ctor'u
	public veya protected bildirilemez. enum sınıfı türünden bir nesne enum sınıfı içerisinde de yaratılamaz. Yani ctor
	elemanı private olmanın da ötesindedir.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//enum Color {
//    RED, GREEN, BLUE;
//    private Color()
//    {
//
//    }
//    public void foo()
//    {
//        Color c = new Color(); //error
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte RED, GREEN, BLUE referanslarına ilişkin nesneler yaratılırken default ctor'un çağrıldığına
	dikkat ediniz.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Color.foo();
//        System.out.println("////////////");
//        Color.foo();
//
//    }
//}
//
//enum Color {
//    RED, GREEN, BLUE;
//    Color()
//    {
//        System.out.println("Color.Color");
//    }
//
//    public static void foo()
//    {
//
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte Color enum sınıfına eklenen ctor elemanı ile her bir sabite ilişkin nesneye bilgi iliştirilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Color color = Color.BLUE;
//
//        System.out.printf("(%d, %d, %d)", color.getR(), color.getG(), color.getB());
//    }
//}
//
//enum Color {
//    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
//    private final int m_r, m_b, m_g;
//
//    Color(int r, int g, int b)
//    {
//        m_r = r;
//        m_g = g;
//        m_b = b;
//    }
//
//    public int getR()
//    {
//        return m_r;
//    }
//
//    public int getG()
//    {
//        return m_g;
//    }
//
//    public int getB()
//    {
//        return m_b;
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte Color enum sınıfına eklenen ctor elemanı ile her bir sabite ilişkin nesneye bilgi iliştirilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Color color = Color.B;
//
//        System.out.printf("(%d, %d, %d)", color.r, color.g, color.b);
//    }
//}
//
//enum Color {
//    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
//    R(RED), G(GREEN), B(BLUE);
//    public final int r, b, g;
//
//    Color(int x, int y, int z)
//    {
//        r = x;
//        g = y;
//        b = z;
//    }
//
//    Color(Color c)
//    {
//        r = c.r;
//        g = c.g;
//        b = c.b;
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	enum class ile Singleton sınıf bildirimi. Lazy implemenatation gerekmedikçe veya başka bir gerekçe yoksa singleton
	için bu implementasyon en iyisidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Singleton s = Singleton.INSTANCE;
//        Singleton k = Singleton.INSTANCE;
//
//        System.out.println(s == k);
//    }
//}
//
//enum Singleton {
//    INSTANCE;
//    private int m_a;
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




















/*----------------------------------------------------------------------------------------------------------------------
	enum türlerinde eşitlik karşılaştırması yani aynı enum sabitine ilşkin referansın tutulup tutulmadığı == veya !=
	operatörleri ile test edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Direction direction1 = Direction.LEFT;
//        Direction direction2 = Direction.LEFT;
//
//        System.out.println(direction1 == direction2);
//        System.out.println(direction1 != direction2);
//    }
//}
//
//enum Direction {
//    RIGHT, TOP, LEFT, BOTTOM
//}



















/*----------------------------------------------------------------------------------------------------------------------
	enum türlerinde eşitlik karşılaştırması equals isimli metot ile yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Direction direction1 = Direction.LEFT;
//        Direction direction2 = Direction.LEFT;
//
//        System.out.println(direction1.equals(direction2));
//    }
//}
//
//enum Direction {
//    RIGHT, TOP, LEFT, BOTTOM
//}



















/*----------------------------------------------------------------------------------------------------------------------
	enum türlerinin compareTo metodu:
		a.compareTo(b);
	çağrısı için
		a.ordinal() - b.ordinal()
	sonucunu döndürür
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        DayOfWeek dayOfWeek1 = DayOfWeek.MONDAY;
//        DayOfWeek dayOfWeek2 = DayOfWeek.WEDNESDAY;
//
//        System.out.println(dayOfWeek1.compareTo(dayOfWeek2));
//
//        if (dayOfWeek1.compareTo(dayOfWeek2) > 0)
//            System.out.println("dayofWeek1, dayOfWeek2 den sonra geliyor");
//        else
//            System.out.println("dayofWeek2, dayOfWeek1 den sonra geliyor");
//    }
//}

























/*----------------------------------------------------------------------------------------------------------------------
	enum türünün equals metodu ile farklı türden enum class'lar kullanılabilir. Bu durum equals metodunun parametresinin
	türünün Object olmasından kaynaklanır. Bu işlemin nasıl yapılabildiği ve Object sınıfı ileride ele alınacaktır.
	Farklı enum'lar için equals metodu false değerini döndürür
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Color color = Color.BLUE;
//        MartialStatus martialStatus = MartialStatus.DIVORCED;
//
//        System.out.println(color.equals(martialStatus));
//    }
//}
//
//enum Color {RED, GREEN, BLUE}
//enum MartialStatus {MARRIED, SINGLE, DIVORCED}


















/*----------------------------------------------------------------------------------------------------------------------
	Aynı durum compareTo metodu için geçerli değildir. Çünkü compareTo metodunun  parametresi aynı enum türündendir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Color color = Color.BLUE;
//        MartialStatus martialStatus = MartialStatus.DIVORCED;
//
//        System.out.println(color.compareTo(martialStatus)); //error
//    }
//}
//
//enum Color {RED, GREEN, BLUE}
//enum MartialStatus {MARRIED, SINGLE, DIVORCED}















