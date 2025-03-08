/**
 *
 */
public class LinearProbing extends Hashtable{

    public LinearProbing(int capacity, int loadFactor) {
        super(capacity, loadFactor);
    }

    /**
     *
     * @param key
     * @param probe
     * @return
     */
    public int h(Object key, int probe) {
        return 0; //for compilation purposes
    }
}
