package daniel.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {

       reverse(-35);
    }


        public static void reverse(int number) {
            if (number < 0) {
                System.out.print("-");
                reverse(number * -1);
            } else if (number < 10) {
                System.out.println(number);
            } else {
                System.out.print(number % 10);
                reverse(number / 10);
            }
        }





}

