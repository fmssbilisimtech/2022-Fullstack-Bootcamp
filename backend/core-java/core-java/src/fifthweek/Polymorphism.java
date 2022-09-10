package fifthweek;

import java.util.Scanner;

public class Polymorphism { }

/*----------------------------------------------------------------------------------------------------------------------
	Çok biçimlilik (polymorphism): Biyolojiden programlamaya aktarılmıştır. Biyolojide çok biçimlilik:
	"Farklı doku ya da organların evrim süreci içerisinde temel işlevleri aynı kalması koşuluyla, bu işlevi yerine
	getirme biçiminin değişmesidir"
	şeklinde tanımlanabilir. Örneğin duyma eylemi (davranışı) birbirlerinde türetilmiş canlılar arasında farklılık
	gösterebilir. Fakat görev "duymaktır"

	Nesne yönelimli programlama tekniğinde aşağıda anlatılan çpk biçimliliğe "çalışma zamanı çk biçimliliği (runtime polymorphism")"
	denir. Aslında çok biçimlilik çalışma zamanı ve derleme zamanı çok biçimliliği olarak iki gruba ayrılabilir.
	Biyoloji'den programlamaya aktarılan çok biçimlilik çalışma zamanı çok biçimliliğidir. Çoğu zaman çalışma zamanın
	çok biçimliliği yerine doğprudan "çok biçimlilik" denir.

	Çalışma zamanı çok biçimliliği için çok fazla tanım ya da açıklama yapılabilse de aşağıdaki 3(üç) tanım ile bu kavram
	anlatılabilir:
	1. Biyolojik tanım: Taban sınıfın bir fonksiyonunun türemiş sınıfta yeniden gerçekleştirilmesidir

	2. Yazılım mühendisliği tanım: Türden bapımsız kod yazmaktır. Yani bir kavramın çok sayıda türevi olsa da türevlerden
	bağımsız olarak sadece o kavram üzerinde kod yazmaktır.

	3. Aşağı seviyeli tanım: Önceden yazılmış kodların sonradan yazılmış kodları çağırabilmesidir.

	Java'da çok biçimlilik sanal metotlar (virtual method) kullanılarak gerçekleştirilir. Java' da non-static olan
	ve final olmayan her metot sanaldır. İleride bunun dışında da sanal olan metotlar antalıcaktır.

	Sanal bir metodun türemiş sınıfta geri dönüş değeri ve imzası aynı olacak şekilde yazılmasına "override" denir.
	override işleminde erişim belirleyicinin durumu ileride ele alınacaktır. Yani örneğin
	"public bir metodu override	edebilir miyim?" sorusunın detayları ayrıca cevaplanacaktır. Ancak public bir metot
	public olarak override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	non-static bir metot çağrısında metot sanal ise derleyici "çalışma zamanında referansın dinamik türüne bak, dinamik
	türe ilişkin sınıfta metot override edilmişse onu çağır" kodunu üretir
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        B x = new B();
//        A y;
//
//        y = x;
//
//        y.foo();
//    }
//}
//
//class B extends A {
//    public void foo() //override
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A {
//    public void foo()
//    {
//        System.out.println("A.foo");
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	non-static bir metot çağrısında metot sanal ise derleyici "çalışma zamanında referansın dinamik türüne bak, dinamik
	türe ilişkin sınıfta metot override edilmişse onu çağır" kodunu üretir.
	Aşağıdaki örnekte main metodunun içindeki müşteri kodu A sınıfından türetilenlerden bağımsız olarak yazılmıştır.
	Yani türden bağımsız yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Factory factory = new Factory();
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//
//        x = factory.getInstance(val);
//
//        x.foo(23);
//    }
//}
//
//
//class Factory {
//    //...
//    public A getInstance(int val)
//    {
//        return val % 2 == 0 ? new B() : new A();
//    }
//}
//
//class B extends A {
//    public void foo(int val) //override
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A {
//    public void foo(int val)
//    {
//        System.out.println("A.foo");
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örneğe C sınıfı eklenmesine rağmen main içerisinde kodlar bundan etkilenmemiştir (türden bağımsızlık)
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        Factory factory = new Factory();
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//
//        x = factory.getInstance(val);
//
//        x.foo(23);
//    }
//}
//
//
//class Factory {
//    //...
//    public A getInstance(int val)
//    {
//        A x;
//
//        if (val > 0)
//            x = new B();
//        else if (val == 0)
//            x = new C();
//        else
//            x = new A();
//
//        return x;
//    }
//}
//
//class C extends A {
//    public void foo(int val) //override
//    {
//        System.out.println("C.foo");
//    }
//}
//
//class B extends A {
//    public void foo(int val) //override
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A {
//    public void foo(int val)
//    {
//        System.out.println("A.foo");
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Sanal metot dinamik türe ilişkin sınıfta override edilmemişse sırasıyla taban sınıflar bakılır. İlk bulunan
	metot çağrılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Factory factory = new Factory();
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//
//        x = factory.getInstance(val);
//
//        x.foo(23);
//    }
//}
//
//
//class Factory {
//    //...
//    public A getInstance(int val)
//    {
//        A x;
//
//        if (val > 0)
//            x = new B();
//        else if (val == 0)
//            x = new C();
//        else
//            x = new A();
//
//        return x;
//    }
//}
//
//class C extends B {
//
//}
//
//class B extends A {
//    public void foo(int val) //override
//    {
//        System.out.println("B.foo");
//    }
//}
//
//class A {
//    public void foo(int val)
//    {
//        System.out.println("A.foo");
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Sanal metot dinamik türe ilişkin sınıfta override edilmemişse sırasıyla taban sınıflar bakılır. İlk bulunan
	metot çağrılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Factory factory = new Factory();
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//
//        x = factory.getInstance(val);
//
//        x.foo(23);
//    }
//}
//
//
//class Factory {
//    //...
//    public A getInstance(int val)
//    {
//        A x;
//
//        if (val > 0)
//            x = new B();
//        else if (val == 0)
//            x = new C();
//        else
//            x = new A();
//
//        return x;
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
//    public void foo(int val)
//    {
//        System.out.println("A.foo");
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Sanal metot dinamik türe ilişkin sınıfta override edilmemişse sırasıyla taban sınıflar bakılır. İlk bulunan
	metot çağrılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Factory factory = new Factory();
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//
//        x = factory.getInstance(val);
//
//        x.foo(23);
//    }
//}
//
//
//class Factory {
//    //...
//    public A getInstance(int val)
//    {
//        A x;
//
//        if (val > 0)
//            x = new B();
//        else if (val == 0)
//            x = new C();
//        else
//            x = new A();
//
//        return x;
//    }
//}
//
//class C extends B {
//    public void foo(int val)
//    {
//        System.out.println("C.foo");
//    }
//}
//
//class B extends A {
//
//}
//
//class A {
//    public void foo(int val)
//    {
//        System.out.println("A.foo");
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Bazen override edilen metot içerisinde taban sınıfının ilgili metodu da çağrılmak istenebilir. Bu durumda
	super referansı kullanılmalıdır. Bu işleme "augmatation" da denir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Factory factory = new Factory();
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//
//        x = factory.getInstance(val);
//
//        x.foo(23);
//    }
//}
//
//
//class Factory {
//    //...
//    public A getInstance(int val)
//    {
//        A x;
//
//        if (val > 0)
//            x = new B();
//        else if (val == 0)
//            x = new C();
//        else
//            x = new A();
//
//        return x;
//    }
//}
//
//class C extends B {
//    public void foo(int val)
//    {
//        System.out.println("C.foo");
//        super.foo(val); //augmetation
//    }
//}
//
//class B extends A {
//    public void foo(int val)
//    {
//        System.out.println("B.foo");
//        super.foo(val); //augmetation
//    }
//}
//
//class A {
//    public void foo(int val)
//    {
//        System.out.println("A.foo");
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örneğe D sınıfı eklenmesine rağmen yine müşteri kodları etkilenmemiştir. Ayrıca taban sınıfın
	ilgili metodunu çağırma kuralına D için de bu senaryoda uyulduğundan D için de program doğru çalışmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Factory factory = new Factory();
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        A x;
//
//        x = factory.getInstance(val);
//
//        x.foo(23);
//    }
//}
//
//
//class Factory {
//    //...
//    public A getInstance(int val)
//    {
//        A x;
//
//        if (val > 0)
//            x = new B();
//        else if (val == 0)
//            x = new C();
//        else
//            x = new D();
//
//        return x;
//    }
//}
//
//class D extends C {
//    public void foo(int a)
//    {
//        System.out.println("D.foo");
//        super.foo(a);
//    }
//}
//
//class C extends B {
//    public void foo(int val)
//    {
//        System.out.println("C.foo");
//        super.foo(val); //augmetation
//    }
//}
//
//class B extends A {
//    public void foo(int val)
//    {
//        System.out.println("B.foo");
//        super.foo(val); //augmetation
//    }
//}
//
//class A {
//    public void foo(int val)
//    {
//        System.out.println("A.foo");
//    }
//}
































