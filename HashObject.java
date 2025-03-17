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
        freqCount++;
    }

    /**
     * Returns the frequency count.
     * @return freqCount
     */
    public int getFreqCount() {
        return freqCount;
    }

    /**
     * Increments probe count.
     */
    public void updateProbeCount() {
        if (freqCount == 0) {
            probeCount++;
        }
    }

    /**
     * Returns probe count.
     * @return probeCount
     */
    public int getProbeCount() {
        return probeCount;
    }

    @Override
    public boolean equals(Object obj) {
        return this.key == obj;
    }

    @Override
    public String toString() {
        //TODO: Write toString() method.
        return "HashObject [key=" + key + ", freqCount=" + freqCount + ", probeCount=";
    }


}
