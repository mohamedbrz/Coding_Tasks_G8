package aaron.week10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListSortAsc {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<>(Arrays.asList(5, 55, 4, 44, 66, -1));
        ArrayList<String> listNames = new ArrayList<String>(Arrays.asList("Charlie", "Aaron", "James", "Sally"));
        sortAscIntList(listNumbers);
        sortAscStringList(listNames);

    }

    public static void sortAscIntList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

    public static void sortAscStringList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    // Swap elements if they are in the wrong order
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }


}