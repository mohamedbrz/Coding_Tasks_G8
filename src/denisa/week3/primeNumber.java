package denisa.week3;

public class primeNumber {
     // Write a method that can check if a number is prime or not
     public static void main(String[] args) {

         boolean prime = true;
         int n = 6;

         for (int i = 2; i <= n / 2; i++) {

             if (n % i == 0) {
                 prime = false;
                 break;
             }
         }

         if (prime)
             System.out.println(n + " is prime number.");
         else
             System.out.println(n + " is not prime number.");

     }
}






