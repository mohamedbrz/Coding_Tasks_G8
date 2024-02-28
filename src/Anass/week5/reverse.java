package Anass.week5;

public class reverse {
    /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {


        String stringExample  =  "FavTutor";

        System.out.println("Original string: "+stringExample);


        StringBuilder reverseString = new StringBuilder(stringExample);


        reverseString.reverse();

        String result = reverseString.toString();


        System.out.println("Reversed string: "+result);

    }

}

