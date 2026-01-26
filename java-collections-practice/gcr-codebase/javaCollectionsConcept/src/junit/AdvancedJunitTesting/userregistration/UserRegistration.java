package junit.AdvancedJunitTesting.userregistration;

public class UserRegistration {

    public boolean registerUser(String username, String email, String password) {

        if (username == null || username.trim().length() < 3) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email");
        }

        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Invalid password");
        }

        return true;
    }
}
