/*
* Digital Watch Simulation ⏱️
* Simulate a 24-hour watch:
* Print hours and minutes in a nested for-loop.
* Use a break to stop at 13:00 manually (simulate power cut).
*/
import java.util.Scanner;
public class DigitalWatchSimulation{
    public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  int hour=24;
	  int minutes=60;
	  
	  for(int i=0;i<hour;i++){
	    
	    for(int j=0;j<minutes;j++){
		 if(i==13&&j==0){
		   System.out.println("Power cut");
		   return;
		 }
		   if(i<10&& j<10){
		     System.out.println(0+""+i+":"+0+""+j);
		   }
		   else if(i<10){
		     System.out.println(0+""+i+":"+j);
		   }
		   else if(j<10){
		     System.out.println(i+":"+0+""+j);
		   }
		   else {
		     System.out.println(i+":"+j);
		   }
		}
		try{
		  Thread.sleep(30);
		}
		catch(Exception e){
		
		}
	  }
	  
	}
}