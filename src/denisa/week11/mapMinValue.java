package denisa.week11;


import java.util.Collections;
import java.util.Map;

public class mapMinValue {
//Write a method that can return the minimum value from a map (DO NOT use sort method)
    public static <K, V extends Comparable<V>> V getMinValue(Map<K, V> map) {
        //K = Key                   //V = Value

        //check if map is empty
        if(map.isEmpty()){
            throw new IllegalArgumentException("Map is empty");
        }
        //use Collection.min() to find the minimum value
        return Collections.min(map.values());
    }

    public static void main(String[] args) {
        //Example usage:
        Map<String, Integer> sampleMap = Map.of("A",10,"B", 5, "C", 15, "D",3);
        Integer minValue = getMinValue(sampleMap);
        System.out.println("Minimum value: " + minValue);
    }




}
/*
In this approach, we utilize the Collections.min() method, which finds and returns the minimum element from a collection. We simply pass the values() of the map to this method, and it returns the minimum value. This approach avoids explicit iteration over the values of the map.
 */

 /*
   <K, V extends Comparable<V>>: This part specifies the method's generic type parameters. It declares two type parameters K and V, where K represents the type of keys in the map, and V represents the type of values in the map. Additionally, it specifies that the value type V must implement the Comparable interface. This constraint is necessary because the method compares values using their natural ordering.

V: This indicates the return type of the method. The method returns a value of type V, which represents the minimum value found in the map.

getMinValue(Map<K, V> map): This is the method signature. It takes a single parameter map, which is a Map object with keys of type K and values of type V. The method is designed to find and return the minimum value from this map.

Inside the method, it first checks if the map is empty. If the map is not empty, it uses Collections.min(map.values()) to find and return the minimum value from the map. If the map is empty, it throws an IllegalArgumentException.

  */