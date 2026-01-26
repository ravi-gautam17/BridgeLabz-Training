package junit.AdvancedJunitTesting.passwordvalidator;


public class PasswordValidator {
    public boolean isValid(String password) {
        if (password == null) return false;
        
        String regex = "^(?=.*[0-9])(?=.*[A-Z]).{8,}$";
        
        return password.matches(regex);
    }
}