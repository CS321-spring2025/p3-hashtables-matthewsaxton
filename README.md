# Project 3: Hashtables

* Author: Matthew Saxton
* Class: CS321 Section 002
* Semester: Spring 2025

**Note: Download this file and add to your repo as README.md. Don't cut and paste it as you won't get the formatting Markdown tags!**

## Overview

This program takes a list of objects, and sorts them into a Hashtable. This program
does its sorting as both a Linear Probing method, as well using a double Hash method.


## Reflection

This project was difficult to debug. The large size of what was being implemented
as a hash table made it really difficult, especially if the errors were super deep into
a list. My understanding of HashTables were better than our previous project with MaxHeap,
so much of my initial code was somewhat correct, but the debugging took a lot more time than before.

I do feel that I really understand the implementation a lot more, and what the different
factors mean, and why they are important. For example, the relation of the load factor,
size, number of elements, and capacity was something that I never really grasped until
recently, but this project made me really understand how they work together so I could properly
implement a table.

## Compiling and Using

 To compile the code: \
    $ javac *.java \
 This will compile all the needed java files in the folder.

Then, to use the main program, HashtableExperiment, follow these guidelines in the terminal:\
java HashtableExperiment dataSource loadFactor [debugLevel] \
dataSource: 1 for random numbers, 2 for dates, 3 for word list \
loadFactor:  The ratio of objects to table size, denoted by α = n/m \
debugLevel: \
0 ==> print summary of experiment \
1 ==> same as 0 and dump the two hash tables to files at end \
2 ==> print debugging output for each insert



## Results 

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Random-Numbers	Loadfactor: 0.50

	Using Linear Probing: 
HashtableExperiment: size of hash table is 37700
Inserted 47896 elements, of which 10196 were duplicates
Avg. no. of probes = 1.00

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 37700
Inserted 47896 elements, of which 10196 were duplicates
Avg. no. of probes = 1.00
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Random-Numbers	Loadfactor: 0.60

	Using Linear Probing: 
HashtableExperiment: size of hash table is 43162
Inserted 57475 elements, of which 14313 were duplicates
Avg. no. of probes = 1.00

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 43162
Inserted 57475 elements, of which 14313 were duplicates
Avg. no. of probes = 1.00
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Random-Numbers	Loadfactor: 0.70

	Using Linear Probing: 
HashtableExperiment: size of hash table is 48311
Inserted 67054 elements, of which 18743 were duplicates
Avg. no. of probes = 1.00

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 48311
Inserted 67054 elements, of which 18743 were duplicates
Avg. no. of probes = 1.00
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Random-Numbers	Loadfactor: 0.80

	Using Linear Probing: 
HashtableExperiment: size of hash table is 52816
Inserted 76633 elements, of which 23817 were duplicates
Avg. no. of probes = 1.00

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 52816
Inserted 76633 elements, of which 23817 were duplicates
Avg. no. of probes = 1.00
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Random-Numbers	Loadfactor: 0.90

	Using Linear Probing: 
HashtableExperiment: size of hash table is 57052
Inserted 86212 elements, of which 29160 were duplicates
Avg. no. of probes = 1.00

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 57052
Inserted 86212 elements, of which 29160 were duplicates
Avg. no. of probes = 1.00
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Random-Numbers	Loadfactor: 0.95

	Using Linear Probing: 
HashtableExperiment: size of hash table is 58748
Inserted 91002 elements, of which 32254 were duplicates
Avg. no. of probes = 1.00

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 58748
Inserted 91002 elements, of which 32254 were duplicates
Avg. no. of probes = 1.00
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Random-Numbers	Loadfactor: 0.99

	Using Linear Probing: 
HashtableExperiment: size of hash table is 60383
Inserted 94834 elements, of which 34451 were duplicates
Avg. no. of probes = 1.00

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 60383
Inserted 94834 elements, of which 34451 were duplicates
Avg. no. of probes = 1.00
--------------------------------------------------------------------------------



--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Dates	Loadfactor: 0.50

	Using Linear Probing: 
HashtableExperiment: size of hash table is 47896
Inserted 47896 elements, of which 0 were duplicates
Avg. no. of probes = 1.28

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 47896
Inserted 47896 elements, of which 0 were duplicates
Avg. no. of probes = 1.37
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Dates	Loadfactor: 0.60

	Using Linear Probing: 
HashtableExperiment: size of hash table is 57475
Inserted 57475 elements, of which 0 were duplicates
Avg. no. of probes = 1.44

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 57475
Inserted 57475 elements, of which 0 were duplicates
Avg. no. of probes = 1.70
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Dates	Loadfactor: 0.70

	Using Linear Probing: 
HashtableExperiment: size of hash table is 67054
Inserted 67054 elements, of which 0 were duplicates
Avg. no. of probes = 1.60

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 67054
Inserted 67054 elements, of which 0 were duplicates
Avg. no. of probes = 2.01
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Dates	Loadfactor: 0.80

	Using Linear Probing: 
HashtableExperiment: size of hash table is 76633
Inserted 76633 elements, of which 0 were duplicates
Avg. no. of probes = 1.82

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 76633
Inserted 76633 elements, of which 0 were duplicates
Avg. no. of probes = 2.41
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Dates	Loadfactor: 0.90

	Using Linear Probing: 
HashtableExperiment: size of hash table is 86212
Inserted 86212 elements, of which 0 were duplicates
Avg. no. of probes = 2.18

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 86212
Inserted 86212 elements, of which 0 were duplicates
Avg. no. of probes = 3.12
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Dates	Loadfactor: 0.95

	Using Linear Probing: 
HashtableExperiment: size of hash table is 91002
Inserted 91002 elements, of which 0 were duplicates
Avg. no. of probes = 2.70

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 91002
Inserted 91002 elements, of which 0 were duplicates
Avg. no. of probes = 3.81
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Dates	Loadfactor: 0.99

	Using Linear Probing: 
HashtableExperiment: size of hash table is 94834
Inserted 94834 elements, of which 0 were duplicates
Avg. no. of probes = 5.41

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 94834
Inserted 94834 elements, of which 0 were duplicates
Avg. no. of probes = 5.39
--------------------------------------------------------------------------------


--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Word-List	Loadfactor: 0.50

	Using Linear Probing: 
HashtableExperiment: size of hash table is 47896
Inserted 1305930 elements, of which 1258034 were duplicates
Avg. no. of probes = 1.60

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 47896
Inserted 1305930 elements, of which 1258034 were duplicates
Avg. no. of probes = 1.39
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Word-List	Loadfactor: 0.60

	Using Linear Probing: 
HashtableExperiment: size of hash table is 57475
Inserted 1587659 elements, of which 1530184 were duplicates
Avg. no. of probes = 2.15

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 57475
Inserted 1587659 elements, of which 1530184 were duplicates
Avg. no. of probes = 1.53
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Word-List	Loadfactor: 0.70

	Using Linear Probing: 
HashtableExperiment: size of hash table is 67054
Inserted 1869206 elements, of which 1802152 were duplicates
Avg. no. of probes = 3.60

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 67054
Inserted 1869206 elements, of which 1802152 were duplicates
Avg. no. of probes = 1.72
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Word-List	Loadfactor: 0.80

	Using Linear Probing: 
HashtableExperiment: size of hash table is 76633
Inserted 2147748 elements, of which 2071115 were duplicates
Avg. no. of probes = 6.71

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 76633
Inserted 2147748 elements, of which 2071115 were duplicates
Avg. no. of probes = 2.02
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Word-List	Loadfactor: 0.90

	Using Linear Probing: 
HashtableExperiment: size of hash table is 86212
Inserted 2840050 elements, of which 2753838 were duplicates
Avg. no. of probes = 19.81

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 86212
Inserted 2840050 elements, of which 2753838 were duplicates
Avg. no. of probes = 2.57
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Word-List	Loadfactor: 0.95

	Using Linear Probing: 
HashtableExperiment: size of hash table is 91002
Inserted 3013622 elements, of which 2922620 were duplicates
Avg. no. of probes = 110.59

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 91002
Inserted 3013622 elements, of which 2922620 were duplicates
Avg. no. of probes = 3.19
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
HashTableExperiment: Found a twin Prime table capacity: 95791
HashtableExperiment: Input: Word-List	Loadfactor: 0.99

	Using Linear Probing: 
HashtableExperiment: size of hash table is 94834
Inserted 3024134 elements, of which 2929300 were duplicates
Avg. no. of probes = 471.67

	 Using Double Hashing: 
HashtableExperiment: size of hash table is 94834
Inserted 3024134 elements, of which 2929300 were duplicates
Avg. no. of probes = 4.70
--------------------------------------------------------------------------------



## Sources used

Resources used were all through the Java API, including the Random class,
and the hashCode() functionality.

----------

## Notes

* This README.md template is using Markdown. Here is some help on using Markdown: 
[markdown cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)


* Markdown can be edited and viewed natively in most IDEs such as Eclipse and VS Code. Just toggle
between the Markdown source and preview tabs.

* To preview your README.md output online, you can copy your file contents to a Markdown editor/previewer
such as [https://stackedit.io/editor](https://stackedit.io/editor).
