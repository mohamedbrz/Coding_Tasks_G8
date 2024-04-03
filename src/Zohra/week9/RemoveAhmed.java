package Zohra.week9;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */
    public static void removeName(List<String> names, String nameToRemove) {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals(nameToRemove)) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        removeName(names, "Ahmed");

        System.out.println("Names after removing Ahmed:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
