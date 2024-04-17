package Cemil.week11;


import java.util.HashMap;
import java.util.Map;

public class mapFrequencyChars {
//Write a method that prints the frequency of each character from a String

    public static void main(String[] args) {
        String testString = "Wooden Spoon";
        frequencyOfCharacter(testString);



        // not counting empty spaces
        frequencyOfCharacterNoEmptySpace(testString);
    }

    // This will print the empty spaces in String
    public static void frequencyOfCharacter(String str) {
        // Created Map to store the character frequency
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string
        for (char each : str.toCharArray()) {
            // Increment the count for the character or set it to 1 if it's the first occurrence
            frequencyMap.put(each, frequencyMap.getOrDefault(each, 0) + 1);
        }

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + ", ");
        }
    }

    // This method will not count the empty spaces
    public static void frequencyOfCharacterNoEmptySpace(String str) {
        // Create a Map to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string to count character frequencies
        for (char c : str.toCharArray()) {
            // Exclude non-alphabetic characters
            if (Character.isLetter(c)) {
                // Increment the count for the character or set it to 1 if it's the first occurrence
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}