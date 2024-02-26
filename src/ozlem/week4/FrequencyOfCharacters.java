package ozlem.week4;

public class FrequencyOfCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDD"));


        // Output: A3B2C1D2
    }

    public static String frequencyOfChars(String str) {
        String result = frequencyOfChars(str);
        char ch = 'A';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return result;
    }

}
