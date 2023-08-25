package datastructures.treeintersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TreeIntersection {

    // Main method to find common values in two binary trees
    public static Set<Integer> treeIntersection(BinaryTreeNode root1, BinaryTreeNode root2) {
        // Create a set to store values from the first tree
        Set<Integer> values1 = new HashSet<>();
        // Traverse the first tree and collect its values
        traverseAndCollect(root1, values1);

        // Create a set to store common values between the trees
        Set<Integer> commonValues = new HashSet<>();
        // Traverse the second tree and find common values with values from the first tree
        traverseAndFindCommon(root2, values1, commonValues);

        return commonValues;
    }

    // Helper method to traverse a tree and collect its values
    private static void traverseAndCollect(BinaryTreeNode node, Set<Integer> values) {
        if (node == null) {
            return;
        }
        // Add the current node's value to the set
        values.add(node.value);
        // Recursively traverse the left and right subtrees
        traverseAndCollect(node.left, values);
        traverseAndCollect(node.right, values);
    }

    // Helper method to traverse a tree and find common values with another set of values
    private static void traverseAndFindCommon(BinaryTreeNode node, Set<Integer> values, Set<Integer> commonValues) {
        if (node == null) {
            return;
        }
        // If the value of the current node is in the set of values from the first tree,
        // add it to the set of common values
        if (values.contains(node.value)) {
            commonValues.add(node.value);
        }
        // Recursively traverse the left and right subtrees
        traverseAndFindCommon(node.left, values, commonValues);
        traverseAndFindCommon(node.right, values, commonValues);
    }
}

// Class representing a node in a binary tree
class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    // Constructor to create a new node with a given value
    public BinaryTreeNode(int value) {
        this.value = value;
    }
}
