package ExceptionHandling;

import java.io.*;
import java.util.*;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter amount: ");
			double p = sc.nextDouble();
			System.out.print("Enter rate: ");
			double r = sc.nextDouble();
			System.out.print("Enter time(int years): ");
			int t = sc.nextInt();
			
			System.out.println(calculateInterest(p,r,t));
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
		
		if(rate<0 || amount<0) {
			throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
		}
		return (amount*rate*years)/100;
	}
}
