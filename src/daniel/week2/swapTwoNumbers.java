package daniel.week2;
public class swapTwoNumbers {
    //Swap two variable' values without using a third variable

    public static void main(String[] args) {
        variableSwap(10, 25);
    }

    public static void variableSwap(int a, int b){
        if (a == b){
            throw new RuntimeException("The variables must be different");
        }
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
