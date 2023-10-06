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

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
Node Class: This class represents a node in the binary tree. It contains properties for the node's value, left child 
node, and right child node. It's a basic building block for constructing binary trees.

BinaryTree Class: This class represents a basic binary tree structure. It has methods for depth-first traversals: 
pre-order, in-order, and post-order. These methods use recursive algorithms to traverse the tree and collect values in 
the specified order.

Pre-order Traversal: The algorithm starts from the root and collects values in the order root-left-right.
In-order Traversal: The algorithm collects values in the order left-root-right, which is used to retrieve the elements 
in sorted order in a binary search tree.
Post-order Traversal: The algorithm collects values in the order left-right-root, which can be useful in deleting nodes 
from a binary search tree.
BinarySearchTree Class: This class is a subclass of BinaryTree and implements the binary search tree operations: adding 
nodes and checking for containment.

Add Operation: The add method inserts a new node with the given value in the correct location in the binary search tree. 
The algorithm recursively searches for the appropriate location and adds the new node accordingly.
Contains Operation: The contains method searches for a specific value in the binary search tree using a recursive approach.
TreesTest.java: This JUnit test class is used to verify the correctness of the implemented classes and methods. It 
covers scenarios such as adding nodes, checking containment, and validating the correctness of different traversal orders.

Time Complexity:

Adding a node in the binary search tree (add operation): The time complexity of this operation depends on the height of 
the tree. In a balanced binary search tree, the height is log(n) where n is the number of nodes. In the worst case, if 
the tree is completely unbalanced, the height can be n. Therefore, the time complexity for adding a node is O(log n) on 
average and O(n) in the worst case.

Checking containment (contains operation): Similar to the add operation, the time complexity for checking containment is 
O(log n) on average and O(n) in the worst case.

Traversals (pre-order, in-order, post-order): These traversals visit each node once, resulting in a time complexity of 
O(n), where n is the number of nodes in the tree.

Space Complexity:

The space complexity for both adding a node and checking containment is determined by the recursive call stack. In a 
balanced binary search tree, the maximum stack depth for these operations is log(n). Therefore, the space complexity 
is O(log n) on average.

The space complexity for traversals is determined by the space used to store the result arrays. Since each node's value 
is stored once in the result array, the space complexity for traversals is O(n), where n is the number of nodes in the tree.

In summary, the provided approach uses a combination of classes and methods to implement binary trees and binary search 
trees, along with their associated operations and traversals. The time and space complexities for the major operations 
are analyzed based on the characteristics of binary search trees and the specific traversal algorithms used.

## Solution
Run tests inside of the TreesTest.java file. (src/test/java/datastructures/trees/TreesTest.java)