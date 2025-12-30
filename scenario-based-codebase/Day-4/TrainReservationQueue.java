/*
* Train Reservation Queue 🚆
* Simulate a basic ticket booking system.
* Show menu with switch
* Allow multiple bookings using while-loop.
* Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

public class TrainReservationQueue {
    public static void main(String[] args) {      
		Scanner sc=new Scanner(System.in);
		// available tickets
		int available=100;
		boolean shouldExit=false;
		while(!shouldExit && available>0){
		  System.out.println("Choose your option: 1. Book the ticket 2. Show available tickets 3. Exit the application");
		  int choice=sc.nextInt();
		  switch(choice){
		     case 1: 
			     System.out.print("Enter your name: ");
				 String name=sc.next();
				 System.out.println("Enter your age: ");
				 int age=sc.nextInt();
				 System.out.println("Enter date:");
				 String date=sc.next();
				 available--;
				 
				 break;
			 case 2:
                 System.out.println("The available tickets are : "+available);
				 break;
			 case 3:
                 System.out.println("Exit the application.");
				 shouldExit=true;
                 break;				 
			 default:
                 System.out.println("Invalid choice. Try again ");
				 		  
		  }
          		  
		  
		}
		
		
		       
        sc.close();
    }
}