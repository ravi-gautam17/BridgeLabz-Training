import java.util.Scanner;

public class ConversionOfLength{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int height=sc.nextInt();
      double heightInInches=height/2.54;
      double heightInFoot=heightInInches/12;
      
      System.out.println("Your height in cm is "+height+" while in feet is "+heightInFoot+" and inches is "+heightInInches);
      
   }
}
 
