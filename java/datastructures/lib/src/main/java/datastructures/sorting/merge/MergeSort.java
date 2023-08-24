package datastructures.sorting.merge;

public class MergeSort {
    public void merge(int[] left, int[] right, int[] arr) {
        int i = 0; // Pointer for the left subarray
        int j = 0; // Pointer for the right subarray
        int k = 0; // Pointer for the merged array

        // Compare elements from left and right subarrays and merge them in order
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                // If the current element in the left subarray is smaller or equal, place it in the merged array
                arr[k] = left[i];
                i++;
            } else {
                // If the current element in the right subarray is smaller, place it in the merged array
                arr[k] = right[j];
                j++;
            }
            // Move the pointer in the merged array forward
            k++;
        }

        // Copy remaining elements from the left subarray to the merged array
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right subarray to the merged array
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] arr) {
        int n = arr.length;

        // If the array has more than one element, proceed with sorting
        if (n > 1) {
            int mid = n / 2;

            // Divide the array into two halves: left and right
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, n - mid);

            // Recursively sort the left half
            mergeSort(left);

            // Recursively sort the right half
            mergeSort(right);

            // Merge the sorted left and right halves back into the original array
            merge(left, right, arr);
        }
    }
}
