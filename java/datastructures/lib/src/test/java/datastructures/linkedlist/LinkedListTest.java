package datastructures.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

  @Test
  public void testInstantiateEmptyLinkedList() {
    LinkedList list = new LinkedList();
    Assertions.assertNull(list.getHead());
  }

  @Test
  public void testInsertIntoLinkedList() {
    LinkedList list = new LinkedList();
    list.insert(5);
    Assertions.assertEquals(5, list.getHead().getValue());
  }

  @Test
  public void testHeadPointsToFirstNode() {
    LinkedList list = new LinkedList();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    Assertions.assertEquals(30, list.getHead().getValue());
  }

  @Test
  public void testInsertMultipleNodes() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    Assertions.assertEquals(4, list.getHead().getValue());
  }

  @Test
  public void testValueExistsInLinkedList() {
    LinkedList list = new LinkedList();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    Assertions.assertTrue(list.includes(20));
  }

  @Test
  public void testValueDoesNotExistInLinkedList() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    Assertions.assertFalse(list.includes(10));
  }

  @Test
  public void testReturnAllValuesInLinkedList() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    Assertions.assertEquals("{ 3 } -> { 2 } -> { 1 } -> NULL", list.toString());
  }
}
