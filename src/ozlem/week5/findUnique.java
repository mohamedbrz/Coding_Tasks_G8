package ozlem.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {

        System.out.println(uniqueChar("AAABBBCCCDEF"));
    }
    public static String uniqueChar(String str){

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
    result += ch;
}
        }
        return result;
    }
/*public static void main(String[] args) {: This line starts the main method, which is the entry point of the program. It prints the result of the uniqueChar method to the console.

System.out.println(uniqueChar("AAABBBCCCDEF"));: This line calls the uniqueChar method with the input string "AAABBBCCCDEF" and prints the result to the console.

public static String uniqueChar(String str){: This line starts the uniqueChar method, which takes a string str as input and returns a string.

String result = "";: This line initializes an empty string result to store the unique characters.

for (int i = 0; i <str.length() ; i++) {: This line starts a loop that iterates through each character of the input string str.

char ch = str.charAt(i);: This line gets the character at the current index i of the input string str.

if (str.indexOf(ch) == str.lastIndexOf(ch)) {: This line checks if the first occurrence of the character ch is the same as the last occurrence of the character ch in the input string str. If they are the same, it means that the character ch is unique in the string.

result += ch;: This line appends the unique character ch to the result string.

}: This line marks the end of the if statement.

}: This line marks the end of the for loop.

return result;: This line returns the result string containing the unique characters.

So, what this code does is:

It iterates through each character of the input string str.
For each character, it checks if the first occurrence of the character is the same as the last occurrence of the character in the string.
If they are the same, it means that the character is unique, so it appends the character to the result string.
Finally, it returns the result string containing the unique characters.*/

}