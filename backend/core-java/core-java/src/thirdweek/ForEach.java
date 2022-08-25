package thirdweek;

public class ForEach { }
/*----------------------------------------------------------------------------------------------------------------------
	for-each döngü deyiminin genel biçimi:
	for (<tür> <değişken> : <dolaşaılabilir (iterable) bir türe ilişkin referans>)
		<deyim>

	Burada dolaşılabilir kavramı uygulama kursunda ele alınacaktır. Diziler dolaşılabilir türler olduğundan
	for-each döngü deyimi ile kullanılabilir. İleride diziler dışında dolaşılabilir bir sınıflar göreceğiz

	for-each döngü deyimi kodu kolaylaştırır. Bu durumlarda hep for-each kullanılmalı. Kodu kolaylaştırmadığı
	durumlarda klasik for döngüsü tercih edilmelidir.

	for-each döngü deyimi kodun okunabilirliğini de artırır. Yani kodu okuyan kişi for-each döngü deyimi
	gördüğünde dizinin tüm elemanlarıyla sırasıyla bir işlem yapılıyor olduğunu anlar. Okunabilirlik tersten de düşünülebilir.
	Yani kodu okuyan kişi bir örneğin bir dizi için klasik for döngüsü görürse, "for-each ile yazılmadığına göre
	dizinin baştan sona tamamı dolaşılsa bile örneğin index gerekiyor olabilir" anlayabilir.
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	for-each döngü deyiminin dizi ile kullanımında döngü değişkenine döngünün her adımında o anki elemanın değeri
	atanır. Bu işlem dizinin başından sonuna kadar tekrarlanır. Aşağıdaki for-each deyiminin temsili karşılığı şu
	şekildedir:

    {
        int val;

        for (int i = 0; i < a.length; ++i) {
            val = a[i];

            System.out.printf("%d ", val);
        }
    }
----------------------------------------------------------------------------------------------------------------------*/
































//class App {
//    public static void main(String [] args)
//    {
//        int [] a = {1, 2, 3, 4, 5};
//
//        for (int val : a)
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
	for-each döngü deyiminde döngü değişkenine atama işlemi dorğudan yapılır. Aşağıdaki örnekte int türünden short
	türüne otomatik tür dönüşümü olmadığından error oluşur
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = {1, 2, 3, 4, 5};
//
//        for (short val : a) //error
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	for-each döngü deyiminde döngü değişkenine atama işlemi dorğudan yapılır. Aşağıdaki örnekte error oluşmaz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = {1, 2, 3, 4, 5};
//
//        for (double val : a)
//            System.out.printf("%f%n", val);
//    }
//}























/*----------------------------------------------------------------------------------------------------------------------
	for-each döngü deyiminde döngü değişkenini alanı döngü boyunca görülebilirdir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = {1, 2, 3, 4, 5};
//
//        for (double val : a)
//            System.out.printf("%f%n", val);
//
//        System.out.println(val); //error
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
	for-each döngü deyiminde : den sonraki kısım bir kez yapılır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        for (int val : Sample.getArray())
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//}
//
//class Sample {
//    public static int[] getArray()
//    {
//        System.out.println("getArray");
//
//        return new int[] {1, 2, 3, 4, 5};
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
	for-each döngü deyiminde döngü değişkenine atama yapılabilir. Bu çok işe yarar bir işlem değildir. Şüphesiz
	döngü değikenini değiştirmez diz elemanını değiştirmez
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = {1, 2, 3, 4};
//
//        for (int val : a)
//            val *= 2;
//
//        for (int val : a)
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//}





















/*----------------------------------------------------------------------------------------------------------------------
	String sınıfı for-each döngü deyimi ile kullanılamamaktadır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s = "ankara";
//
//        for (char c : s) //error
//            System.out.println(c);
//    }
//}




















/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki işlem toCharArray metodu ile yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        String s = "ankara";
//
//        for (char c : s.toCharArray())
//            System.out.println(c);
//    }
//}






















/*----------------------------------------------------------------------------------------------------------------------
	for-each döngü deyimi ile dizi dizilerinin dolaşılması
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [][] a = {{1, 2}, {3, 4}, {5, 6}};
//
//        for (int [] array : a) {
//            for (int val : array)
//                System.out.printf("%d ", val);
//
//            System.out.println();
//        }
//    }
//}


























/*----------------------------------------------------------------------------------------------------------------------
	for-each döngü deyimi kullanımı kolaylaştırdığı her yerde kullanılmalıdır. Ancak örneğin döngü içerisinde indeks
	gerekirse for-each döngü deyimi index değerini vermediğinden indeksin ayrıca tanımlanması yerine klasik
	for döngü deyimi tercih edilebilir. Aşağıdaki örnekte for-each döngü deyimi index ayrıca ayrıca tanımlanarak
	kullanılmıştır. Örnekte for-each döngü deyiminin döngü değişkeninin kullanılmadığına dikkat ediniz
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        int [] a = new int[5];
//
//        int i = 0;
//
//        for (int val : a) // Bunun yerine klasik for döngüsü kullanılması daha iyidir
//            a[i++] = i * 10;
//
//        for (int val : a)
//            System.out.printf("%d ", val);
//
//        System.out.println();
//    }
//}





































