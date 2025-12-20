
import java.util.Arrays;

public class RandomStatistics {

    public static void main(String[] args) {
        RandomStatistics rs = new RandomStatistics();
        
        // Generate five 4-digit numbers
        int[] randomNumbers = rs.generate4DigitRandomArray(5);
        
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));

        // Find stats: result[0] = Average, result[1] = Min, result[2] = Max
        double[] stats = rs.findAverageMinMax(randomNumbers);

        System.out.println(" Statistics");
        System.out.println("Average Value: " + stats[0]);
        System.out.println("Minimum Value: " + (int)stats[1]);
        System.out.println("Maximum Value: " + (int)stats[2]);
    }

    /**
     * Generates an array of random 4-digit numbers (1000 to 9999).
     */
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Formula: (Math.random() * (max - min + 1)) + min
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    /**
     * Calculates Average, Min, and Max of an integer array.
     * Returns double[] where index 0=Avg, 1=Min, 2=Max.
     */
    public double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[3];

        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        
        return new double[]{average, (double)min, (double)max};
    }
}