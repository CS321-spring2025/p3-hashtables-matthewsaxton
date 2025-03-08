public class TwinPrimeGenerator {


    public static int generateTwinPrime(int min, int max) {
        for(int i = min + 2; i <= max; i++) { //loops through list
            for(int j = 2; j <= i; j++) { //loops through divisors
                if (i % j == 0 && (j == 1 || j == i)) { //checks if number is prime
                    for(int k = 2; k <= i; k++) {
                        if ( (i - 2) % k != 0 && (k == 1 || k == i)) { //checks if twin number is prime
                            return i;
                        }
                    }
                }
            }
        }
        throw new Error("Could not generate twin prime");
    }

    public static void main(String[] args) {
        int twinPrime = generateTwinPrime(100, 200);
        System.out.println(twinPrime);
    }
}
