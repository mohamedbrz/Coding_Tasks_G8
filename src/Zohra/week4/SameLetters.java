package Zohra.week4;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

        //This method takes two String , str1 and str2, as arguments
        public static boolean same(String str1, String str2) {
            //checks if either of Strings is null or if lenght are different. if true will return false
            if (str1 == null || str2 == null || str1.length() != str2.length())
                return false;

            // Convert strings to character arrays and sort them
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare sorted strings
            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String str1 = "abc";
            String str2 = "cab";
            System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" built out of the same letters? " + same(str1, str2));

            str1 = "abc";
            str2 = "abb";
            System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" built out of the same letters? " + same(str1, str2));
        }
    }


