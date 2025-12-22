//Program to compare two strings with different methods

import java.util.Scanner;

public class StringComparison{
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
		String str1=sc.next();
		String str2=sc.next();
		
		boolean areEqualStrings=compareStrings(str1,str2);
		
		if(areEqualStrings){
		 System.out.println("Strings are equal using charAt() method");
		}
		else{
		 System.out.println("Strings are not equal using charAt() method");
       }    
	   
	   if(str1.equals(str2)){
		 System.out.println("Strings are equal using equals() method");
		}
		else{
		 System.out.println("Strings are not equal using equals method");
       } 

        // Close the Scanner object
        sc.close();
    }
	// method to compare using charAt() method
	public static boolean compareStrings(String str1,String str2){
	    // compare the length
	    if(str1.length()!=str2.length()){
		   return false;
		}
		// compare each index, if unequal return false
		for(int i=0;i<str1.length();i++){
		   char ch1=str1.charAt(i);
		   char ch2=str2.charAt(i);
		   if(ch1!=ch2){
		     return false;
		   }
		}
		return true;
	}
}