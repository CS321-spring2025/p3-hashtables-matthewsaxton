/**
 *
 */
public abstract class Hashtable {

    protected int size;
    protected int capacity;
    protected int loadFactor;

    public Hashtable(int capacity, int loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
    }

    public abstract int h(Object key, int probe);
}
