package datastructures.trees;
// BinarySearchTree.java
public class BinarySearchTree extends BinaryTree {
    public void add(Object value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, Object value) {
        if (current == null) {
            if (value instanceof Integer) {
                return new Node((int) value);
            } else if (value instanceof String) {
                return new Node((String) value);
            } else {
                throw new IllegalArgumentException("Unsupported value type");
            }
        }

        if (compareValues(value, current.value) < 0) {
            current.left = addRecursive(current.left, value);
        } else if (compareValues(value, current.value) > 0) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }


    public boolean contains(Object value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node current, Object value) {
        if (current == null) {
            return false;
        }

        if (compareValues(value, current.value) == 0) {
            return true;
        }

        if (compareValues(value, current.value) < 0) {
            return containsRecursive(current.left, value);
        } else {
            return containsRecursive(current.right, value);
        }
    }
}
