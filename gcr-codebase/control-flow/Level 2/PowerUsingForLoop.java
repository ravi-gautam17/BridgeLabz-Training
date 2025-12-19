import java.util.Scanner;

public class PowerUsingForLoop {
    public static void main(String[] args) {
        // create the scanner object
        Scanner input=new Scanner(System.in);
        // take the number and power as input
        int number=input.nextInt();
        int power=input.nextInt();
        //initialize the result
        double result=1;
        //logic to calculate power
        for(int i=1;i<=power;i++){
            result*=number;
        }
        //print the result
        System.out.println("The result of power is "+result);
        //close the scanner
        input.close();
    }
}
