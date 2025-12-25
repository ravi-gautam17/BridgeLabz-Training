import java.time.LocalDate;
import java.util.Scanner;


public class DataArithmetic {
    public static void main(String[] args) {
        // create the scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date in (YYYY-MM-DD) format: ");

        String inputDate=sc.next();

        // Create Local date by parsing the string to date
        LocalDate date=LocalDate.parse(inputDate);

        //update the date
        LocalDate updatedDate=date.plusDays(7)
                             .plusMonths(1).plusYears(2);
          
        // get the final date                     
        LocalDate finalDate=updatedDate.minusWeeks(3);
        
         // Display results
        System.out.println("Original Date : " + date);
        System.out.println("After Adding 7 Days, 1 Month, 2 Years : " + updatedDate);
        System.out.println("After Subtracting 3 Weeks : " + finalDate);

        sc.close();
    }
}
