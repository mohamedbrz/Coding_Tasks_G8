package daniel.week11;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class mapFrequencyChars {
//Write a method that prints the frequency of each character from a String

    public static void main(String[] args) {

        String s = "The dog is super";

        System.out.println("freqOrCharactersMap(s) = " + freqOrCharacters(s));

    }


    public static Map<Character, Integer> freqOrCharacters(String str){

            Map<Character, Integer> charFrequency = new HashMap<>();

            for (char c : str.toCharArray()) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }

            return charFrequency;
        }

    }

