package denisa.week1;

public class oddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    public static void main(String[] args) {


        int number = 6;
        int number2 = 5;

        boolean isEven = number % 2 == 0;
        boolean isOdd = !isEven;

        System.out.println(number + " is even number " );
        System.out.println(number2 + " is odd number ");

    }
}