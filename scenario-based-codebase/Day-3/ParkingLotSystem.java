import java.util.Scanner;
public class ParkingLotSystem{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the maximum occupancy size : ");
	 int limit=sc.nextInt();
	 int size=limit;
	 
	 boolean user=true;
	 while(user){
	    if(size==0){
		   break;		 
		}
	     System.out.println("Enter your choice : Park, Exit or Occupancy");
	    switch(sc.next()){
		   case "Park":
		      size--;
			  System.out.println("Successfully parked");
			  break;
		   case "Exit":
		      user=false;
		      System.out.println("Successfully exited");
			  break;
		   case "Occupancy":
      			System.out.println("Occupancy size is :"+(limit-size));
				break;
			default :
                System.out.println("Invalid choice");			
			  
		}		 
	 }   
   }
}