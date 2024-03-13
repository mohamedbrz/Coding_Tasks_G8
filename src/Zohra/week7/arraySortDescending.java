package Zohra.week7;


public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/

    public static int[] sortDescending(int[] arr) {

        int n = arr.length;

        // Perform the selection sort in descending order
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap arr[i] and arr[maxIndex]
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        arr = sortDescending(arr);
        System.out.println("Sorted array in descending order:");
        printArray(arr);
    }
    }

    /*
    Iterating through the Array: Start iterating through the array starting from the second element (i = 1) up
    to the last element (i = n - 1, where n is the length of the array).

    Insertion Process: For each element at index i, we consider it as the key. We store its value in a
    variable called key.

    Comparing and Shifting: We then compare the key with the elements before it (from arr[i-1] to arr[0]).
    If an element is smaller than the key, we move it one position to the right to make space for the key.
    This step differs from the standard insertion sort because we're sorting in descending order, so we check
    for elements greater than the key.

    Placing Key in Correct Position: Once we find the correct position for the key (either we reach the beginning
    of the array or we find an element greater than the key), we insert the key into that position.

    Ieration and Sorting: Repeat steps 3-5 for each pass through the array. With each pass, the largest unsorted
    element will be inserted into its correct position at the beginning of the sorted portion of the array.

    Returning Sorted Array: After the iteration completes, the array is fully sorted in descending order,
    and we return it.


     */



