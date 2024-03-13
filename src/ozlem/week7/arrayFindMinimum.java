package ozlem.week7;


import java.sql.Array;
import java.util.Arrays;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
    public static void main(String[] args) {
        int[] arr = {99, 12, 101, 32, 500, 854, 631};
        System.out.println(findMinimum(arr));

        int[] arr2 = {-99, 12, 23, 32, 44, 57, 6};
        System.out.println(findMinimum(arr2));
    }
    public static int findMinimum(int[] arr) {
        // Assume the first element of the array is the minimum
        int min = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is smaller than the current minimum, update the minimum
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Return the minimum value found in the array
        return min;
    }
}
