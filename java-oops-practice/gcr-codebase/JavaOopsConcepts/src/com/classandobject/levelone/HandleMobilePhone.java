package com.classandobject.levelone;

public class HandleMobilePhone {
	//Declaring variable for entering the details
	String brand;
	String model;
	double price;
	
	//constructor
	HandleMobilePhone(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void diplayMobile() {
		System.out.println("Brand of mobile: "+brand);
		System.out.println("Model of mobile: "+model);
		System.out.println("Price of mobile: "+price);
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
		HandleMobilePhone mobile1=new HandleMobilePhone("VIVO","VIVO V29" , 15999);
		HandleMobilePhone mobile2=new HandleMobilePhone("ONE PLUS","ONE PLUS nord4",39999);
		HandleMobilePhone mobile3=new HandleMobilePhone("APPLE","iphone pro16",79999);
	
	mobile1.diplayMobile();
	mobile2.diplayMobile();
	mobile3.diplayMobile();
	}
}