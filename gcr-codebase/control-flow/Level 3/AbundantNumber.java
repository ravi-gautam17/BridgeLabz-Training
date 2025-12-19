import java.util.Scanner;
// Check if number is Abundant
public class AbundantNumber {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the number as input
		 int number=input.nextInt();
		 
		  //calculate the sum of factors
		  int sum=0;
		  for(int i=number-1;i>=1;i--){
		     if(number%i==0){
			    sum+=i;
			 }
		  }
		  if(sum>number){		 
		       System.out.println("Abundant Number"); 
		  }
		  else{
		     System.out.println("Not an abundant number");
		   }
		  
        //close the scanner
        input.close();
    }
}