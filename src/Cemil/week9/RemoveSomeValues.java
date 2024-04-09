package Cemil.week9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.


    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,-30,300,90,80,-250,900,62,54,99,947,101,201));
        System.out.println("=========ORIGINAL LIST=============");
        System.out.println(Arrays.asList(numbers));

        System.out.println("=========REMOVED LIST=============");
        System.out.println(removeGreaterThan(numbers, 2));

    }


    // a method will accept an Integer List and int number variable to remove dynamically
    public static List<Integer> removeGreaterThan(List<Integer> numbers, int number){

        // since it's a list we create an iterator to iterate through the elements and remove
        Iterator<Integer> iterator = numbers.iterator();

        // while list of integer has next element
        while (iterator.hasNext()){

            // it the current element greater than given number, remove
            if (iterator.next() > number){
                iterator.remove();
            }
        }
        return numbers;
    }


}