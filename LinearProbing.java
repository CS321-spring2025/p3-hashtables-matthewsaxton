/**
 *
 */
public class LinearProbing extends Hashtable{

    public LinearProbing(int capacity, int loadFactor) {
        super(capacity, loadFactor);
    }



    /**
     * Hash function for LinearProbing method.
     * @param key
     * @param probe
     * @return Hashtable value where Object is placed.
     */
    @Override
    public int h(Object key, int probe) {
        return positiveMod(key.hashCode(), capacity);
    }
}
