import java.util.Scanner;
 
public class CalculateSum{
   public static void main(String[] args){
     // create the scanner object
       Scanner input=new Scanner(System.in);
	 
	 // take the number as input to which you want to compute the sum 
	   int number=input.nextInt();
	  
	  // call the method to calculate sum and printing output
	  calculateAndShowSum(number);
	 //close the scanner
	 input.close();
	} 
	public static void calculateAndShowSum(int number){
	   int sum=0;
	   int i=1;
	   while(i<=number){
          sum+=i;	
          i++;		  
	   }
	   System.out.println("The sum is "+sum);
	}
}