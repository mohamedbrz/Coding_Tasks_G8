package ozlem.week7;


import java.util.Arrays;

public class arraySortAscending {
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Ex: int[] arr = {10, 9, 8, 7};
        arr = Sort(arr); ==>{ 7, 8, 9, 10};*/

         public static void main(String[] args) {
            int[] arr = {3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6};
            System.out.println(Arrays.toString(sortAscending(arr)));

            int[] arr1 = {-400, -300, 80, 60, 20, 10, 56};
            System.out.println(Arrays.toString(sortAscending(arr1)));
        }

        public static int[] sortAscending(int[] arr){

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length - 1; j++){
                    if(arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            return arr;
        }

    }

    /*Method Definition: The code defines a method called "sortAscending." This method takes an array of numbers and sorts them in ascending order, then returns the sorted array.

Iterating through Numbers: The code loops through each element in the array one by one.

Checking Pairs of Numbers: For each element, it compares it with the next element in the array. If an element is greater than the next one, it swaps their positions.

Repeated Checks: By going through multiple iterations of checking and swapping, the code ensures that smaller numbers "bubble up" to their correct positions, just like bubbles rising in water.

Returning the Sorted Array: After all the checks and swaps are done, the code returns the sorted array back to the caller.*/
/*method named sortAscending that takes an integer array arr as a parameter and returns an integer array.
*  starts a loop that iterates through each index of the array arr.
* Inside the outer loop, this line starts another loop that iterates through each index from 0 to arr.length - 1. This inner loop is used for comparison and swapping elements during sorting.
* This line checks if the element at index j is greater than the element at index j + 1. If so, it means the elements are out of order and need to be swapped.
* If the condition in the previous if statement is true, this block of code swaps the elements at indices j and j + 1 using a temporary variable temp. This is a standard way to perform a swap operation in array sorting algorithms.
* After both loops complete, this line returns the sorted array arr. Note that the sorting is done in place, meaning the original array arr is modified and then returned.*/