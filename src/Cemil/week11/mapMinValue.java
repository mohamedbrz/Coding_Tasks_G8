package Cemil.week11;


import java.util.HashMap;
import java.util.Map;

public class mapMinValue {
//Write a method that can return the minimum value from a map (DO NOT use sort method)

    public static void main(String[] args) {
        // Create a map and populate it with key-value pairs
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("a", 10);
        testMap.put("b", 5);
        testMap.put("c", 8);

        // Call the method to print the minimum value
        printMinValue(testMap);
    }

    public static void printMinValue(Map<String, Integer> map) {
        // Initialize min value with the first value in the map
        Integer minValue = null;

        // Iterate through the map's values
        for (Integer value : map.values()) {
            // If it's the first value encountered or the current value is less than the min value
            if (minValue == null || value.compareTo(minValue) < 0) {
                // Update min value
                minValue = value;
            }
        }

        // Print the minimum value
        System.out.println("Minimum value: " + minValue);
    }





}