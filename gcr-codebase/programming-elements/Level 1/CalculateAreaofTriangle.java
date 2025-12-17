import java.util.Scanner;
public class CalculateAreaofTriangle{
   public static void main(String[] args){

     // Take the base and height as an input with the help of scanner class
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int height=sc.nextInt();
      
    // Calculate the area of triangle
      double area=(height*base)/2.0;
     
    // print the area of triangle
      System.out.println("The area of triangle is "+area);
}
}