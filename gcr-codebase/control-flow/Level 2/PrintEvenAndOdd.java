import java.util.Scanner;
 
public class PrintEvenAndOdd{
   public static void main(String[] args){
      // create the scanner object
        Scanner input=new Scanner(System.in);
	 
	  // take the number as input 
	   int num=input.nextInt();
	   
	   //check for natural number 
	    if(num<=0){
			System.out.println("Not a natural number");
		}
	   else{	
	       System.out.println("Odd number");
	       for(int i=1;i<=num;i=i+2){
		      if(i%2==1){
			     System.out.println(i);
		      }
		   }
		   System.out.println("Even Number");
	      for(int i=2;i<=num;i=i+2){
		      if(i%2==0){
			     System.out.println(i);
		      }
		   }
		   
	   }
	   //close the scanner
	   input.close();
	} 
}