package Onnipa.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */

    public static void main(String[] args) {
        List<String> Name = new ArrayList<>();
        Name.add("Ahmed");
        Name.add("Alice");
        Name.add("Dime");


        List<String> NoAhmed = new ArrayList<>();

        for (String each : Name) {

            if (each.equalsIgnoreCase("Ahmed")) {
                continue;
            } else {
                NoAhmed.add(each);
            }


        }
        System.out.println("NoAhmed = " + NoAhmed);

    }
}






