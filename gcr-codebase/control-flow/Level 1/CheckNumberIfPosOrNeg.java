import java.util.Scanner;

public class CheckNumberIfPosOrNeg{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //take the number as input
	 int number=input.nextInt();
	
	// check if number is positive, negative or zero
	 if(number>0){
		 System.out.println("Positive");
	 }
	 else if(number==0){
	     System.out.println("Zero");
	 }
	 else{
	   System.out.println("Negative");
	 }
	 //close the scanner
	 input.close();
	} 
}
