
import java.util.Scanner;

public class SumOfNaturalNum{

    public static void main(String[] args) {
         // Create the scanner object
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // call a method to find the sum of n natural numbers recursively
		int recSum=findSum(num);
		int formulaSum=(n*(n-1))/2;
		
		// Display the results
		if(formulaSum==recSum){
		  System.out.println("Both the results are same and the sum is "+recSum);
		}
		else{
		  System.out.println("The results are different");
		}
       
	   // close the scanner
	   input.nextInt();
    }

    // Method to find sum of n natural numbers recursively
    public static int findSum(int num) {
        if(n==1){
		  return 1;
		}
		return num+findSum(num-1);
    }
}

