/*----------------------------------------------------------------------------------------------------------------------
    CommandUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

public final class CommandLineUtil {
    private CommandLineUtil() {}

    private static void doWorkForControl(String msg)
    {
        Console.Error.writeLine(msg);
        System.exit(-1);
    }

    public static void checkForLengthEqual(String [] args, int val, String msg)
    {
        if (args.length != val)
            doWorkForControl(msg);
    }

    public static void checkForLengthGreater(String [] args, int val, String msg)
    {
        if (args.length <= val)
            doWorkForControl(msg);
    }

    public static void checkForLengthGreaterOrEqual(String [] args, int val, String msg)
    {
        if (args.length < val)
            doWorkForControl(msg);
    }

    public static void checkForLengthLess(String [] args, int val, String msg)
    {
        if (args.length >= val)
            doWorkForControl(msg);
    }

    public static void checkForLengthLessOrEqual(String [] args, int val, String msg)
    {
        if (args.length > val)
            doWorkForControl(msg);
    }

    public static String [] getCommandLineArgs(String [] args, String msg)
    {
        if (args.length == 0)
            return Console.read(msg).split("[ \t\r]+");

        return args;
    }

    public static String getCommandLineArgsJoin(String [] args, String msg)
    {
        if (args.length == 0)
            args =  Console.read(msg).split("[ \t\r]+");

        return String.join("", args);
    }
}
