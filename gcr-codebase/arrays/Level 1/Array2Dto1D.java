import java.util.Scanner;

public class Array2Dto1D {
    public static void main(String[] args) {
        // create the scanner object

        Scanner input=new Scanner(System.in);
        // take rows and columns as input

        System.out.println("Enter rows and columns: ");
        int rows=input.nextInt();
        int column=input.nextInt();

        //Declare a 2-D array and take inputs for its values with the help of nested loops
        int[][] multiArr=new int[rows][column];
        for (int i = 0; i < multiArr.length; i++) {
             for (int j = 0; j < multiArr[0].length; j++) {
                 multiArr[i][j]=input.nextInt();
             } 
        }
        //create a single dimensional array
        int[] singleArr=new int[rows*column];
        
        // put index at 0 and then loop through the 2-D array and fill 1-D array with values
        int index=0;
         for (int i = 0; i < multiArr.length; i++) {
             for (int j = 0; j < multiArr[0].length; j++) {
                singleArr[index++]=multiArr[i][j];
             } 
        }

        //Display the values in single dimensional array
        for (int i = 0; i < singleArr.length; i++) {
            System.out.print(singleArr[i]+" ");
        }

        // close the scanner
        input.close();
    }
    
}
