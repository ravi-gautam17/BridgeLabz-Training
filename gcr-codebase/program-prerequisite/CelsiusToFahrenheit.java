import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tempInCelcius=sc.nextInt();
        double tempInFahrenheit=9/5.0* (tempInCelcius)+32;
        System.out.println(tempInFahrenheit);
    }
}
