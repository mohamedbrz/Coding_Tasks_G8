package ozlem.week10;


import java.util.ArrayList;
import java.util.Arrays;

public class arrayListSortAsc {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method
    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(9, 5, 7, 3, 1, 8, 4, 6, 2));

        ascendingArray(numbers);

        // Print the sorted list
        System.out.println(numbers);
    }

    public static void ascendingArray(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }


}