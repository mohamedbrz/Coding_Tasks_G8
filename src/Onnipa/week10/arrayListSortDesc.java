package Onnipa.week10;


import java.util.ArrayList;

public class arrayListSortDesc {
    //Write a method that can sort the ArrayList in descending order without using the sort method



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(3);

        sortDescending(list);

        System.out.println("Sorted List (Descending): " + list);
    }

    public static void sortDescending(ArrayList<Integer> list) {
        // Bubble Sort algorithm in descending order
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    // Swap list[j] and list[j+1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}