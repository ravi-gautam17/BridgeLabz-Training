import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println("The average of 3 numbers is : "+(n1+n2+n3)/3.0);
    }
}
