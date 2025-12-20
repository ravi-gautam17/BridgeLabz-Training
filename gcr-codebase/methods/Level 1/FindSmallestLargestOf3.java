import java.util.Scanner;

public class FindSmallestLargestOf3{
   public static void main(String[] args){
     // create the scanner object
     Scanner input=new Scanner(System.in);
	 
	 //read the input
	 int number1=input.nextInt();
	 int number2=input.nextInt();
	 int number3=input.nextInt();
	 
	 int[] smallLargeArr=findSmallestAndLargest(number1,number2,number3);
	 int smallest=smallLargeArr[0];
	 int largest=smallLargeArr[1];
	  
	 // Print the output
	 System.out.println("The smallest number is "+smallest);
	 System.out.println("The largest number is "+largest);
	 
   }
   public static int[] findSmallestAndLargest(int number1,int number2,int number3){
       int[] smallLargeArr=new int[2];
	    // logic to find the smallest number among the 3 numbers
	 if(number1<number2){
	     if(number1<number3){
		   smallLargeArr[0]=number1;
		 }
		 else{
		   smallLargeArr[0]=number3;
		 }
	 }
	 else{
	     if(number2<number3){
		    smallLargeArr[0]=number2;
		 }
		 else{
		    smallLargeArr[0]=number3;
		 }
	 }
	 // logic to find the largest number among the 3 numbers
	 if(number1>number2){
	     if(number1>number3){
		   smallLargeArr[1]=number1;
		 }
		 else{
		   smallLargeArr[1]=number3;
		 }
	 }
	 else{
	     if(number2>number3){
		    smallLargeArr[1]=number2;
		 }
		 else{
		    smallLargeArr[1]=number3;
		 }
	 }
	 return smallLargeArr;

   }
}