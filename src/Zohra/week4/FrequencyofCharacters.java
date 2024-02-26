package Zohra.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


    public static String frequencyOfChars(String input) {

        // We created an array with size 256 assuming ASCII characters
        //Each index of array represents a character's ASCII value
        //value of index represents the frequency of that character
        int[] frequency = new int[256];

        // We iterate through each character of the input String
        // Counting the frequency of each character
        for (char c : input.toCharArray()) {
            frequency[c]++;
        }

        //We iterate through the 'frequency' array.
        //For each index where the frequency is greater then 0, we add on the character represent by index
        // and its frequency to the 'result' string
        //We concatentate characters and numbers to the 'result' string
        String result = "";
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result += (char) i;
                result += frequency[i];
            }
        }
        //return the 'result' string containing the frequency of characters.
        return result;
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println("Frequency of characters in \"" + input + "\": " + frequencyOfChars(input));
    }
}

