package util;

public final class CommandLineArgsUtil {
    private CommandLineArgsUtil()
    {}

    private static String join(String [] str, String delimiter)
    {
        var result = new StringBuilder();

        for (var s : str)
            result.append(s).append(delimiter);

        return result.substring(0, result.length() - delimiter.length());
    }


    public static void checkForLengthEqual(String [] args, int count, String errMessage, int exitCode)
    {
        if (args.length != count) {
            Console.Error.writeLine(errMessage);
            System.exit(exitCode);
        }
    }

    public static void checkForLengthGreater(String [] args, int count, String errMessage, int exitCode)
    {
        if (args.length > count) {
            Console.Error.writeLine(errMessage);
            System.exit(exitCode);
        }
    }

    public static void checkForLengthGreaterOrEqual(String [] args, int count, String errMessage, int exitCode)
    {
        checkForLengthGreater(args, count + 1, errMessage, exitCode);
    }


    public static void checkForLengthLess(String [] args, int count, String errMessage, int exitCode)
    {
        if (args.length < count) {
            Console.Error.writeLine(errMessage);
            System.exit(exitCode);
        }
    }

    public static void checkForLengthLessOrEqual(String [] args, int count, String errMessage, int exitCode)
    {
        checkForLengthLess(args, count + 1, errMessage, exitCode);
    }

    public static String getCommandLineArgsJoin(String [] args, String stdIntMessage, String delimiter)
    {
        return args.length == 0 ? Console.read(stdIntMessage) : join(args, delimiter);
    }

    public static String getCommandLineArgsJoin(String [] args, String stdIntMessage, char delimiter)
    {
        return getCommandLineArgsJoin(args, stdIntMessage, delimiter + "");
    }
}
