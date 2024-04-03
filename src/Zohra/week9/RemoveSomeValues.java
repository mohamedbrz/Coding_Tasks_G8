package Zohra.week9;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            // Populate the list with integers 1 to 200 for demonstration
            for (int i = 1; i <= 200; i++) {
                numbers.add(i);
            }

            removeGreaterThan100(numbers);

            System.out.println("Numbers after removing values greater than 100:");
            for (int num : numbers) {
                System.out.println(num);
            }
        }

        public static void removeGreaterThan100(List<Integer> numbers) {
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                int number = iterator.next();
                if (number > 100) {
                    iterator.remove();
                }
            }
        }
    }



