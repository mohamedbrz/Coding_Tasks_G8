package daniel.week1;

public class oddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    public static void checkForOddEven(int num){

        if (num <= 0){
            RuntimeException exception = new RuntimeException("The number cannot be 0 or negative");
            throw exception;
        }

        if (num % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        checkForOddEven(15);

    }
}
