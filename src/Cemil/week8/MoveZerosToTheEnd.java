package Cemil.week8;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/


    public static void main(String[] args) {

        int[] inputArray = {1,0,2,0,3,0,-4,0};
        int[] resultArray = moveZerosToEnd(inputArray);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] moveZerosToEnd(int[] nums){
        int[] result = new int[nums.length];
        int countZero = 0;

        // move non-zero element to the front
        for (int num :  nums ){
            if (num != 0){
                result[countZero] = num;
                countZero++;
            }
        }

//        //fill the remaining space with zero
//        while (countZero < nums.length){
//            result[countZero] = 0;
//            countZero++;
//        }

        return result;



    }



}