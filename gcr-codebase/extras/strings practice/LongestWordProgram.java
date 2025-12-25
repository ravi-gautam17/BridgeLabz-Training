import java.util.*;

// Write a program to find the longest word in a sentence
public class LongestWordProgram{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		String inp=input.nextLine();
		 
		 // make a method to return the longest word
	    String longestWord=getLongestWord(inp);	
		System.out.println("Longest word in the sentence : "+ longestWord);
		    			
        //close the scanner
        input.close();
		
      }
	   public static String getLongestWord(String sentence) {
	       String[] words=sentence.split(" ");
		   String str="";
		   for(String word:words){
		     if(word.length()>str.length()){
			   str=word;
			 }
		   }
		   return str;
       }
       
    }