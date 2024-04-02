package Cemil.week9;


import java.util.Arrays;

public class concat2Arrays {
    //Write a return method that can concatenate two arrays

    public static void main(String[] args) {
        int[] arr1 = {1,4,5};
        int[] arr2 = {3,8,9,6};

        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));
    }



    public static int [] concatArrays(int[] arr1, int[] arr2){

        // first we will find the total length of 2 arrays
        int[] mergedArr = new int[arr1.length + arr2.length];

        // i will add merged array, also will read from arr1
        // y will read elements from arr2
        for (int i = 0, y = 0; i < mergedArr.length; i++) {

            // we will add all elements from arr1 to mergedArr in if statement and
            // we will add elements from arr2 to mergedArr in else
            if (i < arr1.length){
                mergedArr[i] = arr1[i];
            } else {
                mergedArr[i] = arr2[y++]; // we will increase the value
            }

        }
        return mergedArr;

    }



}