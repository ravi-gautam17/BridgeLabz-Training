import java.util.Arrays;
import java.util.Scanner;

public class FactorAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int num = sc.nextInt();

        System.out.println("\nAnalyzing Factors for: " + num);
        System.out.println("--------------------------------");

        // 1. Get Factors Array
        int[] factors = getFactorsArray(num);
        System.out.println("Factors Array: " + Arrays.toString(factors));

        // 2. Greatest Factor
        int greatest = findGreatestFactor(factors);
        System.out.println("Greatest Factor (excluding self): " + greatest);

        // 3. Sum of Factors
        int sum = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sum);

        // 4. Product of Factors
        long product = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + product);

        // 5. Product of Cubes of Factors
        double cubeProduct = findProductOfCubes(factors);
        System.out.println("Product of the Cube of Factors: " + cubeProduct);

        sc.close();
    }

    // Method to find factors and return them as an array
    public static int[] getFactorsArray(int num) {
        // First loop: Count the factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Create the array based on the count
        int[] factors = new int[count];

        // Second loop: Store the factors
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the greatest factor (usually the number itself, or num/2 if excluding self)
    public static int findGreatestFactor(int[] factors) {
        // Since factors are added in increasing order, the last one is the greatest
        if (factors.length == 0) return 0;
        
        // If the task implies the greatest factor OTHER than the number itself:
        if (factors.length > 1) {
            return factors[factors.length - 2];
        }
        return factors[0];
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static double findProductOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
}