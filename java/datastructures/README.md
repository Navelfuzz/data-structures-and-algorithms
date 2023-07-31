# Code Challenge: Class 05: Linked List Implementation
Create a Node class and Linked List class

## Whiteboard Process
N/a

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
