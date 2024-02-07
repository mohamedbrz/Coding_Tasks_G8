package ozlem.week2;

public class printConsecutiveNumbers {
    public static void main(String[] args) {

        int N = 100;
        int count = 0;
        String by3 = "Test";
        String by2 = "Codility";
        String by5 = "Coders";

        for (int i = 1; i <= N; i++) {
            count++;
            System.out.print(count + "-");
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(by2+by3+by5);
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(by2 + by3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(by2 + by5);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(by3 + by5);
            } else if (i % 2 == 0) {
                System.out.println(by2);
            } else if (i % 3 == 0) {
                System.out.println(by3);
            } else if (i % 5 == 0) {
                System.out.println(by5);

            } else {
                System.out.println(i);

            }

        }
    }


}



//
//            System.exit(1);
//        if (N%2==0 || N%3==0 || N%5==0){
//            System.out.println("Codility");
//        } else if ((N%2==0 && N%3==0) || (N%2==0 && N%5==0) ||(N%3==0 && N%2==0) || (N%3==0 && N%5==0) ) {
//            System.out.println("CodilityTestCoders");
//
//

/*  Write a function: that, given a positive integer N, prints the consecutive numbers from 1 to N,
      each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
      Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5,
      it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
      For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible
      by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N = 24:
        1             1
        Codility      2     2
        Test          3     3
        Codility      4     2
        Coders        5     5
        CodilityTest  6     2-3
        7             7
        Codility      8     2
        Test          9     3
        Codi1ityCoders 10  2-5
        11             11
        CodilityTest   12  2-3
        13             13
        Codility       14  2
        TestCoders     15 3-5
        Codility       16 2
        17             17
*/


