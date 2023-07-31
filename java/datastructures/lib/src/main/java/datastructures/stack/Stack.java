
import datastructures.linkedlist.Node;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }
}
