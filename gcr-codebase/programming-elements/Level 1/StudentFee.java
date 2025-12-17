import java.util.Scanner;
public class StudentFee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        double discountPercent=sc.nextDouble();
        double discount=(discountPercent*fee)/100;
        double feeToBePayed=fee-discount;
        System.out.println("The discount amount is INR "+discount +" and the final discounted fee is INR "+feeToBePayed);
       
    }

}