import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        // create a scanner object
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int maxFactor=10;
        int[] factors=new int[maxFactor];

        //run a for loop from 1 to number
        int index=0;
        for(int i=1;i<number;i++){
            //check if number is divisible by i
            if(number%i==0){
             factors[index++]=i;
             if(index==maxFactor){
                //resize the factors array
                maxFactor=maxFactor*2;
                int[] temp=new int[maxFactor];
                for (int j = 0; j < index; j++) {
                    temp[j]=factors[j];
                }
                factors=temp;
             }
            
            }   
        }
        //Print all the factors
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]+" ");
        }
        //close the scanner
        input.close();
    }
    
}
