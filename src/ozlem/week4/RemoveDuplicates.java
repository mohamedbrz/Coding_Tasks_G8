package ozlem.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static void main(String[] args) {


    String str = "AABBCCDDFF";
    String result ="";

        for(int i=0; i<str.length();i++){
        char ch = str.charAt(i);
        if(!result.contains(ch+"")){
            result += ch;
        }
    }
        System.out.println(result);


}
}