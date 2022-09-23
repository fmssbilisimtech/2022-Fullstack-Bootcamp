package sixthweek;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class CloseableExamples { }
/*----------------------------------------------------------------------------------------------------------------------
	Bazı durumlarda nesne içerisinde bir takım kaynaklar (resources) kullanılıyor olabilir. Bu kaynakların kullanılmaya
	başlanmasına mantıksal olarak "kaynağın açılması" dersek kaynak kullanımı bittikten sonra bu kaynağın
	artk mantıksal olarak "kapatılması" yani artık serbest bırakılması gerekebilir. Java' da nesneler garbage collector
	tarafından yok edildiğinden kullanılan kaynağı geri bırakmak için nesnenin ölmesi beklenmez. Çünkü örneğin
	bu kaynak iş bittikten sonra başka bir nesne tarafından tekrar kullanılmaya başlayabilir. Bu durumda eskiden kullanan
	nesne ölmezse yeni nesne bu kaynağın kullanımına başlayamayabilir. Burada kaynak olarak belirttiğimiz bir dosya,
	bir cihaz vb. olabilir. Böylesi bir durumda Closeable arayüzü kullanılır. Closeable arayüzü close metoduna sahiptir.
	Anlatılana benzer kaynağı kullanan sınıf Closeable arayüzünü destekler ve bu sınıfı kullanan programcı (client) kaynakla
	işi bittikten sonra close metodunu çağırır. Java'da Closeable arayüzünü destekleyen bir sınıfı gören programcı
	yukarıdaki anlatılanları bilir ve close metodunu çağırması gerektiğini anlar.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte finally bloğunda çağrılan close metodu try-catch içerisine alınarak checked exception fırlatmasından
	dolayı oluşan error engellenmiştir.	Ancak çoğu zaman (her zaman değil) close metodunun exception fırlatması
	durumu programın ilgileneceği birşey değildir. Yani açık olan bir kaynağın close yapılamaması durumunda çoğu zaman
	programcının yapabileceği birşey yoktur. Dolayısıyla aşağıdaki örnekte finally içerisinde try-catch kullanılması
	checked exception probleminden dolayı yapılmıştır. Yani aslında gereksiz bir kod yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Connection con  = null;
//
//        try {
//            con = new Connection("postgresql:jdbc://localhost:8080/devicesdb");
//            con.doWork();
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//        finally {
//            try {
//                if (con != null)
//                    con.close();
//            }
//            catch (Exception ex) {
//                //...
//            }
//        }
//    }
//}
//
//class Connection implements Closeable {
//    private final String m_url;
//
//    public Connection(String url)
//    {
//        //...
//        m_url = url;
//        System.out.printf("Connected to:%s%n", m_url);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on connection at '%s'%n", m_url);
//    }
//
//    public void close() throws IOException
//    {
//        System.out.println("Connection closed");
//    }
//
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problem aşağıdaki gibi daha az karmaşık ve biraz daha okunabilir olarak çözülebilir.
	Ayrıca bu yaklaşımda close metodu için exception işlenmesi de yapılabilir. Ancak üstteki örnekte close
	için yapılacak exception işlenmesi ayrıca yapılmak zorundadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Connection con  = null;
//
//        try {
//            try {
//                con = new Connection("postgresql:jdbc://localhost:8080/devicesdb");
//                con.doWork();
//            }
//            finally {
//                if (con != null)
//                    con.close();
//            }
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//
//class Connection implements Closeable {
//    private final String m_url;
//    public Connection(String url)
//    {
//        //...
//        m_url = url;
//        System.out.printf("Connected to:%s%n", m_url);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on connection at '%s'%n", m_url);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Connection closed");
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnek aşağıdaki gibi daha okunabilir hale getirilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Connection con  = null;
//
//        try {
//            ConnectionUtil.doWorkForConnection("postgresql:jdbc://localhost:8080/devicesdb");
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//
//class ConnectionUtil {
//    public static void doWorkForConnection(String url) throws IOException
//    {
//        Connection con = null;
//
//        try {
//            con = new Connection(url);
//            con.doWork();
//        }
//        finally {
//            if (con != null)
//                con.close();
//        }
//    }
//}
//
//class Connection implements Closeable {
//    private final String m_url;
//    public Connection(String url)
//    {
//        //...
//        m_url = url;
//        System.out.printf("Connected to:%s%n", m_url);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on connection at '%s'%n", m_url);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Connection closed");
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Java 7 ile birlikte eklenen try-with resources (twr) deyimi ile yukarıdaki problem çok daha etkin olarak çözülebilir.
	twr deyimi ile AutoCloseable arayüzünü destekleyen sınıflar kullanılabilir. twr yukarıdaki işlemin
	otomatik olarak yapılanı biçiminde düşünülebilir. Closeable arayüzü AutoCloseable arayüzünden türetilmiştir.
	Bu deyim ile close metodunun çağrılacağı da garanti altında olduğundan programcının çağırmayı unutması gibi
	bir durum da yaşanmaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try (Connection con = new Connection("postgresql:jdbc://localhost:8080/devicesdb")) {
//            con.doWork();
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//
//class Connection implements Closeable {
//    private final String m_url;
//
//    public Connection(String url)
//    {
//        //...
//        m_url = url;
//        System.out.printf("Connected to:%s%n", m_url);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on connection at '%s'%n", m_url);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Connection closed");
//    }
//}
//
///*----------------------------------------------------------------------------------------------------------------------
//	twr birden fazla sınıf ile de kullanılabilir. Bu durumda close yaratılma sırasının tersinde çağrılır
//----------------------------------------------------------------------------------------------------------------------*/
//package org.csystem.app;
//
//        import java.io.Closeable;
//        import java.io.IOException;
//
//class App {
//    public static void main(String [] args)
//    {
//        try (Connection con = new Connection("postgresql:jdbc://localhost:8080/devicesdb");
//             Image image = new Image("tatil.png")) {
//            con.doWork();
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//
//class Connection implements Closeable {
//    private final String m_url;
//    public Connection(String url)
//    {
//        //...
//        m_url = url;
//        System.out.printf("Connected to:%s%n", m_url);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on connection at '%s'%n", m_url);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Connection closed");
//    }
//}
//
//
//class Image implements Closeable {
//    private final String m_filename;
//
//    public Image(String filename)
//    {
//        //...
//        m_filename  = filename;
//        System.out.printf("%s image opened%n", m_filename);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on image '%s'%n", m_filename);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Image closed");
//    }
//
//}



























/*----------------------------------------------------------------------------------------------------------------------
	twr paranetezi içerisinde yaratılan nesnelere ilişkin referanslar final kabul edilir (effectively final)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try (Connection con = new Connection("postgresql:jdbc://localhost:8080/devicesdb");
//             Image image = new Image("tatil.png")) {
//            con = new Connection("test"); //error
//            con.doWork();
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//
//class Connection implements Closeable {
//    private final String m_url;
//    public Connection(String url)
//    {
//        //...
//        m_url = url;
//        System.out.printf("Connected to:%s%n", m_url);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on connection at '%s'%n", m_url);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Connection closed");
//    }
//
//}
//
//class Image implements Closeable {
//    private String m_filename;
//    public Image(String filename)
//    {
//        //...
//        m_filename  = filename;
//        System.out.printf("%s image opened%n", m_filename);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on image '%s'%n", m_filename);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Image closed");
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	Java 9 ile birlikte twr'den önce yaratılmış olan nesnelere ilişkin referanslar da twr parantezi içerisinde
	kullanılabilmektedir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Connection con = new Connection("postgresql:jdbc://localhost:8080/devicesdb");
//        Image image = new Image("tatil.png");
//
//        try (con; image) { //Since Java 9
//            con.doWork();
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//
//class Connection implements Closeable {
//    private final String m_url;
//
//    public Connection(String url)
//    {
//        //...
//        m_url = url;
//        System.out.printf("Connected to:%s%n", m_url);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on connection at '%s'%n", m_url);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Connection closed");
//    }
//}
//
//class Image implements Closeable {
//    private final String m_filename;
//    public Image(String filename)
//    {
//        //...
//        m_filename  = filename;
//        System.out.printf("%s image opened%n", m_filename);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on image '%s'%n", m_filename);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Image closed");
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	twr parantezi içerisinde kullanılan referanslar yine final etkisi gösterir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Connection con = new Connection("postgresql:jdbc://localhost:8080/devicesdb");
//        Image image = new Image("tatil.png");
//
//        try (con; image) { //error
//            con.doWork();
//            con = new Connection("test");
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//
//class Connection implements Closeable {
//    private final String m_url;
//    public Connection(String url)
//    {
//        //...
//        m_url = url;
//        System.out.printf("Connected to:%s%n", m_url);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on connection at '%s'%n", m_url);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Connection closed");
//    }
//}
//
//class Image implements Closeable {
//    private final String m_filename;
//    public Image(String filename)
//    {
//        //...
//        m_filename  = filename;
//        System.out.printf("%s image opened%n", m_filename);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on image '%s'%n", m_filename);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Image closed");
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	twr parantezi içerisinde kullanılan referanslar yine final etkisi gösterir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Connection con = new Connection("postgresql:jdbc://localhost:8080/devicesdb");
//        Image image = new Image("tatil.png");
//
//
//        try (con; image) { //error
//            con.doWork();
//
//        }
//        catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        con = new Connection("test");
//    }
//}
//
//class Connection implements Closeable {
//    private final String m_url;
//    public Connection(String url)
//    {
//        //...
//        m_url = url;
//        System.out.printf("Connected to:%s%n", m_url);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on connection at '%s'%n", m_url);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Connection closed");
//    }
//}
//
//class Image implements Closeable {
//    private final String m_filename;
//    public Image(String filename)
//    {
//        //...
//        m_filename  = filename;
//        System.out.printf("%s image opened%n", m_filename);
//    }
//
//    public void doWork()
//    {
//        //...
//        System.out.printf("Working on image '%s'%n", m_filename);
//    }
//    public void close() throws IOException
//    {
//        System.out.println("Image closed");
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	twr bloğu yalnız başına olabilir. Scanner sınıfı Closeable arayüzünü destekler
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        try (Scanner kb = new Scanner(System.in)) {
//            System.out.print("Bir sayı giriniz:");
//            int val = Integer.parseInt(kb.nextLine());
//
//            System.out.println(val * val);
//        }
//    }
//}
