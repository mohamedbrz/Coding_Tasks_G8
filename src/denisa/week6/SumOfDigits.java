package denisa.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */
        public static int calculateDigitSum(String input) {
            int sum = 0;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isDigit(c)) {
                    int digit = Character.getNumericValue(c);
                    sum += digit;
                }
            }

            return sum;
        }



}
/*
We use Character.isDigit(c) to check if a character is a digit.
Character.getNumericValue(c) converts the character to its numeric value.
For the given input string "12 java 5 apple 3", the sum of digits is 20. Feel free to test this method with other input strings!
 */