package ozlem.week1;

public class finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
    public static void main(String[] args) {


        for (int num = 1; num <= 30; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FINRA");
            } else if (num % 3 == 0) {
                System.out.println("FIN");
            } else if (num % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(num);
            }
        }
    }
}

/*EXPLANATION
Loop (for loop):

The loop runs from num = 1 to num = 30, incrementing num by 1 in each iteration.
Conditions:

It checks three conditions for each number:
If the number is a multiple of both 3 and 5, it prints "FINRA."
If the number is only a multiple of 3, it prints "FIN."
If the number is only a multiple of 5, it prints "RA."
If the number doesn't meet any of these conditions, it prints the number itself.
Printing:

The System.out.println() statements print the appropriate message or number based on the conditions.
So, when you run this program, it will print numbers from 1 to 30, replacing multiples of 3 with "FIN," multiples of 5 with "RA," and multiples of both 3 and 5 with "FINRA."






*/

