package datastructures.linkedlist;

public class LinkedListTest {
  public static void main(String[] args) {
    // Can successfully instantiate an empty linked list
    LinkedList list = new LinkedList();

    // Can properly insert into the linked list
    list.insert(3);
    list.insert(2);
    list.insert(1);

    // The head property will properly point to the first node in the linked list
    System.out.println("Head value: " + list.toString()); // Expected output: 1

    // Can properly insert multiple nodes into the linked list
    list.insert(4);
    list.insert(5);
    System.out.println("Linked list: " + list.toString()); // Expected output: "{ 5 } -> { 4 } -> { 1 } -> { 2 } -> { 3 } -> NULL"

    // Will return true when finding a value within the linked list that exists
    System.out.println("Includes 2: " + list.includes(2)); // Expected output: true

    // Will return false when searching for a value in the linked list that does not exist
    System.out.println("Includes 6: " + list.includes(6)); // Expected output: false

    // Can properly return a collection of all the values that exist in the linked list
    System.out.println("Linked list: " + list.toString()); // Expected output: "{ 5 } -> { 4 } -> { 1 } -> { 2 } -> { 3 } -> NULL"

    // Can successfully add a node to the end of the linked list
    list.append(6);
    System.out.println("Linked list: " + list.toString()); // Expected output: "{ 5 } -> { 4 } -> { 1 } -> { 2 } -> { 3 } -> { 6 } -> NULL"

    // Can successfully add multiple nodes to the end of a linked list
    list.append(7);
    list.append(8);
    System.out.println("Linked list: " + list.toString()); // Expected output: "{ 5 } -> { 4 } -> { 1 } -> { 2 } -> { 3 } -> { 6 } -> { 7 } -> { 8 } -> NULL"

    // Can successfully insert a node before a node located in the middle of a linked list
    list.insertBefore(2, 9);
    System.out.println("Linked list: " + list.toString()); // Expected output: "{ 5 } -> { 4 } -> { 1 } -> { 9 } -> { 2 } -> { 3 } -> { 6 } -> { 7 } -> { 8 } -> NULL"

    // Can successfully insert a node before the first node of a linked list
    list.insertBefore(5, 10);
    System.out.println("Linked list: " + list.toString()); // Expected output: "{ 10 } -> { 5 } -> { 4 } -> { 1 } -> { 9 } -> { 2 } -> { 3 } -> { 6 } -> { 7 } -> { 8 } -> NULL"

    // Can successfully insert after a node in the middle of the linked list
    list.insertAfter(3, 11);
    System.out.println("Linked list: " + list.toString()); // Expected output: "{ 10 } -> { 5 } -> { 4 } -> { 1 } -> { 9 } -> { 2 } -> { 3 } -> { 11 } -> { 6 } -> { 7 } -> { 8 } -> NULL"

    // Can successfully insert a node after the last node of the linked list
    list.insertAfter(8, 12);
    System.out.println("Linked list: " + list.toString()); // Expected output: "{ 10 } -> { 5 } -> { 4 } -> { 1 } -> { 9 } -> { 2 } -> { 3 } -> { 11 } -> { 6 } -> { 7 } -> { 8 } -> { 12 } -> NULL"
  }
}

