package denisa.week10;


import java.util.*;

public class sortMapbyValues {
//Write a method that can sort the Map by values

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 5);
        unsortedMap.put("banana", 2);
        unsortedMap.put("orange", 7);
        unsortedMap.put("grape", 3);

        System.out.println("Before sorting: " + unsortedMap);
        Map<String, Integer> sortedMap = sortByValues(unsortedMap);
        System.out.println("After sorting: " + sortedMap);
    }

    public static Map<String, Integer> sortByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        // Sorting the list based on values using Collections.sort() and a custom Comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Creating a LinkedHashMap to maintain the insertion order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }


}