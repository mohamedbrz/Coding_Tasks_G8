package daniel.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */

    public static void main(String[] args) {

        String str1 = "12 java 5 apple 3";

        System.out.println("returnSumOfDigits(str1) = " + returnSumOfDigits(str1));

        String str2 = "5000 dog eats 5 with a 587 and a 43";

        System.out.println("returnSumOfDigits(str2) = " + returnSumOfDigits(str2));

    }




    public static int returnSumOfDigits(String str) {
        String[] arr = str.split(" ");
        int answer = 0;

        for (String each : arr) {
            if (each.contains("0") || each.contains("1") || each.contains("2") || each.contains("3") ||
                    each.contains("4") || each.contains("5") || each.contains("6") || each.contains("7") ||
                    each.contains("8") || each.contains("9")) {
                answer += Integer.parseInt(each);
            }
        }

        return answer;
    }

}
