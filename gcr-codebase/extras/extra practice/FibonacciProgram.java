import java.util.Scanner;
// Write a fibonacci
public class FibonacciProgram{
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the number as input
		 int number=input.nextInt();
		 
		 // calculate the fibonacci and display
		 calculateFib(number);
        
        //close the scanner
        input.close();
      }
	public static void calculateFib(int number){
	   // calculate and display fibonacci sequence
	   int a=0;
	   int b=1;
	   System.out.println(a);
	   System.out.println(b);
	   int i=0;
	   while(i<number){
	     int c=a+b;
		 a=b;
		 b=c;
		 System.out.println(c);
		 i++;
	   }
				 
	}
}