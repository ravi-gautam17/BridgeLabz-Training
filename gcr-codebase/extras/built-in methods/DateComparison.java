import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two dates input (yyyy-MM-dd) : ");
        String input1=sc.next();
        String input2=sc.next();
        
        
        LocalDate date1=LocalDate.parse(input1);
        LocalDate date2=LocalDate.parse(input2);

        if(date1.isBefore(date2)){
            System.out.println(date1+" is before the "+date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1+" is after the "+date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1+" is equals to the "+date2);
        }
        

        sc.close();
     }
}