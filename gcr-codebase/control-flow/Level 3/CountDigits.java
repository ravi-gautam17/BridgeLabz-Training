import java.util.Scanner;
// Count the number of digits in an integer
public class CountDigits {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the number as input
		 int number=input.nextInt();
		 
		  //calculate count of digits
		  int count=0;
		  int tempNum=number;
		  while(tempNum>0){
		    count++;
			tempNum/=10;
			
		  }
		  // show the count of digits
		   System.out.println("Count of digits of "+number+" is "+count); 
        
        //close the scanner
        input.close();
    }
}