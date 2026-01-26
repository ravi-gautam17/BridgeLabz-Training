package ExceptionHandling;

import java.util.*;

public class ArrayAndDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter size of arr: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			System.out.print("Enter array elements: ");
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.print("Enter the element you want: ");
			int idx = sc.nextInt();
			
			System.out.print("Enter divisor: ");
			int num = sc.nextInt();
			try {
				int ans = arr[idx]/num;
			
				System.out.println("element at idx: "+idx+" divided by: "+num+" is: "+ans);
			}catch(ArithmeticException e) {
				System.out.println("Division by zero");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
		
	}
}
