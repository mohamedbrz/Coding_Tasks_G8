package aaron.week6;

import java.util.Arrays;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */
    public static void main(String[] args) {
        System.out.println(sumOfDigits("12java 5apple 3 ."));
        System.out.println(getSumOfNumbers("12java 5apple 3 ."));
    }
    //if you need all numbers as separate values use this one; such as "12java 5apple 3 ." = 1+2+5+3=11
    public  static int  sumOfDigits(String str) {
        int total = 0;
        char[] ch =  str.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }
    //this one assumes numbers are separated from others, such as "12java 5apple 3 ." = 12+5+3=20
    public static int getSumOfNumbers(String str) {
        int sum = 0;

        String[] numbers = str.replaceAll("[\\D]+"," ").split(" ");
        System.out.println(Arrays.toString(numbers));
        for(String each : numbers){
            sum+=Integer.parseInt(each);
        }
        return sum;
    }


}
