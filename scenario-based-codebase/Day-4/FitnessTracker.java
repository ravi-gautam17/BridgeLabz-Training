/*
* Movie Ticket Booking App 🎬
* Ask users for movie type, seat type (gold/silver), and snacks.
* Use switch and if together.
* Loop through multiple customers.
* Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieTicketBookingApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	     String name="";
		 String movieName="";
		 String snacks="";
		 int totalCost=0;
		 int movieIndex=0;
		 String[] movies={"Avatar", "Dhurandhar", "Animal"};
		 String[] seats={"Gold", "Silver"};
		 int[] goldSeats={100,100,100};
		 int[] silverSeats={200,200,200};
		 
		 int goldPrice=500;
		 
		 int silverPrice=300;
		 String[] snacks={"samosa","popcorn","kurkure"};
		 int[] snacksPrice={50,60,40};
		 System.out.println("Welcome to the DB Mall ");
		 while(true){
			 System.out.println("Which movie are you looking for ? ");
			 System.out.print("Your options are : \n\t");
			 for(int i=0;i<movies.length;i++){
				 System.out.print((i+1)+":"+movies[i]+"\t");
				 
			 }
			 System.out.println("Enter the choice :");
			 int movieIndex=sc.nextInt()-1;
			 String choiceMovie=movies[movieIndex];
			 
			 switch(choiceMovie){
				 case "Avatar" ->{
					 System.out.println("Which seat would you prefer ?");
					 System.out.print("Your options are : \n\t");
					 for(int j=0;j<seats.length;j++){
						  System.out.println((j+1)+": "+seats[j]+"\t");
					 }
					 System.out.println("Enter the choice :");
					 int seatChoiceIndex=sc.nextInt()-1;
					 String seatChoice=seats[seatChoiceIndex];
					 switch(seatChoice){
						 case "Silver" ->{
							 System.out.println("Available seats : "+silverSeats[movieIndex]);
							 System.out.println("How many seats you want to book ? ");
							 int noOfSeats=sc.nextInt();
							 silverSeats[movieIndex]-=noOfSeats;
							 System.out.println("Remaining seats :"+silverSeats[movieIndex]);
							 totalCost=silverPrice*noOfSeats;
							 System.out.println("Do you want snacks: (yes/no): ");
							 String yesNo=sc.next();
							 if("yes".equals(yesNo)){
								  System.out.println("Which snack would you prefer :");
								  System.out.print("Your options are: \n\t");
								  for(int k=0;k<snacks.length;k++){
									  System.out.println((k+1)+": "+snacks[k]+"\t");
								  }
								  int snackChoice=sc.nextInt()-1;
								  totalCost+=snacksPrice[snackChoice];
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }else {
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }
						 }
						 case "Gold" ->{
							 System.out.println("Available seats : "+goldSeats[movieIndex]);
							 System.out.println("How many seats you want to book ? ");
							 int noOfSeats=sc.nextInt();
							 goldSeats[movieIndex]-=noOfSeats;
							 System.out.println("Remaining seats :"+goldSeats[movieIndex]);
							 totalCost=goldPrice*noOfSeats;
							 System.out.println("Do you want snacks: (yes/no): ");
							 String yesNo=sc.next();
							 if("yes".equals(yesNo)){
								  System.out.println("Which snack would you prefer :");
								  System.out.print("Your options are: \n\t");
								  for(int k=0;k<snacks.length;k++){
									  System.out.println((k+1)+": "+snacks[k]+"\t");
								  }
								  int snackChoice=sc.nextInt()-1;
								  totalCost+=snacksPrice[snackChoice];
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }else {
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }
						 }
					 }
					 
				 }
				 case "Dhurandhar" ->{
					 System.out.println("Which seat would you prefer ?");
					 System.out.print("Your options are : \n\t");
					 for(int j=0;j<seats.length;j++){
						  System.out.println((j+1)+": "+seats[j]+"\t");
					 }
					 System.out.println("Enter the choice :");
					 int seatChoiceIndex=sc.nextInt()-1;
					 String seatChoice=seats[seatChoiceIndex];
					 switch(seatChoice){
						 case "Silver" ->{
							 System.out.println("Available seats : "+silverSeats[movieIndex]);
							 System.out.println("How many seats you want to book ? ");
							 int noOfSeats=sc.nextInt();
							 silverSeats[movieIndex]-=noOfSeats;
							 System.out.println("Remaining seats :"+silverSeats[movieIndex]);
							 totalCost=silverPrice*noOfSeats;
							 System.out.println("Do you want snacks: (yes/no): ");
							 String yesNo=sc.next();
							 if("yes".equals(yesNo)){
								  System.out.println("Which snack would you prefer :");
								  System.out.print("Your options are: \n\t");
								  for(int k=0;k<snacks.length;k++){
									  System.out.println((k+1)+": "+snacks[k]+"\t");
								  }
								  int snackChoice=sc.nextInt()-1;
								  totalCost+=snacksPrice[snackChoice];
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }else {
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }
						 }
						 case "Gold" ->{
							 System.out.println("Available seats : "+goldSeats[movieIndex]);
							 System.out.println("How many seats you want to book ? ");
							 int noOfSeats=sc.nextInt();
							 goldSeats[movieIndex]-=noOfSeats;
							 System.out.println("Remaining seats :"+goldSeats[movieIndex]);
							 totalCost=goldPrice*noOfSeats;
							 System.out.println("Do you want snacks: (yes/no): ");
							 String yesNo=sc.next();
							 if("yes".equals(yesNo)){
								  System.out.println("Which snack would you prefer :");
								  System.out.print("Your options are: \n\t");
								  for(int k=0;k<snacks.length;k++){
									  System.out.println((k+1)+": "+snacks[k]+"\t");
								  }
								  int snackChoice=sc.nextInt()-1;
								  totalCost+=snacksPrice[snackChoice];
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }else {
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }
						 }
					 }
					 
				 }
				 case "Animal" ->{
					 System.out.println("Which seat would you prefer ?");
					 System.out.print("Your options are : \n\t");
					 for(int j=0;j<seats.length;j++){
						  System.out.println((j+1)+": "+seats[j]+"\t");
					 }
					 System.out.println("Enter the choice :");
					 int seatChoiceIndex=sc.nextInt()-1;
					 String seatChoice=seats[seatChoiceIndex];
					 switch(seatChoice){
						 case "Silver" ->{
							 System.out.println("Available seats : "+silverSeats[movieIndex]);
							 System.out.println("How many seats you want to book ? ");
							 int noOfSeats=sc.nextInt();
							 silverSeats[movieIndex]-=noOfSeats;
							 System.out.println("Remaining seats :"+silverSeats[movieIndex]);
							 totalCost=silverPrice*noOfSeats;
							 System.out.println("Do you want snacks: (yes/no): ");
							 String yesNo=sc.next();
							 if("yes".equals(yesNo)){
								  System.out.println("Which snack would you prefer :");
								  System.out.print("Your options are: \n\t");
								  for(int k=0;k<snacks.length;k++){
									  System.out.println((k+1)+": "+snacks[k]+"\t");
								  }
								  int snackChoice=sc.nextInt()-1;
								  totalCost+=snacksPrice[snackChoice];
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }else {
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }
						 }
						 case "Gold" ->{
							 System.out.println("Available seats : "+goldSeats[movieIndex]);
							 System.out.println("How many seats you want to book ? ");
							 int noOfSeats=sc.nextInt();
							 goldSeats[movieIndex]-=noOfSeats;
							 System.out.println("Remaining seats :"+goldSeats[movieIndex]);
							 totalCost=goldPrice*noOfSeats;
							 System.out.println("Do you want snacks: (yes/no): ");
							 String yesNo=sc.next();
							 if("yes".equals(yesNo)){
								  System.out.println("Which snack would you prefer :");
								  System.out.print("Your options are: \n\t");
								  for(int k=0;k<snacks.length;k++){
									  System.out.println((k+1)+": "+snacks[k]+"\t");
								  }
								  int snackChoice=sc.nextInt()-1;
								  totalCost+=snacksPrice[snackChoice];
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }else {
								  System.out.println("Total cost : "+totalCost);
								  System.out.println("Do you want to continue ? ");
								  String moreChoice=sc.next();
								  if(moreChoice.equals("yes") continue;
								  else{
									  System.out.println("Thankyou for booking . Happy time :)");
									  return;
								  }
							 }
						 }
					 }
				 }
				 default -> System.out.println("Invalid choice. Try again");
				 
			 }
			 			 
		 }
      	  
		
	}
}

