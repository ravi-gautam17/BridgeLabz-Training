// Program to guess the number and print feedback
import java.util.Scanner;
import java.util.Random;
public class NumberGuessProgram{
    public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number: ");
	  int userInp=sc.nextInt();
	  
	  int compInp=generateNum();
	  String feedback=getFeedback(userInp,compInp);
	  printFeedback(feedback);
	  sc.close();
	}
	// generate the number
	public static int generateNum(){
	   Random random=new Random();
	   int val=random.nextInt(101);
	   return val;
	}
	// program to get feedback
	public static String getFeedback(int userInp,int compInp){	   
	   if(userInp>compInp){
	      return "Low";
	   }
	   else if(userInp<compInp){
	      return "High";
	   }
	   else{
	      return "Correct";
	   }
	  
	}
	public static void printFeedback(String message){
	   System.out.println(message);
	}
	
}