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

    public void insert(int key, int value) {

    }

    public int search(int key) {
        return -1;
    }

    public abstract int h(Object key, int probe);
}
