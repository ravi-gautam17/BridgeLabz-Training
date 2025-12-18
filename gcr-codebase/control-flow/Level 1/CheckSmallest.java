import java.util.Scanner;
// check the smallest of three numbers
public class CheckSmallest{
  public static void main(String[] args){
     // Create a scanner object to read the input
     Scanner input=new Scanner(System.in);
	 
	 // read the input
	 int number1=input.nextInt();
	 int number2=input.nextInt();
	 int number3=input.nextInt();
	 
	 // logic to find the smallest of the three numbers
	 boolean isFirstSmallest=false;
	 if(number1<number2 &&number1<number3){
	    isFirstSmallest=true;
	 }
	 
	 //Print the output
	 System.out.println("Is the first number the smallest? "+isFirstSmallest);
	 
	 input.close();
  }
 } 