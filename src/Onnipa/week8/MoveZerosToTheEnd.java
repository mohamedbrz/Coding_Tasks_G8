package Onnipa.week8;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/

        public static void moveZeros(int[] nums) {
            int nonZeroIndex = 0;

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    // If current element is non-zero, move it to the nonZeroIndex position
                    nums[nonZeroIndex] = nums[i];
                    // Increment the nonZeroIndex
                    nonZeroIndex++;
                }
            }

            // Fill remaining positions with zeros
            for (int i = nonZeroIndex; i < nums.length; i++) {
                nums[i] = 0;
            }
        }

        public static void main(String[] args) {
            int[] nums = {1, 0, 2, 0, 3, 0, 4, 0};
            moveZeros(nums);

            // Print the modified array
            System.out.println(Arrays.toString(nums));
        }
    }


