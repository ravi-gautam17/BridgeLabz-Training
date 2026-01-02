package com.inheritance.hybridinheritance.restaurantmanagement;

public class RestaurantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chef chef = new Chef("Swaraj", 101);
        Waiter waiter = new Waiter("Ravi", 201);

        System.out.println("Chef Details----");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("\nWaiter Details----");
        waiter.displayInfo();
        waiter.performDuties();
	}

}
