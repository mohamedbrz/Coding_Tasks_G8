package daniel.week8;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/

    public static void main(String[] args) {

        int n = 4;

        System.out.println("uniquesThatSumTo0(n) = " + Arrays.toString(uniquesThatSumTo0(n)));

    }

    public static int [] uniquesThatSumTo0(int num) {

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * (num * 2)) - num;
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] == 0) {
                count++;
                if (count == 2) {
                    break;
                }
            } else {
                count = 0;
            }
        }
        int[] result = new int[num - count];
        int j = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i]!= 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;

    }

}