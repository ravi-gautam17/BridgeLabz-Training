/*
* Shopkeeper’s Discount Dashboard 🛍️
* A shopkeeper gives discounts based on total bill:
* Input item prices in a for-loop.
* Use if-else for discount logic.
* Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

public class ShopkeeperDiscountBoard {
    public static void main(String[] args) {
       
	    double discount_10=0.10;
		double discount_20=0.20;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of products");
		int num=sc.nextInt();
		System.out.println("===========================================");
		System.out.println("         Shopkeeper Discount Board         ");
		System.out.println("===========================================");	
	    
		double total=0;
		System.out.print("\tProduct No. \t\t Prices\n");
		System.out.println("===========================================");
		for(int i=0;i<num;i++){
		   System.out.print("\t"+(i+1)+"\t \t");
		   double price=sc.nextDouble();
		   total+=price;  	
		}
		double finalPrice=0;
		if(total>=500&&total<1000){
		   finalPrice=total*(1-discount_10);
		}
		else if(total>1000){
		  finalPrice=total*(1-discount_20);
		}
		else{
		  finalPrice=total;
		}
        System.out.println("==========================================");
        System.out.print("\tTotal Price \t");
		System.out.print("Total Cost \n");
		System.out.println("==========================================");
		System.out.print("\t"+total+"\t\t");
		System.out.print(finalPrice+"\n");
		

        sc.close();
    }
}
