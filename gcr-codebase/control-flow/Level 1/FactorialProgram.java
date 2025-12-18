import java.util.Scanner;
 
public class FactorialProgram{
   public static void main(String[] args){
     // create the scanner object
       Scanner input=new Scanner(System.in);
	 
	 // take the number as input 
	   int number=input.nextInt();
	   
	  //calculate the factorial
	   int factorial=1;
	   int i=1;
	   while(i<=number){
	      factorial*=i;
		  i++;
	   }
	   
	   //print the factorial as output
	   System.out.println("Factorial of "+number+" is " +factorial);
	 
	 //close the scanner
	 input.close();
	} 
}