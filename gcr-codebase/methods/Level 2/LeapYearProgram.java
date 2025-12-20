import java.util.Scanner;
// Leap year program
public class LeapYearProgram {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the year as input
		 int year=input.nextInt();
		 
		 
         checkLeapYear(year);
   
        //close the scanner
        input.close();
    }
	public static void checkLeapYear(int year){
	   if(year<1582){
			 System.out.println("Invalid input");
		 }
		 else{
			 if(year%400==0){
				 System.out.println("Leap year");
			 }
			 else if(year%4==0&&year%100!=0){
			     System.out.println("Leap year");
			 }
			 else{
			     System.out.println("Not a leap year");	 
		     }
		 }
	}
}