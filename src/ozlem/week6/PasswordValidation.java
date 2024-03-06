package ozlem.week6;

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
        System.out.println(passwordValid("asRt123!"));
    }

    public static boolean passwordValid(String password) {

        if (password.length() <= 6) {
            return false;
        }
        if (password.contains(" ")) {
            return false;
        }
        // Check for at least one uppercase letter
        boolean hasUppercase = false;
        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        // Check for at least one lowercase letter
        boolean hasLowercase = false;
        for (char each : password.toCharArray()) {
            if (Character.isLowerCase(each)) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            return false;
        }

        // Check for at least one special character
        boolean hasSpecialCharacter = false;
        for (char each : password.toCharArray()) {
            if (!Character.isLetterOrDigit(each)) {
                hasSpecialCharacter = true;
                break;
            }
        }
        if (!hasSpecialCharacter) {
            return false;
        }

        // Check for at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        // All requirements met
        return true;
    }
    }



