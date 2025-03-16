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
    public int h(int key, int probe) {

        if(!search(key).equals(key)) { //check if hashCode exists elsewhere.
            return positiveMod(key, capacity);
        }
         else {
             return 1 + positiveMod(key, capacity - 2);
        }
    }
}
