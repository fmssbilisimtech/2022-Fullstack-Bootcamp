package thirdweek;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample { }

// Sorting video
// https://www.youtube.com/watch?v=EdIKIf9mHk0&list=PLOmdoKois7_FK-ySGwHBkltzB11snW7KQ

/*----------------------------------------------------------------------------------------------------------------------
	Veri yapısı: Verileri belirli bir algoritmaya göre tutan ve istenilğidinde bu verilere erişilebilen
	yapılara denir.

	Diziler (Arrays):
	Elemanları aynı türden olan ve elemanların bellekte peşpeşe olarak tutulduğu veri yapısıdır. Java' diziler
	sınıfsal olarak temsil edilir. Yani dizi türü aslında bir referans türüdür ve diziiler heap de yaratılır.
	Şüphesiz dizi referansları stack'de yaratılabilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Dizi refansı referansı bildirimi Java' da iki şekilde yapılabilir:
	T bir tür olmak üzere

	T [] a; //*
	T a[];

	Biz *'daki bildirim biçimini kullanacağız
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a; // dizi referansı bildirimi
//        int b[]; //dizi referansı bildirimi
//        //...
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
	[]'in referans bildiriminde bulunduğu yare göre farkları
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int [] a, b, c;
//        int d[], e, f;
//
//        e = 10;
//        d = 30; //error
//        b = 45; //error
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
	Dizi yaratmak için de new operatörü kullanılır. Dizi yaramanın genel biçimi:
		new <tür>[<dizinin int türden eleman sayısı>];
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int [] a;
//
//        a = new int[5];
//
//        //...
//
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Dizinin eleman sayısı length isimli veri elemanı ile elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int n = Integer.parseInt(kb.nextLine());
//        int [] a;
//
//        a = new int[n];
//
//        System.out.printf("Length:%d%n", a.length);
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	length veri elemanına atama yapılamaz
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int n = Integer.parseInt(kb.nextLine());
//        int [] a;
//
//        a = new int[n];
//
//        System.out.printf("Length:%d%n", a.length);
//
//        a.length = 20; //error
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	Dizinin elamlarına [] operatörü ile erişilebilir. Bu operatör iki operandlı araek durumunda bir operatördür.
	Ürettiği değer dizinin elemanı türünden bir değişkendir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int n = Integer.parseInt(kb.nextLine());
//        int [] a;
//
//        a = new int[n];
//
//        for (int i = 0; i < a.length; ++i)
//            a[i] = i + 1;
//
//        for (int i = 0; i < a.length; ++i)
//            System.out.printf("%d ", a[i]);
//
//        System.out.println();
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
	Bir dizi ilk yaratıldığında tüm elemanlarına default değerler atanır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int n = Integer.parseInt(kb.nextLine());
//        int [] a;
//        boolean [] flags;
//
//        a = new int[n];
//        flags = new boolean[n];
//
//        for (int i = 0; i < a.length; ++i)
//            System.out.printf("%d ", a[i]);
//
//        System.out.println();
//
//        for (int i = 0; i < flags.length; ++i)
//            System.out.printf("%b ", flags[i]);
//
//        System.out.println();
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Dizilere ilkdeğer verilmesi (initialization) küme parantezi ile yapılabilir. Burada new operatörünün [] içerisi
	boş bırakılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int [] a;
//
//        a = new int[] {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < a.length; ++i)
//            System.out.printf("%d ", a[i]);
//
//        System.out.println();
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	Diziye ilkdeğer verilirken aynı zamanda bir referansa da ilkdeğer veriliyorsa new operatörü kullanılması
	gerekmez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < a.length; ++i)
//            System.out.printf("%d ", a[i]);
//
//        System.out.println();
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnek error oluşturur
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int [] a;
//
//        a = {1, 2, 3, 4, 5}; //error
//
//        for (int i = 0; i < a.length; ++i)
//            System.out.printf("%d ", a[i]);
//
//        System.out.println();
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
	Diziye ilkdeğer olarak verilen elemanlar sabit ifadesi olmak zorunda değildir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int x = Integer.parseInt(kb.nextLine());
//        int [] a = {x, x + 1, x + 2, x + 3};
//
//        for (int i = 0; i < a.length; ++i)
//            System.out.printf("%d ", a[i]);
//
//        System.out.println();
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değerine ilişkin tür bir dizi türü olabilir
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        Random r = new Random();
//        int [] a = ArrayUtil.getRandomArray(r, 10, 0, 101);
//
//        ArrayUtil.display(a);
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	ArrayUtil sınıfının swap metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = {1, 2, 3, 4, 5};
//
//        ArrayUtil.swap(a, 1, 3);
//
//        ArrayUtil.display(a);
//    }
//}






























/*----------------------------------------------------------------------------------------------------------------------
	ArrayUtil sınıfının fillRandomArray metodu
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Random r = new Random();
//        int [] a = new int[10];
//
//        ArrayUtil.fillRandomArray(r, a, 0, 101);
//        ArrayUtil.display(a);
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir diziyi tersyüz eden reverse isimli metodu
	yazınız ve tes ediniz. İşlemi ikinci bir dizi kullanmadan yapınız
----------------------------------------------------------------------------------------------------------------------*/
//class App {
//    public static void main(String [] args)
//    {
//        int [] a = {1, 2, 3, 4, 5};
//
//        Util.reverse(a);
//        ArrayUtil.display(a);
//    }
//}
//
//class Util {
//    public static void reverse(int [] a)
//    {
//        int left = 0;
//        int right = a.length - 1;
//
//        while (left < right)
//            swap(a, left++, right--);
//    }
//
//    public static void swap(int [] a, int i, int k)
//    {
//        int temp;
//
//        temp = a[i];
//        a[i] = a[k];
//        a[k] = temp;
//    }
//}


































/*----------------------------------------------------------------------------------------------------------------------
	Java'da length bilgisi sıfır olan dizi yaratılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = new int[0];
//        int [] b = {};
//
//        System.out.printf("Length:%d%n", a.length);
//        System.out.printf("Length:%d%n", b.length);
//    }
//}




































/*----------------------------------------------------------------------------------------------------------------------
	Sayısal loto kuponu üreten basit bir program
	(Daha iyi versiyon)
----------------------------------------------------------------------------------------------------------------------*/


//class App {
//    public static void main(String [] args)
//    {
//        LottaryApp.run();
//    }
//}
//
//
// class LottaryApp {
//    public static void run()
//    {
//        Lottary lottary = new Lottary();
//        Scanner kb = new Scanner(System.in);
//
//        for (;;) {
//            System.out.print("Kaç kupon oynamak istersiniz?");
//            int n = Integer.parseInt(kb.nextLine());
//
//            if (n <= 0)
//                break;
//
//            for (int i = 0; i < n; ++i)
//                ArrayUtil.display(2, lottary.getNumbers());
//
//            System.out.println("///////////////////");
//        }
//
//        System.out.println("Tekrar yapıyor musunuz?");
//    }
//}
//
//
// class Lottary {
//    public Random random;
//
//    public boolean [] getFlags()
//    {
//        boolean [] flags = new boolean[50];
//        int val;
//
//        for (int i = 0; i < 6; ++i) {
//            for (;;) {
//                val = random.nextInt(49) + 1;
//                if (!flags[val])
//                    break;
//            }
//            flags[val] = true;
//        }
//
//        return flags;
//    }
//
//    public int [] getNumbers(boolean [] flags)
//    {
//        int [] a = new int[6];
//
//        int index = 0;
//
//        for (int i = 1; i < 50; ++i)
//            if (flags[i])
//                a[index++] = i;
//
//        return a;
//    }
//
//    public Lottary()
//    {
//        random = new Random();
//    }
//
//    public int [] getNumbers()
//    {
//        return getNumbers(getFlags());
//    }
//}



























/*----------------------------------------------------------------------------------------------------------------------
	ArrayUtil sınıfının max ve min metotları
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = ArrayUtil.getRandomArray(10, 0, 256);
//
//        ArrayUtil.display(3, a);
//
//        System.out.printf("En küçük eleman:%d%n", ArrayUtil.min(a));
//        System.out.printf("En büyük eleman:%d%n", ArrayUtil.max(a));
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının char türden dizi paametreli ctor'u ile char türden diziden bir String
	elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        char [] c = {'a','n', 'k', 'a', 'r', 'a'};
//        String s = new String(c);
//
//        System.out.println(s);
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının char türden dizi paametreli valueOf ile char türden diziden bir String
	elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        char [] c = {'a','n', 'k', 'a', 'r', 'a'};
//        String s = String.valueOf(c);
//
//        System.out.println(s);
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının toCharArray metodu ile bit String'in karakterlerinden oluşan
	char türden bir dizi elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s = "ankara";
//        char [] c = s.toCharArray();
//
//        for (int i = 0; i < c.length; ++i)
//            System.out.println(c[i]);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	Referans dizilerinde dizinin yaratılması dizinin elemanları olan referansların gösterdikleri nesnelerin de
	yaratılması anlamına gelmez. Bu durumdda programcının referans dizisinin elemanlları olan referanslara da
	uygun nesnelerin adreslerini vermesi gerekir. Aşağıdaki örnekte referans dizi yaratılmıştır ancak referansların
	gösterdiği nesneler olmadığı için erişmeye çalışmak exception oluşturur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample [] samples;
//
//        samples = new Sample[5];
//
//        for (int i = 0; i < 5; ++i)
//            samples[i].x = i;
//
//        for (int i = 0; i < 5; ++i)
//            System.out.println(samples[i].x);
//    }
//}
//
//class Sample {
//    public int x;
//    public Sample(int a)
//    {
//        x = a;
//    }
//}
































/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problemin bir çözümü aşağıdaki gibi olabilir. Şüphesiz çözüm senaryoya da bağlıdır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample [] samples;
//
//        samples = new Sample[5];
//
//        for (int i = 0; i < 5; ++i)
//            samples[i] = new Sample(i);
//
//        for (int i = 0; i < 5; ++i)
//            System.out.println(samples[i].x);
//    }
//}
//
//class Sample {
//    public int x;
//    public Sample(int a)
//    {
//        x = a;
//    }
//}































/*----------------------------------------------------------------------------------------------------------------------
	Referans dizierine ilkdeğer verilmesi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample(10);
//        Sample k = new Sample(30);
//        Sample [] samples = {new Sample(1), s, new Sample(67), s, k, new Sample(90)};
//
//        for (int i = 0; i < samples.length; ++i)
//            System.out.printf("%d ", samples[i].x);
//
//        System.out.println();
//    }
//}
//
//class Sample {
//    public int x;
//    public Sample(int a)
//    {
//        x = a;
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	String dizileri
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String [] cities = {"ankara", "istanbul", "izmir", "zonguldak", "bolu"};
//
//        for (int i = 0; i < cities.length; ++i)
//            System.out.println(cities[i]);
//    }
//}














































/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte split metodu space karakterini ayraç kabul ederek yazıyı ayrıştırmıştır. Ancak split
	metodu regex kullanıldığında bu şekildeki kullanım her karakter için mümkün değildir. Ayraç tek bir karakterden
	oluşsa bile bu kullanım tavsiye edilmez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String text = "Bugün,hava çok güzel";
//        String [] strings = text.split(" ");
//
//        for (int i = 0; i < strings.length; ++i)
//            System.out.println(strings[i]);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	split' in aşağıdaki biçimde kullanımında iki ayraç arasındaki boş string'ler de geri döndürülen diziye dahil edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String text = "Bugün hava  çok, güzel";
//        String [] strings = text.split("[ ,]");
//
//        for (int i = 0; i < strings.length; ++i)
//            System.out.println(strings[i]);
//    }
//}

































/*----------------------------------------------------------------------------------------------------------------------
	T [] a ifadesinde T dizinin herbir elemanının tür bilgisi olduğuna göre örneğin:
	int [][] a
	ifadesi "her bir elemanı bir dizi referansı olan bir dizi referansı bildirimidir". Yani, a'nın türü int[][] dir.
	a referansı herbir elemanı bir dizi referansı olan bir dizinin adresini tutar
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Dizi dizisi bildiriminde new işlemi sırasında tür isminde sonra referans bildiriminde kullanılan [] kadar
	[] olmalıdır. Bu [] 'lerin ilki dizinin uzunluğunu temsil ettiği için boş bırakılamaz. Diğer []'ler boş bırakılabilir.
	int [][] türünden bir dizinin her bir elemanı olan dizi referanslarının gösterdiği dizilerin uzunlukları aynı ise
	buna mantıksal olarak matris denir. Çünkü bir matrisi temsil eder. Eğer en az bir dizinin uzunluğu diğerlerinden
	faklı ise bu aryık matris belitrmez. Java' da bazı programlama dillerinde olduğu gibi çok boyutlu dizi kavramı
	yoktur. Örneğin iki boyutlu bişr dizi matris belirtir cümlesi Java için yanlış bir cümledir. Yani aslında
	matrisler de Java' da dizi dizileridir.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki m * n'lik bir matris yaratılmış ve elemanlarına rasgele değerler atanmıştır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Random r = new Random();
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Satır sayısını giriniz:");
//        int m = Integer.parseInt(kb.nextLine());
//
//        System.out.print("Sütun sayısını giriniz:");
//        int n = Integer.parseInt(kb.nextLine());
//
//        int [][] a;
//
//        a = new int[m][];
//
//        for (int i = 0; i < a.length; ++i)
//            a[i] = new int[n];
//
//        for (int i = 0; i < m; ++i)
//            for (int j = 0; j < n; ++j)
//                a[i][j] = r.nextInt(100);
//
//        for (int i = 0; i < m; ++i) {
//            for (int j = 0; j < n; ++j)
//                System.out.printf("%02d ", a[i][j]);
//
//            System.out.println();
//        }
//    }
//}




























/*----------------------------------------------------------------------------------------------------------------------
	Java 5 ile birlikte aşağıdaki gibi ikinci [] içerisinde yazılan uzunluk matrisin satır sayısı anlamına gelir. Yani
	dizinin gösterdiği diziler otomatik olarak aynı uzunlukta yarılmış olur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Random r = new Random();
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Satır sayısını giriniz:");
//        int m = Integer.parseInt(kb.nextLine());
//
//        System.out.print("Sütun sayısını giriniz:");
//        int n = Integer.parseInt(kb.nextLine());
//
//        int [][] a;
//
//        a = new int[m][n];
//
//        for (int i = 0; i < m; ++i)
//            for (int j = 0; j < n; ++j)
//                a[i][j] = r.nextInt(100);
//
//        for (int i = 0; i < m; ++i) {
//            for (int j = 0; j < n; ++j)
//                System.out.printf("%02d ", a[i][j]);
//
//            System.out.println();
//        }
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Dizi dizilerine ilk değer verilmesi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [][] a = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
//
//        ArrayUtil.display(a);
//    }
//}





























/*----------------------------------------------------------------------------------------------------------------------
	Dizi dizilerine ilk değer verilmesi
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [][] a;
//
//        a = new int[][]{{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
//
//        ArrayUtil.display(a);
//    }
//}



































/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir matrisin devriğini (transpose) döndüren transpose isimli
	metodu yazınız. Metot şüphesiz yeni bir dizi dizisi referansı döndürecektir.
	Not: Matris kontrolü yapılmayacaktır
	1 2 3
	4 5 6

	1 4
	2 5
	3 6
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        TransposeTest.run();
//    }
//}
//
//
//class TransposeTest {
//    public static void run()
//    {
//        Scanner kb = new Scanner(System.in);
//        Random r = new Random();
//
//        for (;;) {
//            System.out.print("Satır sayısını giriniz:");
//            int m = Integer.parseInt(kb.nextLine());
//
//            if (m <= 0)
//                break;
//
//            System.out.print("Sütun sayısını giriniz:");
//            int n = Integer.parseInt(kb.nextLine());
//
//            int [][] a = ArrayUtil.getRandomMatrix(r, m, n, 0, 100);
//
//            ArrayUtil.display(2, a);
//            System.out.println("///////////////////////");
//            ArrayUtil.display(2, ArrayUtil.transpose(a));
//        }
//
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	Dizi dizilerine yönelik karmaşık bildirimler
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [][][] a;
//
//        a = new int[3][4][5];
//
//        for (int i = 0; i < a.length; ++i)
//            for (int j = 0; j < a[i].length; ++j)
//                for (int k = 0; k < a[i][j].length; ++k)
//                    a[i][j][k] = i + j + k;
//
//        //...
//    }
//}



















