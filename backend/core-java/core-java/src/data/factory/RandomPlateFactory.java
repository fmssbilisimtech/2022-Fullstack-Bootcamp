package data.factory;


import util.StringUtil;

import java.util.Random;

public class RandomPlateFactory {
    private final Random m_random;

    public RandomPlateFactory()
    {
        this(new Random());
    }
    public RandomPlateFactory(Random random)
    {
        m_random = random;
    }

    public String getRandomPlate()
    {
        var cityCode = m_random.nextInt(81) + 1;
        var text = StringUtil.getRandomTextEN(m_random, 3);
        var number = m_random.nextInt(999) + 1;

        return String.format("%02d %s %d", cityCode, text.toUpperCase(), number);
    }
}
