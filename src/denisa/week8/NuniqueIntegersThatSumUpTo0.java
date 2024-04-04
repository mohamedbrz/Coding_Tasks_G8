package denisa.week8;


import java.util.Arrays;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/

    public static void main(String[] args) {
        int N = 6;
        int[] result = sumZeroArray(N);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sumZeroArray(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N should be greater than 1 and less than 100");
        }

        int[] result = new int[N];

        // If N is odd, add 0 to the result array
        if (N % 2 != 0) {
            result[0] = 0;
        }

        // Generate N/2 positive and N/2 negative integers
        int num = 1;
        for (int i = 0; i < N / 2; i++) {
            result[i * 2 + (N % 2)] = num;
            result[i * 2 + 1 + (N % 2)] = -num;
            num++;
        }

        return result;
    }

}