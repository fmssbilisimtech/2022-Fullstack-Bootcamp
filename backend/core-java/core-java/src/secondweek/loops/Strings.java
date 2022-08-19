package secondweek.loops;

public class Strings { }


/*----------------------------------------------------------------------------------------------------------------------
	Derleyici String atomu gördüğünde şöyle bir kod üretir: "Çalışma zamanı sırasında String türden bir nesne yarat
	bu karakteleri o nesneye aktar ve o nesnenin referansını ver"

	print ve println metotlarının String parametreli versiyonları (overload) aldıkları String referansına ilişkin
	yazıyı ekrana basarlar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s;
//
//        s = "ankara";
//
//        System.out.println(s);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda s format karakteri ile bir String referansına ilişkin yazı ekrana basılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s;
//
//        s = "ankara";
//
//        System.out.printf("Yazı:%s%n", s);
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------
	immutable sınıf: Bir nesnenin bilgileri bir kez verilip bir daha değiştirilemiyor ise o nesneye ilişkin sınıfa
	immutable sınıf denir

	String sınıfı immutable bir sınıftır. Yani bir String nesnesine ilişkin yazı üzerinde değişiklik yapılamaz.
	Yazı üzerinde değişiklik yapan metotlar (örneğin yazının tamamını büyük harfe çeviren metot) tamamı büyütülmüş
	harflerden oluşan yeni bir String nesnesinin referansını döndürür
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının toUpperCase metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir yazı giriniz:");
//        String s = kb.nextLine();
//        String upper = s.toUpperCase();
//
//        System.out.println(s);
//        System.out.println(upper);
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının toLowerCase metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir yazı giriniz:");
//        String s = kb.nextLine();
//        String upper = s.toLowerCase();
//
//        System.out.println(s);
//        System.out.println(upper);
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının length isimli metodu ile yazının karakter sayısı elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir yazı giriniz:");
//        String s = kb.nextLine();
//
//        System.out.printf("Girilen Yazı:%s%n", s);
//        System.out.printf("Girilen Yazının Uzunluğu:%d%n", s.length());
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının charAt isimli metodu ile herhangi bir indeksteki karakter elde edilebilir. Indeks numarası
	sıfırdan başlar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir yazı giriniz:");
//        String s = kb.nextLine();
//
//        int length = s.length();
//
//        for (int i = 0; i < length; ++i)
//            System.out.println(s.charAt(i));
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	İki tane iki tırnağın bitişik olarak yazılması ile yaratılan String'e boş string (empty string) denir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s = ""; //boş string
//
//        System.out.printf("Length:%d%n", s.length());
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	Aynı türden iki referansın == veya != operatörü ile karşılaştırılması adres karşılaştırmasıdır. Yani == operatörü
	iki referansı karşılaştırma durumunda iki referans da aynı nesneyi gösteriyorsa true değer üretilir. Benzer
	şekilde !=	operatörü ile iki referansı karşılatırma durumunda iki referans farklı nesneleri gösteriyor ise
	true değer üretilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(10);
//        Sample k = s; //new Sample(10);
//
//        if (s == k)
//            System.out.println("Aynı nesne");
//        else
//            System.out.println("Farklı nesneler");
//    }
//}
//
//
//class Sample {
//    public int x;
//
//    public Sample(int a)
//    {
//        x = a;
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Yazıların eşitlik karşılaştırması == ve != operatörleri ile yapılamaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci yazıyı giriniz:");
//        String s1 = kb.nextLine();
//
//        System.out.print("İkinci yazıyı giriniz:");
//        String s2 = kb.nextLine();
//
//        if (s1 == s2)
//            System.out.println("Aynı yazı");
//        else
//            System.out.println("Farklı yazılar");
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
	Yazıların eşitlik karşılaştırması equals metodu ile yapılabilir. equals metodu büyük küçük harf duyarlı
	karşılaştırma yapar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci yazıyı giriniz:");
//        String s1 = kb.nextLine();
//
//        System.out.print("İkinci yazıyı giriniz:");
//        String s2 = kb.nextLine();
//
//        if (s1.equals(s2))
//            System.out.println("Aynı yazı");
//        else
//            System.out.println("Farklı yazılar");
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının equalsIgnoreCase isimli metodu büyük-küçük harf duyarsız eşitlik karşılaştırması yapar
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci yazıyı giriniz:");
//        String s1 = kb.nextLine();
//
//        System.out.print("İkinci yazıyı giriniz:");
//        String s2 = kb.nextLine();
//
//        if (s1.equalsIgnoreCase(s2))
//            System.out.println("Aynı yazı");
//        else
//            System.out.println("Farklı yazılar");
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının indexOf metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String str = "Bugün hava çok rüzgarlı, çok dikkat etmek gerekir";
//        char ch = 'ç';
//
//        int index = str.indexOf(ch);
//
//        System.out.printf("Index:%d%n", index);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının indexOf metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String str = "Bugün hava çok rüzgarlı, çok dikkat etmek gerekir";
//        char ch = 'ğ';
//
//        int index = str.indexOf(ch);
//
//        System.out.printf("Index:%d%n", index);
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının fromIndex parametreli indexOf metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String str = "Bugün hava çok rüzgarlı, çok dikkat etmek gerekir";
//        char ch = 'ç';
//
//        int index = str.indexOf(ch, 12);
//
//        System.out.printf("Index:%d%n", index);
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının indexOf metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String str = "Bugün hava çok rüzgarlı, çok dikkat etmek gerekir";
//        String s = "çok";
//
//        int index = str.indexOf(s, 12);
//
//        System.out.printf("Index:%d%n", index);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının lastIndexOf metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String str = "Bugün hava çok rüzgarlı, çok dikkat etmek gerekir";
//        String s = "çok";
//
//        int index = str.lastIndexOf(s);
//
//        System.out.printf("Index:%d%n", index);
//    }
//}







































/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı iki yazıdan birincisi içerisinde ikincisinden kaç tane olduğunu
	döndüren countString isimli metodu StringUtil sınıfı içerisinde yazınız ve test ediniz
	Örnek:
	Birinci yazıyı giriniz:bootcamp surecinde tekrar yapmanin onemini tekrardan hatirlatiyorum
    İkinci yazıyı giriniz:tek
    Birinci yazı içerisinde ikinci yazıdan 2 tane var
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        CountStringTest.run();
//    }
//}
//
//class CountStringTest {
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        for (;;) {
//            System.out.print("Birinci yazıyı giriniz:");
//            String s1 = kb.nextLine();
//
//            if (s1.equals("quit"))
//                break;
//
//            System.out.print("İkinci yazıyı giriniz:");
//            String s2 = kb.nextLine();
//
//            int count = StringUtil.countString(s1, s2);
//
//            System.out.printf("Birinci yazı içerisinde ikinci yazıdan %d tane var%n", count);
//        }
//    }
//}
//
//class StringUtil {
//    public static int countString(String s1, String s2)
//    {
//        int count = 0;
//        int index = 0;
//
//        while ((index = s1.indexOf(s2, index)) != -1) {
//            ++count;
//            ++index;
//        }
//
//        return count;
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Bir String'in boş string olup olmadığının anlaşılması (kötü yöntem)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        EmptyStringTest.run();
//    }
//}
//
//class EmptyStringTest {
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        for (;;) {
//            System.out.print("Birinci yazıyı giriniz:");
//            String s = kb.nextLine();
//
//            if (s.equals("quit"))
//                break;
//
//            System.out.println(s.equals("") ? "Boş String" : "Boş String değil");
//        }
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Bir String'in boş string olup olmadığı isEmpty metodu ile anlaşılabilir (en iyi yöntem)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        EmptyStringTest.run();
//    }
//}
//
//class EmptyStringTest {
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        for (;;) {
//            System.out.print("Birinci yazıyı giriniz:");
//            String s = kb.nextLine();
//
//            if (s.equals("quit"))
//                break;
//
//            System.out.println(s.isEmpty() ? "Boş String" : "Boş String değil");
//        }
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının trim metodu baştaki sondaki boşlukları (whitespace) atar. Aradaki boşluklara dokunmaz
----------------------------------------------------------------------------------------------------------------------*/
//
//class App {
//    public static void main(String [] args)
//    {
//        EmptyStringTest.run();
//    }
//}
//
//class EmptyStringTest {
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        for (;;) {
//            System.out.print("Birinci yazıyı giriniz:");
//            String s = kb.nextLine();
//
//            if (s.equals("quit"))
//                break;
//
//            System.out.printf("(%s)%n", s.trim());
//        }
//    }
//}





































/*----------------------------------------------------------------------------------------------------------------------

	String sınıfının concat metodu ile yazı birleştirmesi (concatanation) yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s1 = "ankara";
//        String s2 = "istanbul";
//        String s;
//
//        s = s1.concat(s2);
//
//        System.out.println(s);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği ineleyiniz
----------------------------------------------------------------------------------------------------------------------*/
//
//class App {
//    public static void main(String [] args)
//    {
//        String s1 = "ankara";
//        String s2 = "istanbul";
//        String s;
//
//        s = s1.concat("-").concat(s2);
//
//        System.out.println(s);
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Yazı birleştirmesi + operatörü ile de yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s1 = "ankara";
//        String s2 = "istanbul";
//        String s;
//
//        s = s1 + "-" + s2;
//
//        System.out.println(s);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	+ operatörünün operandlarından bir String türündense diğer operandının String karşlığı elde edilerek
	birleştirme işlemi yapılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String message = "Derece:";
//        double degree = 30.7;
//
//        String fullMessage = message + degree;
//
//        System.out.println(fullMessage);
//    }
//}






































/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Paremetresi ile aldığı bir yazının tersini döndüren reverse isimli metodu StringUtil
	sınıfı içerisinde yazınız ve metodu test ediniz
	(İleride daha iyisi yazılacak)
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        ReverseTest.run();
//    }
//}
//
//class ReverseTest {
//    public static void run()
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//
//        for (;;) {
//            System.out.print("Bir yazı giriniz:");
//            String str = kb.nextLine();
//
//            System.out.println(StringUtil.reverse(str));
//
//            if (str.equals("quit"))
//                break;
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//class StringUtil {
//    public static String reverse(String str)
//    {
//        String revStr = "";
//
//        for (int i = str.length() - 1; i >= 0; --i)
//            revStr += str.charAt(i);
//
//        return revStr;
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının substring metodu ile yazının içerisinden belli bir yazı alınabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s = "ankara";
//
//        System.out.println(s.substring(2)); //kara
//        System.out.println(s.substring(2, 5)); //[2, 5) -> kar
//    }
//}
























/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının startsWith metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Web adresini giriniz");
//        String address = kb.nextLine();
//
//        if (!address.startsWith("http://"))
//            address = "http://" + address;
//
//        System.out.println(address);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının endsWith metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Email adresini giriniz");
//        String email= kb.nextLine();
//
//        if (!email.endsWith(".com"))
//            email += ".com";
//
//        System.out.println(email);
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	 String sınıfının compareTo metodu
	 s1.compareTo(s2); çağrısı için:
	 1. Geri dönüş değeri pozitif ise s2 s1'den önce gelir
	 2. Geri dönüş değeri negatif ise s1 s2'den önce gelir
	 3. Geri dönüş değeri sıfır ise s1 ile s2 aynı yazılardır

	 Bu metot büyük-küçük harf duyarlı çalışır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s1 = "Ankara";
//        String s2 = "adana";
//
//        int result = s1.compareTo(s2);
//
//        System.out.println(result);
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	 18.07.2020
	 Derleyici özdeş String atomları (string literal) için aynı adresi verir. Aşağıdaki örnekte "ankara"
	 sabiti için hep aynı adres verilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s1 = "ankara";
//        String s2 = "ankara";
//
//        if (s1 == s2)
//            System.out.println("Aynı yazı");
//        else
//            System.out.println("Farklı yazılar");
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının valueOf metotları ile temel türlerin yazı karşılığı elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int val = 10;
//        String str = String.valueOf(val);
//
//        System.out.println(str);
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının contains metodu ile bir yazı içerisinde başka bir yazının varolup olmadığı test edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir yazı giriniz:");
//        String s1 = kb.nextLine();
//
//        System.out.print("Zararlı yazıyı giriniz:");
//        String s2 = kb.nextLine();
//
//        System.out.println(s1.contains(s2) ? "Yazı kabul edilemez" : "Yazı kabul edilebilir");
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının static format metodu formatlı bir yazı elde etmek için kullanılabilir. Bu metotta
	kullanılan format karakterleri printf metoduyla aynıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Birinci sayıyı giriniz:");
//        int a = Integer.parseInt(kb.nextLine());
//
//        System.out.print("İkinic sayıyı giriniz:");
//        int b = Integer.parseInt(kb.nextLine());
//
//        String str = String.format("%d + %d = %d", a, b, a + b);
//
//        System.out.println(str);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının replace metodu ile yazı içerisinde bulunan başka yazılar değiştirilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String str = "Bugün hava çok sıcak. Bu sıcak havada dışarıda dolaşılamıyor";
//
//        str = str.replace("sıcak", "soğuk");
//
//        System.out.println(str);
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	Java 7 ile birlikte switch deyiminde String de kullanılabilmektedir. Bu durumda case bölümlerinin
	String literal olması zorunludur. String sınıfı switch deyimi ile kullanıldığında karşılaştırma
	equals metodu ile yapılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.printf("Şehir ismi giriniz:");
//        String cityName = kb.nextLine();
//
//        switch (cityName) {
//            case "istanbul":
//                System.out.println("Marmara Bölgesi");
//                break;
//            case "ankara":
//                System.out.println("İç Anadolu Bölgesi");
//                break;
//            case "izmir":
//                System.out.println("Ege Bölgesi");
//                break;
//            default:
//                System.out.println("Sistemde kayıtlı olmayan şehir girdiniz");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
































