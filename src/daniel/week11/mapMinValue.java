package daniel.week11;


import java.util.Map;

public class mapMinValue {
//Write a method that can return the minimum value from a map (DO NOT use sort method)

    public static void main(String[] args) {

        Map<String, Integer> test = Map.of("A", 10, "B", -5, "C", 500, "G", -42);
        Integer minValue = findMinValue(test);
        System.out.println("Minimum value: " + minValue);


    }


    public static <K, V extends Comparable<V>> V findMinValue(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map must not be null or empty");
        }

        V minValue = null;

        for (V value : map.values()) {
            if (minValue == null || value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }

        return minValue;
    }

}