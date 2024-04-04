package denisa.week9;


import java.util.Arrays;

public class concat2Arrays {
    //Write a return method that can concatenate two arrays

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] concatenatedArray = concatenateArrays(arr1, arr2);
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }

    // method takes two integer arrays, arr1 and arr2, as input parameters and returns an integer array
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length; // calculate the length and store them into variables len1, and len2.
        int len2 = arr2.length;
        int[] concatenatedArray = new int[len1 + len2]; //creates a new integer array  with a length equal to the sum of the lengths of arr1 and arr2. This array will hold the concatenated elements from both arrays.

        // Copy elements of arr1 to concatenatedArray

        for (int i = 0; i < len1; i++) { // loop iterates over each element of arr1 and copies it to the corresponding position in concatenatedArray

            //Copy Elements of arr1 to concatenatedArray
            concatenatedArray[i] = arr1[i];
        }

        // Copy elements of arr2 to concatenatedArray
        for (int i = 0; i < len2; i++) {
            concatenatedArray[len1 + i] = arr2[i];
        }

        return concatenatedArray;
    }

}