import java.util.Scanner;
// Display the grade of students
public class GradeDisplayProgram {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the marks of 3 subjects as input
		 int physics=input.nextInt();
		 int chemistry=input.nextInt();
		 int maths=input.nextInt();
		 
		 //calculate the percentage
		  double percentage=(double)(physics+chemistry+maths)/3;
          
         //check the grade and display
          if(percentage>=80){
		     System.out.println("The average marks is "+percentage+", Grade: Level-4, Remarks: at above agency-normalized standards");
			 
		  }
		  else if(percentage>=70 && percentage<=79){
		      System.out.println("The average marks is "+percentage+", Grade: Level-3, Remarks: at agency-normalized standards");
		  }
		  else if(percentage>=60 && percentage<=69){
		      System.out.println("The average marks is "+percentage+", Grade: Level-2, Remarks: below, but approaching agency-normalized standards");
		  }
		  else if(percentage>=50&& percentage<=59){
		      System.out.println("The average marks is "+percentage+", Grade: Level-1, Remarks: well below agency-normalized standards");
		  }
		  else if(percentage>=40&&percentage<=49){
		      System.out.println("The average marks is "+percentage+", Grade: Level-1-, Remarks: too below agency-normalized standards");
		  }
		  else{
		      System.out.println("The average marks is "+percentage+", Grade: Level-3, Remarks: Remedial standards");
		  }
	   
        //close the scanner
        input.close();
    }
}