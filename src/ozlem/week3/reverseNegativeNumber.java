package ozlem.week3;

public class reverseNegativeNumber {

    public static void main(String[] args) {
        System.out.println(reverseInt(-35));
       // System.out.println(reverseInt(872387643));
    }

    public static int reverseInt(int n) { // 1

        int rev = 0; // 4321

        while (n < 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev;
    }
}

//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53