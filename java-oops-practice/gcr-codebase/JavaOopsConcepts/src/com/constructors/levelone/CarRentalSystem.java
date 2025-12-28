package com.constructors.levelone;

public class CarRentalSystem {
	// instance variables declaration
    private String customerName;
    private String carModel;
    private int rentalDays;
    // Constructor to initialize the rental days
    public CarRentalSystem(String customerName,String carModel,int rentalDays){
    	  this.customerName=customerName;
    	  this.carModel=carModel;
    	  this.rentalDays=rentalDays;
    }
    //method to calculate the total cost
    public int getCost() {
    	   int oneDayPrice=10000;
    	   int totalCost=oneDayPrice*rentalDays;
    	   return totalCost;
    }
    
	public static void main(String[] args) {
		
		// Creating the objects
        CarRentalSystem per1=new CarRentalSystem("Harry","Frenkestude71",3);
        int cost1=per1.getCost();
        CarRentalSystem per2=new CarRentalSystem("Maddy","Mercedes",4);
        int cost2=per2.getCost();
        int total=cost1+cost2;
        System.out.println("Total cost is : "+total);
	}

}
