package daniel.week7;


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.TreeSet;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6


    public static void main(String[] args) {
        int[] arr = {99, 12, 101, 32, 500, 854, 631};
        System.out.println("MinimumFromArray(arr) = " + minimumFromArray(arr));

        int[] arr2 = {-99, 12, 23, 32, 44, 57, 6};
        System.out.println("MinimumFromArray(arr2) = " + minimumFromArray(arr2));

        System.out.println("minimumFromArray2(arr) = " + minimumFromArray2(arr));

        System.out.println("minimumFromArray2(arr2) = " + minimumFromArray2(arr2));

    }

    public static Integer minimumFromArray(int[] arr){
        TreeSet<Integer> sorted = new TreeSet<>();
        for (int each : arr) {
            sorted.add(each);
        }
        return sorted.first();
    }

    //Alternative streaming method.
    public static int minimumFromArray2(int[] arr){
        OptionalInt min = Arrays.stream(arr).min();
        return min.orElse(0);
    }


}