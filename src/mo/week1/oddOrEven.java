package mo.week1;

public class oddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    public static void EvenOdd (int num){
        if (num % 2 ==0 ){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
      EvenOdd(99);

    }
}
