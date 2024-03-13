package Zohra.week7;


public class arraySortAscending {
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Ex: int[] arr = {10, 9, 8, 7};
        arr = Sort(arr); ==>{ 7, 8, 9, 10};*/

    public static int[] sort(int[] arr) {

        int n = arr.length;

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        int[] arr = {10, 9, 8, 7};
        arr = sort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
    }

    /*
    Outer Loop: Iterate through the array from the first element to the second-to-last element.
    This loop controls the number of passes through the array.

    Inner Loop: For each pass, iterate through the array from the first element to the element before the last i elements.
    This loop compares adjacent elements and swaps them if they are in the wrong order.

    Comparison and Swapping: Inside the inner loop, compare the current element (arr[j]) with the next element (arr[j + 1]).
    If arr[j] is greater than arr[j + 1], swap them to put the larger element to the right.

    With each pass, the largest unsorted element will "bubble up" to the correct position at the end of the array.
    Returning Sorted Array: After the outer loop completes, the array is fully sorted in ascending order,
    and we return it.
     */

