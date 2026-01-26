package ExceptionHandling;

import java.util.*;

public class MethodPropagation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
			int ans = method2(a,b);
			
			System.out.println(a + " / " + b + " = " + ans);
			
		}catch(ArithmeticException e) {
			System.out.println("Handled exception in main");
		}
	}
	public static int method1(int a,int b){
		return a/b;
		
	}
	public static int method2(int a,int b) {
		
		return method1(a,b);
	}
}
