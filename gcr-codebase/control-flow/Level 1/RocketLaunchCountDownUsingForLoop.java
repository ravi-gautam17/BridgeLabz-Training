import java.util.Scanner;
 // print the count till 1 , then print rocket launched message 
public class RocketLaunchCountDownUsingForLoop{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //take the counter as input
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
