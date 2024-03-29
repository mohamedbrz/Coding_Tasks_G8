package aaron.week9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sam", "Jane", "Ahmed", "James"));
        System.out.println(removeName(names, "Ahmed"));

        List<String> names2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sam", "Jane", "Ahmed", "James"));
        System.out.println(removeName2(names2, "Ahmed"));

        List<String> names3 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sam", "Jane", "Ahmed", "James"));
        System.out.println(removeName3(names3, "Ahmed"));

    }

    public static List<String> removeName(List<String> names, String name) {
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(name)) {
                iterator.remove();
            }
        }
        return names;
    }

    public static List<String> removeName2(List<String> names, String name) {
        names.removeAll(List.of(name));
        return names;
    }

    public static List<String> removeName3(List<String> names, String name) {
        names.removeIf(p -> p.equals(name));
        return names;
    }
}