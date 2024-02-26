package ozlem.week4;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static void main(String[] args) {


    System.out.println(same("abc", "cabccc"));
        System.out.println(same("abc", "abb"));
}

    public static boolean same(String str1, String str2){

//        if(str1.length() != str2.length()){
//            return false;
//        }


        char[] arr1 = str1.toCharArray(); //a b c
        char[] arr2 = str2.toCharArray();  // c a b

        Arrays.sort(arr1); //a b c
        Arrays.sort(arr2);  // a b c

        return  Arrays.equals(arr1,arr2); // return boolean
    }
}