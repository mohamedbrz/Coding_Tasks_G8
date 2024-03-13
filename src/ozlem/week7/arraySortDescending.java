package ozlem.week7;


import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/

    public static void main(String[] args) {
        int[] arr = {10,60,90,70,400,400,300};
        System.out.println(Arrays.toString(sortDescending(arr)));

        int[] arr1 = {-400, -300, 80, 60, 20, 10, 56};
        System.out.println(Arrays.toString(sortDescending(arr1)));

    }
    public static int[] sortDescending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <  arr.length -1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
/*This line starts a special method called "sortDescending" that takes a list of numbers (an array) and arranges them from largest to smallest. It's like putting the biggest numbers first.
* Here, the code starts checking each number in the list one by one, but it stops before the last number because we compare each number with the next one. If there's only one number left, we don't need to compare it with anything.
* Inside the first loop, the code starts another check for each number with the one next to it. It's like looking at pairs of numbers to see which one is bigger.
* This line checks if the current number is smaller than the next number. If it is, we swap their positions because we want the bigger numbers to come first for descending order.
* If we need to swap the numbers, we use a temporary placeholder called "temp" to do that. It's like temporarily putting one number aside while we move the other.
* After all these checks and swaps, the code gives back the list of numbers with the largest numbers coming first. It's like giving you a list of your toys or books, but this time from biggest to smallest, so you know which ones are the largest.*/