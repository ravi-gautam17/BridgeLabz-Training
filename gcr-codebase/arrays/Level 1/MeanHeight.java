import java.util.Scanner;

// calculate the mean height of players
public class MeanHeight{
   public static void main(String[] args){
      // create the scanner object
      Scanner input=new Scanner(System.in);
	  
	  // declare an array of 11 size indicating height
	  
	  double[] height=new double[11];
	  
	  //take all the heights as input
	  for(int i=0;i<11;i++){
	     height[i]=input.nextInt();
	  }
	  // calculate the sum of height
	  double sum=0.0;
	  for(int i=0;i<11;i++){
	     sum+=height[i];
	  }
	  
	  //calculate the mean height and print
	  double meanHeight=sum/11;
	  System.out.println("Mean height of football team is "+meanHeight);
	  
	  //close the scanner
	     input.close();
    }
}