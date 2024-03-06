package ozlem.week5;

public class reverse {
    /* Write a return method that can reverse  String
     Ex: Reverse("ABCD"); ==> DCBA*/
    public static void main(String[] args) {
        System.out.println(reverse("alper"));

    }

    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            result += ch;
        }
        return result;

    }


}
/*public static void main(String[] args) {: This line starts the main method, which is the entry point of the program. It prints the result of the reverse method to the console.

System.out.println(reverse("alper"));: This line calls the reverse method with the input string "alper" and prints the result to the console.

public static String reverse(String str) {: This line starts the reverse method, which takes a string str as input and returns a string.

String result = "";: This line initializes an empty string result to store the reversed string.

for (int i = str.length() - 1; i >= 0; i--) {: This line starts a loop that iterates through each character of the input string str in reverse order.

char ch = str.charAt(i);: This line gets the character at the current index i of the input string str.

result += ch;: This line appends the character ch to the result string.

}: This line marks the end of the for loop.

return result;: This line returns the result string containing the reversed characters.

So, what this code does is:

It iterates through each character of the input string str in reverse order.
For each character, it appends the character to the result string.
Finally, it returns the result string containing the reversed characters.*/