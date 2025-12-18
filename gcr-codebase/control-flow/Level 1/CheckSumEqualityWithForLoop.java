import java.util.Scanner;
 
public class CheckSumEqualityWithForLoop{
   public static void main(String[] args){
     // create the scanner object
       Scanner input=new Scanner(System.in);
	 
	 // take the number as input to which you want to compute the sum 
	   int number=input.nextInt();
	  
	  // check if number is natural number 
	    if(number<=0){
		    System.out.println("Not a natural number");
		}
	  else{
	  
	    int manualSum=0;
	    int formulaSum=(number*(number+1))/2;
	  
	    // check if sum manually is equal to the formula
	    for(int i=1;i<=number;i++){
	       manualSum+=i;
	    }
	   
	    if(manualSum==formulaSum){
	       System.out.println("Equal");
	    }
	    else{
	      System.out.println("Not equal");
	    }
	  }
	 
	 //close the scanner
	 input.close();
	} 
}