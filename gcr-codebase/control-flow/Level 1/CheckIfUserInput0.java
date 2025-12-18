import java.util.Scanner;
 
public class CheckIfUserInput0{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	  double total=0.0;
	 // take the variable as input
	  double inputVal=input.nextDouble();
	    
	// check if user entered 0 using while loop
	  while(inputVal!=0){
	      total+=inputVal;
		  inputVal=input.nextDouble();
	  }
	  //print the total
	  System.out.println(total);
	 
	 //close the scanner
	 input.close();
	} 
}