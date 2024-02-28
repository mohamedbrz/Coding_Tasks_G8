package Zohra.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    //Method 'unique' takes a String as a parameter and returns a String containing unique characters
    public static String unique(String input){
        //initialize an empty string named 'result' to store the unique char found in input
        //this loop iterates over each character in the input. 'i' is the index of current character
        //Inside loop, we retrieve character at current index 'i' from input
        //we check if the index of the first occurence of the current character is the same
            //as the index of the last occurrence of the same character in the input
            //if the same, the character appears only once
            //if different, characters occurs more then once
        //we add on the unique characters in 'result' string
        String result="";
        for (int i=0; i<input.length();i++){
            char currentChar = input.charAt(i);
            if(input.indexOf(currentChar)== input.lastIndexOf(currentChar)){
                result +=currentChar;
            }
        }
        //after iterating through all characters, return the 'result' string containing all unique
        return result;

    }

    public static void main(String[] args) {
        String input="AAABBBCCCDEF";
        String uniqueChars=unique(input);
        System.out.println("Unique characters: " +uniqueChars );
    }


}