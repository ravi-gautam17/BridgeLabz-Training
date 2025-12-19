import java.util.Scanner;

public class PrintOddEvenArray {
    public static void main(String[] args) {
        //create the scanner object
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        
        // check if number is natural number
        if(number<=0){
            System.out.println("Not a natural number");
        }
        else{
            // create the even and odd array
            int[] odd=new int[(number/2)+1];
            int[] even=new int[(number/2)+1];
            int oddIndex=0;
            int evenIndex=0;
            // assign the value of odd and even values
            for(int i=1;i<=number;i++){
                if(i%2==0){
                    even[evenIndex++]=i;
                }
                else{
                    odd[oddIndex++]=i;
                }
            }
            // show the even and odd array values
            oddIndex = 0;
            evenIndex=0;
            while(oddIndex<odd.length){
                System.out.print(odd[oddIndex++]+" ");
            }
            System.out.println();
            while(evenIndex<even.length){
                System.out.print(even[evenIndex++]+" ");
            }
        }
        input.close();
    }
}
