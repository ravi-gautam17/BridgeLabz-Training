import java.util.Scanner;
 // check the spring season
public class RocketLaunchCountDown{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //take the month(1-12) and day as input
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