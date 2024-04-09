package daniel.week10;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class sortMapbyValues {
//Write a method that can sort the Map by values

    public static void main(String[] args) {

        Map<String, Integer> test1 = new HashMap<>();
        test1.put("value1", 1);
        test1.put("value2", 0);
        test1.put("value3", 34);
        test1.put("value4", -447);
        test1.put("value5", 5564);

        System.out.println("keySortMap(test1) = " + keySortMap(test1));

    }

    public static Map <String, Integer> keySortMap (Map <String, Integer> map) {
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Entry::getKey,
                        Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
            return sortedMap;
    }

}