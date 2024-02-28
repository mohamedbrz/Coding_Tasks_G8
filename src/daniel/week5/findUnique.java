package daniel.week5;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {
        System.out.println("uniqueChars(\"AAABBBCCCDEF\") = " + uniqueChars("AAABBBCCCDEF"));
    }


    public static String uniqueChars(String str){
        String result = "";
        String [] split = str.split("");

        for (String each : split) {
            int count = 0;
            for (String each2 : split) {
                if (each2.equals(each)){
                    count++;
                }

                }
            if (count == 1){
                result += each;
            }
        }

        return result;
    }


}