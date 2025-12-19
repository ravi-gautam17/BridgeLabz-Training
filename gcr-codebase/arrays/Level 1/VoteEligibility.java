import java.util.Scanner;
// Check for the voting eligibility
public class VoteEligibility{
   public static void main(String[] args){
	   // create the scanner object
      Scanner input=new Scanner(System.in);
	  int[] arr=new int[10];
	  
	   //take the 10 inputs from the user
	  for(int i=0;i<arr.length;i++){
	    System.out.println("Enter the "+(i+1)+"th person's age");
	    arr[i]=input.nextInt();
	  }
	  
	  //logic to print the eligibility of people to vote 
	  for(int i=0;i<arr.length;i++){
	      if(arr[i]>=18){
		     System.out.println("The "+(i+1)+"th person can vote");
		  }
		  else{
		     System.out.println("The "+(i+1)+"th person can't vote");
		  }
	  }
	  
	  //close the scanner
	  input.close();
	  
    }
}