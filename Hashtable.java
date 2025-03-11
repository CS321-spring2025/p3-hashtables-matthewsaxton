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
        this.size = 0;
    }

    /**
     * Uses a key value, and hashCode() for HashObject's key. hashCode() will be used to perform
     * hash function calculation. Two different keys may have the same hashCode() value.
     * @param key
     * @param value
     */
    public void insert(Object key, int value) {
        //checks if the n/m has exceeded the load factor.
        if((size / capacity) >= loadFactor) {
            throw new IndexOutOfBoundsException("n/m has exceeded load factor");
        }
        //use hashCode() value for HashObject's key.

        //use hashCode to perform hash function

        //compare actual key objects with equals method, checking for duplicates

    }

    public int search(int key) {
        return -1;
    }

    /**
     * Hash function.
     * @param key
     * @param probe
     * @return
     */
    public abstract int h(Object key, int probe);
}
