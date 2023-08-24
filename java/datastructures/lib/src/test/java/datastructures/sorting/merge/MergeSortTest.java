package datastructures.sorting.merge;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {
    @Test
    public void testMergeSortUnsorted() {
        int[] arr = {8, 4, 23, 42, 16, 15};
        int[] sortedArr = {4, 8, 15, 16, 23, 42};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testMergeSortReverseSorted() {
        int[] arr = {20, 18, 12, 8, 5, -2};
        int[] sortedArr = {-2, 5, 8, 12, 18, 20};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testMergeSortFewUniques() {
        int[] arr = {5, 12, 7, 5, 5, 7};
        int[] sortedArr = {5, 5, 5, 7, 7, 12};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testMergeSortNearlySorted() {
        int[] arr = {2, 3, 5, 7, 13, 11};
        int[] sortedArr = {2, 3, 5, 7, 11, 13};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sortedArr, arr);
    }
}
