package datastructures.zipLists;

import datastructures.linkedlist.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZipperTest {
    @Test
    void testZipLists() {
        // Test case 1
        Node list1 = new Node(1);
        list1.setNext(new Node(3));
        list1.getNext().setNext(new Node(5));

        Node list2 = new Node(2);
        list2.setNext(new Node(4));
        list2.getNext().setNext(new Node(6));

        ZipperLinkedLists zipperLinkedLists = new ZipperLinkedLists();
        Node zipperedList = zipperLinkedLists.zipLists(list1, list2);

        // Create an array with the expected values of the zipped list
        int[] expectedValues = {1, 2, 3, 4, 5, 6};

        // Compare the zipped list with the expected values
        for (int expectedValue : expectedValues) {
            assertEquals(expectedValue, zipperedList.getValue());
            zipperedList = zipperedList.getNext();
        }
    }
}
