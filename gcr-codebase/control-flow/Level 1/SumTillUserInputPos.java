import java.util.Scanner;
 
public class SumTillUserInputPos{
   public static void main(String[] args){
     // create the scanner object
      Scanner input=new Scanner(System.in);
	 
	 // initialize the sum with 0
	  int sum=0;
	  
	    
	// check if user entered 0 using while loop
	  while(true){
	     System.out.println("Enter the number: ");
	     int inputVal=input.nextInt();
		 
		 if(inputVal<=0){
		   break;
		 }
		 else{
		   sum+=inputVal;
		 }
	  }
	  //print the total
	  System.out.println(sum);
	 
	 //close the scanner
	 input.close();
	} 
}