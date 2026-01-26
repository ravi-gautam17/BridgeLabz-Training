package ExceptionHandling;

import java.util.*;

public class IntegerOperation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter numerator: ");
			int a = sc.nextInt();
			
			System.out.print("Enter denominator: ");
			int b= sc.nextInt();
			
			int c= a/b;
			System.out.println(a+"/"+b+" = "+c);
			
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input, enter integer value");
		}
		finally {
			System.out.println("Operation completed");
		}
	}
}
