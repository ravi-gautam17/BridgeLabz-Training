//Program to create array of characters in two ways

import java.util.Scanner;
import java.util.Arrays;
public class ShowNullPointerExcept{
    public static void main(String[] args){
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
		String text=null;
		try{
		    int length=getStrLength(text);
			System.out.println("Length of string is : "+length);
		  }
		catch(NullPointerException e){
		    System.out.println("Null Pointer Exception occured");
		}
		catch(Exception e){
		    e.printStackTrace();
		}

        // Close the Scanner object
        sc.close();
    }
	// method to generate exception
	public static int getStrLength(String text){
	    // return length of string
        return text.length();		
		
	}
}