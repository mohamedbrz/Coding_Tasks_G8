package aaron.week11;


import java.util.*;

public class mapMinValue {
//Write a method that can return the minimum value from a map (DO NOT use sort method)

    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<>();
        test.put("Aaron", 11);
        test.put("Harun", 5);
        test.put("Cydeo", 27);
        test.put("Java", 100);
        System.out.println(minValue(test));
    }


    public static int minValue(Map<String, Integer> map) {
        SortedSet<Integer> sortedMapValues = new TreeSet<>(map.values());
        return sortedMapValues.first();
    }



}