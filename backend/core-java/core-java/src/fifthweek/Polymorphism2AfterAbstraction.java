package fifthweek;

public class Polymorphism2AfterAbstraction { }

/*----------------------------------------------------------------------------------------------------------------------
    abstract sınıflar final olarak bildirilemez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//abstract final class A { //error
//
//}





















/*----------------------------------------------------------------------------------------------------------------------
    Şüphesiz bir sınıf başka bir sınıftan türetilip abstract olmıyacaksa final bildirilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//
//final class B extends A {
//    //...
//}
//
//abstract class A {
//    //...
//}



























/*----------------------------------------------------------------------------------------------------------------------
    override işleminde erişim belirleyici erişim anlamında yükseltilebilir ancak düşürülemez. Bu durumda public bir
    sanal metot public olarak override edilmek zorundadır
----------------------------------------------------------------------------------------------------------------------*/































/*----------------------------------------------------------------------------------------------------------------------
    override işleminde erişim belirleyici erişim anlamnında yükseltilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class B extends A {
//    public void foo()
//    {
//
//    }
//}
//
//abstract class A {
//    protected abstract void foo();
//}

































/*----------------------------------------------------------------------------------------------------------------------
    override işleminde erişim belirleyici erişim anlamnında yükseltilebilir. Ancak bu durumda aşağıdaki gibi
    sınıfların da paket anlamında uygun yerlerinde olması gerekir. Erişim belirleyicilerinin anlamlarını hatırlayınız
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new B();
//
//        x.foo();
//    }
//}
//
//
//
// class B extends A {
//    public void foo()
//    {
//        System.out.println("B.foo");
//    }
//}
//
//
//
// class B extends A {
//    public void foo()
//    {
//        System.out.println("B.foo");
//    }
//}
//
//
// abstract class A {
//    public abstract void foo();
//}


































/*----------------------------------------------------------------------------------------------------------------------
    final olarak bildirilmiş bir metot sanal değildir. Override edilemez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class B extends A {
//    public void foo() //error
//    {
//
//    }
//}
//
//class A {
//    public final void foo()
//    {
//
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
    final olarak bildirilmiş bir metot sanal değildir. Override edilemez. Aşağıdaki örnekte B sınıfı foo metodunu
    override etmiştir. B foo'nun sanallığını kaldırdığında C sınıfında foo override edilemez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class C extends B {
//    public void foo() //error
//    {}
//}
//
//class B extends A {
//    public final void foo()
//    {
//    }
//}
//
//abstract class A {
//    public abstract void foo();
//
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Java' da static bir metot türemiş sınıfta aynı geri dönüş değeri ve aynı imza ile ve erişim belirleyiciyi
    düşürmemek şartıyla yazılabilir. Bu durumda metot hangi sınıf ismi ile çağrılıyorsa o sınıfın metodu çağrılır.
    Bu durum her ne kadar override işlemini andırsa da "override" dendiğinde non-static bir metot anlaşılır. static
    metotlar için bu işleme bazı kaynaklar "static override" derler. Ancak unutulmamalıdır ki "override" non-static
    metotlar ve polymorphism için anlamlıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A.foo();
//        B.foo();
//        B.foo();
//        B b = new B();
//        B.a= 13;
//        b.
//    }
//}
//
//class B extends A {
//    public static int b = 22;
//    public static void foo()
//    {
//
//        System.out.println("B.foo");
//    }
//}
//
//class A {
//    public static int a =10;
//
//    public static    void foo()
//    {
//        System.out.println("A.foo");
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte B sınıfının foo metodu içerisinde A sınıfının foo metodu çağrılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A.foo();
//        B.foo();
//    }
//}
//
//class B extends A {
//    public static void foo()
//    {
//        System.out.println("B.foo");
//        A.foo();
//    }
//}
//
//class A {
//    public static void foo()
//    {
//        System.out.println("A.foo");
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte x A türünden olduğundan ve foo' da static olduğundan A'nın foo metodu çağrılır.
    static bir metodun referans ile çağrılmasının sınıf ismi ile çağrılmasından farkı olmadığını hatırlayınız
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new B();
//
//        x.foo();
//    }
//}
//
//class B extends A {
//    public static void foo()
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A {
//    public static void foo()
//    {
//        System.out.println("A.foo");
//    }
//}
