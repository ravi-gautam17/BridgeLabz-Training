package junit.test;

import org.junit.jupiter.api.Test;

import junit.BasicJunitTesting.testexception.Division;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestException {
	public Division div;
	
	@BeforeEach
	public void setup() {
		div = new Division();
	}
	
	@Test
	public void testDision1() {
		Assertions.assertEquals(div.division(4, 2), 2);
	}
	
	@Test
	public void testDision2() {
		Assertions.assertThrows(ArithmeticException.class, ()-> div.division(5, 0));
	}
}
