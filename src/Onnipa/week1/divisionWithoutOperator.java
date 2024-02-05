package Onnipa.week1;

import java.util.Scanner;

public class divisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator

    public static void division (int num1,int num2){
        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }


    public static void main(String[] args) {

        division(3,1);
        division(2,3);
        division(7,5);


    }
}
