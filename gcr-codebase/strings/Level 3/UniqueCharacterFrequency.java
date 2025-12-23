
// Program to show the Frequency of characters in a string with unique characters

import java.util.Scanner;

public class UniqueCharacterFrequency {

    public static void main(String[] args) {
		// Create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
       		
		String[][] freqArray=findFrequency(input);
		
		for(int i=0;i<freqArray.length;i++){
		    System.out.println("Char\t Freq");
			System.out.println(freqArray[i][0]+"\t"+freqArray[i][1]);		
		}
		sc.close();
    }
    public static char[] findUnique(String input){
	    int[] ascii=new int[256];
		// convert each character into lowercase
		for(int i=0;;i++){
		 try{
		   char ch=input.charAt(i);
		   if(ch>='A'&&ch<='Z'){
		     ch=(char)(ch+32);
		   }
		 
		 }
		 catch(StringIndexOutOfBoundsException e){
		    break;
		 }
		}
		//find every ascii with frequency more than 1
		for(int i=0;;i++){
		 try{
		   char ch=input.charAt(i);
		   ascii[ch]++;
		 
		 }
		 catch(StringIndexOutOfBoundsException e){
		    break;
		 }
		}
		int len=0;
		for(int i=0;i<256;i++){
		  if(ascii[i]>0){
		   len++;
		  }
		
		}
		// create an array that stores unique characters
		char[] uniqueChars=new char[len];
		int idx=0;
		for(int i=0;i<256;i++){
		   if(ascii[i]!=0){
		     char ch=(char)(i);
			 uniqueChars[idx++]=ch;
		   }
		
		}
		return uniqueChars;
		
	
	}
	//method to find frequency array that returns 2D array 
	// characters in 0th index, frequency in 1st index
	public static String[][] findFrequency(String input){
	    int[] ascii=new int[256];
		
		for(int i=0;;i++){
		 try{
		   char ch=input.charAt(i);
		   if(ch>='A'&&ch<='Z'){
		     ch=(char)(ch+32);
		   }
		 
		 }
		 catch(StringIndexOutOfBoundsException e){
		    break;
		 }
		}
		// find frequency of each character
		for(int i=0;;i++){
		 try{
		   char ch=input.charAt(i);
		   ascii[ch]++;
		 
		 }
		 catch(StringIndexOutOfBoundsException e){
		    break;
		 }
		}
		
		char[] uniqueChars=findUnique(input);
		
		String[][] freqArray=new String[uniqueChars.length][2];
		
		for(int i=0;i<uniqueChars.length;i++){
		   String charUnique=String.valueOf(uniqueChars[i]);
		   String freq=String.valueOf(ascii[uniqueChars[i]]);
		   freqArray[i][0]=charUnique;
		   freqArray[i][1]=freq;
		   
		
		}
		return freqArray;
	}

}




