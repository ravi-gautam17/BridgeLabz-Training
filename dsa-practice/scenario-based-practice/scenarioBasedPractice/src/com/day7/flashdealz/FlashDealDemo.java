	package com.day7.flashdealz;
	
	public class FlashDealDemo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			Product[] products = {new Product("Laptop", 22.6), new Product("Mobile", 32.4), new Product("Mouse", 18.4)};
			
			QuickSort.quickSort(products, 0, products.length-1);
			for (Product p : products) {
	            System.out.println(p.name + " - " + p.discount + "%");
	        }
		}
	
	}
