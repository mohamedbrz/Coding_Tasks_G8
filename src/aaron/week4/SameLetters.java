package aaron.week4;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static void main(String[] args) {
        System.out.println(same("abc", "caabb"));
        System.out.println(same1("abc", "caabb"));

    }

    //checking if both Strings contains same letters (disregard duplicates)
    public static boolean same(String a, String b) {
        String a1 = RemoveDuplicates.removeDup(a);
        String b1 = RemoveDuplicates.removeDup(b);
        char[] ch1 = a1.toCharArray();
        char[] ch2 = b1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);

        /*String a1 = "", a2 = "";
        for (char each : ch1)
            a1 += each;
        for (char each : ch2)
            a2 += each;
        return a1.equals(a2);*/

    }

    //checking if both Strings contain exactly same letters with the same frequency
    public static boolean same1(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}