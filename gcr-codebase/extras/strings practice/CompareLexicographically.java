import java.util.*;

// Write a program to toggle the case of characters
public class CompareLexicographically{
    public static void main(String[] args){
        //create the scanner object
        Scanner input =new Scanner(System.in);

        // read the string as input
		
		System.out.println("Enter two strings : ");
		String str1=input.nextLine();
		String str2=input.nextLine();
	
	    // make a method to return which string will comes first
		boolean willStr1ComeFirst=compareStrings(str1,str2);	   
		    	
	    if(willStr1ComeFirst){
          System.out.println(str1+" comes before "+str2+" in lexicographical order");
        }else{
                    System.out.println(str1+" comes after "+str2+" in lexicographical order");
        }		
        				
        //close the scanner
        input.close();
		
      }
	   public static boolean compareStrings(String str1,String str2) {
	     
		   int smallLen=str1.length()<str2.length()?str1.length():str2.length();
	       for(int i=0;i<smallLen;i++){
		      char ch1=str1.charAt(i);
			  char ch2=str2.charAt(i);
			  if(ch1<ch2){
			    return true;
			  }
			  else if(ch1>ch2){
			    return false;
			  }   
		   }
		   if(smallLen==str1.length()){
		      return true;
		   }
		   else{
		      return false;
		   }
       }
       
    }