package mo.week8;


public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/
    public static void moveZerosToTheEnd(int[] nums) {
        int index = 0;

        // Move non-zero elements to the front of the array

        for (int num : nums) {   // loop through elements in the array
            if (num != 0) {
                nums[index++] = num; //index++ return the original value of index.
            }
        }

        // replace the rest indexes with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }

        //print the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,0};
        moveZerosToTheEnd(nums);




    }


}