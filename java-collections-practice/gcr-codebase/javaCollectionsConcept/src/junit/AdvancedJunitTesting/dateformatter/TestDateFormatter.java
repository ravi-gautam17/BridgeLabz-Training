package junit.AdvancedJunitTesting.dateformatter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.time.format.DateTimeParseException;
import static org.junit.jupiter.api.Assertions.*;

public class TestDateFormatter {
    DateFormatter formatter = new DateFormatter();

    @Test
    @DisplayName("Should convert yyyy-MM-dd to dd-MM-yyyy correctly")
    void testValidDateConversion() {
        String input = "2026-12-25";
        String expected = "25-12-2026";
        assertEquals(expected, formatter.formatDate(input));
    }

    @Test
    @DisplayName("Should throw DateTimeParseException for wrong format")
    void testInvalidFormat() {
        assertThrows(DateTimeParseException.class, () -> formatter.formatDate("25-12-2026"));
    }

    @Test
    @DisplayName("Should throw DateTimeParseException for non-existent dates")
    void testNonExistentDate() {
        assertThrows(DateTimeParseException.class, () -> formatter.formatDate("2026-02-30"));
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException for null input")
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(null));
    }
    
    @Test
    @DisplayName("Should accept February 29th on a Leap Year")
    void testLeapYearValid() {
        String result = formatter.formatDate("2024-02-29");
        assertEquals("29-02-2024", result);
    }

    @Test
    @DisplayName("Should throw exception for February 29th on a non-Leap Year")
    void testLeapYearInvalid() {
        assertThrows(DateTimeParseException.class, () -> formatter.formatDate("2026-02-29"));
    }
}