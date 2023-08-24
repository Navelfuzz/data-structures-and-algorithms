package datastructures.sorting.quickSort;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotLocation = partition(arr, low, high);
            quickSort(arr, low, pivotLocation - 1);
            quickSort(arr, pivotLocation + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int leftWall = low;

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[leftWall];
                arr[leftWall] = temp;
                leftWall += 1;
            }
        }

        int temp = arr[leftWall];
        arr[leftWall] = arr[high];
        arr[high] = temp;

        return leftWall;
    }
}
