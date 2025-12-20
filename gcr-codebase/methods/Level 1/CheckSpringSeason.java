import java.util.Scanner;
public class CheckSpringSeason{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //take the month(1-12) and day as input
	 int month=input.nextInt();
	 int day=input.nextInt();
	 
	 boolean flag=isSpring(month,day);
	  if(flag){
	     System.out.println("Its a spring season");	
	  }
	  else{
	      System.out.println("Not a Spring season");
	  }
	 
	 //close the scanner
	 input.close();
	} 
	public static boolean isSpring(int month,int day){
	  // check if the month is between march 20 (3,20) to june (6,20)
	  if(month==4||month==5){
	     return true;
        	 
	  }
	  else if((month==3&&day>=20)|| (month==6&&day<=20)){
	     return true;      
	  }
	  else{
	    return false;
	  }	  
	}
}
