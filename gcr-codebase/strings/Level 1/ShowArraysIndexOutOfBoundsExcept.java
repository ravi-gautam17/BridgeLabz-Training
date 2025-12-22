// Program to demonstrate ArrayIndexOutOfBoundsException

import java.util.Scanner;

public class ShowArraysIndexOutOfBoundsExcept {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the size of array: ");		
		int size=sc.nextInt();
		String[] names=new String[size];
		
		for(int i=0;i<names.length;i++){
		   names[i]=sc.next();
		}
                
		try{
          String name=generateException(names);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException exception occured");
			
		}
       
       
        
        sc.close();
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static String generateException(String[] names) {
         String name=names[names.length];
         return name;		 
    }
   

}
