package denisa.week11;

public class mapFrequencyChars {
//Write a method that prints the frequency of each character from a String
    public static void printCharacterFrequency(String str){

        //ASCII characters (0-255)
        int[] frequency=new int[256];

        //counting the frequency of each character
        for (int i = 0; i <str.length(); i++) {
            char c = str.charAt(i);
            frequency[c]++;
        }

        //print the frequencies

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] !=0){
                System.out.println("Character: " + (char)i + "Frequency: " + frequency[i]);
            }

        }

    }
    public static void main(String[] args) {
        String input = "wooden spoon";
        printCharacterFrequency(input);
    }
}
/*
This method creates an array frequency of size 256 to store the frequency of each ASCII character. It then iterates over each character in the input string, increments the corresponding frequency count in the array, and finally prints out the frequency of each character.
 */




