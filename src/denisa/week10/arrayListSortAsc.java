package denisa.week10;


import java.util.ArrayList;

public class arrayListSortAsc {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Before sorting: " + numbers);
        sortAscending(numbers);
        System.out.println("After sorting: " + numbers);
    }

    public static void sortAscending(ArrayList<Integer> list) {
        int n = list.size();

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}