package Onnipa.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 200; i++) { // Example list from 1 to 200
            numbers.add(i);
        }

        // Remove values greater than 100
        numbers.removeIf(num -> num > 100);

        // Print the updated list
        System.out.println("List after removing values greater than 100: " + numbers);
    }

}