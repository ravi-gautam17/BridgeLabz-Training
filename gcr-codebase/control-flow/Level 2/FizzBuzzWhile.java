import java.util.Scanner;
// write the fizz buzz program using while loop
public class FizzBuzzWhile {

    public static void main(String[] args) {
         // create the scanner object
        Scanner input = new Scanner(System.in);
        
		//read the input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

         //logic if number is not positive
        if (number <= 0) {
            System.out.println("Invalid input");
        } else {
            //logic using while loop
            int i = 1;

            while (i <= number) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                i++;
            }
        }
         //close the scanner
        input.close();
    }
}
