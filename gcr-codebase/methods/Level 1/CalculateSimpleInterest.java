import java.util.Scanner;

// calculate simple interest
public class CalculateSimpleInterest{
   public static void main(String[] args){
      // create the scanner object
      Scanner input=new Scanner(System.in);
	 
	  System.out.println("Enter the principal, rate and time respectively: ");
	  int principal=input.nextInt();
	  double rate=input.nextDouble();
	  double time=input.nextDouble();
	  
	  // create a method to calculate simple interest
	  double simpleInterest=calculateSI(principal,rate,time);
	  
	  // print the output
	  System.out.println("The simple interest is "+simpleInterest+" for principal "+principal+" , Rate of Interest "+rate+" and Time "+time+" years");
	   
	  //close the scanner
	     input.close();
    }
	// write the method body
	public static double calculateSI(int principal,double rate, double time){
	     // calculate simple interest using formula
    	 double simpleInterest=(principal*rate*time)/100;
		 // return simple interest
	     return simpleInterest;
	}
}