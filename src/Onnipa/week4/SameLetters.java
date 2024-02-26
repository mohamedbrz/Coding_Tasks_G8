package Onnipa.week4;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/
    public static void main(String[] args) {
        System.out.println(same("gone","oneg"));
    }
    public static boolean same (String word1,String word2){

        String words = RemoveDuplicates.duplicate(word1);
        String words2 = RemoveDuplicates.duplicate(word2);


        char[] ch1 = words.toCharArray();
        char[] ch2 = words2.toCharArray();
        Arrays.sort(ch1);
        System.out.println(ch1);

        Arrays.sort(ch2);
        System.out.println(ch2);
        return Arrays.equals(ch1, ch2);

    }


}


