package ozlem.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {

        System.out.println(uniqueChar("AAABBBCCCDEF"));
    }
    public static String uniqueChar(String str){

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
    result += ch;
}
        }
        return result;
    }


}