/*
* Rohan’s Library Reminder App 📚
* Rohan wants a fine calculator:
* Input return date and due date.
* If returned late, calculate fine: ₹5/day.
* Repeat for 5 books using for-loop.
*/
import java.util.Scanner;
public class LibraryReminderApp{
    public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter today's month : ");
	  int currMonth=sc.nextInt();
	  System.out.println("Enter today's day : ");
	  int currDay=sc.nextInt();
	  int currDayNumber=currMonth*30+ currDay;
	  int totalFine=0;
	  sc.nextLine();
	  String[] books=new String[5];
	  System.out.println("Enter the books you brought:");
	  for(int i=0;i<5;i++){
	    books[i]=sc.nextLine();
	  }
	  int oneDayFine=5;
	  for(int i=0;i<5;i++){
	    System.out.println("Enter the due month of book : "+books[i]);
		int dueMonth=sc.nextInt();
		System.out.println("Enter the due day of book : "+books[i]);
	    int dueDay=sc.nextInt();
		int dueDaysNumber=dueMonth*30+dueDay;
		int lateDays=currDayNumber-dueDaysNumber;
		int fine=lateDays*oneDayFine;
		System.out.printf("Fine for book : %s is %d \n",books[i],fine);
		totalFine+=fine;
	  }
	  System.out.println("The total fine is : "+totalFine);
	}
}