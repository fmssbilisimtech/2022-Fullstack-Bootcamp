package seventhweek;

import util.Console;

public class FighterInner { }
/*----------------------------------------------------------------------------------------------------------------------
   Aşağıdaki örnekte Figther sınıfına int türden yeni bir yetenek eklendiğinde sumOfAbilities ve averageOfAbilities
   metotları da değiştirilmek zorundadır. Şüphesiz gerekirse AlertDialog örneğindeki gibi bir static bir sınıf ile bu
   durum kodları değişse bile bu sınıfı kullanan programcıya farkettirilmez.

   Problem: Aşağıdaki sınıfa yeni bir yetenek eklendiğinde sumOfAbilities ve averageOfAbilities metotlarını
   değiştirmek zorunda kalmayacak şekilde sınıfı yeniden yazınız. Bu problemde ctor önemli değildir. İstenirse
   sadece default ctor bırakılabilir
----------------------------------------------------------------------------------------------------------------------*/

//class App {
//    public static void main(String[] args)
//    {
//        Fighter f = new Fighter();
//
//        f.setName("Baldrog");
//        f.setAgility(70);
//        f.setHealth(65);
//        f.setPower(89);
//
//        Console.writeLine("Sum of abilities:%d", f.sumOfAbilities());
//        Console.writeLine("Average of abilities:%f", f.averageOfAbilities());
//    }
//}
//
//
//class Fighter {
//    private String m_name;
//    private int m_health;
//    private int m_agility;
//    private int m_power;
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
//    public int getHealth()
//    {
//        return m_health;
//    }
//
//    public void setHealth(int health)
//    {
//        m_health = health;
//    }
//
//    public int getAgility()
//    {
//        return m_agility;
//    }
//
//    public void setAgility(int agility)
//    {
//        m_agility = agility;
//    }
//
//    public int getPower()
//    {
//        return m_power;
//    }
//
//    public void setPower(int power)
//    {
//        m_power = power;
//    }
//
//    public int sumOfAbilities()
//    {
//        return m_agility + m_health + m_power;
//    }
//
//    public double averageOfAbilities()
//    {
//        return sumOfAbilities() / 3.;
//    }
//}
