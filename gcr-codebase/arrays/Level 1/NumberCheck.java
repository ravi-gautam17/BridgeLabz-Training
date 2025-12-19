import java.util.Scanner;

// check the number
public class NumberCheck{
   public static void main(String[] args){
      // create the scanner object
      Scanner input=new Scanner(System.in);
	  int[] arr=new int[5];
	  
	  // take the inputs from the user
	  for(int i=0;i<arr.length;i++){
	    System.out.println("Enter the numbers: ");
	    arr[i]=input.nextInt();
	  }
	  
	  //check if the number is positive, negative or zero. If positive, check for even & odd
	  for(int i=0;i<arr.length;i++){
	     if(arr[i]>0){
		    if(arr[i]%2==0){
			   System.out.println(arr[i]+" is positive and even");
			}
			else{
               System.out.println(arr[i]+" is positive and odd");			
			}
		 }
		 else if(arr[i]==0){
		    System.out.println(arr[i]+" is zero");
		 }
		 else{
		   System.out.println(arr[i]+" is negative");
		 }
	  }
	  // compare first and last value
	  if(arr[0]>arr[4]){
	     System.out.println("First is larger");
	  }
	    else{
		 System.out.println("Last number is larger");
		}
		
		//close the scanner
	  input.close();
	  
    }
}