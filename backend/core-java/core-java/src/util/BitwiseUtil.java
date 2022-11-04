/*----------------------------------------------------------------------------------------------------------------------
    BitwiseUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

public final class BitwiseUtil {
    private BitwiseUtil()
    {}

    public static int clearBit(int val, int k) //k -> [0, 31]
    {
        return val & ~(1 << k);
    }

    public static long clearBit(long val, int k) //k -> [0, 63]
    {
        return val & ~(1L << k);
    }

    public static int [] indicesOfSetBits(char ch)
    {
        int [] bitIndices = new int[numberOfSetBits(ch)];
        int index = 0;

        for (int k = 0; k < 16; ++k)
            if ((ch & 1 << k) != 0)
                bitIndices[index++] = k;

        return bitIndices;
    }

    public static int [] indicesOfSetBits(byte val)
    {
        int [] bitIndices = new int[numberOfSetBits(val)];
        int index = 0;

        for (int k = 0; k < 8; ++k)
            if ((val & 1 << k) != 0)
                bitIndices[index++] = k;

        return bitIndices;
    }

    public static int [] indicesOfSetBits(short val)
    {
        int [] bitIndices = new int[numberOfSetBits(val)];
        int index = 0;

        for (int k = 0; k < 16; ++k)
            if ((val & 1 << k) != 0)
                bitIndices[index++] = k;

        return bitIndices;
    }

    public static int [] indicesOfSetBits(int val)
    {
        int [] bitIndices = new int[numberOfSetBits(val)];
        int index = 0;

        for (int k = 0; k < 32; ++k)
            if ((val & 1 << k) != 0)
                bitIndices[index++] = k;

        return bitIndices;
    }

    public static int [] indicesOfSetBits(long val)
    {
        int [] bitIndices = new int[numberOfSetBits(val)];
        int index = 0;

        for (int k = 0; k < 64; ++k)
            if ((val & 1L << k) != 0)
                bitIndices[index++] = k;

        return bitIndices;
    }

    public static boolean isSet(int val, int k)
    {
        return (val & (1 << k)) != 0;
    }

    public static boolean isClear(int val, int k)
    {
        return !isSet(val, k);
    }

    public static boolean isSet(long val, int k)
    {
        return (val & 1L << k) != 1;
    }

    public static boolean isClear(long val, int k)
    {
        return !isSet(val, k);
    }

    public static int numberOfClearBits(byte val)
    {
        return 8 - numberOfSetBits(val);
    }

    public static int numberOfSetBits(byte val)
    {
        int count = 0;

        for (int k = 0; k < 8; ++k)
            if ((val & 1 << k) != 0)
                ++count;

        return count;
    }

    public static int numberOfClearBits(short val)
    {
        return 16 - numberOfSetBits(val);
    }

    public static int numberOfSetBits(short val)
    {
        int count = 0;

        for (int k = 0; k < 16; ++k)
            if ((val & 1 << k) != 0)
                ++count;

        return count;
    }

    public static int numberOfClearBits(int val)
    {
        return 32 - numberOfSetBits(val);
    }

    public static int numberOfSetBits(int val)
    {
        int count = 0;

        for (int k = 0; k < 32; ++k)
            if ((val & 1 << k) != 0)
                ++count;

        return count;
    }

    public static int numberOfClearBits(long val)
    {
        return 64 - numberOfSetBits(val);
    }

    public static int numberOfSetBits(long val)
    {
        int count = 0;

        for (int k = 0; k < 64; ++k)
            if ((val & 1L << k) != 0)
                ++count;

        return count;
    }

    public static int numberOfClearBits(char val)
    {
        return 16 - numberOfSetBits(val);
    }

    public static int numberOfSetBits(char val)
    {
        int count = 0;

        for (int k = 0; k < 16; ++k)
            if ((val & 1 << k) != 0)
                ++count;

        return count;
    }

    public static int setBit(int val, int k) //k -> [0, 31]
    {
        return val | 1 << k;
    }

    public static long setBit(long val, int k) //k -> [0, 63]
    {
        return val | 1L << k;
    }

    public static String toBitsStr(char ch)
    {
        char [] bits = new char[16];

        for (int k = 15; k >= 0; --k)
            bits[15 - k] = (ch & 1 << k) != 0 ? '1' : '0';

        return String.valueOf(bits);
    }

    public static String toBitsStr(byte val)
    {
        char [] bits = new char[8];

        for (int k = 7; k >= 0; --k)
            bits[7 - k] = (val & 1 << k) != 0 ? '1' : '0';

        return String.valueOf(bits);
    }

    public static String toBitsStr(short val)
    {
        char [] bits = new char[16];

        for (int k = 15; k >= 0; --k)
            bits[15 - k] = (val & 1 << k) != 0 ? '1' : '0';

        return String.valueOf(bits);
    }

    public static String toBitsStr(int val)
    {
        char [] bits = new char[32];

        for (int k = 31; k >= 0; --k)
            bits[31 - k] = (val & 1 << k) != 0 ? '1' : '0';

        return String.valueOf(bits);
    }

    public static String toBitsStr(long val)
    {
        char [] bits = new char[64];

        for (int k = 63; k >= 0; --k)
            bits[63 - k] = (val & 1L << k) != 0 ? '1' : '0';

        return String.valueOf(bits);
    }

    public static int toggleBit(int val, int n)
    {
        return val ^ 1 << n;
    }

    public static long toggleBit(long val, int n)
    {
        return val ^ 1L << n;
    }
}
