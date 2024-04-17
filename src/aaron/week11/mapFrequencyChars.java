package aaron.week11;


import java.util.*;

public class mapFrequencyChars {
//Write a method that prints the frequency of each character from a String

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