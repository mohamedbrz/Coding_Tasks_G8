package denisa.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // Adding integers from 1 to 200 for demonstration
        for (int i = 1; i <= 200; i++) {
            numbers.add(i);
        }

        System.out.println("Original List: " + numbers);

        removeValuesGreaterThan100(numbers);

        System.out.println("List after removing values greater than 100: " + numbers);
    }

    public static void removeValuesGreaterThan100(List<Integer> numbers) {
        numbers.removeIf(num -> num > 100);
    }

}