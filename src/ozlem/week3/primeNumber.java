package ozlem.week3;

public class primeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(34));
        System.out.println(isPrime(11));
        System.out.println(isPrime(22));
        System.out.println(isPrime(13));
    }

    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
                return true;
    }
}


// Write a method that can check if a number is prime or not