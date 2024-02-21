package Cemil.week4;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static void main(String[] args) {
        System.out.println("sameLetterMethod(\"abc\", \"cab\") = " + sameLetterMethod("abc", "cab"));
        System.out.println("sameLetterMethod(\"abc\", \"abb\") = " + sameLetterMethod("abc", "abb"));
        System.out.println("sameLetterMethod(\"abcd\", \"ab\") = " + sameLetterMethod("abcd", "ab"));
    }

    public static boolean sameLetterMethod(String str1, String str2){

        if (str1.length() != str2.length()){ // checks if both str has same legth
            return false;
        }

        // converting String to character Array and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }

}