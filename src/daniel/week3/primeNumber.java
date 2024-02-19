package daniel.week3;

public class primeNumber {
     // Write a method that can check if a number is prime or not

    public static void main(String[] args) {
        System.out.println(isPrime(97));
    }

    public static boolean isPrime(int num){

        for (int i = 2; i < 100; i++) {
            if (num % i == 0 && i != num){
                return false;
            }
        }
        return true;
    }


}
