import java.util.ArrayList;

/**
 * This class represents a generic selection sort algorithm.
 * @author Vivek
 * @version 1.0
 * A generic that extends T and is lower bounded
 * @param <T> variable of a generic
 */
public class AbstractDex<T extends Comparable<? super T>> {
    private ArrayList<T> entries;
    private boolean sorted;

    /**
     * Empty constructor to create an entries list with no entries
     */
    public AbstractDex() {
        this.entries = new ArrayList<T>();
    }

    /**
     * Sorts an array list using selection sort.
     */
    public void selectionSort() {
        for (int i = 0; i < (entries.size() - 1); i++) {
            T smallest = entries.get(i);
            int smallestIndex = i;
            for (int j = (i + 1); j < entries.size(); j++) {
                if (smallest.compareTo(entries.get(j)) > 0) {
                    smallest = entries.get(j);
                    smallestIndex = j;
                }
            }
            smallest = entries.remove(smallestIndex);
            entries.add(i, smallest);
        }
        this.sorted = true;
    }
}