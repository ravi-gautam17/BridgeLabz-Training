import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double PI=3.14;
        System.out.print("Enter the radius : ");
        int radius=sc.nextInt();
        double areaOfCircle=PI*Math.pow(radius,2);
        System.out.println("The area of circle is : "+areaOfCircle);
    }
}
