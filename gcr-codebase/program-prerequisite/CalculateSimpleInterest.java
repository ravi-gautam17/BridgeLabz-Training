import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal,rate and time : ");
        int principal= sc.nextInt();
        int rate= sc.nextInt();
        int time= sc.nextInt();
        double SI=(principal*rate*time)/100.0;
        System.out.println("The simple interest is : "+SI);
    }
}
