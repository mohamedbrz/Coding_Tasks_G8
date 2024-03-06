package ozlem.week6;

import java.util.Arrays;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(maxNum(arr1));

    }

    public static int maxNum(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (max < each) {
                max = each;
            }
        }
        return max;
    }

}
