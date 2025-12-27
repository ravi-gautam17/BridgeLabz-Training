package com.constructors.levelone;

public class HotelBooking {
   private String guestName;
   private String roomType;
   private int nights;
   
   public HotelBooking(){
	   guestName="Unknown";
	   roomType="Single";
	   nights=0;
   }
	public HotelBooking(String guestName,String roomType,int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	public HotelBooking(HotelBooking obj){
		this.guestName=obj.guestName;
		this.roomType=obj.roomType;
		this.nights=obj.nights;
	}
	public void show() {
		System.out.println("Guest Name: "+this.guestName);
		System.out.println("Room type: "+this.roomType);
		System.out.println("Total nights stayed : "+this.nights);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HotelBooking obj1=new HotelBooking();
        HotelBooking obj2=new HotelBooking("Ravi","double bed",3);
        HotelBooking obj3=new HotelBooking(obj2);
        obj1.show();
        obj2.show();
        obj3.show();
        
	}

}
