package denisa.week8;


public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 9, 0, 1, 7};
        moveZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // Count of non-zero elements
        // Traverse the array. If element encountered is non-zero, then replace the element at index 'count' with this element
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // here count is incremented
            }
        }
        // Now all non-zero elements have been shifted to front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end of array.
        while (count < n) {
            arr[count++] = 0;
        }
    }

}