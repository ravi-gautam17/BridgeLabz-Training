/*
**Phone Recharge Simulator 📱
**Take the user's mobile operator and amount.
* Use a switch to display offers.
* Loop to allow repeated recharges.
* Show balance after each recharge.
*/

import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the amount of money in your account: ");
		double amount=sc.nextDouble();
		int n;
	    boolean insufficientBalance=false;
	    while(!insufficientBalance){
		  System.out.println("Enter the mobile operator: ");
		  String mobOpr=sc.next();
		  
		  switch(mobOpr){
		     case "jio":
			     System.out.println("Enter the mobile recharge plan : ");
				 System.out.println("Your options are 1. 349 2. 299 3. 249 4.199 ");
				 System.out.println("Enter the plan: ");
				 n=sc.nextInt();
				 switch(n){
				   case 349: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;
				   case 299: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;	  
				   case 249: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;
				   case 199: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;
				   default: 
				      System.out.println("Invalid choice. Try again");
				 }
				 
				 break;
			    case "airtel":
			     System.out.println("Enter the mobile recharge plan : ");
				 System.out.println("Your options are 1. 249 2. 99 3. 149 4.399 ");
				 System.out.println("Enter the plan: ");
				 n=sc.nextInt();
				 switch(n){
				   case 249: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;
				   case 99: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;	  
				   case 149: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
						
					  }
					  break;
				   case 399: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;
				   default: 
				      System.out.println("Invalid choice. Try again");
				 }
				  break;
		         case "vi":
			     System.out.println("Enter the mobile recharge plan : ");
				 System.out.println("Your options are 1. 100 2. 400 3. 200 4.300 ");
				 System.out.println("Enter the plan: ");
				 n=sc.nextInt();
				 switch(n){
				   case 100: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;
				   case 400: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;	  
				   case 200: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;
				   case 300: 
				      if(amount>n){
					    amount-=n;
						System.out.println("Recharge of "+n+" is successfull");
					  }
					  else{
					    insufficientBalance=true;
						System.out.println("Insufficient balance. You can't recharge");
					  }
					  break;
				   default: 
				      System.out.println("Invalid choice. Try again");
				 }
				  break;
				default:
                     System.out.println("Invalid mobile operator. Try again");				
				 
		    }
		
		
        }
        sc.close();
    }
}