package denisa.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        System.out.println("Original List: " + names);

        removeName(names, "Ahmed");

        System.out.println("List after removing 'Ahmed': " + names);
    }

    public static void removeName(List<String> names, String nameToRemove) {
        names.removeIf(name -> name.equals(nameToRemove));
    }

}