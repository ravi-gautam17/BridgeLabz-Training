import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int base= sc.nextInt();
        System.out.println("Enter the exponent value: ");
        int expo=sc.nextInt();
        System.out.println("Thr power result is : "+Math.pow(base,expo));
    }
}
