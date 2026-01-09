package com.oops.day7.artify;

public class DigitalArt extends ArtWork implements IPurchasable{
    private boolean commercialUseAllowed;
    private int licenseDuration;
	public DigitalArt(String title, String artist, double price, String licenseType,boolean isLicenseGlobal,boolean commercialUseAllowed,boolean modificationAllowed,boolean redistributionAllowed,int licenseDuration) {
		
		super(title, artist, price, licenseType,isLicenseGlobal);
		this.commercialUseAllowed=commercialUseAllowed;
		this.licenseDuration=licenseDuration;
		
		
	}
	public double purchase(User buyer) {
		
		 if(buyer.hasSufficientBalance(price)) {
			 buyer.deductBalance(price);
		 }
		 else {
			 System.out.println("Not sufficient balance");
			 System.out.println("Current balance "+buyer.getWalletBalance());
		 }
		 return buyer.getWalletBalance();
	}
	public void license() {
		if(commercialUseAllowed) {
			System.out.println("Commercial use allowed");
		}
		else {
			System.out.println("Commercial use not allowed");
		}
		System.out.println("License duration "+licenseDuration);
	}

}
