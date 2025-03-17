import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Creates and debugs HashTables,
 * using the Linear Probing and Double Hashing methods.
 *
 * @author Matthew Saxton
 */
public class HashtableExperiment {
    public static void main(String[] args) {
        //checks for correct implementation
        if (args.length == 0) {
            System.out.println("Usage: java HashtableExperiment <dataSource> <loadFactor> [<debugLevel>]" +
                    "\n\t<dataSource>: 1 ==> random numbers" +
                    "\n\t\t\t2 ==> date value as a long" +
                    "\n\t\t\t3 ==> word list" +
                    "\n\t<loadFactor>: The ratio of objects to table size," +
                    "\n\t\t\tdenoted by alpha = n/m" +
                    "\n\t<debugLevel>: 0 ==> print summary of experiment" +
                    "\n\t\t\t1 ==> save the two hash tables to a file at the end" +
                    "\n\t\t\t2 ==> print debugging output for each insert");
            System.exit(1);
        }
        int capacity = TwinPrimeGenerator.generateTwinPrime(95500, 96000);
        double loadFactor = Double.parseDouble(args[1]);
        double n = Math.ceil(loadFactor * capacity);
        String input = null;
        int linearNumObjects = 0;
        int doubleNumObjects = 0;

        //create new hashtables for each method
        LinearProbing linProbe = new LinearProbing(capacity, loadFactor);
        DoubleHashing doubleHash = new DoubleHashing(capacity, loadFactor);

        if (args[0].equals("1")) {
            input = "Random-Numbers";
            Random rand = new Random();

            //checks if either hashtable has exceeded the loadFactor
            while (((double) linearNumObjects / capacity) < loadFactor || ((double) doubleNumObjects / capacity) < loadFactor) {
                int randomInt = (rand.nextInt(capacity));

                if (((double) linearNumObjects / capacity) < loadFactor) {
                    HashObject linearHashObject = new HashObject(randomInt);

                    linProbe.insert(linearHashObject);

                    linearNumObjects++;

                }
                if (((double) doubleNumObjects / capacity) < loadFactor) {
                    HashObject doubleHashObject = new HashObject(randomInt);

                    doubleHash.insert(doubleHashObject);

                    doubleNumObjects++;

                }
            }
        } else if (args[0].equals("2")) {
            input = "Dates";
            long current = new Date().getTime();

            //checks if either hashtable has exceeded the loadFactor
            while (((double) linearNumObjects / capacity) < loadFactor || ((double) doubleNumObjects / capacity) < loadFactor) {
                Date date = new Date(current);

                if (((double) linearNumObjects / capacity) < loadFactor) {

                    HashObject linearHashObject = new HashObject(date);
                    linProbe.insert(linearHashObject);
                    linearNumObjects++;

                }
                if (((double) doubleNumObjects / capacity) < loadFactor) {
                    HashObject doubleHashObject = new HashObject(date);

                    doubleHash.insert(doubleHashObject);

                    doubleNumObjects++;

                }
                current += 1000;
            }

        } else if (args[0].equals("3")) {
            input = "Word-List";
            try {
                //scans through each line of file
                File wordListFile = new File("word-list.txt");
                Scanner fileScanner = new Scanner(wordListFile);
                int lineCounter = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();

                        //create new object for each method
                        HashObject linearObject = new HashObject(line);
                        HashObject doubleObject = new HashObject(line);

                        //insert objects
                        linProbe.insert(linearObject);
                        doubleHash.insert(doubleObject);

                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        //calculating average probe for each table
        double avgLinProbe = (double) linProbe.numProbes/linProbe.size;
        double avgDoubleProbe = (double) doubleHash.numProbes/doubleHash.size;
        if (args.length < 3 || args[2].equals("0")) {
            //prints summary of hashtable
            System.out.println("HashTableExperiment: Found a twin Prime table capacity: " + capacity);
            System.out.print("HashtableExperiment: Input: " + input);
            System.out.printf("\tLoadfactor: %.2f\n", loadFactor);

            //prints summary of linear probing hashtable
            System.out.println("\n\tUsing Linear Probing: ");
            System.out.println("HashtableExperiment: size of hash table is " + linProbe.size);
            System.out.println("\tInserted " + linProbe.numInserts + " elements, of which " + linProbe.numDuplicates + " were duplicates");
            System.out.printf("\tAvg. no. of probes = %.2f\n", avgLinProbe);

            //prints summary of double hashing hashtable
            System.out.println("\n\t Using Double Hashing: ");
            System.out.println("HashtableExperiment: size of hash table is " + doubleHash.size);
            System.out.println("\tInserted " + doubleHash.numInserts + " elements, of which " + doubleHash.numDuplicates + " were duplicates");
            System.out.printf("\tAvg. no. of probes = %.2f\n", avgDoubleProbe);
        }
        else if (args[2].equals("1")) {
            //prints out summary of HashTable
            System.out.println("HashTableExperiment: Found a twin Prime table capacity: " + capacity);
            System.out.print("HashtableExperiment: Input: " + input);
            System.out.printf("\tLoadfactor: %.2f\n", loadFactor);

            //Prints summary of Linear Probing Hashtable
            System.out.println("\n\tUsing Linear Probing: ");
            System.out.println("HashtableExperiment: size of hash table is " + linProbe.size);
            System.out.println("\tInserted " + linProbe.numInserts + " elements, of which " + linProbe.numDuplicates + " were duplicates");
            System.out.printf("\tAvg. no. of probes = %.2f\n", avgLinProbe);
            linProbe.dumpToFile("linear-dump.txt");
            System.out.println("HashtableExperiment: Saved dump of hash table");

            //Prints summary of Double Hashing Hashtable
            System.out.println("\n\t Using Double Hashing: ");
            System.out.println("HashtableExperiment: size of hash table is " + doubleHash.size);
            System.out.println("\tInserted " + doubleHash.numInserts + " elements, of which " + doubleHash.numDuplicates + " were duplicates");
            System.out.printf("\tAvg. no. of probes = %.2f\n", avgDoubleProbe);
            doubleHash.dumpToFile("double-dump.txt");
            System.out.println("HashtableExperiment: Saved dump of hash table");
        }
        else if(args[2].equals("2")) {
            //prints out the elements of each hashtable, marks if duplicate
            System.out.println("Linear Probing Elements: ");
            System.out.println(linProbe.toString());
            System.out.println("Double Hashing Elements: ");
            System.out.println(doubleHash.toString());
        }
    }
}
