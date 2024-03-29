package aaron.week9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 200, 3, 4, 555, 6, 7, 8, 9, 101, 200, 300));
        System.out.println(removeIfGreater1(list1, 100));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 200, 3, 4, 555, 6, 7, 8, 9, 101, 200, 300));
        System.out.println(removeIfGreater2(list2, 100));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 200, 3, 4, 555, 6, 7, 8, 9, 101, 200, 300));
        System.out.println(removeIfGreater3(list3, 100));

    }


    public static List<Integer> removeIfGreater1(List<Integer> numbers, int number) {
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() > number) {
                iterator.remove();
            }
        }
        return numbers;
    }

    public static List<Integer> removeIfGreater2(List<Integer> numbers, int number) {
        ArrayList<Integer> bucketList = new ArrayList<>();
        for (int each : numbers)
            if (each < 100)
                bucketList.add(each);
        return bucketList;
    }

    public static List<Integer> removeIfGreater3(List<Integer> numbers, int number) {
        numbers.removeIf(p -> p > number);
        return numbers;
    }

}