package Zohra.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    //Checks if the input String is null or empty, if it is method returns an empty string
    public static String removeDup(String input) {
        if (input == null || input.isEmpty())
            return "";

    //create a boolean array with size 256 to keep track of characters we have seen
        //Each index of array represents a ASCII value of characters
        boolean[] seen = new boolean[256]; // Assuming ASCII characters
        String result = "";

        //we iterate through each character of the input string.
        //for each character 'c', we convert it to its ASCII value
        //if seen[ascii] is false, it means we have not seen it, we add on to result string
        for (char c : input.toCharArray()) {
            int ascii = (int) c;
            if (!seen[ascii]) {
                result += c;
                seen[ascii] = true;
            }
        }

        //we return the string containing unique characters.
        return result;
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        System.out.println("After removing duplicates from \"" + input + "\": " + removeDup(input));
    }


}