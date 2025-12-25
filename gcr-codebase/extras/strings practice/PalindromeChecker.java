import java.util.Scanner;
// Write a program to check palindrome
public class PalindromeChecker{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		 String inp=input.nextLine();
		 
	    String cleanInput = inp.toLowerCase().replaceAll("\\s+", "");
	    
		
        if(isPalindrome(cleanInput)){
           System.out.println("Is a palindrome");
        }
        else{
           System.out.println("Not a palindrome");
        }		
        			
        //close the scanner
        input.close();
      }
	    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
			if(!Character.isLetter(text.charAt(start))){
				 start++;
				 continue;
			}
			if(!Character.isLetter(text.charAt(end))){
				 end--;
				 continue;
			}
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
	
}