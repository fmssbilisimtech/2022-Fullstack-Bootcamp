package firstweek.methods;

public class Return1 {
    public static void main(String[] args) {
/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri return deyimi ile oluşturulur. return deyiminin genel biçimi:

	return [ifade];

	return deyiminin temel olarak ilk görevi metodu sonlandırmaktır. Metodun geri dönüş değeri varsa return' e
	ilişkinin ifadenin değeri çağıran metoda aktarılır
----------------------------------------------------------------------------------------------------------------------*/

        int a;

        a = getSquare() * 2;

        System.out.println(a);


    }

    public static int getSquare() {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        int square = val * val;

        return square;


        /* return deyimi nasıl kullanılırsa kullanılsın metodu sonlandırır. Aşağıdaki örnekte return deyiminden sonrasına
        //        akış erişemeceğinden error oluşur */
//        //System.out.println("Unreachable code"); // error
    }


        // Geri dönüş değeri olan metotlarda return tek başına kullanılamaz
//   public static int foo()
//   {
//       java.util.Scanner kb = new java.util.Scanner(System.in);
//       System.out.print("Bir sayı giriniz:");
//       int val = Integer.parseInt(kb.nextLine());
//
//       return; //error:
//   }


  /*  Derleyici geri dönüş değeri aktarımı için geçici değişken yaratan kodu üretir. Aşağıdaki kodun temsili
    karşılığı:
    int temp = val * val;
    a = temp * 2;
    Yani aslında geri dönüş değeri geçici değişkene yapılan bir atama işlemidir. Geçici değişkenin türü metodun
    geri dönüş değeri türü ile aynıdır */

//    public static int getSquare() {
//        java.util.Scanner kb = new java.util.Scanner(System.in);
//        System.out.print("Bir sayı giriniz:");
//        int val = Integer.parseInt(kb.nextLine());
//
//        return val * val;
//
//    }

    }

