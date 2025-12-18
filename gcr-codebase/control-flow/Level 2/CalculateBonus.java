import java.util.Scanner;
 
public class CalculateBonus{
   public static void main(String[] args){
      // create the scanner object
        Scanner input=new Scanner(System.in);
	 
	  // take the number as input 
	   double salary=input.nextDouble();
	   int yearOfService=input.nextInt();
	   
	   // calculate bonus if year of service is more than 5
	   if(yearOfService<5){
		    System.out.println("No bonus");
	   }
	   else{
		   double bonus=salary/20;
		   System.out.println("Bonus amount "+bonus);
	   }
	  
	   //close the scanner
	   input.close();
	} 
}