package daniel.week10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class arrayListSortDesc {
    //Write a method that can sort the ArrayList in descending order without using the sort method

    public static void main(String[] args) {

        List<Integer> test1 = new ArrayList<>(Arrays.asList(5, -85, 5000, 24, -9546454, 789, 1, 0));
        System.out.println("sortByAscending(test1) = " + sortByDescending(test1));

    }

    public static List<Integer> sortByDescending (List<Integer> list) {

        List<Integer> sortedDescending = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return sortedDescending;

    }


}