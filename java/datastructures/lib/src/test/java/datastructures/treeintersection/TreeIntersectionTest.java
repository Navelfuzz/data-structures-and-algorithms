package datastructures.treeintersection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;


public class TreeIntersectionTest {

    @Test
    public void testTreeIntersectionWithCommonValues() {
        // Create the first tree:     5
        //                        /    \
        //                       3      8
        //                      / \
        //                     2   4
        BinaryTreeNode root1 = new BinaryTreeNode(5);
        root1.left = new BinaryTreeNode(3);
        root1.right = new BinaryTreeNode(8);
        root1.left.left = new BinaryTreeNode(2);
        root1.left.right = new BinaryTreeNode(4);

        // Create the second tree:    3
        //                        /    \
        //                       2      6
        //                        \
        //                         4
        BinaryTreeNode root2 = new BinaryTreeNode(3);
        root2.left = new BinaryTreeNode(2);
        root2.right = new BinaryTreeNode(6);
        root2.left.left = new BinaryTreeNode(4);

        // Print the visualization of the trees
        System.out.println("Tree 1:");
        printTree(root1, "");

        System.out.println("Tree 2:");
        printTree(root2, "");

        // Find the common values
        var commonValues = TreeIntersection.treeIntersection(root1, root2);

        // Print the common values and the expected result
        System.out.println("Common Values: " + commonValues);
        assertEquals(Set.of(2, 3, 4), commonValues);
    }

    @Test
    public void testTreeIntersectionWithNoCommonValues() {
        // Create the first tree:     5
        //                        /    \
        //                       3      8
        BinaryTreeNode root1 = new BinaryTreeNode(5);
        root1.left = new BinaryTreeNode(3);
        root1.right = new BinaryTreeNode(8);

        // Create the second tree:    2
        //                        /    \
        //                       6      9
        BinaryTreeNode root2 = new BinaryTreeNode(2);
        root2.left = new BinaryTreeNode(6);
        root2.right = new BinaryTreeNode(9);

        // Print the visualization of the trees
        System.out.println("Tree 1:");
        printTree(root1, "");

        System.out.println("Tree 2:");
        printTree(root2, "");

        // Find the common values
        var commonValues = TreeIntersection.treeIntersection(root1, root2);

        // Print the common values and the expected result
        System.out.println("Common Values: " + commonValues);
        assertEquals(Set.of(), commonValues);
    }

    @Test
    public void testTreeIntersectionWithSingleNode() {
        // Create a tree with a single node: 5
        BinaryTreeNode root1 = new BinaryTreeNode(5);
        BinaryTreeNode root2 = new BinaryTreeNode(5);

        // Print the visualization of the trees
        System.out.println("Tree 1:");
        printTree(root1, "");

        System.out.println("Tree 2:");
        printTree(root2, "");

        // Find the common values
        var commonValues = TreeIntersection.treeIntersection(root1, root2);

        // Print the common values and the expected result
        System.out.println("Common Values: " + commonValues);
        assertEquals(Set.of(5), commonValues);
    }

    // Helper method to print a binary tree
    private void printTree(BinaryTreeNode node, String prefix) {
        if (node == null) {
            return;
        }

        System.out.println(prefix + "|__ " + node.value);
        printTree(node.left, prefix + "|   ");
        printTree(node.right, prefix + "|   ");
    }
}
