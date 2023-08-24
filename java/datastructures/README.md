# CF 401 Data Structures and Algorithms
## Table of Contents
##### Authored by Jonathon Stillson
* [Code Challenge: Class 01: Reverse an Array](#code-challenge-class-01-reverse-an-array)
* [Code Challenge: Class 02: Shift an Array](#code-challenge-class-02-shift-an-array)
* [Code Challenge: Class 03: Array Binary Search](#code-challenge-class-03-array-binary-search)
* [Code Challenge: Class 04: Linked List Implementation](#code-challenge-class-04-linked-list-implementation)
* [Code Challenge: Class 05: Linked List Implementation](#code-challenge-class-05-linked-list-implementation)
* [Code Challenge: Class 06: Linked List Implementation II](#code-challenge-class-06-linked-list-implementation-ii)
* [Code Challenge: Class 7: Linked List Implementation III - k-th value](#code-challenge-class-7-linked-list-implementation-iii---k-th-value)
* [Code Challenge: Class 8: Zipping two linked lists](#code-challenge-class-8-zipping-two-linked-lists)
* [Code Challenge: Class 10: Implementing Stack and Queue](#code-challenge-class-10-implementing-stack-and-queue)
* [Code Challenge: Class 12: First-in, First out Animal Shelter](#code-challenge-class-12-first-in-first-out-animal-shelter)
* [Code Challenge: Class 13: Multi-bracket Validation](#code-challenge-class-13-multi-bracket-validation)
* [Code Challenge: Class 15: Binary Tree and BST Implementation](#code-challenge-class-15-binary-tree-and-bst-implementation)
* [Code Challenge: Class 16: Find Maximum Value in a Binary Tree](#code-challenge-class-16-find-maximum-value-in-a-binary-tree)
* [Code Challenge: Class 17: Breadth First Traversal](#code-challenge-class-17-breadth-first-traversal)
* [Code Challenge: Class 18: FizzBuzz Tree](#code-challenge-class-18-fizzbuzz-tree)
* [Code Challenge: Class 26: Insertion Sort](#code-challenge-class-26-insertion-sort)
* [Code Challenge: Class 27: Merge Sort](#code-challenge-class-27-merge-sort)
* [Code Challenge: Class 28: Quick Sort](#code-challenge-class-28-quick-sort)
* [Code Challenge: Class 30: Hash Table Implementation](#code-challenge-class-30-hash-table-implementation)

___

# Code Challenge: Class 05: Linked List Implementation
Create a Node class and Linked List class

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Created the following classes: Node & LinkedList

### Node Class

Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.

### LinkedList Class 
* Within your Linked List class, include a head property.
* Upon instantiation, an empty Linked List should be created.
 * The class should contain the following methods: 
   * insert
     * Arguments: value
     * Returns: nothing
     * Adds a new node with that value to the head of the list with an O(1) Time performance.
   * includes
     * Arguments: value
     * Returns: Boolean
       * Indicates whether that value exists as a Node’s value somewhere within the list.
   * to string
     * Arguments: none
     * Returns: a string representing all the values in the Linked List, formatted as:
     * `"{ a } -> { b } -> { c } -> NULL"`

## Solution
<!-- Show how to run your code, and examples of it in action -->
___
# Code Challenge: Class 06: Linked List Implementation II

## Whiteboard Process
N/a

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Augmented the LinkedList class to add the following features:
* append
  * arguments: new value
  * adds a new node with the given value to the end of the list
* insert before
  * arguments: value, new value
  * adds a new node with the given new value immediately before the first node that has the value specified
* insert after
  * arguments: value, new value
  * adds a new node with the given new value immediately after the first node that has the value specified

## Solution
<!-- Show how to run your code, and examples of it in action -->

___
# Code Challenge: Class 7: Linked List Implementation III - k-th value 

## Whiteboard Process
N/a

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Augmented the LinkedList class to add the following features:
* kth from end
  * argument: a number, `k`, as a parameter
  * Return the node's value that is `k` places from the tail of the linked list.
  * You have access to the Node class and all the properties on the LL class as well as the methods created in prev. challenges.

O(N) Time, O(1) Space

## Solution
<!-- Show how to run your code, and examples of it in action -->

___
# Code Challenge: Class 8: Zipping two linked lists

Challenge Type: Code Challenge / Algorithm

Feature Tasks
* Write a function called zip lists
* Arguments: 2 Linked Lists
* Return: New Linked List, zipped as noted below
* Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the zipped list.
* Try and keep additional space down to O(1)
* You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

___
# Code Challenge: Class 10: Implementing Stack and Queue
Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue.

Feature Tasks: 

**Stack Data Structure Methods:**
* pop()
* peek()
* push(T value)
* isEmpty()

**Queue Data Structure Methods:**
* enqueue()
* dequeue()
* peek()
* isEmpty()

___

# Code Challenge: Class 12: First-in, First out Animal Shelter.

Feature Tasks:
* Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
* Implement the following methods:
  * enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
  * dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

___

# Code Challenge: Class 13: Multi-bracket Validation.

Feature Tasks
* Write a function called validate brackets
* Arguments: string
* Return: boolean
  * representing whether or not the brackets in the string are balanced

There are 3 types of brackets:

* Round Brackets : ()
* Square Brackets : []
* Curly Brackets : {}

___ 

# Code Challenge: Class 15: Binary Tree and BST Implementation

Feature Tasks
*Node*
* Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

*Binary Tree*
* Create a Binary Tree class
  * Define a method for each of the depth first traversals:
    * pre order
    * in order
    * post order

  * Each depth first traversal method should return an array of values, ordered appropriately.

*Binary Search Tree*
* Create a Binary Search Tree class
  * This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
  * Add
    * Arguments: value
    * Return: nothing
    * Adds a new node with that value in the correct location in the binary search tree.
* Contains
  * Argument: value
  * Returns: boolean indicating whether or not the value is in the tree at least once.

___

# Code Challenge: Class 16: Find Maximum Value in a Binary Tree

Feature Tasks

Write the following method for the Binary Tree class

* find maximum value
  * Arguments: none
  * Returns: number
  
Find the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

___

# Code Challenge: Class 17: Breadth First Traversal

Feature Tasks

Write a function called breadth first

* Arguments: tree
* Return: list of all values in the tree, in the order they were encountered
* NOTE: Traverse the input tree using a Breadth-first approach

___

# Code Challenge: Class 18: FizzBuzz Tree

Feature Tasks

Write a function called fizz buzz tree
Arguments: k-ary tree
Return: new k-ary tree
Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:

If the value is divisible by 3, replace the value with “Fizz”
If the value is divisible by 5, replace the value with “Buzz”
If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
If the value is not divisible by 3 or 5, simply turn the number into a String.

___

# Code Challenge: Class 26: Insertion Sort

Feature Tasks

Write a blog post that demonstrates a visual step-through of the insertion sort algorithm

implement insertion sort for an array of numbers and add tests.

InsertSortTest.java tests all functionality of the InsertSort class.
___

# Code Challenge: Class 27: Merge Sort

Feature Tasks

Write a blog post that demonstrates a visual step-through of the merge sort algorithm

implement merge sort for an array of numbers and add tests.

MergeSortTest.java tests all functionality of the MergeSort class.
___

# Code Challenge: Class 28: Quick Sort

Feature Tasks

Write a blog post that demonstrates a visual step-through of the quick sort algorithm

implement quick sort for an array of numbers and add tests.

QuickSortTest.java tests all functionality of the QuickSort class.
___

# Code Challenge: Class 30: Hash Table Implementation

Feature Tasks

Implement a Hashtable with the following methods:

* add
  * Arguments: key, value
  * Returns: nothing
  * This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
* get
  * Arguments: key
  * Returns: Value associated with that key in the table
* contains
  * Arguments: key
  * Returns: Boolean, indicating if the key exists in the table already.
* hash
  * Arguments: key
  * Returns: Index in the collection for that key

Structure and Testing

* Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge.

* Write tests to prove the following functionality:
  * Adding a key/value to your hashtable results in the value being in the data structure
  * Retrieving based on a key returns the value stored
  * Successfully returns null for a key that does not exist in the hashtable
  * Successfully handle a collision within the hashtable
  * Successfully retrieve a value from a bucket within the hashtable that has a collision
  * Successfully hash a key to an in-range value

___

