package Zohra.week8;


public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/



        public static void moveZerosToEnd(int[] nums) {
            int count = 0; // Index to keep track of the last non-zero element found

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                // If current element is non-zero
                if (nums[i] != 0) {
                    // Swap current element with the element at count index
                    int temp = nums[count];
                    nums[count] = nums[i];
                    nums[i] = temp;

                    // Increment count to point to the next position
                    count++;
                }
            }
        }

        public static void printArray(int[] arr) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    public static void main(String[] args) {
        int[] input = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(input);
        System.out.print("Output: ");
        printArray(input);
    }

    }






