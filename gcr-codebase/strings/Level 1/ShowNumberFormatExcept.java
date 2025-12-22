// Program to demonstrate NormatFormatException

import java.util.Scanner;

public class ShowNumberFormatExcept {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String textNum = sc.next();
         
		try{
          generateException(textNum);
		}catch(NumberFormatException e){
			System.out.println("Number Format exception occured");
			
		}
       
        handleException(textNum);
        
        sc.close();
    }

    // Method to generate NumberFormatException
    public static void generateException(String str) {
        int num=Integer.parseInt(str);
		System.out.println(num);
    }
	// Method to handle runtime exception
	 public static void handleException(String text) {

        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

}
