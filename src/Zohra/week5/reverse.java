package Zohra.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
        public static String reverse(String input) {
            // Check for null or empty input
            if (input == null || input.isEmpty()) {
                return input;
            }

            // Convert the string to a character array using toCharArray()
            char[] charArray = input.toCharArray();

            // Initialize pointers for reversing
            int left = 0; //starts from beginning of character array
            int right = charArray.length - 1; //starts from the end of char array

            // Reverse the character array
            while (left < right) {
                // inside 'while' loop, Swap characters at left and right pointers
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                // Move the pointers towards each other to middle
                left++; //moves 'left' pointer one position to right towards end of array
                right--; //opposite as above
            }

            // Convert the character array back to a string and return
            return new String(charArray);
        }

        public static void main(String[] args) {
            String input = "ABCD";
            String reversedString = reverse(input);
            System.out.println("Reversed string: " + reversedString); // Output: DCBA
        }
    }



