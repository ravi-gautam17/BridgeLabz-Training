import java.util.Scanner;

// calculate number of handshakes
public class MaximumHandshakes{
   public static void main(String[] args){
      // create the scanner object
      Scanner input=new Scanner(System.in);
	 
	  System.out.println("Enter the number of students: ");
	  int numberOfStudents=input.nextInt();
	  
	  
	  // create a method to calculate maximum number of handshakes
	  int maxHandshake=calculateMaxHandshake(numberOfStudents);
	  
	  // print the output
	  System.out.println("The number of maximum hanshakes possible is "+maxHandshake);
	   
	  //close the scanner
	     input.close();
    }
	// write the method body
	public static int calculateMaxHandshake(int numberOfStudents){
	     // calculate maximum number of handshakes using formula
    	  int maxHandshake=(numberOfStudents*(numberOfStudents-1))/2;
		 // return maximum number of Handshake
	     return maxHandshake;
	}
}