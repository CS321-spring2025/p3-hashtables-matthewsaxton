public class TwinPrimeGenerator {

    /**
     * Generates a prime number in which number two below is also prime
     * in a given range.
     * @param min - minimum range value
     * @param max - maximum range value
     * @return twin prime value
     */
    public static int generateTwinPrime(int min, int max) {
        for(int i = min + 2; i <= max; i++) {
            if(isPrime(i)) { //checks if first instance number is prime
                if(isPrime(i - 2)) { //checks if it has twin prime
                    return i;
                }
            }
        }
        throw new Error("Could not generate twin prime");
    }

    /**
     * Checks if given number is prime.
     * @param num - value to check if prime
     * @return true/false - if value is a prime number
     */
    private static boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) { //checks if prime
                return false;
            }
        }
        return true;
    }

    /**
     * Main method used for smoke testing purposes.
      * @param args
     */
    public static void main(String[] args) {
        int twinPrime = generateTwinPrime(150, 500);
        System.out.println(twinPrime);
    }
}
