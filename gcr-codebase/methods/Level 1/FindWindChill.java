import java.util.Scanner;
//calculate the wind chill temperature given the temperature and wind speed
public class FindWindChill{
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read temperature and wind speed
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
		System.out.print("Enter wind speed: ");
        double windSpeed = scanner.nextDouble();

         FindWindChill findWindChill=new FindWindChill();
         double windChill=findWindChill.calculateWindChill(temperature, windSpeed);
        // Display the result in required format
        System.out.println(
            "The wind chill temperature is " + windChill
        );

        // Close the scanner
        scanner.close();
    }
	// method to calculate the wind chill temperature using the formula 

	public double calculateWindChill(double temp, double windSpeed){
          // calculate the wind chill and return        
		  double windChill=35.74 + 0.6215*temp +(0.4275*temp-35.75) *Math.pow(windSpeed,0.16);
	      
	      return windChill;

   }
}
