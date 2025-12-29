import java.util.Scanner;
import java.util.Random;
public class NumberGuessGame{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Input the number : ");
	 Random rd=new Random();
	 int number=rd.nextInt(100)+1;
	 System.out.println(number);
	 int wrongCount=0;
	 
	 do{
        int guessed=sc.nextInt();
		if(guessed==number){
		  System.out.println("You guessed it right");
		  break;
		}
		else if(guessed<number){
		  System.out.println("Two low");
		  wrongCount++;
		}
		else {
		  System.out.println("Two high");
		  wrongCount++;
		}
     }while(wrongCount<5);

	 if(wrongCount==5){
	   System.out.println("Attempt limit exceeded");
	 }
   }
}