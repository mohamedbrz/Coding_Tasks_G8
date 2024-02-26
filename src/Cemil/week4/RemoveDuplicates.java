package Cemil.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {
        removeDuplicatesMethod("AAABBBCCC");
        removeDuplicatesMethod("AJHBJBSDKJGBSADBJABB");
    }


    public static void removeDuplicatesMethod(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) { // this loop will get each character of String

            if (result.contains("" + str.charAt(i))){ // if the result contains the character
                continue; // continue method will skip it
            }

            result += str.charAt(i); // this line will contain the characters

        }
        System.out.println(result);

    }

}