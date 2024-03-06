package ozlem.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */

    public static void main(String[] args) {
        String str = "12 java 5 apple 3";
        int sum = sumOfDigits(str);
        System.out.println(sum); // Output: 20
    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}



