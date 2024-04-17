package Onnipa.week11;


public class mapFrequencyChars {

//Write a method that prints the frequency of each character from a String


    public static void printCharacterFrequency(String inputString) {
        // Creating an array to store the frequency of each character
        int[] frequency = new int[Character.MAX_VALUE];

        // Calculating the frequency of each character
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            // Incrementing the frequency count for the character
            frequency[ch]++;
        }

        // Printing the frequency of each character
        for (int i = 0; i < frequency.length; i++) {
            // Printing only if the character appeared at least once
            if (frequency[i] > 0) {
                System.out.println("Character '" + (char) i + "' occurs " + frequency[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String input = "hello world";
        printCharacterFrequency(input);
    }
}





