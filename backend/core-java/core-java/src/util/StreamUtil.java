package util;

import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.function.Predicate;

public final class StreamUtil {
    private StreamUtil()
    {
    }

    public static <T, R> R filter(Stream<T> stream, Predicate<T> predicate, Collector<? super T, ?, ? extends R> collector)
    {
        return stream.filter(predicate).collect(collector);
    }
}
