package Zohra.week11;


import java.util.HashMap;
import java.util.Map;

public class mapFrequencyChars {
//Write a method that prints the frequency of each character from a String

        public static void printCharacterFrequency(String input) {
            // Creating a HashMap to store character-frequency pairs
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Converting the input string to an array of characters
            char[] characters = input.toCharArray();

            // Counting the frequency of each character
            for (char ch : characters) {
                if (frequencyMap.containsKey(ch)) {
                    // If the character is already in the map, increment its frequency by 1
                    frequencyMap.put(ch, frequencyMap.get(ch) + 1);
                } else {
                    // If the character is not in the map, add it with a frequency of 1
                    frequencyMap.put(ch, 1);
                }
            }

            // Printing the character-frequency pairs
            System.out.println("Character frequencies:");
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println("'" + entry.getKey() + "': " + entry.getValue());
            }
        }

        public static void main(String[] args) {
            String input = "hello world";
            printCharacterFrequency(input);
        }
    }
