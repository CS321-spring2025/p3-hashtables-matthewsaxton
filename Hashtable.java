import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
     * @param value
     */
    public void insert(int value) {
        //checks if the n/m has exceeded the load factor.
        if((size / capacity) >= loadFactor) {
            throw new IndexOutOfBoundsException("n/m has exceeded load factor");
        }
        //use hashCode() value for HashObject's key.
        HashObject newHO = new HashObject(hashCode(), value);

        //use hashCode to perform hash function
        int hashIndex = h(newHO.getKey(), capacity);
        //compare actual key objects with equals method, checking for duplicates

    }

    /**
     *
     * @param key
     * @return
     */
    public int search(int key) {
        for(int i = 0; i < capacity; i++) {
            if(key == i){
                return -1;
            }
        }
        return key;
    }

    /**
     * Ensures the mod operation returns a positive integer.
     * @param dividend
     * @param divisor
     * @return quotient
     */
    protected int positiveMod (int dividend, int divisor) {
        int quotient = dividend % divisor;
        if (quotient < 0)
            quotient += divisor;
        return quotient;
    }

    public void dumpToFile(String fileName) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // loop through the hash table, and print non-null entries
        // using toString() method in the HashObject class
        out.close();
    }

    /**
     * Hash function.
     * @param key
     * @param probe
     * @return
     */
    public abstract int h(Object key, int probe);
}
