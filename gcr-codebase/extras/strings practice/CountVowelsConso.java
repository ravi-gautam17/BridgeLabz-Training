import java.util.Scanner;
// Write a program to count vowels and consonents
public class CountVowelsConso{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		 String inp=input.nextLine();
		 
	    String cleanInput = inp.toLowerCase().replaceAll("\\s+", "");
	    
		int[] letterArr=letterCheckArr(cleanInput);
   		
		System.out.println("Vowels count : "+letterArr[0]);
		System.out.println("Consonents count: "+letterArr[1]);
		
        			
        //close the scanner
        input.close();
      }
	   public static int[] letterCheckArr(String text) {
	       int[] letterCount=new int[2];
		   int vowelCount=0;
		   int consoCount=0;
           for(int i=0;i<text.length();i++){
		     char ch=text.charAt(i);
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			    vowelCount++;
			 }
			 else{
			    consoCount++;
			 }
		   
		   }
		   
		   
		   letterCount[0]=vowelCount;
		   letterCount[1]=consoCount;
		   return letterCount;
		   
        }
       
    }
	
