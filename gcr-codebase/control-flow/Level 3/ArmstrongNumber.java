import java.util.Scanner;
// Check for armstrong number
public class ArmstrongNumber {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the number as input
		 int number=input.nextInt();
		 
		  //calculate sum of cube of digits
		  int sumOfDigitCubes=0;
		  int tempNum=number;
		  while(tempNum>0){
		    int dig=tempNum%10;
			sumOfDigitCubes+=dig*dig*dig;
			tempNum/=10;
			
		  }
		  // checking the armstrong number and displaying the result
		  if(number==sumOfDigitCubes){
		     System.out.println(number+" is an armstrong number");
		  }
		  else{
		     System.out.println(number+" is not an armstrong number");
		  }
		  
        
        //close the scanner
        input.close();
    }
}