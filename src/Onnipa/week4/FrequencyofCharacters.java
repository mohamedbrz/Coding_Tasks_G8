package Onnipa.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static String frequency1 (String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i);


            if(result.contains(ch)){

                continue;
            }

            result +=ch ;

        }

            return result;
    }

    public static void main(String[] args) {
        System.out.println(frequency1("ADEKOEEAAA"));
    }
}