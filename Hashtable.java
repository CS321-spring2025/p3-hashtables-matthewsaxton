import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *  Creates a HashTable, with the ability to
 *  insert and search for objects within itself.
 *
 * @author Matthew Saxton
 * @author CS321 Instructors (dumpToFile outline)
 */
public abstract class Hashtable {

    protected int size;
    protected int capacity;
    protected double loadFactor;
    protected HashObject[] hashTable;
    protected int numInserts;
    protected int numDuplicates;
    protected int numProbes;

    public Hashtable(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.size = 0;
        this.hashTable = new HashObject[capacity];
        this.numInserts = 0;
        this.numDuplicates = 0;
        this.numProbes = 0;
    }

    /**
     * Searches if hashObject is in the HashTable
     *
     * @param hashObject - object to look for
     * @return probe if hashObject exists, -1 if not
     */
    public int search(HashObject hashObject) {
        int key = hashObject.hashCode();
        for(int i = 0; i < capacity; i++){
            int probe = h(key, i);
            if(hashTable[probe] == null) {
                return -1;
            }
            //if there is a match, return the probe where the hashObject matches
            if(hashTable[probe].getKey().equals(hashObject.getKey())){
                return probe;
            }
        }
        return -1;
    }

    /**
     * Inserts a given hashObject into the table.
     * Will check if the loadFactor has been exceeded, as well as for
     * duplicates. Also keeps track of amount of probes.
     *
     * @param hashObject - object to be inserted
     * @return probe if inserted, -1 if unable to insert
     */
    public int insert(HashObject hashObject) {
        //checks if loadFactor has been exceeded
        if((double)size / capacity >= loadFactor){
            return -1;
        }

        //checks to see if the hashObject exists in the table already
        int fullIndex = search(hashObject);

        if(fullIndex != -1){
            hashTable[fullIndex].updateFreqCount();
            numDuplicates++;
            numInserts++;

            return fullIndex;
        }

        int key = hashObject.hashCode();

        numInserts++;
        int probeCount = 0;

        //Loops until there is a probe that is empty
        for (int i = 0; i < capacity; i++) {
            int probe = h(key, i);
            probeCount++;
            hashObject.updateProbeCount();

            if (hashTable[probe] == null) {
                hashTable[probe] = hashObject;

                hashObject.updateFreqCount();

                size++;
                numProbes += probeCount;
                return probe;
            }
        }
        return -1;
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

    /**
     * Implements the hashTable into a txt file.
     * @param fileName
     */
    public void dumpToFile(String fileName) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(fileName);
            for(int i = 0; i < capacity; i++) {
                if(hashTable[i] != null) {
                    out.println("table[" + i + "]: " + hashTable[i].toString());
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        out.close();
    }

    public String toString() {
        String str = "";
        for(int i = 0; i < capacity; i++) {
            if(hashTable[i] != null) {
                str = "table[" + i + "]: " + hashTable[i].toString() + "\n";
                if(hashTable[i].getFreqCount() > 1) {
                    str += "^^^DUPLICATE^^^\n";
                }
            }
        }
        return str;
    }

    /**
     * Hash function.
     * @param key
     * @param probe
     * @return
     */
    public abstract int h(Object key, int probe);
}
