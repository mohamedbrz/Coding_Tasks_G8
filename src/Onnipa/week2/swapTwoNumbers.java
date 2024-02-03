package Onnipa.week2;
public class swapTwoNumbers {
    //Swap two variable' values without using a third variable

public static void swap (int x, int y){

    System.out.println(x +" "+ y);


   x = x+y;

   y = x-y;

   x = x-y;







    System.out.println(x+" "+y);





}
    public static void main(String[] args) {

        swap(9,7);
    }


}
