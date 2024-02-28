package daniel.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {
        System.out.println("reverseString2(\"ABCD\") = " + reverseString2("ABCD"));

        System.out.println("reverseString(\"AACCCNNKDDD\") = " + reverseString("AACCCNNKDDD"));
    }


    public static StringBuilder reverseString(String str){
        StringBuilder newString = new StringBuilder(str);
        newString.reverse();
        return newString;
    }

    public static String reverseString2(String str){
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

}