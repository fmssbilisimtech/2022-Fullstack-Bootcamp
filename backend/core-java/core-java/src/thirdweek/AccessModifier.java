package thirdweek;

public class AccessModifier { }

/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın elemanlarının erişim belirleyicileri:
	Sınıf elemanlarının (veri elemanları, metotlar, ctor'lar vb.) erişim belirleyicileri 4 tanedir:
	public, protected, no-modifier, private
	Erişim belirleyici anlamında sınıf dört bölüme ayrılmış gibi düşünülmelidir. Yani örneğin sınıfın public bir elemanı
	sınıfın içerisinde nerede bildirilirse bildirilsin public bölüme eklenmiş olur. Erişim belirleyiciler sınıf dışından
	erişim için anlamlıdır. Sınıfın dışı başka bir sınıfın içi demektir. Sınıfın içinde erişim belirleyici anlamında bir
	kısıt yoktur. Yani sınıfın içerisinde her bölüme erişilebilir.

	Anahtar Notlar: Sınıfın no-modifier elemanı (hiçbir erişim belirleyici yazılmaması) Java' da erişim anlamında
	diğerlerinden farklıdır. Bazı dillerde olduğu gibi no-modifier diğerlerinden biri anlamına gelmez (default).
	Bu durumun bir tek enum türünde ctor için istisnası
	vardır. İleride ele alınacaktır.

	Sınıfın protected ve no-modifier bölümlerinin anlamları sınıfların aynı pakette veya farklı pakette olmasına göre
	değişmektedir.

	Sınıfın private ve public bölümlerinin anlamları aynı pakette veya farklı pakette değişmemektedir
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın public bölüme sınıf dışından erişilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class A {
//    public int a;
//
//    public A()
//    {}
//
//    public void foo()
//    {}
//}
//
//class B {
//    public void bar()
//    {
//        A x = new A();
//
//        x.a = 20;
//        x.foo();
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın public bölüme sınıf dışından erişilebilir
----------------------------------------------------------------------------------------------------------------------*/

// class A {
//    public int a;
//
//    public A()
//    {}
//
//    public void foo()
//    {}
//}
//
//
//
// class B {
//    public void bar()
//    {
//        A x = new A();
//
//        x.a = 20;
//        x.foo();
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın private bölüme sınıf dışından erişilemez
----------------------------------------------------------------------------------------------------------------------*/

//class A {
//    private int a;
//
//    private A()
//    {}
//
//    private void foo()
//    {}
//}
//
//class B {
//    public void bar()
//    {
//        A x = new A(); //error
//
//        x.a = 20; //error
//        x.foo(); //error
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın no-modifier bölümü aynı paketteki diğer sınıflar için public anlamındadır (friendly, internal)
----------------------------------------------------------------------------------------------------------------------*/
//class A {
//    int a;
//
//    A()
//    {}
//
//    void foo()
//    {}
//}
//
//class B {
//    public void bar()
//    {
//        A x = new A();
//
//        x.a = 20;
//        x.foo();
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın protected bölümü aynı paketteki diğer sınıflar için public anlamındadır (friendly, internal)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        //...
//    }
//}
//
//class A {
//    protected int a;
//
//    protected A()
//    {}
//
//    protected void foo()
//    {}
//}
//
//class B {
//    public void bar()
//    {
//        A x = new A();
//
//        x.a = 20;
//        x.foo();
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
    Erişim Belirleyici          Kendisi         Aynı Paketteki sınıflar     Farklı paketteki sınıflar       Türemiş sınıflar
    public                         T                       T                           T                            T
    protected                      T                       T                           F                            T
    no-modifier                    T                       T                           F                            F
    private                        T                       F                           F                            F
----------------------------------------------------------------------------------------------------------------------*/
