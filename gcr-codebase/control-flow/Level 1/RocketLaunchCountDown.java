import java.util.Scanner;
 // print the countdown and print the rocket launched message at the end
public class RocketLaunchCountDown{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //read the time as input in counter variable
	 int counter=input.nextInt();
	  
	// check if the counter is greater than or equal to 1
	  while(counter-->1){
	    
		System.out.println(counter);
		
	  }
	  System.out.println("Rocket Launched");
	 
	 //close the scanner
	 input.close();
	} 
}
