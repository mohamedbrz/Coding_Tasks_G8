package Cemil.week8;


import java.util.Arrays;
import java.util.Random;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/


    public static void main(String[] args) {
        int N = 3;
        int[] result = generateSumZeroArray(N);
        System.out.println(Arrays.toString(result));
    }

    public static int[] generateSumZeroArray(int N){

        if (N < 2 || N >= 100){
            throw new IllegalArgumentException("N must be between 2 and 99");
        }

        int[] array = new int[N];
        Random random = new Random(); // to generate pseudorandom numbers.

        // Generate N - 1 random integers between -N/2 and N/2
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            array[i] = random.nextInt(N + 1) - N / 2;
            sum += array[i];
        }

        // Ensure the sum of all elements is 0 by assigning the opposite of the sum to the last element
        array[N - 1] = -sum;

        return array;


    }




}