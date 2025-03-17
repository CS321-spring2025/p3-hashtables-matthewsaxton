public class DoubleHashing extends Hashtable{

    public DoubleHashing(int capacity, double loadFactor) {
        super(capacity, loadFactor);
    }

    /**
     * Hash function for DoubleHashing method.
     * @param key
     * @param probe
     * @return Hashtable value where Object is placed.
     */
    @Override
    public int h(Object key, int probe) {
        int h1 = positiveMod(key.hashCode(), capacity);
        int h2 = 1 + positiveMod(key.hashCode(), capacity - 2);

        return positiveMod(h1 + probe * h2, capacity);
    }
}
