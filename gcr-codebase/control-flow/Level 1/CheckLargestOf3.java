import java.util.Scanner;

public class CheckLargestOf3{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //read the input
	 int number1=input.nextInt();
	 int number2=input.nextInt();
	 int number3=input.nextInt();
	 
	 boolean isFirstNumLargest=false;
	 boolean isSecNumLargest=false;
	 boolean isThirdNumLargest=false;
	 
	 // logic to find the largest number among the 3 numbers
	 if(number1>number2){
	     if(number1>number3){
		   isFirstNumLargest=true;
		 }
		 else{
		   isThirdNumLargest=true;
		 }
	 }
	 else{
	     if(number2>number3&& number2>number1){
		    isSecNumLargest=true;
		 }
		 else{
		    isThirdNumLargest=true;
		 }
	 }
	 
	 // Print the output
	 System.out.println("Is the first number the largest? "+isFirstNumLargest);
	 System.out.println("Is the second number the largest? "+isSecNumLargest);
	 System.out.println("Is the third number the largest? "+isThirdNumLargest);
	 
   }
}