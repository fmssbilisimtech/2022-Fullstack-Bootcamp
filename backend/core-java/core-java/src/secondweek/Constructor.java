package secondweek;

public class Constructor { }



/*----------------------------------------------------------------------------------------------------------------------
	 Java'da nesnenin yaratılma aşamaları:
	 1. Bellekte yer ayrılır
	 2. non-static veri elemanlarına default değerler atanır
	 3. constructor (ctor) çağrılır

	 Bu üç aşamanın sonunda new operatörünün ürettiği değer yani referans elde edilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	ctor aşağıdaki özelliklere sahip bir metottur:
	- Sınıfı yazan programcı sınıfa hiç bir ctor yazmasa bile sınıfın parametresiz ctor'u (default ctor)
	derleyici tarafından içi boş ve public olarak yazılır

	- Sınıfı yazan programcı sınıfa en az bir tane bile ctor yazsa default ctor derleyici tarafından yazılmaz.
	Programcının yazdığı ctor default ctor değilse default ctor sınıfta bulunmaz

	- Sınıfın ctor'u sınıf ismi ile aynı olan ve geri dönüş değeri kavramı olmayan bir metottur. Geri dönüş bilgisi
	hiç birşey yazılmaz. void da yazılmaz. void yazıldığında error oluşmaz. Ancak bu ctor anlamına gelmez.
	Yapılmamalıdır

	- ctor overload edilebilir (constructor overloading)

	- ctor non-static bir metottur

	- ctor new operatörü ile nesne yaratılması aşamasında çağrılır. Hangi ctor'un çağrılacağı derleme zamanında
	overload resolution kuralları ile aynı şekilde belirlenir

	- ctor'dan önce veri elemanlarına default değerler atanmış olur

	- ctor içerisinde return deyimi tek başına olmak üzere istenirse ctor'u sonlandırmak için kullanılabilir

	- Programcı ctor çağıramaz. Programcı new operatörü ile, ilgili ctor'un ÇAĞRILACAĞI kodu yazar
----------------------------------------------------------------------------------------------------------------------*/


/*----------------------------------------------------------------------------------------------------------------------
	ctor'un çağrılması
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s1 = new Sample();
//        Sample s2 = new Sample(10);
//        Sample s3 = new Sample(10, 3.4);
//        Sample s4 = new Sample(10, 10L);
//
//        //...
//    }
//}
//
//class Sample {
//    public Sample()
//    {
//        System.out.println("Sample.Sample()");
//    }
//
//    public Sample(int a)
//    {
//        System.out.println("Sample.Sample(int)");
//    }
//
//    public Sample(int a, double b)
//    {
//        System.out.println("Sample.Sample(int, double)");
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
	ctor non-static bir metottur. Aşağıdaki örnekte doğrudan erişilen x bu ctor ile yaratılan nesnenin x'i olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(10);
//
//        System.out.println(s.x);
//    }
//}
//
//class Sample {
//    public int x;
//
//    public Sample(int a)
//    {
//        x = a;
//        System.out.println("Sample.Sample(int)");
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	ctor öncesinde default değerler atanmış olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(10);
//
//        System.out.println(s.x);
//        System.out.println(s.y);
//    }
//}
//
//class Sample {
//    public int x;
//    public boolean y;
//
//    public Sample(int a)
//    {
//        System.out.printf("x=%d%n", x);
//        System.out.printf("y=%b%n", y);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	ctor içerisinde return kullanımı
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(-10);
//
//        System.out.println(s.x);
//
//    }
//}
//
//class Sample {
//    public int x;
//
//    public Sample(int a)
//    {
//        if (a > 0)
//            return;
//
//        x = -a;
//    }
//}

















































/*----------------------------------------------------------------------------------------------------------------------
	ctor içerisinde veri elemanlarına değer atanması tipik yapılan durumlardandır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(-10, true);
//
//        System.out.println(s.x);
//        System.out.println(s.y);
//
//        Sample k = new Sample(-34);
//
//        System.out.println(k.x);
//        System.out.println(k.y);
//    }
//}
//
//class Sample {
//    public int x;
//    public boolean y;
//
//    public Sample(int a)
//    {
//        x = a;
//    }
//
//    public Sample(int a, boolean b)
//    {
//        x = Math.abs(a);
//        y = b;
//    }
//}
















































/*----------------------------------------------------------------------------------------------------------------------
	Point sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Point p1 = new Point();
//
//        p1.display();
//
//        Point p2 = new Point(100, 34);
//
//        p2.display();
//
//        Point p3 = new Point(100);
//
//        p3.display();
//    }
//}
//
//class Point {
//    public int x;
//    public int y;
//
//    public Point()
//    {
//    }
//
//    public Point(int a)
//    {
//        x = a;
//    }
//
//    public Point(int a, int b)
//    {
//        x = a;
//        y = b;
//    }
//
//    public double distance(Point p)
//    {
//        return distance(p.x, p.y);
//    }
//
//    public double distance(int a, int b)
//    {
//        return Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
//    }
//
//    public void offset(int dxy)
//    {
//        offset(dxy, dxy);
//    }
//
//    public void offset(int dx, int dy)
//    {
//        x += dx;
//        y += dy;
//    }
//
//    public void display()
//    {
//        System.out.printf("{x = %d, y = %d}%n", x, y);
//    }
//}















































