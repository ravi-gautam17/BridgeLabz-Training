package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.BasicJunitTesting.StringUtility.StringUtils;

import org.junit.jupiter.api.AfterAll;

class TestString {
	
	public static StringUtils string;
	
	@BeforeAll
	public static void setup() {
		string = new StringUtils();
	}
	@Test
	public void testRev() {
		Assertions.assertEquals(string.reverse("Nitin"), "nitiN");
	}
	
	@Test
	public void testPalin() {
		Assertions.assertEquals(string.isPalindrome("nitin"), true);
	}
	@Test
	public void testToUpper() {
		Assertions.assertEquals(string.toUpperCase("nitin"), "NITIN");
	}
	@AfterAll
	public static void end() {
		System.out.println("Program completed");
	}
}
