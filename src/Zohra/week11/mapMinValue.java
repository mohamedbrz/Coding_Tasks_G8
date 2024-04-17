package Zohra.week11;


import java.util.Map;

public class mapMinValue {
//Write a method that can return the minimum value from a map (DO NOT use sort method)


        public static int getMinValue(Map<String, Integer> map) {
            int minValue = Integer.MAX_VALUE;
            for (int value : map.values()) {
                if (value < minValue) {
                    minValue = value;
                }
            }
            return minValue;
        }

        public static void main(String[] args) {
            // Example usage:
            Map<String, Integer> testMap = Map.of("A", 5, "B", 3, "C", 7, "D", 1);
            int minValue = getMinValue(testMap);
            System.out.println("Minimum value in the map: " + minValue);
        }
    }

