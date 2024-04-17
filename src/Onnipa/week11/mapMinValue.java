package Onnipa.week11;


import java.util.Map;

public class mapMinValue {
//Write a method that can return the minimum value from a map (DO NOT use sort method)

    public static <K, V extends Comparable<V>> V getMinimumValue(Map<K, V> map) {
        // Check if the map is null or empty
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map is null or empty");
        }

        V minValue = null;

        // Iterate through the values of the map
        for (V value : map.values()) {
            // If minValue is null or the current value is less than minValue
            if (minValue == null || value.compareTo(minValue) < 0) {
                // Update minValue to the current value
                minValue = value;
            }
        }

        // Return the minimum value found
        return minValue;
    }

    public static void main(String[] args) {
        // Example usage:
        Map<String, Integer> sampleMap = Map.of(
                "a", 10,
                "b", 5,
                "c", 20,
                "d", 15
        );

        Integer minValue = getMinimumValue(sampleMap);
        System.out.println("Minimum value in the map: " + minValue);
    }
}



