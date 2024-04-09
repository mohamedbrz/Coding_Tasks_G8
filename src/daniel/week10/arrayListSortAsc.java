package daniel.week10;


import java.util.*;

public class arrayListSortAsc {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static void main(String[] args) {

        List<Integer> test1 = new ArrayList<>(Arrays.asList(5, -85, 5000, 24, -9546454, 789, 1, 0));
        System.out.println("sortByAscending(test1) = " + sortByAscending(test1));

    }


    public static List<Integer> sortByAscending(List<Integer> list){

        Set<Integer> sorted = new TreeSet<>();
        sorted.addAll(list);
        List<Integer> newList = new ArrayList<>();
        newList.addAll(sorted);
        return newList;
    }

}