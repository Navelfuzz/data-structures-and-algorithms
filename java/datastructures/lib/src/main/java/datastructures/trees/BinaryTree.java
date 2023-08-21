package datastructures.trees;

// BinaryTree.java
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public List<Object> preOrderTraversal() {
        return preOrderTraversal(root);
    }

    private List<Object> preOrderTraversal(Node node) {
        List<Object> result = new ArrayList<>();
        if (node != null) {
            result.add(node.value);
            result.addAll(preOrderTraversal(node.left));
            result.addAll(preOrderTraversal(node.right));
        }
        return result;
    }

    public List<Object> inOrderTraversal() {
        return inOrderTraversal(root);
    }

    private List<Object> inOrderTraversal(Node node) {
        List<Object> result = new ArrayList<>();
        if (node != null) {
            result.addAll(inOrderTraversal(node.left));
            result.add(node.value);
            result.addAll(inOrderTraversal(node.right));
        }
        return result;
    }

    public List<Object> postOrderTraversal() {
        return postOrderTraversal(root);
    }

    private List<Object> postOrderTraversal(Node node) {
        List<Object> result = new ArrayList<>();
        if (node != null) {
            result.addAll(postOrderTraversal(node.left));
            result.addAll(postOrderTraversal(node.right));
            result.add(node.value);
        }
        return result;
    }

    public Object findMaximumValue() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        return findMaximumValue(root);
    }

    private Object findMaximumValue(Node node) {
        if (node == null) {
            return null; // Return null for an empty tree
        }

        Object maxValue = node.value;
        Object leftMax = findMaximumValue(node.left);
        Object rightMax = findMaximumValue(node.right);

        if (compareValues(leftMax, maxValue) > 0) {
            maxValue = leftMax;
        }
        if (compareValues(rightMax, maxValue) > 0) {
            maxValue = rightMax;
        }

        return maxValue;
    }

    public List<Object> breadthFirst() {
        List<Object> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.value);

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return result;
    }

    public BinaryTree fizzBuzzTree() {
        BinaryTree newTree = new BinaryTree();
        newTree.root = fizzBuzzTransform(root);
        return newTree;
    }


    private Node fizzBuzzTransform(Node node) {
        if (node == null) {
            return null;
        }

        Node newNode = new Node(transformValue((int) node.value)); // Cast to int

        newNode.left = fizzBuzzTransform(node.left);
        newNode.right = fizzBuzzTransform(node.right);

        return newNode;
    }

    private String transformValue(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(value);
        }
    }

    protected int compareValues(Object value1, Object value2) {
        if (value1 instanceof Integer && value2 instanceof Integer) {
            int intValue1 = (int) value1;
            int intValue2 = (int) value2;
            return Integer.compare(intValue1, intValue2);
        }
        return 0; // Default comparison
    }
}
