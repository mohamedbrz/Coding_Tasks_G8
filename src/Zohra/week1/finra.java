package Zohra.week1;

import javax.imageio.stream.ImageInputStream;

public class finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    public static void main(String[] args) {
        printFinra();
    }

    public static void printFinra(){
        for (int i = 1; i <= 30; i++) { //Iterate from 1 to 30
            //As it is iterating, we want to check for the following conditions
            //If statement is true , it will print out FINRA (multiple of 3 and 5)
            if(i % 3 ==0&& i % 5 ==0){
                System.out.println("FINRA");
            } else if (i % 3 == 0 ) {
                //or FIN if multiple of 3
                System.out.println("FIN");
            }else if(i % 5 ==0) {
                //or RA if multiple of 5
                System.out.println("RA");
            }else {
                //or print out number if not multiply of 3 or 5.
                System.out.println(i);
            }
        }




}}
