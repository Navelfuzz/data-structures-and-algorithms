# Code Challenge: Class 32 - Tree Intersection

**Feature Tasks**
* Write a function called `tree_intersection` that takes two binary trees as parameters.
* Using your Hashmap implementation as a part of your algorithm, return a set of values found in both trees.

**Structure and Testing**
* Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component 
parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex 
algorithm in one function definition.
* Write at least three test assertions for each method that you define.
* Ensure your tests are passing before you submit your solution.


**Stretch Goal**
* Describe how you might solve this differently if the parameters were Binary Search Trees.
    * What are the potential efficiency differences?

**Input:**

![BT1](BT1.png)
![BT2](BT2.png)

**Output:**
```
[100, 160, 125, 175, 200, 350, 500]
```

## Approach & Efficiency

**Approach:**
1. Collect Values: The first step is to traverse one of the binary trees and collect its values using depth-first 
traversal. The values are stored in a set data structure to ensure uniqueness.

2. Find Common Values: The second step involves traversing the other binary tree while checking if each node's value is 
present in the set of collected values from the first tree. If a match is found, the value is added to a separate set 
that stores the common values.

3. Return Result: Finally, the set of common values is returned as the result.

**Efficiency:**
* Time Complexity: The time complexity of this approach depends on the depth of the trees and the number of common 
values. In the worst case, when both trees are balanced and have N nodes, the time complexity would be O(N), as each 
node of the second tree needs to be checked against the set of values from the first tree. However, if the trees are 
significantly different in structure, the complexity could be higher due to more traversals.

* Space Complexity: The space complexity is primarily determined by the space needed for storing the values from the 
first tree (O(N)) and the set of common values (up to O(N) in the worst case). Additionally, the call stack for the 
recursive traversal contributes to the space complexity, which is O(h), where h is the height of the tree.

In summary, the approach used in `TreeIntersection.java` provides an efficient solution for finding common values 
between two binary trees. However, the efficiency depends on factors such as the structure of the trees and the 
distribution of common values.

## Solution

```java
Function treeIntersection(root1, root2):
valuesSet = createEmptySet()

    // Step 1: Collect values from the first tree
    traverseAndCollect(root1, valuesSet)
    
    commonValuesSet = createEmptySet()
    
    // Step 2: Find common values in the second tree
    traverseAndFindCommon(root2, valuesSet, commonValuesSet)
    
    return commonValuesSet

Function traverseAndCollect(node, valuesSet):
if node is null:
return

    // Add the node's value to the set
    add node.value to valuesSet
    
    // Recurse on left and right subtrees
    traverseAndCollect(node.left, valuesSet)
    traverseAndCollect(node.right, valuesSet)

Function traverseAndFindCommon(node, valuesSet, commonValuesSet):
if node is null:
return

    // If node's value is in the valuesSet, add to commonValuesSet
    if node.value is in valuesSet:
        add node.value to commonValuesSet
    
    // Recurse on left and right subtrees
    traverseAndFindCommon(node.left, valuesSet, commonValuesSet)
    traverseAndFindCommon(node.right, valuesSet, commonValuesSet)
```
