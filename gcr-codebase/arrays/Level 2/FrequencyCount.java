import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        
        int temp=number;
        int count=0;
        while (temp>0) {
             count++;
             temp/=10;            
        }
        int[] digits=new int[count];
        temp=number;
        for (int i = 0; i < digits.length; i++) {
            digits[i]=temp%10;
            temp/=10;
        }
        
        int[] freq=new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;     
        }
        
        for (int i = 0; i < freq.length; i++) {
            System.out.print("\n The frequency of "+i+" is "+freq[i]);      
        }

        input.close();
    }
}
