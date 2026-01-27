package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.BasicJunitTesting.calculator.Calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

class TestCalculator {
	public static Calculator calcu;
	@BeforeAll
	public static void setup() {
		calcu = new Calculator();
	}
	
	@Test
	public void testAddition() {
		Assertions.assertEquals(calcu.addition(2, 3), 5);
	}
	
	@Test
	public void TestSubtraction() {
		Assertions.assertEquals(calcu.subtraction(5, 3),2);
	}
	
	@Test
	public void testMultiplication() {
		Assertions.assertEquals(calcu.multiple(3, 2), 6);
	}
	
	@Test
	public void testDivision1() {
		Assertions.assertEquals(calcu.division(3, 2), 1);
	}
	
	@Test
	public void testDivison2() {
		assertThrows(ArithmeticException.class, () -> {
            calcu.division(3, 0);
        });
	}
	@AfterAll
	public static void end() {
		System.out.println("Program comleted");
	}
}
