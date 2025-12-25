import java.util.Scanner;
// Check for prime number
public class PrimeNuberProgram {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the number as input
		 int number=input.nextInt();
		 
		 boolean isPrime=checkPrime(number);
		 if(isPrime){
		    System.out.println("Prime Number");
		 }else{
		    System.out.println("Not a prime number");
		 }
        
        //close the scanner
        input.close();
    }
	public static boolean checkPrime(int number){
	   // checking the prime number logic
		
		 for(int i=2;i<number;i++){
		  if(number%i==0){
		     return false;
			
		  }
		 }
		 return true;
		 
	}
}