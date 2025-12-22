import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker2 {

    public static void main(String[] args) {
        //create the scanner object
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        
        System.out.println("Analyzing Number: " + num);
        System.out.println("--------------------------------");

        // 1. Get digit count and array
        int digCount=getDigitCount(num);
        System.out.println("Digit Count: "+digCount);

        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        // 2. Sum of digits
        int sumDigits = findSumOfDigits(digits);
        System.out.println("Sum of Digits: " + sumDigits);

        // 3. Sum of squares of digits
        double sumSquares = findSumOfSquares(digits);
        System.out.println("Sum of Squares: " + (int)sumSquares);

        // 4. Harshad Number Check
        System.out.println("Is Harshad Number? " + isHarshadNumber(num, digits));

        // 5. Frequency of each digit
        System.out.println("\nDigit Frequency Table:");
        int[][] freqMap = findDigitFrequency(digits);
        displayFrequency(freqMap);
        
        //close the scanner
        sc.close();
    }

    // Method to find the count of digits
    public static int getDigitCount(int num) {
        if (num == 0) return 1;
        return String.valueOf(Math.abs(num)).length();
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int num) {
        int count = getDigitCount(num);
        int[] digits=new int[count];
        int temp=Math.abs(num);

        for(int i=count-1;i>=0;i--){
            digits[i]=temp%10;
            temp/=10;
        }

        return digits;
    }

    // Method to find the sum of the digits
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Method to find the sum of the squares of the digits
    public static double findSumOfSquares(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = findSumOfDigits(digits);
        if (sum == 0) return false; 
        return num % sum == 0;
    }

    // Method to find frequency using a 2D array
    public static int[][] findDigitFrequency(int[] digits) {
        // First, count unique digits to determine rows (max 10 rows for digits 0-9)
         int[] freq=new int[10];
         int uniqueCount=0;

         for (int d : digits) {
              if(freq[d]==0)uniqueCount++;
              freq[d]++;        
         }

        // Create 2D array: [uniqueCount][2] 
        // Col 0: Digit, Col 1: Frequency
        int[][] freqMap=new int[uniqueCount][2];
        int rowIndex=0;
        for (int i = 0; i <10; i++) {
            if(freq[i]!=0){
                freqMap[rowIndex][0]=i;
                freqMap[rowIndex][1]=freq[i];
                rowIndex++;
            }           
        }
        return freqMap;
    }

    // Helper method to display the 2D array
    public static void displayFrequency(int[][] table) {
        System.out.println("Digit | Frequency");
        for (int[] row : table) {
            System.out.println("  " + row[0] + "   |    " + row[1]);
        }
    }
}