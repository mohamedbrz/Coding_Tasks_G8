package ozlem.week1;

public class oddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/
    public static void main(String[] args) {

       int num = 0;

        if (num%2==0){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + "is odd number");
        }

    }
}
/*Explanation:

Number to Check (int num = 0;):

You have a variable num initialized to 0. This is the number you want to check whether it's even or odd.
Checking Even or Odd:

The if statement checks if the number is even by using the condition num % 2 == 0.
If the condition is true, it prints that the number is even.
If the condition is false (meaning the number is odd), it prints that the number is odd.
Printing Result:

System.out.println() statements are used to print whether the number is even or odd.
So, when you run this program, it will output whether the given number (num) is even or odd. In your specific code, since num is initialized to 0, the output will be "0 is an even number." If you want to check other numbers, you can change the value of num accordingly.







*/