package Cemil.week6;

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

        String validPassword = "Wb123,";
        System.out.println("isPasswordValid(validPassword) = " + isPasswordValid(validPassword));

        String invalid1 = "ab123,";
        String invalid2 = "AS123,";
        String invalid3 = "AAss,!";
        String invalid4 = "AAWw12";
        String invalid5 = "A s12,";
        String invalid6 = "A 12,";


        System.out.println("isPasswordValid(invalid1) = " + isPasswordValid(invalid1));
        System.out.println("isPasswordValid(invalid2) = " + isPasswordValid(invalid2));
        System.out.println("isPasswordValid(invalid3) = " + isPasswordValid(invalid3));
        System.out.println("isPasswordValid(invalid4) = " + isPasswordValid(invalid4));
        System.out.println("isPasswordValid(invalid5) = " + isPasswordValid(invalid5));
        System.out.println("isPasswordValid(invalid6) = " + isPasswordValid(invalid6));

    }


    public static boolean isPasswordValid(String password) {
        // Check if password length is at least 6 characters and does not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;

    }


}
