package datastructures.linkedlist;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append("{ ").append(current.getValue()).append(" } -> ");
            current = current.getNext();
        }
        result.append("NULL");
        return result.toString();
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (head != null) {
            if (head.getValue() == value) {
                newNode.setNext(head);
                head = newNode;
            } else {
                Node current = head;
                while (current.getNext() != null && current.getNext().getValue() != value) {
                    current = current.getNext();
                }
                if (current.getNext() != null) {
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                }
            }
        }
    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        Node current = head;
        while (current != null && current.getValue() != value) {
            current = current.getNext();
        }
        if (current != null) {
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    public int kthFromEnd(int k) {
        if (head == null || k < 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                throw new IllegalArgumentException("k is greater than the length of the linked list");
            }
            fast = fast.getNext();
        }

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }

        if (fast == null) {
            throw new IllegalArgumentException("k is greater than the length of the linked list");
        }

        return slow.getValue();
    }
}
