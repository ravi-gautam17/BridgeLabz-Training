import java.util.Scanner;
 
public class CheckSumEquality{
   public static void main(String[] args){
     // create the scanner object
       Scanner input=new Scanner(System.in);
	 
	 // take the number as input to which you want to compute the sum 
	   int number=input.nextInt();
	   int manualSum=0;
	   int formulaSum=(number*(number+1))/2;
	  
	  // check if sum manually is equal to the formula
	   int i=1;
	   while(i<=number){
          manualSum+=i;	
          i++;		  
	   }
	   
	   if(manualSum==formulaSum){
	      System.out.println("Equal");
	   }
	   else{
	      System.out.println("Not equal");
	   }
	  
	 
	 //close the scanner
	 input.close();
	} 
}