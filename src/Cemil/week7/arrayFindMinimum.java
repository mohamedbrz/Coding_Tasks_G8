package Cemil.week7;


import java.util.stream.IntStream;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6


    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("findMinArr(arr) = " + findMinArr(arr));

        System.out.println("===============");

        System.out.println("findMinArr2(arr) = " + findMinArr2(arr));


    }

    public static int findMinArr(int [] arr){

        int min =arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }


    // Second solution with using Stream
    public static int findMinArr2(int [] arr){

        return IntStream.of(arr).min().getAsInt();
    }




}