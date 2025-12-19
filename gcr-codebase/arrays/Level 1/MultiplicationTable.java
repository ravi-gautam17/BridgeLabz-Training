import java.util.Scanner;

// print the multiplication table
public class MultiplicationTable{
   public static void main(String[] args){
      // create the scanner object
      Scanner input=new Scanner(System.in);
	 
	  // take the input from the user
	  int num=input.nextInt();
	
	  // create an array of size 10 to store the multiplication table values
	   int[] arr=new int[10];
	  // run a loop from 1 to 10
	  for(int i=0;i<10;i++){
	       arr[i]=num*(i+1);
	  }
	  
	  // show the table as output
	  for(int i=0;i<10;i++){
	     System.out.println(num +" * " +(i+1)+" = "+arr[i]);
	  }
	
		//close the scanner
	  input.close();
	  
    }
}