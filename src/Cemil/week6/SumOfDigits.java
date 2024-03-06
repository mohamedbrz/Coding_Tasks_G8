package Cemil.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */


    public static void main(String[] args) {
        String input = "12 java 5 apple 3";

        System.out.println("calculateDigitSum(input) = " + calculateDigitSum(input));
    }

    public static int calculateDigitSum(String input){

        int sum = 0;
        String currentNumber = "";

        for (char ch : input.toCharArray()){
            // If the character is a digit, concatenate it to the currentNumber string
            if (Character.isDigit(ch)){
                currentNumber += ch;

            }else {
                // If the character is not a digit, convert the currentNumber string to an integer and add it to the sum
                if ( ! currentNumber.isEmpty()){

                    sum += Integer.parseInt(currentNumber);
                    currentNumber = ""; // Reset the currentNumber string for the next number
                }

            }
        }

        // Add the last number if present
        if ( ! currentNumber.isEmpty()){
            sum += Integer.parseInt(currentNumber);
        }

        return sum;
    }



}
