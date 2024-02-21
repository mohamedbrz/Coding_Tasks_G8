package daniel.week4;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static void main(String[] args) {
        Boolean r = checkSameLetters("abc", "abb");
        System.out.println(r);
    }



    public static Boolean checkSameLetters(String first, String second) {
        String result = "";
        for (int i = 0; i < first.length(); i++) {

            for (int j = 0; j < second.length(); j++) {
                if ((first.charAt(i) == second.charAt(j)) && (!result.contains(second.charAt(j) + ""))){
                    result += second.charAt(j);
                }

            }
        }

        if (result.length() != second.length()){
            return false;
        } else {
            return true;
        }

    }

}





