package datastructures.sorting.insertion;

import org.junit.jupiter.api.Test;

import static datastructures.sorting.insertion.InsertionSort.InsertSort;
import static org.junit.jupiter.api.Assertions.*;

public class InsertSortTest {

    @Test
    public void testInsertSortUnsortedArray() {
        int[] testArr = {8, 4, 23, 42, 16, 15};
        int[] actual = InsertSort(testArr);
        int[] expected = {4, 8, 15, 16, 23, 42};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortReverseSortedArray() {
        int[] testArr = {20, 18, 12, 8, 5, -2};
        int[] actual = InsertSort(testArr);
        int[] expected = {-2, 5, 8, 12, 18, 20};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortFewUniquesArray() {
        int[] testArr = {5, 12, 7, 5, 5, 7};
        int[] actual = InsertSort(testArr);
        int[] expected = {5, 5, 5, 7, 7, 12};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortNearlySortedArray() {
        int[] testArr = {2, 3, 5, 7, 13, 11};
        int[] actual = InsertSort(testArr);
        int[] expected = {2, 3, 5, 7, 11, 13};
        assertArrayEquals(expected, actual);
    }

}