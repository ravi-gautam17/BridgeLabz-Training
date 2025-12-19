import java.util.Scanner;

public class MultiplesBelowHundred {

    public static void main(String[] args) {
        //create the scanner object
        Scanner input = new Scanner(System.in);
        
		//read the number as input
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
        
		//check if number is between 0 and 100
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
        } else {

            System.out.println("Multiples of " + number + " below 100:");

            // Loop from 100 to 1
            for (int i = 100; i >= 1; i--) {

                // Check if i is a multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        //close the Scanner
        input.close();
    }
}
