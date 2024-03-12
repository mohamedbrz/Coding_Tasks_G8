package daniel.week7;


import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/

    public static void main(String[] args) {

        int[] arr = {99, 12, 101, 32, 500, 854, 631};
        System.out.println("sortAscendingArray(arr) = " + Arrays.toString(sortArryDescending(arr)));

        int[] arr2 = {-99, 12, 23, 32, 44, 57, 6};
        System.out.println("sortAscendingArray(arr2) = " + Arrays.toString(sortArryDescending(arr2)));

    }

        public static int [] sortArryDescending(int [] arr){
            int[] sortedArry = Arrays.stream(arr)
                    .boxed()
                    .sorted((a, b) -> b - a)
                    .mapToInt(Integer::intValue)
                    .toArray();
            return sortedArry;
        }

}