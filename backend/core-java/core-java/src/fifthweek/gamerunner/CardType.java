package fifthweek.gamerunner;

public enum CardType {
    SPADE("Maça"), CLUB("Sinek"), DIAMOND("Karo"), HEART("Kupa");
    private final String m_typeStr;

    CardType(String typeStr)
    {
        m_typeStr = typeStr;
    }

    public String getTypeStr()
    {
        return m_typeStr;
    }

    public static CardType getCardTypeByString(String typeStr)
    {
        CardType resultType = null;

        for (CardType cardType : values())
            if (cardType.m_typeStr.equals(typeStr)) {
                resultType = cardType;
                break;
            }

        return resultType;
    }
}
