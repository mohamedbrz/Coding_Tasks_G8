package Cemil.week9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */


    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "John", "Eric"));

        System.out.println("------FULL NAME LIST------");
        System.out.println(names);

        System.out.println("------REMOVE AHMED------");
        //System.out.println(removeName(names, "Ahmed"));

        System.out.println("------REMOVE ERIC------");
        System.out.println(removeName(names, "Eric"));

    }



    // this method will accept a list of names and a string name to remove the name dynamically
    public static List<String> removeName(List<String> names, String name){

        // since we are not able to remove from List while we're looping and iterating through
        // we create iterator, it will help us to go through each element and remove
        Iterator<String> iterator = names.iterator();


        // while iterator has next element to go through
        while (iterator.hasNext()){

            // we will read the element and check if it's equal to "Ahmed"
            if (iterator.next().equals(name)){
                iterator.remove();
            }

        }
        return names;
    }


}