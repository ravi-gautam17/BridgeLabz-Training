import java.util.Random;

public class FootballTeamAnalysis {

    public static void main(String[] args) {
        // 1. Create an int array named heights of size 11
        int[] heights = new int[11];
        Random random = new Random();

        // 2. Fill array with random heights between 150 and 250 cms
        // random.nextInt(101) gives 0-100; 
        System.out.println("Player Heights (in cms):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; 
            System.out.print(heights[i] + " ");
        }
        System.out.println("\n-------------------------------");

        // 3. Perform calculations using methods
        int totalSum = findSum(heights);
        double meanHeight = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // 4. Finally display the results
        System.out.println("Analysis Results:");
        System.out.println("Total Sum of Heights: " + totalSum + " cm");
        System.out.printf("Mean Height: %.2f cm\n",meanHeight);
        System.out.println("Shortest Player: " + shortest + " cm");
        System.out.println("Tallest Player: " + tallest + " cm");
    }

    // Method to find the sum of all elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] arr) {
        double sum = findSum(arr); 
        return sum / arr.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}