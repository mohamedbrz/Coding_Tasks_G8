package aaron.week3;

public class primeNumber {
     // Write a method that can check if a number is prime or not
     public static void main(String[] args) {
         System.out.println(isPrime(7));

     }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



}
