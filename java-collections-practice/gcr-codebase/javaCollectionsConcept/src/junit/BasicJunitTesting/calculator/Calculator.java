package junit.BasicJunitTesting.calculator;


public class Calculator {
	public int addition(int a, int b) {
		return a+b;
	}
	public int subtraction(int a, int b) {
		return a-b;
	}
	public int multiple(int a, int b) {
		return a*b;
	}
	
	public int division(int a, int b) throws ArithmeticException{
		return a/b;
	}
}
