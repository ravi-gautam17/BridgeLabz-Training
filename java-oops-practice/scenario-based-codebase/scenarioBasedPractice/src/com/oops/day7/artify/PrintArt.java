package com.oops.day7.artify;

public class PrintArt extends ArtWork implements IPurchasable{
    private int maxPrintCopies;
     private boolean resaleAllowed;
    private boolean displayAllowed;
    private String editionType;
	public PrintArt(String title, String artist, double price, String licenseType, boolean isLicenseGlobal, int maxPrintCopies, boolean resaleAllowed, boolean displayAllowed, String editionType) {
		super(title, artist, price, licenseType,isLicenseGlobal);
		this.maxPrintCopies=maxPrintCopies;
		this.resaleAllowed=resaleAllowed;
		this.displayAllowed=displayAllowed;
		this.editionType=editionType;
	}
	

	public double purchase(User buyer) {
		 if(buyer.hasSufficientBalance(super.price)) {
			 buyer.deductBalance(super.price);
		 }
		 else {
			 System.out.println("Not sufficient balance");
			 System.out.println("Current balance "+buyer.getWalletBalance());
		 }
		 return buyer.getWalletBalance();
	}
	public void license() {
		System.out.println("Maximum print copies : "+maxPrintCopies);
		if(resaleAllowed) {
			System.out.println("Resale is allowed");
		}else {
			System.out.println("Resale is not allowed");
		}
		
		if(displayAllowed) {
			System.out.println("Display is allowed");
		}else {
			System.out.println("Display is not allowed");
		}
		
		System.out.println("Edition type : "+editionType);
	}
	

}
