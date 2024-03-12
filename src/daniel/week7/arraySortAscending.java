package daniel.week7;


import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class arraySortAscending {
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Ex: int[] arr = {10, 9, 8, 7};
        arr = Sort(arr); ==>{ 7, 8, 9, 10};*/

    public static void main(String[] args) {

        int[] arr = {99, 12, 101, 32, 500, 854, 631};
        System.out.println("sortAscendingArray(arr) = " + Arrays.toString(sortAscendingArray(arr)));

        int[] arr2 = {-99, 12, 23, 32, 44, 57, 6};
        System.out.println("sortAscendingArray(arr2) = " + Arrays.toString(sortAscendingArray(arr2)));

    }

    public static int[] sortAscendingArray(int[] arr){
        TreeSet<Integer> sorted = new TreeSet<>();
        for (int each : arr) {
            sorted.add(each);
        }

        int[] sortedArry = sorted.stream().mapToInt(Integer::intValue).toArray();
        return sortedArry;
    }



}