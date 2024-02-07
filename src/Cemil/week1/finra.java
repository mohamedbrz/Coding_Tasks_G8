package Cemil.week1;

public class finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.


    public static void main(String[] args) {
        FINRA(30);
    }

    public static void FINRA(int num){

        for (int i = 1; i < num ; i++) {

            String str = "";

            if (i % 3 == 0){
                str += "FIN";
            }
            if (i % 5 == 0){
                str += "RA";
            }

            System.out.println(str.isEmpty() ? i :str);
        }

    }

}
