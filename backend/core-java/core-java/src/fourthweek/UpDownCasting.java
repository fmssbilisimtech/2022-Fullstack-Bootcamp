package fourthweek;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class UpDownCasting { }

/*----------------------------------------------------------------------------------------------------------------------
	Aralarında türetme ilişkisi olmayan iki sınıf türünden referans birbirine tür dönüştürme operatörü kullanılarak
	bile atanamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new A();
//        B y;
//
//        y = (B)x;
//    }
//}
//
//
//class B {
//
//}
//
//class A {
//
//}







































/*----------------------------------------------------------------------------------------------------------------------
	Türemiş sınıf türünden bir referans taban sınıf türünden bir referansa doğrudan (implicit) atanabilir. Buna
	yukarıya doğru dönüşüm (upcasting) denir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B();
//        A y;
//
//        y = x; //upcasting
//    }
//}
//
//
//class B extends A {
//
//}
//
//class A {
//
//}























/*----------------------------------------------------------------------------------------------------------------------
	Yukarıya doğru dönüşümde taban sınıf referansına türemiş sınıf referansına ilişkin nesnenin taban sınıf bölümünün
	adresi atanır.
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B();
//        A y;
//
//        x.a = 20;
//        x.b = 30;
//
//        y = x;
//
//        System.out.printf("y.a=%d%n", y.a);
//        System.out.printf("x.a=%d%n", x.a);
//    }
//}
//
//
//class B extends A {
//    public int b;
//    //...
//}
//
//class A {
//    public int a;
//    //...
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte doWork metodu yalnızca A sınıfına bağımlı (dependency) olarak yazılmıştır. Bu metot A sınıfından
	doğrudan ya da dolaylı olarak türetilen her sınıf için çağrılabilmektedir. Yani doWork metodu derleme zamanında
	yalnızca A ismini bilmek zorundadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//        A x = new A();
//        B y = new B();
//        C z = new C();
//        D t = new D();
//
//        x.a = 10;
//        y.a = 34;
//        z.a = 12;
//        t.a = 78;
//
//        s.doWork(x);
//        s.doWork(y);
//        s.doWork(z);
//        s.doWork(t);
//    }
//}
//
//class Sample {
//    public void doWork(A x)
//    {
//        System.out.printf("a=%d%n", x.a);
//    }
//}
//
//class D extends A {
//    //..
//}
//
//class C extends B {
//    //..
//}
//
//class B extends A {
//    public int b;
//    //...
//}
//
//class A {
//    public int a;
//    //...
//}































/*----------------------------------------------------------------------------------------------------------------------
	Bir referansın iki tane türü vardır: statik, dinamik
	- statik türü (static type): Bir referansın static türü o referansın bildirildiği türdür. "Referansın türü" dendiğinde
	static tür anlaşılır. Derleme zamanına ilişkin bir bilgidir ve değişmez

	- dinamik tür (dynamic type): Bir referansın dinamik türü o referansın gösterdiği nesnenin bellekte yaratıldığı
	türdür (gerçek türüdür). Çalışma zamnına ilişkin bir bilgidir ve değişebilir

	Anahtar Notlar: Bir referansın dinamik türü String olarak aşağıdaki şekilde elde edilebilir:
		<referans>.getClass().getName();
	Buna göre x bir referans ise x referansının dinamik türü ekrana şu şekilde yazdırılabilir:
		System.out.println(x.getClass().getName());
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new A(); //x'in static  türü A, dinamik türü A
//        B y = new B(); //y'in static  türü B, dinamik türü B
//
//        System.out.println(x.getClass().getName());
//        System.out.println(y.getClass().getName());
//        x = y; //x'in static  türü A, dinamik B
//
//        System.out.println(x.getClass().getName());
//        System.out.println(y.getClass().getName());
//    }
//}
//
//class B extends A {
//
//}
//
//class A {
//
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte x'in dinamik türünün değişimi gösterilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//
//        x = val > 0 ? new A() : new B();
//
//        System.out.println(x.getClass().getName());
//    }
//}
//
//class B extends A {
//
//}
//
//class A {
//
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte x'in dinamik türünün değişimi gösterilmiştir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//
//        if (val > 0)
//            x = new C();
//        else if (val == 0)
//            x = new B();
//        else
//            x = new A();
//
//        System.out.println(x.getClass().getName());
//    }
//}
//
//class C extends A {
//
//}
//
//class B extends A {
//
//}
//
//class A {
//
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte z'nin dinamik türü C olmuştur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        C x = new C();
//        B y;
//        A z;
//
//        y = x;
//        System.out.println(y.getClass().getName());
//        z = y;
//        System.out.println(z.getClass().getName());
//    }
//}
//
//class C extends B {
//
//}
//
//class B extends A {
//
//}
//
//class A {
//
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Bir dizi referansının dinamik türü JNI (Java Native Interface) tür ismi olarak
	yazdırılır. Bu isim arakoddaki tür ismidir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = new int[4];
//        double [] b = new double[5];
//
//        System.out.println(a.getClass().getName());
//        System.out.println(b.getClass().getName());
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	Taban sınıf türünden bir referans türemiş sınıf türünden bir referansa doğrudan atanamaz. Bu işlem
	tür dönüştürme operatörü ile (explicit) atanabilir. Burada tür dönüştürme derlemeden geçmek içindir.
	Çalışma zamanı sırasında kaynak referansın dinamik türünün tür dönüştürme operatörüne yazılan türü
	kapsayıp kapsamadığına bakılır. Kapsıyorsa haklı dönüşümdür. Kapsamıyorsa haksız dönüşümdür ve
	exception oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//        B y;
//
//        x = val > 0 ? new A() : new B();
//
//        y = (B)x; //downcasting
//
//        System.out.println("Tekrar yapıyor musunuz?");
//
//        y.a = 10;
//        y.b = 30;
//    }
//}
//
//
//class B extends A {
//    public int b;
//}
//
//class A {
//    public int a;
//}







































/*----------------------------------------------------------------------------------------------------------------------
	downcasting işlemi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//        B y;
//
//        if (val > 0)
//            x = new C();
//        else if (val == 0)
//            x = new B();
//        else
//            x = new A();
//
//        System.out.println(x.getClass().getName());
//        y = (B)x; //downcasting
//        System.out.println(y.getClass().getName());
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class C extends B {
//    //...
//}
//
//class B extends A {
//    //...
//}
//
//class A {
//    //...
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Object sınıfı her sınıfın doğrudan ya da dolaylı olarak taban sınıfı olduğundan her türden referans
	Object referansına atanabilir. Aşağıdaki örnekte çeşitli türler için Object kullanarak upcasting
	yapılmış ve downcasting ile dinamik türlere ilişkin referanslara atama yapılmıştır. Şüphesiz downcasting
	işleminde dinamik tür bilinmeden yapılması durumu exception fırlatılmasına yol açabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Object os = "ankara";
//        Object or = new Random();
//        Object oia = new int[10];
//        Object od = new Date();
//
//        System.out.println(os.getClass().getName());
//        System.out.println(or.getClass().getName());
//        System.out.println(oia.getClass().getName());
//
//        String s = (String)os;
//        Random r = (Random)or;
//        int [] a = (int[])oia;
//        Date date = (Date)od;
//
//        System.out.println(s.toUpperCase());
//        System.out.println(r.nextInt());
//        System.out.println(a[0]);
//
//    }
//}



































