package Zohra.week1;

public class divisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator

    public static void divideWithoutOperator(int d1, int d2){

        if(d2==0){
            System.out.println("Cannot divide by zero");
            return;
        }

        int result=0;
        while(d1 >=d2){
            d1-=d2;
            result++;
        }

        System.out.println(result);

    }}





