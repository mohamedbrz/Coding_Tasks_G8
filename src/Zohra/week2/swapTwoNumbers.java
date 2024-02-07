package Zohra.week2;
public class swapTwoNumbers {
    public static void main(String[] args) {


    //Swap two variable' values without using a third variable

        int a = 5;
        int b = 10;

        System.out.println("Before swapping: ");
        System.out.println("a = " + a + ", b = " + b);

        a = a + b; //15
        b = a - b; //15-10=5
        a = a - b;//15-5=10

        System.out.println("After swapping: ");
        System.out.println("a = " + a + ", b = " + b);

}
}