import datastructures.linkedlist.Node;
public class ZipperLinkedLists {
    public Node zipLists(Node list1, Node list2) {
        Node dummyHead = new Node(0);
        Node current = dummyHead;

        while (list1 != null && list2 != null) {
            // Take an element from list1
            current.setNext(list1);
            list1 = list1.getNext();
            current = current.getNext();

            // Take an element from list2
            current.setNext(list2);
            list2 = list2.getNext();
            current = current.getNext();
        }

        // Append remaining elements from list1, if any
        if (list1 != null) {
            current.setNext(list1);
        }

        // Append remaining elements from list2, if any
        if (list2 != null) {
            current.setNext(list2);
        }

        // Save the zipperedList
        Node zipperedList = dummyHead.getNext();

        return zipperedList;
    }
}
