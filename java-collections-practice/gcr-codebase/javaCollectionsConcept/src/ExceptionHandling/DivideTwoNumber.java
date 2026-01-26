package ExceptionHandling;

import java.util.*;

public class DivideTwoNumber {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter first number: ");
			int a = sc.nextInt();
			
			System.out.print("Enter second number: ");
			int b = sc.nextInt();
			
			int c= a/b;
			System.out.println(a+"/"+b+" = "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}
	}
}
