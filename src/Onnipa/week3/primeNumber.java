package Onnipa.week3;

public class primeNumber {
     // Write a method that can check if a number is prime or not


    public static void prime (int number){

        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        prime(8);
    }




}
