package Cemil.week2;

public class swapTwoNumbers {
    //Swap two variable' values without using a third variable

    public static void main(String[] args) {

        swapTwoNumbers(4, 10);

    }

    public static void swapTwoNumbers(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a " + a);
        System.out.println("b " + b);
    }

}
