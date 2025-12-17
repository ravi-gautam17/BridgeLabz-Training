import java.util.Scanner;

public class ConvertKMtoMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in kilometre");
        int distanceInKM=sc.nextInt();
        double distanceInMiles=distanceInKM*0.621371;
        System.out.println("The distance in miles is "+distanceInMiles);
    }
}
