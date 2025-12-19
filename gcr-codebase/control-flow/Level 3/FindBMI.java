import java.util.Scanner;
// Calculate the BMI of a person
public class FindBMI {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the weight and height in cm as input
		  double weight=input.nextDouble();
		  int heightInCM=input.nextInt();
		  
		  //calculate height in metre
		  double heightInMetre=(double)heightInCM/100;
		  
		  // Calculate BMI 
		  double BMI=weight/Math.pow(heightInMetre,2);
		  
		  //Show the BMI of the program
		  if(BMI<=18.4){
		    System.out.println("Underweight");
		  }
		  else if(BMI>=18.5&& BMI<=24.9){
		    System.out.println("Normal");
		  }
		  else if(BMI>=25.0 && BMI<=39.9){
		    System.out.println("Overweight");
		  }
		  else{
		    System.out.println("Obese");
		  }
        
        //close the scanner
        input.close();
    }
}