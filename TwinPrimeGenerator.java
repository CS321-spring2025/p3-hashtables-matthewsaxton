public class TwinPrimeGenerator {

    /**
     * Generates a prime number in which number two below is also prime
     * in a given range.
     * @param min - minimum range value
     * @param max - maximum range value
     * @return twin prime value
     */
    public static int generateTwinPrime(int min, int max) {
        for(int i = Math.max(min, 3); i <= max; i++) {
            if(isPrime(i) && isPrime(i - 2)) {
                return i;
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
        if(num < 2){
            return false;
        }
        if(num == 2) {
            return true;
        }
        if(num % 2 == 0) {
            return false;
        }
        for(int i = 3; i * i <= num; i += 2) {
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
