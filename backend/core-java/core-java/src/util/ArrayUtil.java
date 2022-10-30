/*----------------------------------------------------------------------------------------------------------------------
	ArrayUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class ArrayUtil {
    private ArrayUtil()
    {
    }

    public static String join() {
        return "";
    }

    public static void display(int n, int... a)
    {
        display(n, a.length, a);
    }

    public static void display(int n, int count, int... a)
    {
        String fmt = String.format("%%0%dd ", n);

        IntStream.range(0,  count).forEach(i -> Console.write(fmt, a[i]));

        Console.writeLine();
    }

    public static void display(int... a)
    {
        display(1, a.length, a);
    }

    public static void display(int[]...a)
    {
        display(1, a);
    }

    public static void display(int n, int[]...a)
    {
        Stream.of(a).forEach(array -> display(n, array));
    }

    public static void display(char...c)
    {
        IntStream.range(0, c.length).forEach(i -> Console.write("%c ", c[i]));
        Console.writeLine();
    }

    public static void display(BigInteger...bigIntegers)
    {
        Stream.of(bigIntegers).forEach(Console::writeLine);
    }

    public static void drawHistogram(int[] data, int n, char ch)
    {
        int maxVal = Arrays.stream(data).max().getAsInt();

        IntStream.of(data).forEach(value -> {
            int val = (int) Math.round(value * n / (double) maxVal);

            System.out.println((ch + "").repeat(val));
        });
    }

    public static int[] enlarge(int[] a, int newLength)
    {
        if (newLength <= a.length)
            return a;

        return Arrays.copyOf(a, newLength);
    }

    public static boolean equals(int [][] a, int [][] b)
    {
        if (a.length != b.length)
            return false;

        return IntStream.range(0, a.length).allMatch(i -> Arrays.equals(a[i], b[i]));
    }

    public static int[] getHistogramData(int[] a, int n) //[0, n]
    {
        int[] counts = new int[n + 1];

        IntStream.of(a).forEach(val -> ++counts[val]);

        return counts;
    }

    public static int[][] getTranspose(int[][] a)
    {
        int row = a.length;
        int col = a[0].length;

        int[][] t = new int[col][row];

        IntStream.range(0, row).forEach(i -> IntStream.range(0, col).forEach(j -> t[j][i] = a[i][j]));

        return t;
    }

    public static int[] resize(int[] a, int newLength)
    {
        if (a.length == newLength)
            return a;

        int[] newArray = new int[newLength];
        int length = Math.min(a.length, newLength);

        System.arraycopy(a, 0, newArray, 0, length);

        return newArray;
    }

    public static void swap(int [] a, int i, int k) // Dikkat index değerleri aynı ise dizi elemanı kaybedilir
    {
        a[i] ^= a[k];
        a[k] ^= a[i];
        a[i] ^= a[k];
    }

    public static void swap(char [] c, int i, int k)  // Dikkat index değerleri aynı ise dizi elemanı kaybedilir
    {
        c[i] ^= c[k];
        c[k] ^= c[i];
        c[i] ^= c[k];
    }

    public static long toNumber(int[] a)
    {
        return LongStream.range(0, a.length).reduce(0, (r, i) -> r + (long) a[(int)i] * (long) Math.pow(10, a.length - 1 - i));
    }

    public static int[] getRandomArray( int n, int min, int max)
    {
        Random r = new Random();
        if (n <= 0 || min > max)
            return new int[0];

        int [] a = new int[n];

        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(max - min) + min;

        return a;
    }
}
