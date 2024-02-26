package Cemil.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {
        System.out.println("reversedNeg(-35) = " + reversedNeg(-35));
        System.out.println("reversedNeg(-1234) = " + reversedNeg(-1234));

    }


    public static int reversedNeg(int n){

        // convert negative number to positive
        int positiveNum = Math.abs(n);

        // reverse the digit
        int reversed = 0;

        while (positiveNum != 0){

            int digit = positiveNum % 10;
            reversed = reversed * 10 + digit;
            positiveNum /= 10;
        }

        // Apply negative sign to the original number
        reversed *= -1;

        return reversed;
    }



}

