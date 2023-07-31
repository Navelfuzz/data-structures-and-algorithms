package zipLists;

import datastructures.linkedlist.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// Testing the zipLists function


public class ZipperTest {
    public static void main(String[] args) {
        // Test case 1
        Node list1 = new Node(1);
        list1.setNext(new Node(3));
        list1.getNext().setNext(new Node(5));

        Node list2 = new Node(2);
        list2.setNext(new Node(4));
        list2.getNext().setNext(new Node(6));

        ZipperLinkedLists zipperLinkedLists = new ZipperLinkedLists();
        Node zipperedList = zipperLinkedLists.zipLists(list1, list2);

        // Print the zipped list
        while (zipperedList != null) {
            System.out.print(zipperedList.getValue() + " ");
            zipperedList = zipperedList.getNext();
        }
        // Output: 1 2 3 4 5 6
    }
}