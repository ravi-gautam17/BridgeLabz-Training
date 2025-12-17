import java.util.Scanner;
public class Calculator{
  public static void main(String[] args){
   // Taking input with the help of Scanner class
    Scanner sc=new Scanner(System.in);
    double number1=sc.nextDouble();
    double number2=sc.nextDouble();

    //calculate after performing each operation    
    double sum=number1+number2;
    double sub=number1-number2;
    double mult=number1*number2;
    double divideRes=number1/number2;
    
    
   //Print the calculated results
    System.out.println("The addition, subtraction, multiplication and division value is "+sum+", "+sub+", "+mult+" and "+divideRes);

}
}
    
    
