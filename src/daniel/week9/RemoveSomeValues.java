package daniel.week9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {

        List<Integer> test1 = new ArrayList<>(Arrays.asList(34, 55, 190, 54, 678, -69, -690, 10000, 1));

        System.out.println(removeAllOverHundred(test1));


    }

    public static List<Integer> removeAllOverHundred (List<Integer> list){
        list.removeIf(p -> p >= 100);
        return list;
    }

}