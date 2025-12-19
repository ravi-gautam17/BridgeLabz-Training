import java.util.Scanner;

public class PowerUsingWhileLoop {
    public static void main(String[] args) {
        // create the scanner object
        Scanner input=new Scanner(System.in);
        // take the number and power as input
        int number=input.nextInt();
        int power=input.nextInt();
        //initialize the result
        double result=1;

        //logic to calculate the result
        int counter=0;
        while(counter!=power){
            result*=number;
            counter++;
        }

        //print the result
        System.out.println("The result of power is "+result);
        //close the scanner
        input.close();
    }
}
