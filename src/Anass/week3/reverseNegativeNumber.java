package Anass.week3;

import java.util.Scanner;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53
    public static void main(String[] args) {

        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        input = scanner.nextInt();
        System.out.print("Its reversal is ");
        reverse(input);
        System.out.println();;
    }
    public static void reverse(int number) {
        if(number < 10 && number > 0) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);
            reverse(number/10);
        }
    }


}

