package Zohra.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */


        public static void main(String[] args) {
            String input = "12 java 5 apple 3";
            int sum = sumOfDigits(input);
            System.out.println("Sum of digits: " + sum);
        }

        public static int sumOfDigits(String str) {
            int sum = 0;
            int currentNumber = 0;
            boolean inNumber = false;

            // Iterate over each character in the string
            for (char ch : str.toCharArray()) {
                // Check if the character is a digit
                if (Character.isDigit(ch)) {
                    // Convert the digit character to its numeric value and update currentNumber
                    currentNumber = currentNumber * 10 + Character.getNumericValue(ch);
                    inNumber = true;
                } else {
                    // If we were in a number, add it to the sum and reset currentNumber
                    if (inNumber) {
                        sum += currentNumber;
                        currentNumber = 0;
                    }
                    inNumber = false;
                }
            }

            // Add the last number if the string doesn't end with a non-digit character
            if (inNumber) {
                sum += currentNumber;
            }

            return sum;
        }
    }







