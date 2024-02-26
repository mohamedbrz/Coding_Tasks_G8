package Zohra.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

        // Method to reverse digits of a negative number
        public static int reverseNegative(int num) {
            // Reverse the digits, treating the negative sign as part of the number
            int reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10; //num = num / 10;
                //The method iterates through the digits of the input number num until num becomes 0.
                //Inside the loop, it extracts the last digit of num using the modulus operator % (num % 10).
                //It then appends this digit to the reversed number by multiplying reversed by 10
                    // and adding the extracted digit.
                //After appending the last digit, it removes it from num by integer division (num /= 10),
                    // moving to the next digit.
            }
            return reversed;
        }

        public static void main(String[] args) {
            int negativeNumber = -35; // Example negative number
            int reversed = reverseNegative(negativeNumber);
            System.out.println("Reversed: " + reversed);
        }
    }






