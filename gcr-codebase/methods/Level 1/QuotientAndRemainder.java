import java.util.Scanner;

public class QuotientAndRemainder{

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read number
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        // Read divisor
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
       
	   // create a method and return it's value in quotientRemainder method
	    int[] quotientRemainder=findRemainderAndQuotient(number,divisor);
		
		// find quotient and remainder
		int quotient=quotientRemainder[0];
		int remainder=quotientRemainder[1];

        // Display the result in required format
        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + number + " and " + divisor
        );

        // Close the scanner
        scanner.close();
    }
	// method to find the reminder and the quotient of a number 
	public static int[] findRemainderAndQuotient(int number, int divisor) {
      // create an array quotientRemainder      
	  int[] quotientRemainder=new int[2];
	   
	   // Calculate quotient using division operator
        quotientRemainder[0] = number / divisor;

        // Calculate remainder using modulus operator
         quotientRemainder[1] = number % divisor;
	 
	 return quotientRemainder;

   }
}
