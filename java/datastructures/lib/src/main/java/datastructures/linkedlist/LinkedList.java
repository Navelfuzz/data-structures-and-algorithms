package datastructures.linkedlist;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public boolean includes(int value){
        Node current = head;
        while (current != null){
            if (current.getValue() == value){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }


    @Override
    public String toString() {
        if (head == null) {
            return "NULL";
        }
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append("{ ").append(current.getValue()).append(" } -> ");
            current = current.getNext();
        }
        sb.append("NULL");
        return sb.toString();
    }
}
