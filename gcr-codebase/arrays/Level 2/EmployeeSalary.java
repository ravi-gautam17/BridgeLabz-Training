import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        // create the scanner object
        Scanner input=new Scanner(System.in);
        // create the double array for salary,new salary, year of service, bonus
        double[] salary=new double[10];
        double[] yearOfService=new double[10];

        double[] newSalary=new double[10];
        double[] bonus=new double[10];
        
        //create variable to store total bonus, total new salary, total old salary
        double totalBonus=0;
        double totalOldSalary=0;
        double totalNewSalary=0;
         
        //logic to verify the inputs and taking correct salary and year of service as input
        for(int i=0;i<10;i++){
            System.out.print("Enter salary of employee "+(i+1)+" : " );
            
            double sal=input.nextDouble();
            while(sal<=0){
              System.out.println("Invalid input. Enter again");
              sal=input.nextDouble();
            }
            salary[i]=sal;
            System.out.print("Enter year of service of employee "+(i+1)+" : " );
            double year=input.nextDouble();
            while(year<=0){
              System.out.println("Invalid input. Enter again");
              year=input.nextDouble();
            }
            yearOfService[i]=year;
            
        }
        
        //calculating the bonus, new salary,total bonus,total new salary,total old salary
        for (int i = 0; i < 10; i++) {
            if(yearOfService[i]>=5){
                bonus[i]=salary[i]/20;
                newSalary[i]=salary[i]+bonus[i];
                totalBonus+=bonus[i];
                totalOldSalary+=salary[i];
                totalNewSalary+=newSalary[i];
            }
            else{
                bonus[i]=salary[i]/50;
                newSalary[i]=salary[i]+bonus[i];
                totalBonus+=bonus[i];
                totalOldSalary+=salary[i];
                totalNewSalary+=newSalary[i];
            }
        }
        // display the total bonus, old salary, new salary
        System.out.print("Total bonus payout: "+totalBonus+"\n");
        System.out.print("Total old salary: "+totalOldSalary+"\n");
        System.out.print("Total new salary:"+totalNewSalary);

        //close the scanner
        input.close();
    }
}
