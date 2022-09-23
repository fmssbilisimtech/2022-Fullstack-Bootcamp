package util;

/*----------------------------------------------------------------------------------------------------------------------
	StringUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.*;

public class StringUtil	{
    private static final String ms_alphabetTR;
    private static final String ms_alphabetEN;
    private static final String ms_alphabetCapitalsTR;
    private static final String ms_alphabetCapitalsEN;
    private static final String ms_alphabetAllTR;
    private static final String ms_alphabetAllEN;


    static {
        ms_alphabetTR = "abcçdefgğhıijklmnoöprsştuüvyz";
        ms_alphabetEN = "abcdefghijklmnopqrstuwxvyz";
        ms_alphabetCapitalsTR = "ABCÇDEFGĞJHIİJKLMNOÖPRSŞTUÜVYZ";
        ms_alphabetCapitalsEN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ms_alphabetAllTR = ms_alphabetTR + ms_alphabetCapitalsTR;
        ms_alphabetAllEN = ms_alphabetEN + ms_alphabetCapitalsEN;
    }

    private static void incrementCounts(HashMap<Character, Integer> charMap, String s)
    {
        int length = s.length();

        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            int count = 1;

            if (charMap.containsKey(c))
                count = charMap.get(c) + 1;

            charMap.put(c, count);
        }
    }

    private static boolean decrementCounts(HashMap<Character, Integer> charMap, String s)
    {
        int length = s.length();

        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);

            if (!charMap.containsKey(c))
                return false;

            int count = charMap.get(c) - 1;

            if (count < 0)
                return false;

            charMap.put(c, count);
        }

        return true;
    }

    private StringUtil() {}

    public static String addAllCharsWith(String s, int n)
    {
        StringBuilder sb = new StringBuilder(s);
        int length = sb.length();

        for (int i = 0; i < length; ++i) {
            char ch = sb.charAt(i);
            sb.setCharAt(i, (char)(ch + n));
        }

        return sb.toString();
    }

    public static boolean areAnagram(String s1, String s2)
    {
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> charMap = new HashMap<>();

        incrementCounts(charMap, s1);

        if (!decrementCounts(charMap, s2))
            return false;

        for (int count : charMap.values())
            if (count != 0)
                return false;

        return true;
    }

    public static boolean areCharactersDistinct(String str)
    {
        HashSet<Character> hashset = new HashSet<>();
        int length =  str.length();

        for (int i = 0; i < length; ++i)
            if (!hashset.add(str.charAt(i)))
                return false;

        return true;
    }

    public static String capitalize(String s)
    {
        if (s.isEmpty())
            return s;

        return toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static String changeCase(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        int length = sb.length();

        for (int i = 0; i < length; ++i) {
            char ch = sb.charAt(i);

            if (!Character.isLetter(ch))
                continue;

            sb.setCharAt(i, Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
        }

        return sb.toString();
    }

    public static int getCount(String s1, String s2)
    {
        int count = 0;

        for (int index = -1; (index = s1.indexOf(s2, index + 1)) != -1; ++count)
            ;

        return count;
    }

    public static String getLetters(String s)
    {
        int len = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);
            if (isLetter(c))
                sb.append(c);
        }

        return sb.toString();
    }

    public static String getRandomText(Random r, int n, String sourceText)
    {
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; ++i)
            sb.append(sourceText.charAt(r.nextInt(sourceText.length())));

        return sb.toString();
    }

    public static String getRandomTextTR(int n)
    {
        Random r = new Random();

        return getRandomTextTR(r, n);
    }

    public static String getRandomTextTR(Random r, int n)
    {
        return getRandomText(r, n, ms_alphabetAllTR);
    }

    public static String [] getRandomTextsTR(Random r, int count, int min, int max)
    {
        return Stream.generate(() -> getRandomTextTR(r, r.nextInt(max - min + 1) + min))
                .limit(count)
                .collect(Collectors.toList())
                .toArray(new String[count]);
    }

    public static String getRandomTextEN(Random r, int n)
    {
        return getRandomText(r, n, ms_alphabetAllEN);
    }

    public static String getRandomTextEN(int n)
    {
        Random r = new Random();

        return getRandomTextEN(r, n);
    }

    public static String [] getRandomTextsEN(Random r, int count, int min, int max)
    {
        return Stream.generate(() -> getRandomTextEN(r, r.nextInt(max - min + 1) + min))
                .limit(count)
                .collect(Collectors.toList())
                .toArray(new String[count]);
    }

    public static boolean isIsogram(String str, String alphabet)
    {
        int [] counts = new int[alphabet.length()];
        int len = str.length();

        for (int i = 0; i < len; ++i) {
            char ch = Character.toLowerCase(str.charAt(i));

            int index = alphabet.indexOf(ch);

            if (index == -1)
                continue;

            ++counts[index];

            if (counts[index] > 1)
                return false;
        }

        for (int val : counts)
            if (val == 0)
                return false;

        return true;
    }
    public static boolean isIsogramEN(String str)
    {
        int [] counts = new int[26];

        int len = str.length();

        for (int i = 0; i < len; ++i) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch < 'a' || ch > 'z')
                continue;

            ++counts[ch - 'a'];

            if (counts[ch - 'a'] > 1)
                return false;
        }

        for (int val : counts)
            if (val == 0)
                return false;

        return true;
    }

    public static boolean isIsogramTR(String str)
    {
        return isIsogram(str, ms_alphabetEN);
    }

    public static boolean isPalindrome(String s)
    {
        String str = getLetters(s);

        if (str.isEmpty())
            return false;

        int first = 0;
        int last = str.length() - 1;

        while (first < last) {
            char chLeft = toLowerCase(str.charAt(first++));
            char chRight = toLowerCase(str.charAt(last--));

            if (chLeft != chRight)
                return false;
        }

        return true;
    }

    public static boolean isPangram(String str, String alphabet)
    {
        str = str.toLowerCase();

        int len = alphabet.length();

        for (int i = 0; i < len; ++i) {
            char c = alphabet.charAt(i);

            if (!str.contains(c + ""))
                return false;
        }

        return true;
    }

    public static boolean isPangramTR(String str)
    {
        return isPangram(str, ms_alphabetEN);
    }

    public static boolean isPangramFR(String str)
    {
        return isPangram(str, ms_alphabetTR);
    }

    public static boolean isPangramEN(String str)
    {
        return isPangram(str, ms_alphabetTR);
    }

    public static String padLeft(String s, int len)
    {
        return padLeft(s, len, ' ');
    }

    public static String padLeft(String s, int len, char ch)
    {
        len -= s.length();

        if (len <= 0)
            return s;

        return (ch + "").repeat(len) + s;
    }

    public static String padRight(String s, int len)
    {
        return padRight(s, len, ' ');
    }

    public static String padRight(String s, int len, char ch)
    {
        len -= s.length();

        if (len <= 0)
            return s;

        return s + (ch + "").repeat(len);
    }


    public static String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }

    public static String squeeze(String s1, String s2)
    {
        StringBuilder sb = new StringBuilder();
        int length = s1.length();

        for (int i = 0; i < length; ++i) {
            char ch = s1.charAt(i);

            if (s2.indexOf(ch) == -1)
                sb.append(ch);
        }

        return sb.toString();
    }

    public static String [] split(String str, String delim)
    {
        return split(str, delim, StringSplitOptions.NONE);
    }

    public static String [] split(String str, String delim, StringSplitOptions options)
    {
        StringBuilder re = new StringBuilder("[");
        String metas = "[]";

        for (int i = 0; i < delim.length(); ++i) {
            char c = delim.charAt(i);

            re.append(metas.contains(c + "") ? "\\" : "").append(c);
        }

        re.append("]");

        if (options == StringSplitOptions.REMOVE_EMPTY_ENTRIES)
            re.append("+");

        return str.split(re.toString());
    }

    public static String subtractAllCharsWith(String s, int n)
    {
        return addAllCharsWith(s, -n);
    }
}

