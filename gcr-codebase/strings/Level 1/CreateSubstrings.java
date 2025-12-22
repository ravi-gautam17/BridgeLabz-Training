//Program to create substrings in two ways

import java.util.Scanner;

public class CreateSubstrings{
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
		String str=sc.next();
	    int start=sc.nextInt();
		int end=sc.nextInt();
		
		// call method to create substring with charAt() method and built-in method
		String substr1=createSubstrings(str,start,end);
		String substr2=str.substring(start,end+1);
		
		//show the output
		System.out.println("Substring with charAt method :"+substr1);
		System.out.println("Substring with substring method :"+substr1);

        // Close the Scanner object
        sc.close();
    }
	// method to compare using charAt() method
	public static String createSubstrings(String str,int start,int end){
	    // create substring from start to end
		StringBuilder sb=new StringBuilder();
		for(int i=start;i<=end;i++){
		   char ch=str.charAt(i);
		   sb.append(ch);
		}
		
		return sb.toString();
	}
}