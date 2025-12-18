import java.util.Scanner;

public class CheckVotingEligibility{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //take the age as input
	 int age=input.nextInt();
	
	// print the output
	 if(age>=18){
	    
		 System.out.println("The person's age is "+age +" and can vote");
	 }
	 else{
	     System.out.println("The person's age is "+age +" and cannot vote");
	 }
	 
	}
	 
}
