package daniel.week6;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

    public static void main(String[] args) {
        int[] arr = {99, 12, 101, 32, 500, 854, 631};
        System.out.println("MaximumFromArray(arr) = " + MaximumFromArray(arr));

        int[] arr2 = {-99, 12, 23, 32, 44, 57, 6};
        System.out.println("MaximumFromArray(arr2) = " + MaximumFromArray(arr2));

    }

    public static Integer MaximumFromArray(int[] arr){
        TreeSet<Integer> sorted = new TreeSet<>();
        for (int each : arr) {
            sorted.add(each);
        }
        return sorted.last();
    }

}
