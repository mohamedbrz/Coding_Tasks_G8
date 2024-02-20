package mo.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static  String  removeDuplicate(String s) {
        String result="";
        for (int i=0 ;i<s.length();i++) {
            char ch = s.charAt(i);
            if (!result.contains(""+ch)) {
                result+=""+ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("removeDuplicate(\"AAABBBCCC\") = " + removeDuplicate("AAABBBCCCC"));
    }


}