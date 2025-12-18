import java.util.Scanner;

public class FindMultipleUsingWhile {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the number as input
        int number= input.nextInt();

        //check if the number is between 0 and 100
        if(number<0 || number>100){
            System.out.println("Invalid input");
        }else{
            int counter=number-1;
            while (counter>=1){
                 if(number%counter==0){
                     System.out.println(counter);
                 
                 }
                 counter--;
            }
        }
        //close the scanner
        input.close();
    }
}