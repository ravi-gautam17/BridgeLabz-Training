//Program to create array of characters in two ways

import java.util.Scanner;
import java.util.Arrays;
public class CreateArrOfChars{
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
		String str=sc.next();
		
		// call method to create character array with user-defined method and built-in method
		char[] charArr=createCharArray(str);
		char[] builtinArr=str.toCharArray();
		
		System.out.println("Array with charMethod :"+Arrays.toString(charArr));
		System.out.println("Array with built-in method :"+Arrays.toString(builtinArr));
		
		// check and compare the two array of characters
		for(int i=0;i<charArr.length;i++){
		   if(charArr[i]!=builtinArr[i]){
		      System.out.println("The arrays are not equal");
			  break;
		   }
		}
		System.out.println("The arrays are equal");

        // Close the Scanner object
        sc.close();
    }
	// method to create array of characters in a string
	public static char[] createCharArray(String str){
	    // create character of strings
		char[] crr=new char[str.length()];
		for(int i=0;i<str.length();i++){
		   char ch=str.charAt(i);
		   crr[i]=ch;
		}		
		return crr;
	}
}