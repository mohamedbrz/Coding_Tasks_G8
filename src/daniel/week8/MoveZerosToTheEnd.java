package daniel.week8;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static void main(String[] args) {

        int [ ] arr = {1,0,-2,0,3,0,4,0};
        System.out.println("moveZerosToTheEnd(arr) = " + Arrays.toString(moveZerosToTheEnd(arr)));
    }


    public static int [] moveZerosToTheEnd(int [] arr){

        int[] result = Arrays.stream(arr)
                .filter(x -> x!= 0)
                .toArray();

        int zeroCount = (arr.length - result.length);
        for (int i = 0; i < zeroCount; i++) {
            result = concatenate(result, new int[]{0});
        }

        return result;

    }

    private static int[] concatenate(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }



}