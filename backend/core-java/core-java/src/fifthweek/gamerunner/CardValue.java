package fifthweek.gamerunner;

public enum CardValue {
    TWO("İki"), THREE("Üç"), FOUR("Dört"), FIVE("Beş"), SIX("Altı"), SEVEN("Yedi"), EIGHT("Sekiz"), NINE("Dokuz"),
    TEN("On"), KNAVE("Vale"), QUEEN("Kız"), KING("Papaz"), ACE("As");

    private final String m_valueStr;

    CardValue(String typeStr)
    {
        m_valueStr = typeStr;
    }

    public String getValueStr()
    {
        return m_valueStr;
    }

    public static CardValue getCardValueByString(String valueStr)
    {
        CardValue resultValue = null;

        for (CardValue cardValue : values())
            if (cardValue.m_valueStr.equals(valueStr)) {
                resultValue = cardValue;
                break;
            }

        return resultValue;
    }
}
