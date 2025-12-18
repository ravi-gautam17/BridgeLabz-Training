import java.util.Scanner;

// Find factors using while loop

public class FactorsUsingWhile {

    public static void main(String[] args) {
        // create the scanner object
        Scanner input = new Scanner(System.in);
        
		//read the number using scanner object
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        //check if number is natural number
        if (number <= 0) {
            System.out.println("Invalid input");
        } else {
            //logic to find all the factors
            int counter = 1;

            System.out.println("Factors of " + number + " are:");

            while (counter < number) {

                if (number % counter == 0) {
				    //print all the factors
                    System.out.println(counter);
                }

                counter++;
            }
        }

        input.close();
    }
}
