import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and the breadth of rectangle : ");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int perimeter=2*(length+breadth);
        System.out.println("The perimeter of rectangle is : "+ perimeter);
    }
}
