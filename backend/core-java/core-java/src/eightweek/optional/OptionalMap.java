package eightweek.optional;

import util.Console;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class OptionalMap { }


/*----------------------------------------------------------------------------------------------------------------------
    Optional sınıfının map metodu
---------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        var r = new Random();
//        var min = Console.readInt("min?");
//        var max = Console.readInt("max?");
//        var n = Console.readInt("n?");
//        var pf = new PersonFactory();
//
//        for (int i = 0; i < n; ++i) {
//            var personOpt = pf.getPersonByIndex(r.nextInt(max - min) + min);
//
//            personOpt.map(p -> p.getName() + ":" + p.getAge())
//                    .ifPresentOrElse(Console::writeLine, () -> Console.writeLine("Kişi yok"));
//        }
//    }
//}
//
//class PersonFactory {
//    private final ArrayList<Person> m_people = new ArrayList<>();
//
//    {
//        //Bu kısım dosyadan ya da veritabanından okunabilir. Ya da her adımda dosyadan ya da veri tabanından okunabilir
//        m_people.add(new Person("Oğuz Karan", "Göktürk", LocalDate.of(1976, 9, 10)));
//        m_people.add(new Person("Yavuz Karan", "İzmir", LocalDate.of(1977, 12, 12)));
//        m_people.add(new Person("Buğra Çelik", "Tarabya", LocalDate.of(1998, 2, 21)));
//        //...
//    }
//
//    public Optional<Person> getPersonByIndex(int i)
//    {
//        return i < m_people.size() ? Optional.of(m_people.get(i)) : Optional.empty();
//    }
//}
//
//class Person {
//    private String m_name;
//    private String address;
//    private LocalDate m_birthDate;
//
//    public Person(String name, String address, LocalDate birthDate)
//    {
//        m_name = name;
//        this.address = address;
//        m_birthDate = birthDate;
//    }
//
//    public String getName()
//    {
//        return m_name;
//    }
//
//    public void setName(String name)
//    {
//        m_name = name;
//    }
//
//    public String getAddress()
//    {
//        return address;
//    }
//
//    public void setAddress(String address)
//    {
//        this.address = address;
//    }
//
//    public LocalDate getBirthDate()
//    {
//        return m_birthDate;
//    }
//
//    public void setBirthDate(LocalDate birthDate)
//    {
//        m_birthDate = birthDate;
//    }
//    public double getAge()
//    {
//        return ChronoUnit.DAYS.between(m_birthDate, LocalDate.now()) / 365.;
//    }
//}
