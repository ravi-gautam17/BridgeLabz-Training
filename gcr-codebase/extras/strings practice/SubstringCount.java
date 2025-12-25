import java.util.*;

// Write a program to find the substring count in a string
public class SubstringCount{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		
		System.out.println("Enter string and substring : ");
		String inp=input.nextLine();
		String substr=input.nextLine();
		 
		 // make a method to return the longest word
	    int subStrcount=getSubstrCount(inp,substr);	
		System.out.println("Substring count in the string : "+ subStrcount);
		    			
        //close the scanner
        input.close();
		
      }
	   public static int getSubstrCount(String str,String substr) {
	      int subLen=substr.length();
		   int count=0;
		  for(int i=0;i<=str.length()-subLen;i++){
		    
			 if(str.substring(i,i+subLen).equals(substr)){
			   count++;
			 }
		  
		  }
		   return count;
       }
       
    }