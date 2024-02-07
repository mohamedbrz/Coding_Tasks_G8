package denisa.week2;
public class swapTwoNumbers {


        public static void swapTwoValues ( int a, int b){

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        public static void swapTwoNumbers ( int a, int b){

            int c = 0;

            c = a;
            a = b;
            b = c;

            System.out.println("a = " + a);
            System.out.println("b = " + b);


        }


    }






