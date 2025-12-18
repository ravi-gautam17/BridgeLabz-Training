import java.util.Scanner;
// check if number is divisible by 5
public class DivisibilityCheck{
    public static void main(String[] args){
	   // create the scanner object to take input
	   Scanner input =new Scanner(System.in);
	   
	   //read the number 
	   int number=input.nextInt();
	   
	   //logic for checking divisibility
	   boolean isDivisible=false;
	   if(number%5==0){
		   isDivisible=true;
	   }
	   
	   //Print the output
	   System.out.println("Is the number "+number+" divisible by 5? "+isDivisible);

	   //close the scanner
	   input.close();
	   
	}
}