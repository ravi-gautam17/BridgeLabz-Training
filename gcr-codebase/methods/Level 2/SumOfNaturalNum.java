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
		int formulaSum=(num*(num+1))/2;
		
		System.out.println(recSum);
		System.out.println(formulaSum);
		// Display the results
		if(formulaSum==recSum){
		  System.out.println("Both the results are same and the sum is "+recSum);
		}
		else{
		  System.out.println("The results are different");
		}
       
	   // close the scanner
	   input.close();
    }

    // Method to find sum of n natural numbers recursively
    public static int findSum(int num) {
        if(num==1){
		  return 1;
		}
		return num+findSum(num-1);
    }
}

