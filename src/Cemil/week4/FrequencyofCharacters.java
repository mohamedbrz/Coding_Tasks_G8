package Cemil.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {

        frequencyOfCharacters("AAABBCDD");
        frequencyOfCharacters("AABBBCCCCDDDD");

    }


    public static void frequencyOfCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) { // read every character from the String
            int count = 0; // every time the outer loop runs, the counter resets

            if (!result.contains("" + str.charAt(i))){

                for (int j = 0; j < str.length(); j++) { // this loop will count the character

                    if (str.charAt(i) == str.charAt(j)){ // if characters are equal
                        count++; // count will go up by one
                    }
                }

                result += str.charAt(i) + "" + count;
            }

        }

        System.out.println(result);

    }



}