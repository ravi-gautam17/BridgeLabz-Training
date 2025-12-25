import java.util.*;

// Write a program to find the most frequent order
public class RemoveSpecificChar{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		
		System.out.println("Enter string : ");
		String str=input.nextLine();
		
		System.out.println("Enter character you want to remove : ");
		
		char ch=input.next().charAt(0);
	
	    // make a method to return the most frequent character
		String modifiedStr=removeChar(str,ch);	   
		
         System.out.println("Modified string : "+modifiedStr);    	
	   			
        //close the scanner
        input.close();
		
      }
	   public static String removeChar(String str,char ch) {    
		   StringBuilder sb=new StringBuilder();
		   
	       for(int i=0;i<str.length();i++){
		      char curr=str.charAt(i);
			  if(curr!=ch){
			    sb.append(curr);
			  }
		   }

		   return sb.toString();
       }
       
   }