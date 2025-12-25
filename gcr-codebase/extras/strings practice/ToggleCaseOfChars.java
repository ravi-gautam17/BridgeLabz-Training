import java.util.*;

// Write a program to toggle the case of characters
public class ToggleCaseOfChars{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		
		System.out.println("Enter string : ");
		String inp=input.nextLine();
	
	    // make a method to return the toggled String
		 String toggled=toggleString(inp);	   
	
		System.out.println(" Toggled string : "+ toggled);
		    			
        //close the scanner
        input.close();
		
      }
	   public static String toggleString(String str) {
	      StringBuilder sb=new StringBuilder();
		  for(int i=0;i<str.length();i++){    
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'){
			  ch=(char)(ch+32);
			  sb.append(ch);
			}
			else{
			  ch=(char)(ch-32);
			  sb.append(ch);
			}		  
		  }
		   return sb.toString();
       }
       
    }