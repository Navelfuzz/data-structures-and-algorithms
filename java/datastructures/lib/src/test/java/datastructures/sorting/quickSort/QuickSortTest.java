package datastructures.sorting.quickSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    public void testQuickSort_UnsortedArray() {
        int[] arr = {8, 4, 23, 42, 16, 15};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {4, 8, 15, 16, 23, 42};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSort_ReverseSortedArray() {
        int[] arr = {20, 18, 12, 8, 5, -2};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {-2, 5, 8, 12, 18, 20};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSort_FewUniquesArray() {
        int[] arr = {5, 12, 7, 5, 5, 7};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {5, 5, 5, 7, 7, 12};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSort_NearlySortedArray() {
        int[] arr = {2, 3, 5, 7, 13, 11};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {2, 3, 5, 7, 11, 13};
        assertArrayEquals(expected, arr);
    }
}
