package Onnipa.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static String duplicate (String words) {

        String result = "";
        for (int i = 0; i < words.length(); i++) {
            String ch = ""+words.charAt(i);
            if (result.contains(ch)) {
                continue;
            }
            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(duplicate("Akorkoe"));
    }


}