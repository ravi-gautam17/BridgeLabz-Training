// Program to demonstrate IllegalArgumentException

import java.util.Scanner;

public class ShowIllegalArgumentExcept {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        // call method that generates exception
        try {
            generateException(str);
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }

        // call method that handles runtime exception
        try {
            handleRuntimeException(str);
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }

        sc.close();
    }

    // Method to generate IllegalArgumentException
    public static void generateException(String str) {

        int start = 3;
        int end = 2;

        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index");
        }

        // This line will not execute
        String sub = str.substring(start, end);
        System.out.println(sub);
    }

    // Method to demonstrate handling RuntimeException
    public static void handleRuntimeException(String str) {

        // This will throw StringIndexOutOfBoundsException
        System.out.println(str.substring(10, 2));
    }
}
