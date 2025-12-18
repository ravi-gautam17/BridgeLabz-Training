import java.util.Scanner;
 
public class FactorialUsingForLoop{
   public static void main(String[] args){
     // create the scanner object
       Scanner input=new Scanner(System.in);
	 
	 // take the number as input 
	   int number=input.nextInt();
	   
	   //check if natural number
	   if(number<=0){
	     System.out.println("Not a natural number");
	   }
	  else{
	     //calculate the factorial
	     int factorial=1;
	     for(int i=1;i<=number;i++){
		   factorial*=i;
		 }
	   
	     //print the factorial as output
	     System.out.println("Factorial of "+number+" is " +factorial);
	   }
	 //close the scanner
	 input.close();
	} 
}