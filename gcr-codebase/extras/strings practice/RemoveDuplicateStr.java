import java.util.*;

// Write a program to remove the duplicate from a string
public class RemoveDuplicateStr{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		String inp=input.nextLine();
		 
		 // make a method to get modified String
	    String modifiedStr=removeDuplicates(inp);	
		System.out.println("Modified string : "+ modifiedStr);
		    			
        //close the scanner
        input.close();
		
      }
	  // program to remove duplicate string 
	   public static String removeDuplicates(String str) {
	      LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		  for(int i=0;i<str.length();i++){
		    lhs.add(str.charAt(i));
			
		  }
		  String s="";
		  for(char val:lhs){
		    s+=val;
		  }
		  return s;
        }
       
    }