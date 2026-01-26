package junit.AdvancedJunitTesting.userregistration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class TestUserRegistration {

    private final UserRegistration registration = new UserRegistration();

    @Test
    @DisplayName("Should register user with valid inputs")
    void testValidUserRegistration() {
        assertTrue(registration.registerUser(
                "Nageshwar",
                "nageshwar@example.com",
                "secret123"
        ));
    }

    @Test
    @DisplayName("Should throw exception for null username")
    void testNullUsername() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser(null, "nageshwar@example.com", "secret123")
        );
    }

    @Test
    @DisplayName("Should throw exception for short username")
    void testShortUsername() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("na", "nageshwar@example.com", "secret123")
        );
    }

    @Test
    @DisplayName("Should throw exception for invalid email")
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("john_doe", "nageshwarexample.com", "secret123")
        );
    }

    @Test
    @DisplayName("Should throw exception for null email")
    void testNullEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("Nageshwar", null, "secret123")
        );
    }

    @Test
    @DisplayName("Should throw exception for short password")
    void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("nageshwar", "nageshwar@example.com", "123")
        );
    }

    @Test
    @DisplayName("Should throw exception for null password")
    void testNullPassword() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("nageshwar", "nageshwar@example.com", null)
        );
    }
}
