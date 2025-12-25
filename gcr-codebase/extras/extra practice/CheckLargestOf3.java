import java.util.Scanner;
// Check the largest of 3 numbers
public class CheckLargestOf3{
   public static void main(String[] args){
     // create the scanner object
     
	 
	 int[] arr=take3NumInput();
	 
	 int num=findMaximum(arr[0],arr[1],arr[2]);
	 
	 displayMaximum(num);	 
   }
   public static int[] take3NumInput(){
      Scanner sc=new Scanner(System.in);
      int[] numArr={sc.nextInt(),sc.nextInt(),sc.nextInt()};
	  sc.close();
	  return numArr;
   }
   public static int findMaximum(int number1,int number2,int number3){
     
	 // logic to find the largest number among the 3 numbers
	 if(number1>number2){
	     if(number1>number3){
		   return number1;
		 }
		 else{
		    return number2;
		 }
	 }
	 else{
	     if(number2>number3&& number2>number1){
		    return number2;
		 }
		 else{
		    return number3;
		 }
	 }
   }
   public static void displayMaximum(int num){
      System.out.println(num+" is the maximum number");
   }
   
}