package seedu.taskscheduler.commons.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility methods
 */
public class CollectionUtil {

    /**
     * Returns true if any of the given items are null.
     */
    public static boolean isAnyNull(Object... items) {
        for (Object item : items) {
            if (item == null) {
                return true;
            }
        }
        return false;
    }

    //@@author A0148145E
    /**
     * Returns true if all of the given items are null.
     */
    public static boolean isAllNull(Object... items) {
        for (Object item : items) {
            if (item != null) {
                return false;
            }
        }
        return true;
    }
    //@@author

    /**
     * Throws an assertion error if the collection or any item in it is null.
     */
    public static void assertNoNullElements(Collection<?> items) {
        assert items != null;
        assert !isAnyNull(items);
    }

    /**
     * Returns true if every element in a collection are unique by {@link Object#equals(Object)}.
     */
    public static boolean elementsAreUnique(Collection<?> items) {
        final Set<Object> testSet = new HashSet<>();
        for (Object item : items) {
            final boolean itemAlreadyExists = !testSet.add(item); // see Set documentation
            if (itemAlreadyExists) {
                return false;
            }
        }
        return true;
    }
}
