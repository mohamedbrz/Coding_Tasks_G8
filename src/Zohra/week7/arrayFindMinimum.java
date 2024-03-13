package Zohra.week7;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int minimum= findMinimun(arr);
        System.out.println("Minimum number = " + minimum);
    }

    public static int findMinimun(int[] arr){

        int min=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min=arr[i];
            }
        }

        return min;

    }



}

/*

This method findMinimum takes an array of integers as input and iterates through
the array to find the minimum element. It initializes the min variable with the
first element of the array and then compares it with each subsequent element. If an
element is found smaller than the current minimum, it updates the min variable.
Finally, it returns the minimum value found.

 */
