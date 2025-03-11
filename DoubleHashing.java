public class DoubleHashing extends Hashtable{

    public DoubleHashing(int capacity, int loadFactor) {
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
        if(search(key.hashCode()) > 0) { //check if hashCode exists elsewhere.
            return positiveMod(key.hashCode(), capacity);
        }
         else {
             return 1 + positiveMod(key.hashCode(), capacity - 2);
        }
    }
}
