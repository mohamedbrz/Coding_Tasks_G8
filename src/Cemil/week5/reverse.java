package Cemil.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/


    public static void main(String[] args) {
        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));

        System.out.println("reverse(\"Monday\") = " + reverse("monday"));
    }

    public static String reverse(String str){ // creating a method with a string parameter to make it re=usable

        String reverse = ""; // variable to store reversed string

        for (int i = str.length() -1; i >=0 ; i--) { // traditional loop to iterate the str backward

            reverse += str.charAt(i) + ""; // store each char character into String variable by concatenating with empty String

        }
        return reverse; // return reversed

    }


}