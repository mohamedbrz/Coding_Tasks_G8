package KurbanHasan.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {


        int a = 3;
        int b = 6;

        a = a * b; //a = 18
        b = a / b; //b = 3
        a = a / b; // a = 6

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("------------------------");

        int x = 3;
        int y = 6;

        x+=y; //9
        y=x-y; //3
        x-=y; //6

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}


//Swap two variable values without using a third variable