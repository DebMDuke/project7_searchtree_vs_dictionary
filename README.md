# project6spring2021
Starter files for CMSC 256 Project 6

# Programming Project 6 – Words in Literature
Note: When you turn in an assignment to be graded in this class, you are making the claim that you neither gave nor received assistance on the work you turned in (except, of course, assistance from your instructor). Any assistance from other sources, including the internet, is an honor code violation.
In this programming project you will write a program to read text data from the BRIDGES API, implement a Map (Dictionary) using two different data structures (a binary search tree and a hash table) using BRIDGES elements, and visualize them with BRIDGES. Additionally, you will examine the efficiency of these two approaches. To start the project, you’ll analyze a short poem to determine which words are used most often, then analyze the entire Shakespeare work to explore algorithmic efficiency. The main assignment is to count how many times each word appears in a single poem. This will be accomplished using a Dictionary implemented as a Binary Search Tree and as a Hash Map.
Counting word appearances using a Dictionary 
A Dictionary is used to store and retrieve (key, value) pairs. In this assignment they will be useful to count how many times a particular word appears in a literary work. The keys are going to be words. And the value associated with that key is going to be how many times that word appears. Counting the words then becomes:

	```Algorithm:
	
Dictionary d

for each word w in document

  entry = d.get(w)
  
  if (entry is NULL)
  
    d.insert (w, 1)
    
  else
  
    entry.value += 1```
    
1.	Clone the GitHub repository, open your scaffolded code, plug in your credentials, review the Dictionary interface, Dictionary.java, and the implementation of the StandardDictionary.java class that uses a Java HashMap to store the key-value pairs.
2.	Run the scaffold code by executing the main method in the Project 6 class that uses the StandardDictionary to read and separate the words in the text.
3.	Follow the algorithm given above to compute the number of occurrences of each work in the main method TODO location and visualize the dictionary.
4.	Implement the Dictionary interface by completing the implementation of the MySearchTree.java class using a Binary Search Tree and the BSTElement of BRIDGES.
5.	Add code in the main method of the Project6 class to use the SearchTreeDictionary and visualize the Dictionary using BRIDGES.
6.	Implement the Dictionary interface by completing the implementation of the MyHashTable.java class using a hash table.
7.	Use BRIDGES SymbolCollection to generate a visualization of the hash table.
8.	Use the complete works of Shakespeare to observe the performance difference between the hash table and the binary search tree implementation of the dictionary.
9.	Submit the following files to Gradescope: **Project6.java**, **MyHashTable.java**, and **MySearchTree.java**

