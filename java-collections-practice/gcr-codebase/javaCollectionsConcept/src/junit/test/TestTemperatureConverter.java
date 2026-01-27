package junit.AdvancedJunitTesting.temperatureConverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTemperatureConverter {
    TemperatureConverter converter = new TemperatureConverter();
    
    private static final double DELTA = 0.001;

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), DELTA);
        
        assertEquals(212.0, converter.celsiusToFahrenheit(100), DELTA);
        
        assertEquals(77.0, converter.celsiusToFahrenheit(25), DELTA);
    }

    @Test
    void testFahrenheitToCelsius() {
        
        assertEquals(0.0, converter.fahrenheitToCelsius(32), DELTA);
        
        assertEquals(100.0, converter.fahrenheitToCelsius(212), DELTA);
        
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40), DELTA);
    }
}