package com.day4.eventmanager;

public class EventManagerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {200, 120, 400, 600, 560, 350, 799};
		TicketPrice.quickSort(prices, 0, prices.length-1);
		
		System.out.print("Top Cheapest Prices...... ");
		for(int price: prices)
			System.out.print(price +  " ");
		
		System.out.println("");
		System.out.print("Top Expensive Prices...... ");
		for(int i=prices.length-1; i>=0; i--) {
			System.out.print(prices[i] +  " ");
		}
	}

}
