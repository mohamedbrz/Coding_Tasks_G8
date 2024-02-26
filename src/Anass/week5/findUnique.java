package Anass.week5;

public class findUnique {
     /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

     public static void main(String[] args) {
         String a = "AnassBoucherrour";

         allunique(a);
     }

    private static void allunique(String a) {
        int[] count = new int[256];// taking count of characters
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i < a.length(); i++) {
            char chh = a.charAt(i);

            if (count[chh] == 1) {
                System.out.println("index => " + i + " and unique character => " + a.charAt(i));

            }
        }

    }

}