/**
 * Creates a new HashObject
 * to be sorted into a HashTable.
 *
 * @author Matthew Saxton
 */
public class HashObject {
    private Object key;
    private int freqCount;
    private int probeCount;

    public HashObject(Object key) {
        this.key = key;
        this.freqCount = 0;
        this.probeCount = 0;
    }

    /**
     * Returns key.
     * @return key
     */
    public Object getKey() {
        return key;
    }

    /**
     * Increments frequency count.
     */
    public void updateFreqCount() {
        this.freqCount++;
    }

    /**
     * Returns the frequency count.
     * @return freqCount
     */
    public int getFreqCount() {
        return this.freqCount;
    }

    /**
     * Increments probe count.
     */
    public void updateProbeCount() {
        this.probeCount++;
    }

    /**
     * Returns probe count.
     * @return probeCount
     */
    public int getProbeCount() {
        return this.probeCount;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        return key.equals(((HashObject)obj).getKey());
    }

    @Override
    public String toString() {
        return key.toString() + " " + freqCount + " " + probeCount;
    }


}
