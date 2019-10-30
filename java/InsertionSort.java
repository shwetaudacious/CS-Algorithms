import java.util.ArrayList;

/**
 * This class represents a generic insertion sort algorithm.
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
     * Sorts an array list using insertion sort
     */
    public void insertionSort() {
        for (int i = 1; i < entries.size(); i++) {
            T hold = entries.get(i);
            int j = i;
            while ((j > 0) && (hold.compareTo(entries.get(j - 1)) < 0)) {
                T temp = entries.remove(j);
                entries.add(j - 1, temp);
                j--;
            }
        }
        this.sorted = true;
    }
}