package fourthweek;

public class FinalInheritance { }

/*----------------------------------------------------------------------------------------------------------------------
	final anahtar sözcüğü ile bildirilen bir sınıftan türetme yapılamaz. Yani bu sınıf türetmeye kapatılmış olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class A extends Sample { //error
//    //...
//}
//
//final class Sample {
//    //...
//}




















/*----------------------------------------------------------------------------------------------------------------------
	final sınıflar başka bir sınıftan türetilmiş olabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//
//    }
//}
//
//class C extends B { //error
//    //...
//}
//
//final class B extends A {
//    //...
//}
//
//class A {
//
//}































/*----------------------------------------------------------------------------------------------------------------------
	final sınıf olmasaysı türetmeye kapatmak için aşağıdaki işlemlerin yapılması gerekirdi
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        A x = A.getInstance();
//
//        //...
//    }
//}
//
//class B extends A { //error
//
//}
//
//class A {
//    private A()
//    {}
//
//    public static A getInstance()
//    {
//        return new A();
//    }
//    //...
//}
