package thirdweek;

public class OopRelations {
}



/*----------------------------------------------------------------------------------------------------------------------
	Sınıflararası ilişkiler: Sınıflararası ilişkiler aslında nesneler arasındaki ilişkisi temsil eder. Örneğin araba
	ile motoru arasında bir ilişki vardır. İnsan ile o kişiye ait olan kimliği arasında bir ilişki vardır. Örneklerde
	görüldüğü gibi aslında ilişkiler nesneler arasındadır. Ancak nesnelerin bu ilişkilerini belirtebilmek için
	sınıfların buna uygun yazılması gerekir.
	Nesne yönelimli programlama tekniği yapılacak bir projenin kodlama aşamasında önce sınıflar sonra da sınıflararası
	ilişkiler belirlenir ve kodlamaya geçilir. Sınıflar ve aralarındaki ilişkiler şüphesiz sınıfların/nesnelerin gerçek
	durumları düşünülerek belirlenir.

	Anahtar Notlar: Bir projenin müşteri ile görüşülmesinden müşteriye teslimine (deployment) geçe süreci çeşitli
	şemalarla anlatan UML (Unified Mpdeling Language) denilen bir araç bazı durumlarda kullanılmaktadır. Bu aracın
	en önemli şeması "sınıf şemaları (class diagrams)" dır. Bu şema tamamen kodlamaya yöneliktir. Sınıf şemalarının
	anlattığı özelliklerden biri de iki sınıf arasındaki ilişkidir.

	Anahtar Notlar: Bir kavram(lar) modellenirken o kavramın genel durumu düşünülür. İstisna niteliğinde olacak durumlar
	modelleme yapılırken göz önünde bulundurulmaz. Aksi taktirde hiç bir şey modellenemez. Örneğin arabayla motor arasındaki
	ilişki için şu kurallar söylenebilir:
		1. Araba nesnesine ait olan motor nesnesi başka bir araba tarafından kullanılamaz
		2. Araba nesnesine ait olan motor nesnesi ömrüne hemen hemen arabayla başlayacak ve araba ile ömrü son bulacak
	Burada örnmeğin ikinci koşul bazı durumlarda delinebilir. Ama bu ilişkinin genel durumunu değiştirmez.

	Bir sınıfın derlenebilmesi için başka bir sınıfın var olması gerektiği durumlara "bağımlılık (dependency)" denir

	İki sınıf arasında ya hiç bir ilişki yoktur ya da aşağıdakilerden birisi vardır:
	1. İçerme (composition) (has a): A ve B arasındaki "A has a B" ilişkisi için aşağıdaki koşulların ikisinin de
	sağlanması gerekir
		- A nesnesine ait B nesnesi ömrüne hemen hemen A nesnesi ile başlayacak ve hemen hemen A nesnesi ile ömrü sonlanacak
		- A nesnesine ait olan B nesnesi başka bir nesne tarafından kullanılamayacak
	Bu ilişkide A nesnesi B nesnesini istediği durumda (hemen her durumda) kullanabilmektedir. Buna bütünsel (whole)
	kullanım denir.

	2. Birleşme (aggregation) (holds a): A ve B arasındaki "A holds a B" ilişkisi composition kurallarının en az bir tanesinin
	gerçeklenmediği bütünsel kullanım ilişkisidir

	3. Çağrışım (association): A nesnesinin B nesnesini ihtiyacı olduğunda kullanması kullandıktan sonra saklamaması
	ilişkisidir. Yani bütünsel kullanım yoktur. Bu kullanıma parçalı (partial) kullanım da denir

	4. Kalıtım/Türetme (inheritance) (is a): Biyoloji'den programlamaya geçmiş bir kavramdır. Biyoloji'de kalıtım
	ebeveynin (parent) özelliklerinin çocuğuna (child) aktarılmasıdır.

	Anahtar Notlar: Bazı sınıflar implementasyonları gereği yukarıdaki ilişkilerin hiç birisine uygun olmayabilir. Ama
	ortada yine bir bağımlılık (dependency) söz konusudur. Bu da yine genel durumu bozmaz.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	A ile B arasındaki composition ilişkisinin genel biçimi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        A x = new A(/*...*/);
//
//        x.doWork1();
//        x.doWork2();
//    }
//}
//
//class A {
//    private B m_b;
//    //...
//
//    public A(/*...*/)
//    {
//        //...
//        m_b = new B(/*...*/);
//    }
//
//    public void doWork1()
//    {
//        //...
//        m_b.doSomething();
//    }
//
//    public void doWork2()
//    {
//        //...
//        m_b.doSomething();
//    }
//}
//
//
//class B {
//    //...
//    public void doSomething()
//    {
//        //...
//    }
//}








































/*----------------------------------------------------------------------------------------------------------------------
	Car, Plane ve Engine sınıfları arasındaki ilişkiler
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Car car = new Car(/*...*/);
//
//        car.run();
//
//        System.out.println("************************");
//
//        Plane plane = new Plane(3/*...*/);
//
//        plane.fly();
//    }
//}
//
//class Plane {
//    private Engine [] m_engines;
//
//    private void startEngines()
//    {
//        for (Engine engine : m_engines)
//            engine.startEngine();
//    }
//
//    private void accelerateEngines()
//    {
//        for (Engine engine : m_engines)
//            engine.accelerateEngine();
//    }
//
//    private void slowEngines()
//    {
//        for (Engine engine : m_engines)
//            engine.slowEngine();
//    }
//
//    private void stopEngines()
//    {
//        for (Engine engine : m_engines)
//            engine.stopEngine();
//    }
//
//    public Plane(int n/*...*/)
//    {
//        //...
//        m_engines = new Engine[n];
//        for (int i = 0; i < n; ++i)
//            m_engines[i] = new Engine(/*...*/);
//    }
//
//    public void fly()
//    {
//        startEngines();
//        accelerateEngines();
//        System.out.println("Plane fly");
//        slowEngines();
//        stopEngines();
//    }
//}
//
//class Car {
//    private Engine m_engine;
//
//    public Car(/*...*/)
//    {
//        //...
//        m_engine = new Engine(/*...*/);
//    }
//
//    public void brake()
//    {
//        m_engine.slowEngine();
//    }
//
//    public void run()
//    {
//        m_engine.startEngine();
//        m_engine.accelerateEngine();
//
//        System.out.println("Car run");
//        //...
//        brake();
//        m_engine.stopEngine();
//    }
//}
//
//class Engine {
//    //...
//    public void startEngine()
//    {
//        System.out.println("start engine");
//    }
//
//    public void accelerateEngine()
//    {
//        System.out.println("accelerate engine");
//    }
//
//    public void slowEngine()
//    {
//        System.out.println("slow engine");
//    }
//
//    public void stopEngine()
//    {
//        System.out.println("stop engine");
//    }
//    //...
//}
































/*----------------------------------------------------------------------------------------------------------------------
	A ile B arasındaki aggregation ilişkisinin genel biçimi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B(/*...*/);
//        A y = new A(x/*....*/);
//
//        y.doWork1();
//        y.doWork2();
//
//        B z = new B(/*...*/);
//
//        y.setB(z);
//        y.doWork1();
//        y.doWork2();
//    }
//}
//
//class A {
//    private B m_b;
//
//    public A(B b/*...*/)
//    {
//        //...
//        setB(b);
//    }
//
//    public void setB(B b)
//    {
//        //...
//        m_b = b;
//    }
//
//    public B getB()
//    {
//        return m_b;
//    }
//
//    public void doWork1()
//    {
//        //...
//        m_b.doSomething();
//    }
//
//    public void doWork2()
//    {
//        //...
//        m_b.doSomething();
//    }
//}
//
//class B {
//    //...
//    public void doSomething()
//    {
//        //...
//    }
//}










































/*----------------------------------------------------------------------------------------------------------------------
	Command ile Connection sınıfları arasındaki aggregation ilişkisi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        DatabaseApp.run();
//    }
//}
//
//class DatabaseApp {
//    private static final Connection CONNECTION = new Connection("postgresql:jdbc://192.168.2.123:5432/devicesappdb", "postgres", "csd1993");
//    private static final String SELECT_COMMAND = "select * from devices";
//    private static final String INSERT_COMMAND = "insert into devices (name, host, port) values (:name, :host, :port)";
//
//    public static void run()
//    {
//        Command selectCommand = new Command(CONNECTION, SELECT_COMMAND);
//        Command insertCommand = new Command(CONNECTION, INSERT_COMMAND);
//
//        selectCommand.executeQuery();
//        insertCommand.executeNonQuery();
//    }
//}
//
//class Command {
//    private Connection m_connection;
//    private String m_commandText;
//
//    public Command(Connection connection, String commandText)
//    {
//        //...
//        m_connection = connection;
//        m_commandText = commandText;
//    }
//
//    public void executeQuery()
//    {
//        System.out.println("executeQuery");
//        m_connection.connect();
//        //...
//        System.out.printf("Command:%s%n", m_commandText);
//    }
//
//    public void executeNonQuery()
//    {
//        System.out.println("executeNonQuery");
//        m_connection.connect();
//        //...
//        System.out.printf("Command:%s%n", m_commandText);
//    }
//}
//
//class Connection {
//    private String m_url;
//    private String m_username;
//    private String m_password;
//
//    public Connection(String url, String username, String password)
//    {
//        //...
//        m_url = url;
//        m_username = username;
//        m_password = password;
//    }
//
//    public String getUrl()
//    {
//        return m_url;
//    }
//
//    public String getUsername()
//    {
//        return m_username;
//    }
//
//    public String getPassword()
//    {
//        return m_password;
//    }
//
//    //...
//
//    public void connect()
//    {
//        System.out.printf("URL:%s%n", m_url);
//        System.out.printf("Username:%s%n", m_username);
//        System.out.printf("Password:%s%n", m_password);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	A ile B arasındaki association ilişkisinin genel biçimi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        B x = new B(/*...*/);
//        A y = new A(/*...*/);
//        B z = new B(/*...*/);
//
//        y.doWork(x);
//
//        //...
//
//        y.doWork(z);
//    }
//}
//
//class A {
//    //...
//    public void doWork(B b)
//    {
//        //...
//        b.doSomething();
//    }
//}
//
//class B {
//    public void doSomething()
//    {
//        //...
//    }
//}








































/*----------------------------------------------------------------------------------------------------------------------
	Taxi, Driver ve Client sınıfları arasındaki ilişkiler
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Driver driver = new Driver(/*...*/);
//        Taxi taxi = new Taxi(driver/*...*/);
//        Client client1 = new Client(/*...*/);
//
//        taxi.take(client1);
//
//        //....
//
//        Client client2 = new Client(/*...*/);
//
//        taxi.take(client2);
//    }
//}
//
//class Taxi {
//    private Driver m_driver;
//
//    public Taxi(Driver driver/*...*/)
//    {
//        //...
//        m_driver = driver;
//    }
//
//    //...
//
//    public void take(Client client)
//    {
//        //...
//    }
//}
//
//class Driver {
//    //...
//}
//
//class Client {
//    //...
//}





























/*----------------------------------------------------------------------------------------------------------------------
	String sınıfı immutable olduğundan aşağıadaki ilişki ne aggregation ne de composition'dır. Ancak composition ilişkisine
	daha yakındır denebilir. Ancak gerçek olarak özel bir durumdur ve herhangi isim de verilemeyebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String name = "Taner";
//        int no = 1;
//
//        Person person = new Person(no, name);
//
//        System.out.println(person.getName());
//        System.out.println(name);
//
//        name = name.toUpperCase();
//
//        System.out.println(person.getName());
//        System.out.println(name);
//
//    }
//}
//
//class Person {
//    private int m_no;
//    private String m_name;
//
//    public Person(int no, String name)
//    {
//        //...
//        m_no = no;
//        m_name = name;
//    }
//
//    public int getNo()
//    {
//        return m_no;
//    }
//
//
//    public void setNo(int no)
//    {
//        //...
//        m_no = no;
//    }
//
//    public String getName()
//    {
//        return m_name;
//    }
//
//    public void setName(String name)
//    {
//        //...
//        m_name = name;
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
    Aggregation vs Composition
        1. Dependency: Aggregation implies a relationship where the child can exist independently of the parent.
        For example, Bank and Employee, delete the Bank and the Employee still exist.
        whereas Composition implies a relationship where the child cannot exist independent of the parent.
         Example: Human and heart, heart don’t exist separate to a Human

        2. Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.

        3. Type of association: Composition is a strong Association whereas Aggregation is a weak Association.



----------------------------------------------------------------------------------------------------------------------*/



