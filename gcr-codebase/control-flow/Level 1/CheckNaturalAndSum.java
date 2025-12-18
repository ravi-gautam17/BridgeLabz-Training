import java.util.Scanner;

public class CheckNaturalAndSum{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //read the input
	 int number=input.nextInt();
	
	// print the output
	 if(number>0){
	    int sum=(number*(number+1))/2;
		 System.out.println("The sum of "+number+" natural numbers is "+sum);
	 }
	 else{
	     System.out.println("The number "+number+" is not a natural number");
	 }
	 
	}
	 
}
