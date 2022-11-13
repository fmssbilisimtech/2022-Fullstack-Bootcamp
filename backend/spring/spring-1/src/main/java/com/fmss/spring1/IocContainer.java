package com.fmss.spring1;

public class IocContainer {
}
/*-------------------------------------------------------------------------------------------------------------------------------------------
   IOC CONTAINER

Inversion of Control’de, bir programın akışının programcıdan alınıp başka aktörlere devredilmesi amaçlanır.
Spring Framework bu aktörlerden birisidir. Böylece loose-coupling (gevşek bağlama) sağlanarak kodun esnekliği
ve modülerliği artar.


loose-coupling: Bir nesne yaratılırken yaratılan bu nesnenin sınıflara veya başka bileşenlere olan bağımlılığının
en aza indirgenmesidir.

Inversion of Control farklı yöntemlerle uygulanabilen genel bir konsepttir. Dependency Injection IoC
konseptinin sadece somut bir örneğidir.



-> i1





Bağımlılık Enjeksiyonu’nda temel yaklaşım, kod içinde yer alan bağımlı bileşenleri tespit ederek bağımsız
hale getirmek ve bağımlılıkları dışarıdan enjekte etmektir. Spring’de bu görevleri IoC container’lar üstlenir.
 Framework’ün çekirdeğinde (özünde) bulunan Spring container’lar nesnelerin oluşturulması, birbirlerine bağlanması,
 yapılandırılması ve oluşumundan yıkımına kadar ki yaşam döngülerinin yönetilmesi gibi görevlerde yer alır. Bahsi
 geçen bu nesnelere Spring Bean’ler denir. Bu nesneler herhangi bir POJO sınıf olabileceği gibi JavaBean sınıfı
 veya EJB gibi heavyweight Java nesneleri de olabilir. Spring bu tür sınıfları destekler. POJO sınıfları
 JavaBean’lere göre daha esnek sınıflardır.




Container’lar hangi nesnelerin başlatılacağını, yapılandırılacağını ve birleştirileceğini yapılandırma
 meta verilerini (metadata) okuyarak elde eder. Meta veriler XML, Java annotations veya Java koduyla
 temsil edilebilir. Günümüzde geliştiriciler ağırlıklı olarak Java tabanlı kodlamayla çalışmayı tercih
 ediyor ancak biz burada işin temelini ve mantığını öğrenmeye çalışıyoruz. Bir önceki bölümde XML tabanlı
 yapılandırmaya bir bakış batmıştık, ilerleyen bölümlerde diğer yöntemlerle birlikte daha detaylı işlenecektir.


Spring IoC container tamamen yapılandırılmış sistem veya uygulamalar üretmek için POJO (Plain Old Java Object)
sınıfları ve yapılandırma meta verilerini kullanır. Aşağıdaki diyagram, Spring container’ın iş akışını temsil etmektedir:



-> i2















İki tür IoC container vardır:

BeanFactory Container
ApplicationContext Container





BeanFactory Container

BeanFactory, Spring IoC container’ın kök (root) interface’idir. org.springframework.beans.factory
paketi altında tanımlıdır. Container’a erişmek için kullanılan BeanFactory interface ve alt-interface’ler
Spring Framework’ün dependency injection işlevselliğini kullanır. BeanFactory ve BeanFactoryAware, InitializingBean,
DisposableBean gibi ilgili diğer interface’ler Spring’le entegre olan pek çok third-party framework ile
geriye dönük uyumluluk amacıyla Spring Framework’de halen mevcuttur.



BeanFactory interface’inin temel işlevi lazy loading yapısıyla singleton
 bean’ler oluşturmak,yapılandırmak ve DI ile loose coupling sağlamaktır. En çok kullanılan BeanFactory uygulaması
 (implementation) XmlBeanFactory (deprecated) sınıfıdır.







lazy loading: Bean’lerin getBean() metodu ile tetiklendikten sonra container tarafından başlatıldığı bir yükleme mekanizmasıdır.
ApplicationContext’e göre ilkel bir yapıda olan BeanFactory bellek tüketimin kritik olduğu mobil cihazlarda veya applet
 tabanlı uygulamalarda tercih edilebilir. Spring Framework geliştiricilerinin şu meşhur sözünü de buraya bırakıp daha
 çok tercih edilen container’a geçeyim:

“Biz tum durumlarda ilk tercih olarak ApplicationContext kullancaz”

ApplicationContext Container
ApplicationContext, BeanFactory inteface’ini miras alan bu nedenle için de mirasçısının tüm işlevselliğini
barındıran gelişmiş bir container’dır. Bu container org.springframework.context.ApplicationContext
tarafından tanımlı bir interface’dir. Eager/Aggressive loading yapısıyla bean tanımlarının yüklenmesi,
bean’lerin birbirine bağlanması ve istek üzerine dağıtılması gibi özelliklerin yanı sıra daha kurumsal olan:

Transaction Yönetimi,
AOP (Aspect Oriented Programming) Hizmetleri,
Properties dosyasından mesaj işleme (internationalization ve localization - i18n),
Uygulama event’lerini ilgilenen listener’lara iletme gibi işlevleri gerçekleştirir. (Spring’de Event Handling)




eager/aggressive loading: Bean’lerin Spring container’ın başladığı anda örneklendiği bir yükleme mekanizmasıdır.


-> i3





En çok kullanılan ApplicationContext implementation’ları:

FileSystemXmlApplicationContext: Bu container bean tanımlarını XML dosyasından yükler.
 Constructor’a XML yapılandırma dosyasının tam yolu (full-path) verilmelidir.

ClassPathXmlApplicationContext: Bu container bean tanımlarını XML dosyasından yükler.
XML dosyasının projenin classpath’inde olması yeterlidir. Daha sonrasından yapılması
gereken tek şey dosya adını constructor’a geçmektir.


-> MainApp ve Beans.xml


İlk satırda yazılan ifade bir XML tanımlayıcısıdır ve genelde IDE ile oluşturduğumuzda dosya başına ekli gelir.
XML’de XSD (XML Schema Definition) yapısı ile belirli standartlar oluşturulabilir.
Bu standartlar, etiket (tag) içeriği veya etiket özelliği değeri için veri türünde kısıtlama şeklinde olabilir.
 Namespace (ad uzayı) ve prefix’ler (takma ad - önek) ile isim karışıklığı engellenebilir (name confliction).
XML’de prefix kullanırken, prefix için bir namespace tanımlanmalıdır.
xmlns:prefix=“URI” şeklinde bir sözdizimi vardır. Bu prefix alt elemanlarda da kullanıldığından başka bir
XML elemanları ile çalıştığımızda aynı isimde elemanların olması durumunda oluşabilecek isim karışıklığı,
 unique namespace’leri temsil eden bu prefix’ler aracılığıyla engellenir.
“xmlns” özelliği ile bir etiket (eleman) için default namespace tanımladığımızda,
 o etiket altındaki elemanlar için de prefix tanımlamamıza gerek kalmaz.
2. satırda kullanılarak <beans> etiketi altındaki elemanlar için default
 namespace oluşturulmuş oldu.
xmlns:xsi XSD’de kullanılan core namespace için prefix tanımlaması yapar:
 http://www.w3.org/2001/XMLSchema-instance (3. satır) Bu da bize XML doküman içinde
 kullanabileceğimiz çeşitli özellikler sağlar.
xsi:schemaLocation bu özelliklerden biridir: Spring, Java XML ayrıştırıcısını (parser)
 kullanarak schemaLocation değerini okur ve internetten .xsd dosyasını yükleyerek XML d
 osyasında kısıtlamalara uyulup uyulmadığını kontrol eder. Aralarında bir boşluk olacak
  şekilde namespace URI ve namespace’in xsd-schema dosyası için schema location link
  değerini alır. (4. satır)
xsi geleneksel bir önek’tir ve pratikte bunu yerine herhangi bir önek yazılabilir.



Spring uygulamamız belleğe yüklendiğinde, Framework tanımlı olan tüm bean’leri oluşturmak
için yukarıdaki yapılandırma dosyasını kullanır ve <bean> etiketinde olduğu gibi eşsiz ID
değerlerini atar. Tabii biz bu örnekte sadece bir tane bean oluşturduk ve ona “ helloSpring” ID
değerini atadık. <property> etiketini de HelloSpring sınıfının “message” değişkenine değer atamak
için kullandık.

Tüm bu işlemleri tamamladıktan sonra IDE üzerinde Run butonuna tıklayarak Spring uygulamasını başlatabiliriz.

Output:
Your Message : Hello Spring!







---------------------------------------------------------------------------------------------------------------------------------------------*/
