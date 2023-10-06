# Quick Sort Blog
##### Code Fellows 401 Java: Code Challenge Class 28

## Quick Sort 

### Watch
[Quick Sort in 4 minutes](https://www.youtube.com/watch?v=Hoixgm4-P4M)
* Video by Michael Sambol that explains the quick sort algorithm in 4 minutes.

### Example from Class
[QuickSort Replit - Rey Oliva](https://replit.com/@ReynaldoOliva/QuickSort#Main.java)

```java
class Main {
  public static void main(String[] args) {
    int[] unsortedArr = {5, 2, 1, 4, 0, 3};
      System.out.println("unsorted array: " + java.util.Arrays.toString(unsortedArr));

      quickSort(unsortedArr, 0, unsortedArr.length - 1);
    
      System.out.println("sorted array: " + java.util.Arrays.toString(unsortedArr));
  }

  static void quickSort(int[] arr, int low, int high) {
    if(low < high) {
      int pivotLocation = partition(arr, low, high);
      quickSort(arr, low, pivotLocation - 1);
      quickSort(arr, pivotLocation + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int leftwall = low;

    for(int i = low; i < high; i++) {
      if(arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[leftwall];
        arr[leftwall] = temp;
        leftwall+=1;
      }
    }

    int temp = arr[leftwall];
    arr[leftwall] = arr[high];
    arr[high] = temp;

    return leftwall;
  }
}
```

### Summary of the Above Quick Sort Algorithm 

##### The main function:

Initializes an array `unsortedArr` with integer values: `[5, 2, 1, 4, 0, 3]`.
Prints the unsorted array.
Calls the quickSort function to sort unsortedArr.
Prints the sorted array.

##### The `quickSort` function:

Takes three parameters: 
* The array to be sorted `arr` 
* The index of the low boundary `low` 
* The index of the high boundary `high`.

It's a recursive function that operates on a sub-array defined by the `low` and `high` indices.
If `low` is less than `high`, it proceeds with sorting.
It calls the `partition` function to find a pivot element's final sorted position.
Then it recursively sorts the left and right sub-arrays on either side of the pivot.

##### The `partition` function:

Takes three parameters: 
* The array `arr` 
* The index of the low boundary `low`
* The index of the high boundary `high`.

Chooses the last element at index `high` as the pivot.
Initializes a `leftwall` index at `low`.
Iterates through the array from `low` to `high - 1`.
If the current element is less than or equal to the `pivot`, swaps the current element with the element at `leftwall` index, and increments `leftwall`.
After the loop, swaps the `pivot` element (at index `high`) with the element at `leftwall` index, placing the `pivot` in its sorted position.
Returns the index of the pivot's final position.

![Quick Sort](quickSort.png)
___

### Notes
***The Quick Sort algorithm essentially follows these steps:***

1. Choose a pivot element.
2. Partition the array around the pivot, such that elements smaller than the pivot are on the left, and elements greater are on the right.
3. Recursively apply the same steps to the sub-arrays on the left and right of the pivot until the entire array is sorted.

The key to Quick Sort's efficiency is the partitioning step, which brings the pivot element to its final position while 
simultaneously placing smaller elements to its left and larger elements to its right.

#### Approach & Efficiency

*Time Complexity:*

The time complexity of the Quick Sort algorithm depends on the choice of pivot and how balanced the partitions are 
during each recursion. In the average case, Quick Sort exhibits an efficient time complexity of O(n log n), where n is 
the number of elements in the array. This is because, on average, each element is compared against the pivot about log n 
times during partitioning, and there are n elements in total.

However, in the worst case, where the pivot choice consistently results in highly unbalanced partitions, the time 
complexity can degrade to O(n^2). This happens when, for example, the array is already sorted, and the pivot is 
consistently chosen as the smallest or largest element.

To mitigate the risk of worst-case performance, randomized pivot selection or the "median-of-three" pivot strategy can 
be employed, which reduces the likelihood of unbalanced partitions.

*Space Complexity:*

The space complexity of the Quick Sort algorithm is determined by the recursion stack and any additional space used for 
swapping elements. In the best and average cases, the space complexity is O(log n), where log n is the maximum depth of 
the recursion tree. This is because the algorithm sorts in place and only requires space proportional to the recursion 
depth.

In the worst case, if the recursion tree is highly unbalanced, the space complexity can become O(n), which occurs when 
each recursive call creates a very skewed partition. However, this is uncommon in practice, especially with good pivot 
selection strategies.

***In summary:***

* Best Case Time Complexity: O(n log n)
* Average Case Time Complexity: O(n log n)
* Worst Case Time Complexity: O(n^2)
* Space Complexity: O(log n) on average, O(n) in the worst case due to the recursion stack and swapping space.

It's important to note that Quick Sort is widely used in practice due to its excellent average-case performance and is 
often faster than other O(n log n) sorting algorithms like Merge Sort and Heap Sort.

