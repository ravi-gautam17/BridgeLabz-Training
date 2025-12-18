import java.util.Scanner;
// check the spring season
public class CheckSpringSeason{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //take the month(1-12) and day as input
	 int month=input.nextInt();
	 int day=input.nextInt();
	
	// check if the month is between march 20 (3,20) to june (6,20)
	 if(month==4||month==5){
         System.out.println("Its a spring season");		 
	 }
	 else if((month==3&&day>=20)|| (month==6&&day<=20)){
         System.out.println("Its a spring season");	 
	 }
	 
	 else{
	   System.out.println("Not a Spring season");
	 }
	 
	 //close the scanner
	 input.close();
	} 
}
