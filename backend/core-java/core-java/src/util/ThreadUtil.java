package util;

public final class ThreadUtil {
    private ThreadUtil()
    {
    }

    public static void sleep(long milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException ex) {

        }
    }
}
