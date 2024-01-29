package aaron.week1;

public class oddOrEven {
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd

        identifyOddEven(5);
        identifyOddEven(6);


    }

 /*   public  static  String  identifyOddEven1( int  n ) { //ternary operator
        return  n%2==0 ? "Even" : "odd" ;
    }*/

    public  static  void  identifyOddEven( int  n ) {
        if(n%2==0){
            System.out.println("even");}
        else{
            System.out.println("odd");}
    }

}
