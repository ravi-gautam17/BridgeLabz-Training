package functionalinterfaces.passwordlengthvalidator;

public interface SecurityUtils {

    // Static method to validate password strength
    static boolean isStrongPassword(String password) {

        if (password == null) {
            return false;
        }

        // Rule 1: Minimum length
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Check each character
        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        // Final validation
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
}

