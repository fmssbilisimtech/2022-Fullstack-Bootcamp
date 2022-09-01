package fourthweek;

public class ObjectClass { }

/*----------------------------------------------------------------------------------------------------------------------
	Java'da bir sınıf herhangi bir sınıftan extends anahtar sözcüğü ile türetilmese bile java.lang paketi içerisinde
	bulunan Object isimli bir sınıftan türetilmiş olur. Yani tüm sınıflar aslında doğrudan ya da dolaylı olarak
	Object sınıfından türetilmiştir. Başka bir deyişle Object sınıfı tüm sınıfların doğrudan ya da dolaylı olarak
	taban sınıfıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
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
	Object sınıfı istenirse extends anahtar sözcüğü ile de bildirimde yazılabilir. Şüphesiz bu sınıfın başka bir
	sınıftan türetilmemiş olması gerekir. Ancak Object sınıfı bu şekilde yazılmaz. Zaten Java programcısı bunu
	bilmektedir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class B extends A {
//
//}
//
//class A extends Object {
//
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Nitelikli ve niteliksiz genel isim arama kurallarına göre bir isim ilgili sınıfta bulunamazsa taban sınıflara da
	sırasıyla bulununcaya veya bulunamayıncaya kadar bakılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B b = new B();
//
//        b.bar(34);
//        System.out.printf("b.x=%d%n", b.x);
//    }
//}
//
//class B extends A {
//    public void bar(int a)
//    {
//        foo();
//        x = a;
//    }
//}
//
//class A {
//    public int x;
//    public void foo()
//    {
//        System.out.println("A.foo");
//    }
//}
































 /*----------------------------------------------------------------------------------------------------------------------
	Hatırlanacağı gibi sınıfın protected bölümü aynı paketteki diğer sınıflar için public'dir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class B {
//    public void bar()
//    {
//        A a = new A(/*...*/);
//
//        a.x = 20;
//
//        a.foo();
//    }
//}
//
//class A {
//    protected int x;
//    protected A(/*...*/)
//    {
//        //...
//    }
//
//    protected void foo()
//    {
//
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Türemiş sınıf içerisinde kendisine ait olan taban sınıf bölümünün protected elemanlarına erişilebilir. Yani türemiş
	sınıf nesnesinin taban sınıf nesnesine ilişkin protected bölüme erişim geçerlidir
----------------------------------------------------------------------------------------------------------------------*/

// class B extends A {
//    public B()
//    {
//
//    }
//
//    public void bar()
//    {
//        x = 10;
//        foo();
//    }
//}
//
//
//
// class A {
//    protected int x;
//    protected A(/*...*/)
//    {
//        //...
//    }
//
//    protected void foo()
//    {
//
//    }
//}































