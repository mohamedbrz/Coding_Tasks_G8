package daniel.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */

    public static void main(String[] args) {
        List<String> test1 = new ArrayList<>();
        test1.add("Ahmed");
        test1.add("John");
        test1.add("Ahmed");
        test1.add("Eric");
        test1.add("Emily");
        test1.add("Ahmed");

        System.out.println(test1);

        System.out.println("------------------");

        System.out.println("removeDuplicateNames(test1, \"Ahmed\") = " + removeAllNames(test1, "Ahmed"));

    }

    public static List<String> removeAllNames (List<String> list, String removedWord){

       list.removeIf(p -> p.equals(removedWord));
       return list;


    }


}