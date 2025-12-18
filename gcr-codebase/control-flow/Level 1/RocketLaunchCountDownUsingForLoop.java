import java.util.Scanner;
 // check the spring season
public class RocketLaunchCountDownUsingForLoop{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //take the month(1-12) and day as input
	 int counter=input.nextInt();
	  
	// check if the counter is greater than or equal to 1
	  for(int i=counter;i>0;i--){
	    System.out.println(i);
	  }
	  System.out.println("Rocket Launched");
	 
	 //close the scanner
	 input.close();
	} 
}