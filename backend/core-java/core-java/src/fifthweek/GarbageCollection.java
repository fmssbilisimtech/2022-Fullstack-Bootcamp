package fifthweek;

public class GarbageCollection { }

/*----------------------------------------------------------------------------------------------------------------------
	Heap'de tahsis edilen nesnelere dinamik olarak tahsis edilen (dinamik ömürlü) nesneler denir. Bu nesnelerin
	yok edilmesi çöp toplayıcı (garbage collector) denilen ve arka planda çalışan bir program tarafından yapılır.
	Çöp toplayıcı artık kullanılmayan (garbage collected, eligible) yani çöp olan nesneleri yok eder. Burada 3(üç)
	tane temel soru sorulabilir:
	1. Programcı bir nesneyi yok edebilir mi? (HAYIR)
	2. Çöp olan (garbage collected) bir nesne çöp olur olmaz yok edilir mi, yani çöp toplayıcı program hemen devreye
	girer mi? (GİRMEYEBİLİR)
	3. Çöp toplayıcı yok edilmesi gereken bir nesneyi nasıl anlar?

	Java' da programcı bir nesneyi yok edemez. Yani tahsis edilmiş bir alanın geri bırakamaz (free, delete). Programcı
	kod akışı içerisinde bir nesneyi yok edilebilir (garbage collected) duruma getirebilir.

	Çöp toplayıcı programın ne zaman devreye gireceği standartlarda belirtilmemiştir. Bu çöp toplayıcı programla
	beraber JVM ve JRE yazanlara bırakılmıştır (implementation dependent.) Hemen devreye gireceği garanti değildir.
	Programcı bu bilinçle ve etkinliğine güvenerek kod yazar.

	Bir nesnenin yok edilebilir yani çöp durumuna gelmesi o nesneyi gösteren hiçbir referansın kalmaması kalmaması
	demektir. Yani nesnenin adresinin hiçbir referans tarafından tutulmuyor duruma gelmesidir. Bir nesnenin adresinin
	hangi referanslar tarafından tutulduğu ve özellikle kaç referans tarafından tutulduğunın takibi çeşitli algoritmalar
	kullanılarak yapılmaktadır. Bu algoritmanın ne olacağı da standtartlarda belirtilmemiştir (implementation dependent.)
	Biz burada referans sayma (reference counting) algoritması kullanılıyor varsayımıyla açıklama yapacağız. Referans
	sayacı yönteminde her yaratılan nesne için bir sayaç tutulur (bu sayaç genelde nesne içerisinde tutulur.). Bu yöntemde
	nesnenin adresi yeni bir referansa atandığından o nesne için sayaç 1(bir) artırılır. Nesne bir referanstan
	kopartıldığında sayaç 1(bir) azaltılır. Sayacı sıfır olam yani hiç bi referans tarafından gösterilmeyen bir nesne
	çöp durumuna gelmiş olur. Şüphesiz bir program sonlandığında tüm nesneler yok edilir.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte referans sayacı yönteminin çalışması gösterilmiştir
	rc: reference counter
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s;
//
//        s = new Sample(); //rc1:1
//
//        {
//            Sample k;
//
//            k = s; //rc1:2
//            Mample.foo(k);//rc1:3 -> rc1:4
//            //rc1:2
//        } //rc1:1
//
//        s = new Sample(); //rc1:0 (garbage collected), rc2:1
//
//        //...
//    }
//}
//
//class Mample {
//    public static void foo(Sample s)
//    {
//        Sample k;
//
//        //...
//
//        k = s;
//
//        //...
//    }
//}
//class Sample {
//    //...
//}

/*----------------------------------------------------------------------------------------------------------------------
	Programcı isterse çöp toplayıcı programın devreye girmesini sağlayabilir. Bunun için System sınıfının gc isimli metodu
	veya Runtime sınıfının gc isimli metodu çağrılabilir. Ancak bu çoğunlukla yapılmaması gereken bir durumdur. Programcı
	çöp toplayıcı programın devre girmesi konusundaki etkin çalışmaya güvenmelidir. Çünkü çöp toplayıcı programın
	gereksi yere arka planda çalışması da uygulamayı göreceli yavaşlatabilir
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        Sample s;
//
//        s = new Sample(); //rc1:1
//
//        {
//            Sample k;
//
//            k = s; //rc1:2
//            Mample.foo(k);//rc1:3 -> rc1:4
//            //rc1:2
//        } //rc1:1
//
//        s = new Sample(); //rc1:0 (garbage collected), rc2:1
//
//        System.gc(); // ~ Runtime.getRuntime().gc();
//        //...
//    }
//}
//
//class Mample {
//    public static void foo(Sample s)
//    {
//        Sample k;
//
//        //...
//
//        k = s;
//
//        //...
//    }
//}
//class Sample {
//    //...
//}
