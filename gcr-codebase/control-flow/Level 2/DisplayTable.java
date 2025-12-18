import java.util.Scanner;
 
public class DisplayTable{
   public static void main(String[] args){
      // create the scanner object
        Scanner input=new Scanner(System.in);
	 
	   System.out.println("Enter the number between 6 and 9");
	   // take the input between 6 and 9
	   
	   int num=input.nextInt();
	   if(num>=6 && num<=9){
		   for(int i=1;i<=10;i++){
			   System.out.println(num +" * "+i+" = " +num*i);
		   }
	   }
	   else{
		   System.out.println("Enter within the valid range");
	   }
	  
	   //close the scanner
	   input.close();
	} 
}