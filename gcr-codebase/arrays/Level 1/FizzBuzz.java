import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // create the scanner object
        Scanner input=new Scanner(System.in);
        
        // read the number as input
        int number=input.nextInt();
        // create an array of string with index one more than number
        String[] arr=new String[number+1];
         
        // write the logic for assigning values to array
        for (int i = 1; i <= number; i++) {
            if(i%3==0&& i%5==0){
                arr[i]="FizzBuzz";
            }
            else if(i%3==0){
                arr[i]="Fizz";
            }
            else if(i%5==0){
                arr[i]="Buzz";
            }
            else{
                arr[i]=String.valueOf(i);
            }
        }
        
        //print the position and values assigned to them
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Position "+i+" : "+arr[i]);
        }

        //close the scanner
        input.close();
    }
    
}
