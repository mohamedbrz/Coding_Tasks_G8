package Zohra.week3;

public class primeNumber {
     // Write a method that can check if a number is prime or not


        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }
            // This loop iterates from 2 up to half of the number itself (num / 2).
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                    //Inside the loop, it checks if the number num is divisible
                    // by the current value of i. If num is divisible by i, it means num is not prime,
                    // and the method returns false.
                }
            }
            return true; // If not divisible by any number, then it's prime
        }


        public static void main(String[] args) {


            int number = 1; // Example number to check
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
