package com.oops.day7.artify;

public class ArtWork {
     private String title;
     private String artist;
     protected double price;
     private String licenseType;
     boolean isLicenseGlobal;
     
     public ArtWork(String title,String artist,double price,String licenseType,boolean isLicenseGlobal){
    	 this.title=title;
    	 this.artist=artist;
    	 this.price=price;
    	 this.licenseType=licenseType;
    	 this.isLicenseGlobal=isLicenseGlobal;
     }
     
     public double getPrice() {
    	 return this.price;
     }
     public String getTitle() {
    	 return this.title;
     }
     public void license() {
    	 System.out.println("License type : "+licenseType);
    	 if(this.isLicenseGlobal) {
    		 System.out.println("License is global");
    	 }
    	 else {
    		 System.out.println("License is local");
    	 }
     }
     
}
