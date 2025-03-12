public class HashtableExperiment {
    public static void main(String[] args) {
        if(args.length == 0) {
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

    }
}
