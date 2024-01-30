package Cemil.week1;

public class divisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {
        divide(6,3);
        divide(25,4);
        divide(36,8);
    }

    public static void divide(int num1, int num2){
        int count = 0;

        while (num1 >= num2){

            num1 -= num2;
            count++;

        }
        System.out.println(count + " with a remainder of " + num1);
    }

}
