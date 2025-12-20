import java.util.Scanner;

// check whether number is zero, positive or negative
public class CheckNumber{
   public static void main(String[] args){
      // create the scanner object
      Scanner input=new Scanner(System.in);
	 
	  System.out.println("Enter the number : ");
	  int number=input.nextInt();
	  
	  // create a method to check the number
	  int numberStatus=checkNum(number);
	  
	  // print the output
	  if(numberStatus==-1){
	     System.out.println("Negative");
	  }
	  else if(numberStatus==1){
	     System.out.println("Positive");
	  }
	  else{
	     System.out.println("Zero");
	  }
	   
	  //close the scanner
	     input.close();
    }
	// write the method body
	public static int checkNum(int number){
	    // check the number if it positive,negative or zero and return the status
		if(number>0){
		   return 1;
		}
		else if(number<0){
		   return -1;  
		}
		else{
		   return 0;
		}
    	
	}
}
