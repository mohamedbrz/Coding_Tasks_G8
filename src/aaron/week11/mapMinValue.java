package aaron.week11;


import java.util.LinkedHashMap;
import java.util.Map;

public class mapMinValue {
//Write a method that can return the minimum value from a map (DO NOT use sort method)

    public static void main(String[] args) {
        String test = "Aaron_aaron_Harun";
        FrequencyTest(test);
    }

    public static void FrequencyTest(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }



}