import java.util.Scanner;

public class CalculateTrigoFunctions{

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read angle
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
       
	    CalculateTrigoFunctions obj=new CalculateTrigoFunctions();
	    double[] getTrigo=obj.calculateTrigonometricFunctions(angle);
		
		double sine=getTrigo[0];
		double cosine=getTrigo[1];
		double tangent=getTrigo[2];
		
        // Display the result in required format
        System.out.println(
            "The Sine is " + sine +
            " , cosine is " + cosine +
            " and tangent is " + tangent 
        );

        // Close the scanner
        scanner.close();
    }
	// Method to calculate various trigonometric functions
	public double[] calculateTrigonometricFunctions(double angle){

       // create an array      
	   double[] trigoVal=new double[3];
	   
	   // Convert angle into radians
        double radAngle=Math.toRadians(angle);

        // Calculate sine,cosine and tangent
         trigoVal[0]=Math.sin(radAngle);
		 trigoVal[1]=Math.cos(radAngle);
		 trigoVal[2]=Math.tan(radAngle);
	 
	     // return array trigoVal
	     return trigoVal;

   }
}