package mo.week1;

public class finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
public static void finra ( int num){
    boolean by3 = num % 3 == 0;
    boolean by5 = num % 5 == 0;
    String result;

    if(by3 && by5){
        result = "FINRA";
    }else if(by3){
        result = "FIN";
    }else if (by5){
        result="RA";
    }else{
        result= "" + num;
    }
    System.out.println(result);

}
    public static void main(String[] args) {
      finra(9);

    }
}
