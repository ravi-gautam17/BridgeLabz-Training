package junit.test;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import junit.BasicJunitTesting.perameterizedtest.CheckEven;

import static org.junit.jupiter.api.Assertions.*;

public class TestEvenNumber {
	CheckEven utils = new CheckEven();
	
	@ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void testIsEven(int number) {
        boolean expected = (number % 2 == 0);
        assertEquals(expected, utils.isEven(number), "Failed for number: " + number);
    }
}
