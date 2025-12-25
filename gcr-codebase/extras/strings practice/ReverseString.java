import java.util.Scanner;
// Write a program to print the reverse of string
public class ReverseString{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		String inp=input.nextLine();
		 
	    String reverseStr=reverse(inp);	
		System.out.println("Reverse of string : "+reverseStr);
		    			
        //close the scanner
        input.close();
      }
	   public static String reverse(String text) {
	      String str="";
		  for(int i=text.length()-1;i>=0;i--){
		    str+=text.charAt(i); 
		  }
		  return str;   		   
        }
       
    }
	
