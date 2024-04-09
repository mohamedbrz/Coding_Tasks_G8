package Cemil.week10;


import java.util.*;

public class sortMapbyValues {
//Write a method that can sort the Map by values

    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("A", 1);
        unsortedMap.put("B", 6);
        unsortedMap.put("C", 3);
        unsortedMap.put("D", 7);

        System.out.println("Original map: " + unsortedMap);
        Map<String, Integer> sortedMap = sortMapByValues(unsortedMap);
        System.out.println("Sorted map by values: " + sortedMap);
    }

    public static Map<String, Integer> sortMapByValues(Map<String, Integer> map) {
        // Create a list of map entries
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        // Sort the list based on values using a custom comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Create a LinkedHashMap to store the sorted entries, preserving the order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }




}