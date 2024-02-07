package denisa.week1;


public class finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    public static void main(String[] args) {

        int num = 3;
        int num2 = 30;
        String result ="";

        if (num % 3 ==0){
            System.out.println("FIN");
        }

        if (num2 % 5 ==0 ){
            System.out.println("RA");
        }

        if(num % 3 ==0&& num2 % 5 ==0){
            System.out.println("FINRA");
        }



    }
}


