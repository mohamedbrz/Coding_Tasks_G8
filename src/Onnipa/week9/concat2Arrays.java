package Onnipa.week9;


import java.util.Arrays;

public class concat2Arrays {
    //Write a return method that can concatenate two arrays

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] concatenatedArray = concatenateArrays(array1, array2);
        System.out.println("Concatenated array: " + Arrays.toString(concatenatedArray));
    }

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;

        int[] result = new int[length1 + length2];

        // Copy elements of array1 to result
        for (int i = 0; i < length1; i++) {
            result[i] = array1[i];
        }

        // Copy elements of array2 to result
        for (int i = 0; i < length2; i++) {
            result[length1 + i] = array2[i];
        }

        return result;
    }
}

