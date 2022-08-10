package firstweek.primitives;

public class Blocks {

    public static void main(String[] args) {
        //Yerel bir değişkenin faaliyet alanı bildirildiği yerden bildirildiği bloğun sonuna kadardır
//        int b;
//        {
//            int a;
//
//            a = 45;
//        }
//
//        a = 20; //error
//
//        b = 45;
//    }


        // Aynı faaliyet alanı içerisinde aynı isimde yerel değişken bildirimi geçersizdir
//        {
//            int a;
//            double a; //error
//        }


        //Farklı faaliyet alanları içerisinde aynı isimde yerel değişken bildirimi yapılabilir
//        int x;
//        {
//            int a;
//            //...
//        }
//
//        {
//            int a;
//            //...
//        }


        // Değişken isimleri rakam karakteri ile başlatılamaz
        // int 1number; //error


        //Değişken isimlendirmede boşluk (whitespace) karakteri kullanılamaz
        //int number of students; //error




      /*  Java 9'dan itibaren alttire karakteri tek başına değişken ismi olarak kullanılamaz.
        Java 8 ile birlikte alttire karakterinin tek başına değişken ismi olarak kullanımı "deprecated"
        olmuştur. */

//        int _ = 10; //error
//        System.out.println(_);







      /*  Java' da değişken isimlendirmede $ karakteri kullanılabilir. Hatta değişken ismi $ karakteri ile başlatılabilir.
        Hatta $ karakteri tek başına kullanılabilir. Ancak programcı açısından değişken isimlendirmede $ karakteri
        kullanılmaması tavsiye edilir. Çünkü derleyici ve bazı kod üreten araçlar isimlendirmede $ karakterini
        tercih edebilirler (çoğu zaman tercih ederler). İsim çakışması olmaması açısından $ karakteri değişken
        isimlendirmede tercih edilmez */

//        int amountOf$s = 100;
//        int $123abc = 200;
//        double $ = 345.56;
//
//        System.out.println(amountOf$s);
//        System.out.println($123abc);
//        System.out.println($);









    }
}
