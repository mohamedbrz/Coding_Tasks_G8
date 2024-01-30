package Zohra.week1;

public class oddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }else{
            System.out.println(num+ " is odd");
        }

    }
}

