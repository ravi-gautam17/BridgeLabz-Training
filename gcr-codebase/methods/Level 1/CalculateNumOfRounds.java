import java.util.Scanner;

// calculate number of rounds taken by athlete to complete 5km
public class CalculateNumOfRounds{
   public static void main(String[] args){
      // create the scanner object
      Scanner input=new Scanner(System.in);
	 
	  System.out.println("Enter the three sides of triangle : ");
	  int side1=input.nextInt();
	  int side2=input.nextInt();
	  int side3=input.nextInt();
	  
	  // create a method to calculate number of rounds
	  int numOfRounds=calculateNumOfRounds(side1,side2,side3);
	  
	  // print the output
	  System.out.println("The number of rounds are "+numOfRounds);
	   
	  //close the scanner
	     input.close();
    }
	// write the method body
	public static int calculateNumOfRounds(int side1, int side2,int side3){
	     // calculate perimeter of triangle
		 int perimeter=side1+side2+side3;
		 
		 int targetDistance=5*1000;
		 
		 // return the number of Rounds after checking divisibility
		 // if not divisible add 1 to the quotient
		 if(targetDistance%perimeter==0){
		    return targetDistance/perimeter;
		 }else{
		    return (targetDistance/perimeter)+1;
		 }
    	
	}
}
