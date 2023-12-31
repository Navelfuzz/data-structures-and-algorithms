package datastructures.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TreesTest {
    @Test
    public void testBinarySearchTree() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);
        bst.add(6);
        bst.add(8);

        assertTrue(bst.contains(5));
        assertTrue(bst.contains(3));
        assertTrue(bst.contains(8));
        assertFalse(bst.contains(1));

        assertEquals("[5, 3, 2, 4, 7, 6, 8]", bst.preOrderTraversal().toString());
        assertEquals("[2, 3, 4, 5, 6, 7, 8]", bst.inOrderTraversal().toString());
        assertEquals("[2, 4, 3, 6, 8, 7, 5]", bst.postOrderTraversal().toString());
    }

    @Test
    public void testFindMaximumValue() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(5);
        binaryTree.root.left = new Node(3);
        binaryTree.root.right = new Node(7);
        binaryTree.root.left.left = new Node(2);
        binaryTree.root.left.right = new Node(4);
        binaryTree.root.right.left = new Node(6);
        binaryTree.root.right.right = new Node(8);

        assertEquals(8, binaryTree.findMaximumValue());
    }

    @Test
    public void testBreadthFirstTraversal() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(5);
        binaryTree.root.left = new Node(3);
        binaryTree.root.right = new Node(7);
        binaryTree.root.left.left = new Node(2);
        binaryTree.root.left.right = new Node(4);
        binaryTree.root.right.left = new Node(6);
        binaryTree.root.right.right = new Node(8);

        List<Object> expected = List.of(5, 3, 7, 2, 4, 6, 8);
        assertEquals(expected, binaryTree.breadthFirst());
    }

    @Test
    public void testFizzBuzzTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(15);
        binaryTree.root.left = new Node(3);
        binaryTree.root.right = new Node(10);
        binaryTree.root.left.left = new Node(9);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.left = new Node(7);
        binaryTree.root.right.right = new Node(11);

        BinaryTree fizzBuzzTree = binaryTree.fizzBuzzTree();
        List<Object> expected = List.of("FizzBuzz", "Fizz", "Buzz", "Fizz", "Buzz", 7, 11);
        assertEquals(expected, fizzBuzzTree.breadthFirst());
    }

}