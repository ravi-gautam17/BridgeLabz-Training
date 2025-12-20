
import java.util.Scanner;

public class FactorsProgram {

    public static void main(String[] args) {
         // Create the scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Get factors array
        int[] factors = findFactors(num);

        // Display factors
        System.out.println("Factors of " + num + " are:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();

        // Display results
        System.out.println("Sum of factors = " + findSum(factors));
        System.out.println("Product of factors = " + findProduct(factors));
        System.out.println("Sum of squares of factors = " + findSumOfSquares(factors));
        sc.close();
    }

    // Method to find factors and return array
    public static int[] findFactors(int num) {

        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Create array with count
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

      // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
	
	   // calculate the sum of squares
	   public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
     }
}

