package daniel.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        Map<Character, Integer> map1 = characterFrequency("AAAABBBBBBBCCCDWEEEEEEE");
        System.out.println(map1);
    }

    public static Map characterFrequency(String s){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : s.split("")) {
            int frequency = Collections.frequency(Arrays.asList(s.split("")), each);
            map.put(each.charAt(0), frequency);
        }

        return map;
    }


}