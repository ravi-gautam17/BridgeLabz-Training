import java.util.Scanner;

public class FriendsComparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Input heights
        System.out.print("Enter Amar's height: ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Akbar's height : ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Anthony's height : ");
        int anthonyHeight = input.nextInt();

        // Find youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest friend: Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest friend: Akbar");
        } else {
            System.out.println("Youngest friend: Anthony");
        }

        // Find tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest friend: Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest friend: Akbar");
        } else {
            System.out.println("Tallest friend: Anthony");
        }

        input.close();
    }
}
