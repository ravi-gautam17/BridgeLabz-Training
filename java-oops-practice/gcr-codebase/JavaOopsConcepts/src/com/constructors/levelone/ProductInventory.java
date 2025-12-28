package com.constructors.levelone;

public class ProductInventory {
    private String productName;
    private int price;
    
    private static int totalProducts;
    public ProductInventory(String productName,int price){
    	   this.productName=productName;
    	   this.price=price;
    }
    
    public static void setTotalProducts(int total) {
    	  totalProducts=total;
    }
    public void displayProductDetails() {
    	   System.out.println("Product Name: "+productName);
    	   System.out.println("Price : "+price);
    }
    public static void displayTotalProducts() {
    	   System.out.println("Total products : "+totalProducts);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ProductInventory pi=new ProductInventory("Wheet",2000);
        setTotalProducts(2);
        ProductInventory pi2=new ProductInventory("Rice",4000);
        displayTotalProducts();
        pi.displayProductDetails();
        pi2.displayProductDetails();
        
	}

}
