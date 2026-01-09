package com.oops.day7.artify;

public class UseArtify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           User user1=new User("Shriyansh",2000);
           User user2=new User("Vedansh",2500);
           User user3=new User("Ritesh",1000);
           ArtWork art1=new DigitalArt("MSD","Dhoni",1000,"Domestic",true,false,true,true,6);
           System.out.println(art1.getPrice());
           System.out.println(art1.getTitle());
           
           
           DigitalArt art2=new DigitalArt("RS45","Rohit",2000,"Global",false,false,true,true,8);
           art2.purchase(user1);
           art2.purchase(user2);
           ArtWork art3=new PrintArt("VK18","Virat",1000,"Domestic",true, 10,false,true,"8th edition");
           art3.license();
          PrintArt art4=new PrintArt("SRT10","Sachin",2000,"Global",false, 20,false,true,"5th edition");
           art4.purchase(user3);
	}

}
