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

    public List<Integer> preOrderTraversal() {
        return preOrderTraversal(root);
    }

    private List<Integer> preOrderTraversal(Node node) {
        List<Integer> result = new ArrayList<>();
        if (node != null) {
            result.add(node.value);
            result.addAll(preOrderTraversal(node.left));
            result.addAll(preOrderTraversal(node.right));
        }
        return result;
    }

    public List<Integer> inOrderTraversal() {
        return inOrderTraversal(root);
    }

    private List<Integer> inOrderTraversal(Node node) {
        List<Integer> result = new ArrayList<>();
        if (node != null) {
            result.addAll(inOrderTraversal(node.left));
            result.add(node.value);
            result.addAll(inOrderTraversal(node.right));
        }
        return result;
    }

    public List<Integer> postOrderTraversal() {
        return postOrderTraversal(root);
    }

    private List<Integer> postOrderTraversal(Node node) {
        List<Integer> result = new ArrayList<>();
        if (node != null) {
            result.addAll(postOrderTraversal(node.left));
            result.addAll(postOrderTraversal(node.right));
            result.add(node.value);
        }
        return result;
    }

    public int findMaximumValue() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        return findMaximumValue(root);
    }

    private int findMaximumValue(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE; // A very small value to start the comparison
        }

        int maxValue = node.value;
        int leftMax = findMaximumValue(node.left);
        int rightMax = findMaximumValue(node.right);

        if (leftMax > maxValue) {
            maxValue = leftMax;
        }
        if (rightMax > maxValue) {
            maxValue = rightMax;
        }

        return maxValue;
    }

    public List<Integer> breadthFirst() {
        List<Integer> result = new ArrayList<>();
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




}
