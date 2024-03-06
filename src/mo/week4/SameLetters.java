package mo.week4;

import aaron.week4.RemoveDuplicates;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/
    public static void main(String[] args) {
        System.out.println(same("abc", "caabb"));
        System.out.println(same("abcd", "caabb"));

    }

    //checking if both Strings contains same letters (disregard duplicates)
    public static boolean same(String a, String b) {
        String a1 = aaron.week4.RemoveDuplicates.removeDup(a);
        String b1 = RemoveDuplicates.removeDup(b);
        char[] ch1 = a1.toCharArray();
        char[] ch2 = b1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);


    }
}