import java.util.Scanner;
// create a calculator program usign switch case
public class CalculatorProgramUsingSwitch {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the two numbers
		 double first=input.nextDouble();
		 double second=input.nextDouble();
		 
		// read the operators
		 String op=input.next();
		 
		 // switch operation for calculator
		 switch(op){
		   case "+":
		         System.out.println("Addition result: "+(first+second));
				 break;
		   case "-":
		         System.out.println("Subtraction result: "+(first-second));
				 break;
		   case "*":
		         System.out.println("Multiplication result: "+(first*second));
				 break;
		   default:
		         System.out.println("Division result: "+(first/second));
				 break;
				
		 }
		 
        //close the scanner
        input.close();
    }
}