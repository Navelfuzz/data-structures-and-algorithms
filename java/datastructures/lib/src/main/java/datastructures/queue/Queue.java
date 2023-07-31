
import datastructures.linkedlist.Node;

public class Queue {
    private Node front;

    public Queue() {
        this.front = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
        } else {
            Node last = getLastNode();
            last.setNext(newNode);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        }
        int value = front.getValue();
        front = front.getNext();
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot peek.");
        }
        return front.getValue();
    }

    public boolean isEmpty() {
        return front == null;
    }

    private Node getLastNode() {
        Node current = front;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }
}
