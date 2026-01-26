package ExceptionHandling;
import java.util.*;

public class ArrayOperations {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		int[] arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		
		System.out.print("Enter the index value you want: ");
		int idx = sc.nextInt();
		
		try {
			if(arr==null) {
				throw new NullPointerException();
			}
			else
				System.out.println(arr[idx]);
		}catch(NullPointerException e) {
			System.out.println("Array cannot be null");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
