package denisa.week6;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */


    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        int max = arr[0]; // Initialize max with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        return max;
    }
}


/*
We start by assuming that the first element of the array is the maximum.
Then, we iterate through the remaining elements and compare each one with the current maximum.
If we find an element greater than the current maximum, we update the maximum value.
 */


