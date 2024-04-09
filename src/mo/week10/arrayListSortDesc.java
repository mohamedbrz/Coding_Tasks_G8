package mo.week10;


import java.util.ArrayList;

public class arrayListSortDesc {
    //Write a method that can sort the ArrayList in descending order without using the sort method

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(90);
        numbers.add(1);
        numbers.add(22);
        numbers.add(5);
        numbers.add(3);

        System.out.println("Before sorting: " + numbers);

        descendingSort(numbers);

        System.out.println("after sorting: " + numbers);
    }

    public static void descendingSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    // Swap elements if they are in the wrong order (in descending order)
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

}