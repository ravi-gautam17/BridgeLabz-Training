import java.util.Scanner;

public class ChildrenChocolateStatus{

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read number of chocolates
        System.out.print("Enter number of chocolates: ");
        int n = scanner.nextInt();

        // Read number of children
        System.out.print("Enter number of children: ");
        int m = scanner.nextInt();
       
	   // create a method and return it's value in childChoco method
	    int[] childChoco=findChildrenStatus(n,m);
		
		// find children number of chocolates student will get and remaining child without chocolates
		int eachChildChoco=childChoco[0];
		int remainingChoco=childChoco[1];

        // Display the result in required format
        System.out.println(
            "The number of chocolates student will get is " + eachChildChoco +
            " and remaining number of remaining chocolates is " + remainingChoco
        );

        // Close the scanner
        scanner.close();
    }
	// method to find the number of chocolates each child gets and number of remaining chocolates

	public static int[] findChildrenStatus(int n, int m) {
      // create an array childChoco to get children status    
	  int[] childChoco=new int[2];
	   
	   // find the number of chocolates each child gets
        childChoco[0] = n / m;

        // find number of remaining chocolates
         childChoco[1] = n % m;
	 
	 return childChoco;

   }
}