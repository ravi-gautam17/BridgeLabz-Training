import java.util.Scanner;
// Check Harshad Number
public class HarshadNumber {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the number as input
		 int number=input.nextInt();
		 
		  //calculate sum of digits
		  int sum=0;
		  int tempNum=number;
		  while(tempNum>0){
		    int dig=tempNum%10;
			sum+=dig;
			tempNum/=10;
		  }
		  // display if number is Harshad Number
		  if(number%sum==0){
		      System.out.println("Harshad Number"); 
		  }
		  else{
		       System.out.println("Not a Harshad Number"); 
		  }
		  
        //close the scanner
        input.close();
    }
}