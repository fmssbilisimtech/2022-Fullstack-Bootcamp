package fifthweek;

public class ObjectToString { }

/*----------------------------------------------------------------------------------------------------------------------
    Object sınıfının toString metodu nesneye yönelik tekil (unique) bir bilgiyi yazı olarak döndürür
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Sample s = new Sample();
//        Sample k = new Sample();
//
//        System.out.println(s.toString());
//        System.out.println(k.toString());
//    }
//}
//
//class Sample {
//
//}













/*----------------------------------------------------------------------------------------------------------------------
    Object sınıfının toString metodu sanal bir metottur. Bir nesnenin yazısal karşılığının olması durumunda o sınıf
    için toString override edilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Object s = new Sample();
//        Object k = new Sample();
//
//        System.out.println(s.toString());
//        System.out.println(k.toString());
//    }
//}
//
//class Sample {
//    public String toString()
//    {
//        return "Sample";
//    }
//}















/*----------------------------------------------------------------------------------------------------------------------
    print ve println metotlarının Object parametreli overload'ları ekrana basacakları yazı için toString metodunu
    çağırır
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String [] args)
//    {
//        Object s = new Sample();
//        Object k = new Sample();
//
//        System.out.println(s);
//        System.out.println(k);
//    }
//}
//
//class Sample {
//    public String toString()
//    {
//        return "Sample";
//    }
//}
