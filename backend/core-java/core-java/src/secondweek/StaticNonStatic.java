package secondweek;

public class StaticNonStatic { }

/*----------------------------------------------------------------------------------------------------------------------
	 Sınıfın static bir veri elemanı bir tanedir. Bu elemanın kullanılabilmesi için nesne yaratılmış olması gerekmez.
	 Sınıfın static veri elemanına sınıf dışından sınıf ismi ve nokta operatörü ile erişilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.a = 10;
//        Sample.b = true;
//
//        System.out.printf("Sample.a=%d%n", Sample.a);
//        System.out.printf("Sample.b=%b%n", Sample.b);
//    }
//}
//
//class Sample {
//    public static int a;
//    public static boolean b;
//    //...
//}


































/*----------------------------------------------------------------------------------------------------------------------
	 Sınıfın static veri elemanlarının hepsi sınıfın bir elemanı ilk kez kez kullanıldığında yaratılır ve programın
	 sonuna kadar yaşarlar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo();
//    }
//}
//
//class Sample {
//    public static int a;
//    public static boolean b;
//
//    public static void foo()
//    {
//
//    }
//    //...
//}

































/*----------------------------------------------------------------------------------------------------------------------
	 Sınıfın static veri elemanlarına da default değerler atanır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        System.out.printf("Sample.a=%d%n", Sample.a);
//        System.out.printf("Sample.b=%b%n", Sample.b);
//    }
//}
//
//class Sample {
//    public static int a;
//    public static boolean b;
//
//    //...
//}








































/*----------------------------------------------------------------------------------------------------------------------
	 static veri elemanlarının bir kullanımı
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        for (int i = 0; i < 10; ++i) {
//            Alien alien = new Alien();
//            //...
//        }
//
//        for (int i = 0; i < 20; ++i) {
//            Soldier soldier = new Soldier();
//
//            //...
//        }
//
//        System.out.printf("Number of Aliens:%d%n", Alien.count);
//        System.out.printf("Number of Soldiers:%d%n", Soldier.count);
//    }
//}
//
//class Alien {
//    public static int count;
//    public int color;
//    public int numberOfArms;
//    public int numberOfGuns;
//    //...
//
//    public Alien()
//    {
//        ++count;
//    }
//}
//
//class Soldier {
//    public static int count;
//    public int title;
//    public int gunType;
//    //...
//
//    public Soldier()
//    {
//        ++count;
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------

	 Sınıfın non-static bir elemanına sınıf dışından sınıf ismi ile erişilemez. Çünkü non-static veri elemanı
	 her nesne için ayrıca yaratılır. Nesne bilinmeden elemana erişilemez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.x = 10; //error
//    }
//}
//
//class Sample {
//    public int x;
//}





































/*----------------------------------------------------------------------------------------------------------------------
	 Sınıfın static bir elemanına sınıf dışından referans ile de erişilebilir. Sınıf ismi ile erişmekten
	 bir farkı yoktur. Bu şekilde kodlar okunabilirlik açısından yazılmamalıdır
----------------------------------------------------------------------------------------------------------------------*/

class App {
    public static void main(String [] args)
    {
        Sample s = new Sample();

        s.x = 10;

        System.out.printf("Sample.x:%d%n", Sample.x);
    }
}

class Sample {
    public static int x;
    //...
}



































/*----------------------------------------------------------------------------------------------------------------------
	 Sınıfın non-static bir metodu sınıf dışından referans ve noka operatörü ile çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
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
	 Sınıfın static bir metodu referans ve nokta operatörü ile de çağrılabilir. static veri elemanlarında olduğu
	 gibi herhangi bir etkisi yoktur. Bu şekilde çağrı okunabilirlik açısından yapılmamalıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//
//        s.foo();
//    }
//}
//
//class Sample {
//    public static void foo()
//    {
//
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın non-static bir metodu içerisinde aynı sınıfın non-static bir veri elemanına doğrudan erişilebilir.
	Doğrudan erişilen veri elemanı metodu çağıran referansın gösterdiği nesnenin veri elemanıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//        Sample k = new Sample();
//
//        s.foo(10);
//        k.foo(20);
//
//        System.out.printf("s.x=%d%n", s.x);
//        System.out.printf("k.x=%d%n", k.x);
//    }
//}
//
//class Sample {
//    public int x;
//
//    public void foo(int a)
//    {
//        x = a;
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın non-static bir metodu içerisinde sınıfın static bir metodu doğrudan çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//
//        s.foo(10);
//
//        System.out.printf("Sample.x=%d%n", Sample.x);
//
//    }
//}
//
//class Sample {
//    public static int x;
//
//    public static void bar(int a)
//    {
//        x = a;
//    }
//
//    public void foo(int a)
//    {
//        bar(a);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın static bir metodu içerisinde sınıfın non-static bir veri elemanına doğrudan erişilemez.
	Çünkü static metotların referans ile çağrılmasının bir anlamı olmadığı non-static veri elemanının kime
	ait olduğu bilinemez. Dolayısıyla error oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//
//    }
//}
//
//class Sample {
//    public int x;
//
//
//    public static void foo(int a)
//    {
//        x = a; //error
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın static bir metodu içerisinde sınıfın non-static bir metodu doğrudan çağrılamaz.
	Çünkü çağrılmaya çalışılan non-static metot bir non-veri elemanına erişiyor olabilir. Bu durumda veri elemanının
	hangi nesneye olduğu bilinemez. Dolayısıyla error oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//
//    }
//}
//
//class Sample {
//    public int x;
//
//    public void bar(int a)
//    {
//        x = a;
//    }
//
//    public static void foo(int a)
//    {
//        bar(a); //error
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki iki maddenin özeti olarak, sınıfın static bir metodu içerisinde sınıfın non-static elemanlarına
	doğrudan erişilemez
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın static bir metodu içerisinde sınıfın static bir elemanına doğrudan erişilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample.foo(10);
//
//        System.out.printf("Sample.x=%d%n", Sample.x);
//    }
//}
//
//class Sample {
//    public static int x;
//
//    public static void foo(int a)
//    {
//        x = a;
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte doğrudan erişim yapılmamıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = Sample.foo(10);
//
//        System.out.printf("s.x=%d%n", s.a);
//    }
//}
//
//class Sample {
//    public int a;
//
//    public static Sample foo(int a)
//    {
//        Sample x = new Sample();
//
//        x.a = a;
//
//        return x;
//    }
//}

































