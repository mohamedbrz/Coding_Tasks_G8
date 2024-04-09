package ozlem.week10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayListSortDesc {
    //Write a method that can sort the ArrayList in descending order without using the sort method

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,-5,6,7,8,9));

        descendingArray(numbers);


        System.out.println(numbers);

    }

    public static void descendingArray(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) < arr.get(j + 1)) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}