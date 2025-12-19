import java.util.Scanner;

public class GreatestFactorWhile {

    public static void main(String[] args) {
         // create the scannner object
        Scanner input = new Scanner(System.in);

        // read the number as input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        //initialize the greatest factor
        int greatestFactor = 1;

        int counter = number - 1;

        while (counter >= 1) {

            if (number % counter == 0) {
                greatestFactor = counter;
                break;
     		}

            counter--;
        }

        //print the greatest factor
        System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        
        //close the scanner 
        input.close();
    }
}
