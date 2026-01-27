package junit.AdvancedJunitTesting.passwordvalidator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class TestPasswordValidator {
    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Secure123"));
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "short1A",        
        "nouppercase123", 
        "NoDigitHere",    
        "       ",        
        ""                
    })
    void testInvalidPasswords(String password) {
        assertFalse(validator.isValid(password), 
            "Password '" + password + "' should be invalid");
    }
}