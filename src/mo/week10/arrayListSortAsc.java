package mo.week10;


import java.util.ArrayList;

public class arrayListSortAsc {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(10);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);

        System.out.println("Before sorting: " + numbers);


        ascendingSort(numbers);

        System.out.println("After sorting: " + numbers);
    }

    public static void ascendingSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap elements if they are in the wrong order
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

}