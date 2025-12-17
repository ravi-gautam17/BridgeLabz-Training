import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum=sc.nextInt();
        System.out.println("Enter the second number: ");
        int secNum=sc.nextInt();
        int sum=firstNum+secNum;
        System.out.println("The sun is "+sum);
    }
}
