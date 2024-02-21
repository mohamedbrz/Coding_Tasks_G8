package daniel.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {
        String g = removeDuplicates("AAABBBCCCCD");
        System.out.println(g);
    }



    public static String removeDuplicates(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(s.charAt(i) + "")){
                result += s.charAt(i) + "";
            }
        }
        return result;
    }
}