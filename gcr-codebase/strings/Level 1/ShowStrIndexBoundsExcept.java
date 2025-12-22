//Program to create array of characters in two ways

import java.util.Scanner;
import java.util.Arrays;
public class ShowStrIndexBoundsExcept{
    public static void main(String[] args){
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
		String str=sc.next();
		
		try{
		    generateExcept(str);
		  }
		catch(StringIndexOutOfBoundsException e){
		    System.out.println("String index out of bounds exception occured");
		}
		catch(Exception e){
		    e.printStackTrace();
		}

        // Close the Scanner object
        sc.close();
    }
	// method to generate StringIndexOutOfBoundsException
	public static void generateExcept(String str){
	    	int length=str.length();
			System.out.println(str.charAt(length));
		
	}
}