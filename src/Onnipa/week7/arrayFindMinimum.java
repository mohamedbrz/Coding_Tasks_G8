package Onnipa.week7;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

public static int Minimum (int[] a){

            int min = a[0];
            for(int i = 1; i < a.length;i++)
            {
                if(a[i] < min)
                {
                    min = a[i];
                }

            }

            return min;
        }

    public static void main(String[] args) {

       int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(Minimum(arr));
    }
    }
