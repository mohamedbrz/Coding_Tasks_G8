package mo.week2;
public class swapTwoNumbers {
    //Swap two variable' values without using a third variable

        public static void main(String[] args) {


            //Swap two variable' values without using a third variable


            int x, y;
            x = 10;
            y = 20;

            // swap numbers
            x = x + y; // 10 + 20 = 30
            y = x - y; // 30 - 20 = 10
            x = x - y; // 30 - 10 = 20

            System.out.println("x= " + x + " " + "y= " + y);

        }
    }

