package datastructures.trees;

// Node.java
public class Node {
    Object value; // Can hold either int or String
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}