package Cemil.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/


    public static void main(String[] args) {
        uniqueCharacter("AAABBBCCCDEF");
        uniqueCharacter("aaabccddde");
    }

    public static void uniqueCharacter(String str){

        String unique =""; // this variable will store unique character

        for (int j = 0; j < str.length(); j++) { // this outer loop will be responsible to provide each character to inner loop to compare

            char ch = str.charAt(j); // this line store each j character to compare it below with i character
            int frequency = 0; // int variable for counting the frequency of a character

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch){ // if the characters are equal
                    frequency++; // raise count by 1
                }

            }

            if (frequency == 1){ // if the character appeared only once
                unique+=ch; // add into the unique variable
            }

        }

        System.out.println(unique);




    }


}