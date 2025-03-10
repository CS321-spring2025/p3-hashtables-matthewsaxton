public class DoubleHashing extends Hashtable{

    public DoubleHashing(int capacity, int loadFactor) {
        super(capacity, loadFactor);
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

    /**
     * Hash function for DoubleHashing method.
     * @param key
     * @param probe
     * @return Hashtable value where Object is placed.
     */
    @Override
    public int h(Object key, int probe) {
        return 1 + positiveMod(key.hashCode(), capacity - 2);
    }
}
