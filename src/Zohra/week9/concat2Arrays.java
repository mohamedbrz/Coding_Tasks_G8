package Zohra.week9;


import java.util.Arrays;

public class concat2Arrays {
    //Write a return method that can concatenate two arrays
        public static int[] concatenateArrays(int[] firstArray, int[] secondArray) {
            int[] concatenatedArray = new int[firstArray.length + secondArray.length];
            int index = 0;

            // Copy elements from the first array
            for (int element : firstArray) {
                concatenatedArray[index] = element;
                index++;
            }

            // Copy elements from the second array
            for (int element : secondArray) {
                concatenatedArray[index] = element;
                index++;
            }

            return concatenatedArray;
        }

        public static void main(String[] args) {
            int[] array1 = {1, 2, 3};
            int[] array2 = {4, 5, 6};
            int[] concatenatedArray = concatenateArrays(array1, array2);

            // Print the concatenated array
            for (int element : concatenatedArray) {
                System.out.print(element + " ");
            }
        }
    }


