import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store names of friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights of friends
        int[] age = new int[3];
        double[] height = new double[3];

        // Taking input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            age[i] = input.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            height[i] = input.nextDouble();
        }

        // Assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest 
        for (int i = 1; i < 3; i++) {
            // Check for youngest
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            // Check for tallest
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println();
        System.out.println("Youngest Friend: " + friends[youngestIndex]);
        System.out.println("Age: " + age[youngestIndex]);

        System.out.println();
        System.out.println("Tallest Friend: " + friends[tallestIndex]);
        System.out.println("Height: " + height[tallestIndex] + " cm");

        input.close();
    }
}

