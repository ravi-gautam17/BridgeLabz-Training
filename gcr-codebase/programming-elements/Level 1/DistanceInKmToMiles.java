import java.util.Scanner;

public class DistanceInKmToMiles {
    public static void main(String[] args) {
        //Take input with Scanner class
        Scanner sc=new Scanner(System.in);
        double km=sc.nextDouble();
        
        //Calculate the miles
        double miles=km*0.621371;

        //print the distance in miles
        System.out.println("The total miles is "+miles+" mile for the given "+km);

    }
}
