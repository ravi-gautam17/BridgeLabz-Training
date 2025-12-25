import java.util.*;

// Write a program to find the most frequent order
public class MostFrequentChar{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		
		System.out.println("Enter string : ");
		String str=input.nextLine();
		
	
	    // make a method to return the most frequent character
		char mostFreq=mostFreqChar(str);	   
		
         System.out.println("Most frequent Character : "+mostFreq);    	
	   			
        //close the scanner
        input.close();
		
      }
	   public static char mostFreqChar(String str) {    
		   HashMap<Character,Integer> hm=new HashMap<>();
		   
	       for(int i=0;i<str.length();i++){
		      char ch=str.charAt(i);
			  hm.put(ch,hm.getOrDefault(ch,0)+1);
			  
		   }
		   int max=0;
		   char mostFreq='\0';
		   for(char ch:hm.keySet()){
		      if(hm.get(ch)>max){
			    max=hm.get(ch);
				mostFreq=ch;
			  }
		   }
		   return mostFreq;
       }
       
   }