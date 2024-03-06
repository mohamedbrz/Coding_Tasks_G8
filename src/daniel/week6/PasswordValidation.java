package daniel.week6;

public class PasswordValidation {
    /*String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false*/

    public static void main(String[] args) {

        String passwordCorrect = "HoT34!@eat";
        String password2 = "hotd324#@";
        String password3 = "Hp@3";
        String password4 = "HKDNFKN#$34";
        String password5 = "Duok#$%%@";
        String password6 = "FeR3456dfdF";

        System.out.println("passwordValidOrNot(passwordCorrect) = " + passwordValidOrNot(passwordCorrect));
        System.out.println("passwordValidOrNot(password2) = " + passwordValidOrNot(password2));
        System.out.println("passwordValidOrNot(password3) = " + passwordValidOrNot(password3));
        System.out.println("passwordValidOrNot(password4) = " + passwordValidOrNot(password4));
        System.out.println("passwordValidOrNot(password5) = " + passwordValidOrNot(password5));
        System.out.println("passwordValidOrNot(password6) = " + passwordValidOrNot(password6));

    }


    public static boolean passwordValidOrNot(String str) {
        if (str.length() < 6 || str.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if ("!@#$%^&*()-+=<>?/{}[]|".indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }


}
