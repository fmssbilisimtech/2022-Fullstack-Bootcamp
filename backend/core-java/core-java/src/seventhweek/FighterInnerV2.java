package seventhweek;

import util.Console;

public class FighterInnerV2 { }
/*----------------------------------------------------------------------------------------------------------------------
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
//        f.setIntelligence(56);
//        f.setPower(89);
//
//        Console.writeLine("Sum of abilities:%d", f.sumOfAbilities());
//        Console.writeLine("Average of abilities:%f", f.averageOfAbilities());
//    }
//}
//
//class Fighter {
//    private String m_name;
//    private final int [] m_abilities;
//    private enum Ability {HEALTH, AGILITY, POWER, INTELLIGENCE, COUNT}
//
//    public Fighter()
//    {
//        m_abilities = new int[Ability.COUNT.ordinal()];
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
//    public int getHealth()
//    {
//        return m_abilities[Ability.HEALTH.ordinal()];
//    }
//
//    public void setHealth(int health)
//    {
//        m_abilities[Ability.HEALTH.ordinal()] = health;
//    }
//
//    public int getAgility()
//    {
//        return m_abilities[Ability.AGILITY.ordinal()];
//    }
//
//    public void setAgility(int agility)
//    {
//        m_abilities[Ability.AGILITY.ordinal()] = agility;
//    }
//
//    public int getPower()
//    {
//        return m_abilities[Ability.POWER.ordinal()];
//    }
//
//    public void setPower(int power)
//    {
//        m_abilities[Ability.POWER.ordinal()] = power;
//    }
//
//    public int getIntelligence()
//    {
//        return m_abilities[Ability.INTELLIGENCE.ordinal()];
//    }
//
//    public void setIntelligence(int intelligence)
//    {
//        m_abilities[Ability.INTELLIGENCE.ordinal()] = intelligence;
//    }
//
//    public int sumOfAbilities()
//    {
//        int sum = 0;
//
//        for (var val : m_abilities)
//            sum += val;
//
//        return sum;
//    }
//
//    public double averageOfAbilities()
//    {
//        return (double)sumOfAbilities() / m_abilities.length;
//    }
//}
