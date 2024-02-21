package aaron.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static void main(String[] args) {


        String str = "aaabbbccddff";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); //a a a b b
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (result.contains(ch + "")) {
                continue;
            }
            result += ch + "" + count;

        }

        System.out.println(result);


    }
}

