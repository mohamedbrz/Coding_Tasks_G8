package denisa.week10;


import java.util.ArrayList;

public class arrayListSortDesc {
    //Write a method that can sort the ArrayList in descending order without using the sort method


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Before sorting: " + numbers);
        sortDescending(numbers);
        System.out.println("After sorting: " + numbers);
    }

    public static void sortDescending(ArrayList<Integer> list) {
        int n = list.size();

        // Perform n-1 iterations for bubble sort
        for (int i = 0; i < n - 1; i++) {
            // After each iteration, the largest element will be bubbled to the end
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is less than the next element, swap them
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

}