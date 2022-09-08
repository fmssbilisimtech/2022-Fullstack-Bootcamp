package fifthweek;

public class ThisSyntax { }


/*----------------------------------------------------------------------------------------------------------------------

    Arakod düzeyinde non-static metot kavramı yoktur. Aslında aşağı seviyede böyle bir kavram yoktur. Bundan dolayı
    derleyici non-static metotları adeta static metotlar biçiminde arakoda yazar. Bunu non-static metoda ait olduğu
    sınıf türünden ekstra bir referans parametresi ekleyerek yapar. Bu parametrenin ilk parametre ya da son parametre
    ya da arada bir parametre olup olmadığının önemi yoktur. non-static bir metodun çağrısı da o metot çağrılırken kullanılan
    referansın arakoddaki karşılığı olan static metoda argüman olarak geçilmesiyle yapılır. Aşağıdaki örnekte
    non-static bir metodun bildirimi ve çağrılmasının arakoddaki temsili karşılıkları gösterilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//
//        s.setVal(10);
//
//        //Arakoddaki karşılığımım temsili
//        Sample.setVal(s, 10);
//
//        s.display();
//
//        //Arakoddaki karşılığımım temsili
//        Sample.display(s);
//    }
//}
//
//class Sample {
//    private int m_val;
//
//    public void setVal(int val)
//    {
//        m_val = val;
//    }
//
//    //Arakoddaki karşılığının temsili
//    public static void setVal(Sample s, int val)
//    {
//        s.m_val = val;
//    }
//
//    public void display()
//    {
//        System.out.printf("m_val=%d%n", m_val);
//    }
//
//    //Arakoddaki karşılığının temsili
//    public static void display(Sample s)
//    {
//        System.out.printf("m_val=%d%n", s.m_val);
//    }
//}



/*----------------------------------------------------------------------------------------------------------------------
    non-static metotlara gizlice geçirilen adrese metot bildiriminde this referansı ile erişilebilir. non-static bir
    metot içerisinde this referansı o metodu çağıran referans yani arakoddaki static metoda geçilen argümana
    karşılık gelir. this referansının türü hangi sınıf içerisinde kullanılmışsa o türdendir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//
//        s.setVal(10);
//        s.display();
//
//        Sample k = new Sample();
//
//        k.setVal(23);
//        k.display();
//    }
//}
//
//class Sample {
//    private int m_val;
//
//    public void setVal(int val)
//    {
//        this.m_val = val;
//    }
//
//    public void display()
//    {
//        System.out.printf("m_val=%d%n", this.m_val);
//    }
//}



/*----------------------------------------------------------------------------------------------------------------------
    this referansı sabit kabul edilir. Yani this referansına atama yapılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample s = new Sample();
//
//        s.foo(10);
//
//        Sample k = new Sample();
//
//        k.foo(20);
//    }
//}
//
//class Sample {
//    private int m_val;
//
//    public void foo(int val)
//    {
//        this = new Sample(); //error
//        this.m_val = val;
//        System.out.printf("m_val=%d%n", this.m_val);
//        this.bar();
//    }
//
//    public void bar()
//    {
//        System.out.println("bar");
//    }
//}

/*----------------------------------------------------------------------------------------------------------------------
    static metotlara this geçirilmez. Yani static metotlar içerisinde this referansı kullanılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//
//    }
//}
//
//class Sample {
//    private static int ms_val;
//
//    public static void foo(int val)
//    {
//        this.ms_val = val; //error
//    }
//
//
//}

/*----------------------------------------------------------------------------------------------------------------------
    Biz programcı olarak veri elemanları için this referansını gerekmedikçe kullanmayacağız. Ancak metot çağrılarında
    okunabilirlik açısından (ifadeyi karmaşık hale getirmesi durumları hariç) kullanmayı tercih edeceğiz. Çünkü
    non-static bir metodu this ile çağırmak static metotların okunabiliğini artırır. Bu kurala uyarak yazılmış bir
    kod içerisinde this ile çağrılmamış bir metodun static olduğu kolayca anlaşılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Sample s = new Sample();
//
//        s.foo(10);
//    }
//}
//
//class Sample {
//    private int m_val;
//
//    public static void tar()
//    {
//        System.out.println("tar");
//    }
//
//    public void foo(int val)
//    {
//        m_val = val;
//        this.bar();
//        tar();
//    }
//
//    public void bar()
//    {
//        System.out.println("bar");
//    }
//}

/*----------------------------------------------------------------------------------------------------------------------
    Bazı programcılar sınıfların veri elemanlarının isimlendirmesinde önek ya da sonek kullanmazlar. Bilindiği gibi
    biz sınıfın private veri elemanlarını m_, static ise ms_ önekleri ile isimlendiriyoruz. Ancak sınıfın veri elemanları
    public ise biz de bir önek kullanmıyoruz. Böylesi bir durumda bir metodun parametresi ile veri elemanı aynı isimde
    yapıldığında artık veri elemanına doğrudan erişilemez. Bu şekilde tasarımda this referansı ile bu işlem
    yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Point sınıfı
----------------------------------------------------------------------------------------------------------------------*/

//public class Point {
//    public int x;
//    public int y;
//
//    Point(Point point)
//    {
//        x = point.x;
//        y = point.y;
//    }
//
//    public Point()
//    {
//    }
//
//    public Point(int x)
//    {
//        this.x = x;
//    }
//
//    public Point(int x, int y)
//    {
//        this.x = x;
//        this.y = y;
//    }
//
//    public double distance(Point p)
//    {
//        return this.distance(p.x, p.y);
//    }
//
//    public double distance(int a, int b)
//    {
//        return sqrt((x - a) * (x - a) + (y - b) * (y - b));
//    }
//
//    public void offset(int dxy)
//    {
//        this.offset(dxy, dxy);
//    }
//
//    public void offset(int dx, int dy)
//    {
//        x += dx;
//        y += dy;
//    }
//
//    public String toString()
//    {
//        return String.format("{x: %d, y: %d}", x, y);
//    }
//}
