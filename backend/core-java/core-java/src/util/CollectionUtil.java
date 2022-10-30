/*----------------------------------------------------------------------------------------------------------------------
    CollectionUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package util;

import java.util.Collection;
import java.util.HashSet;

public final class CollectionUtil {
    private CollectionUtil()
    {
    }

    public static <T> boolean areAllDistinct(Collection<? extends T> collection)
    {
        return collection.size() == new HashSet<T>(collection).size();
    }
}
