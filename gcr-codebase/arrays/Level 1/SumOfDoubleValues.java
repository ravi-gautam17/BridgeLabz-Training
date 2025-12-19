import java.util.Scanner;


public class SumOfDoubleValues{
   public static void main(String[] args){
      // create the scanner object
      Scanner input=new Scanner(System.in);
	 
	  //create the array 
	  double[] arr=new double[10];
      int index=0;
	  
	  // write the logic inside while loop
	  while(true){
	     
	     int inpVal=input.nextInt();
		 if(inpVal<=0 || index==10) {
		   break;
		 }
		 arr[index]=inpVal;
		 index++;
	  }
	  
	  // calculate the total
	  double total=0.0;
	  for(int i=0;i<10;i++){
	    total+=arr[i];
	  }
	  
	  // show the sum of values 
	  System.out.println("Total value "+total);
	 
	  //close the scanner
	  input.close();
	  
    }
}