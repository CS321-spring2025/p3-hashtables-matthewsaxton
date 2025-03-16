import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 */
public abstract class Hashtable {

    protected int size;
    protected int capacity;
    protected int loadFactor;
    protected Object[] hashTable;
    //TODO: SETUP AWS

    public Hashtable(int capacity, int loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.size = 0;
    }

    /**
     *
     * @return
     */
    public Object search(HashObject hashObject) {
        int key = hashObject.hashCode();
//        int i = h(key, capacity);
//        while (hashTable[i] != null) {
//            if(key.equals(hashTable[i])) {
//                return hashTable[i];
//            }
//            i = (i == capacity) ? 0 : i + 1;
//        }
        return null;

        //TODO: FIX SEARCH FUNCTION
    }

    /**
     * Uses a key value, and hashCode() for HashObject's key. hashCode() will be used to perform
     * hash function calculation. Two different keys may have the same hashCode() value.
     * @param hashObject
     */
    public int insert(HashObject hashObject) {
        int i = 0;
        int key = hashObject.hashCode();
        while (i == size) { //TODO: Count number of probes and frequency in insert or in search.
            int probe = h(key, i);
            if (hashTable[probe] == null) {
                hashTable[probe] = key;
                return probe;
            } else {
                i++;
            }
        }
        throw new Error("Hashtable overflow!");
    }


    /**
     * Ensures the mod operation returns a positive integer.
     *
     * @param dividend
     * @param divisor
     * @return quotient
     */
    protected int positiveMod(int dividend, int divisor) {
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
    public abstract int h(int key, int probe);
}
