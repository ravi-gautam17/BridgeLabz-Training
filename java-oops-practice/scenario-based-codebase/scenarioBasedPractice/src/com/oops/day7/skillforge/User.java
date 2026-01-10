package com.oops.day7.skillforge;

public class User {
   private int userId;
   private String name;
   private String email;
   private String password;
   
   public User(int userId, String name, String email,String password ) {
	   this.userId=userId;
	   this.name=name;
	   this.email=email;
	   this.password=password;
   }
   public void login(String userName, String password) {
	   if(this.name==userName&& this.password==password) {
		     System.out.println("Logged in successfully");
	   }
	   else {
		   System.out.println("Wrong username or password");
	   }
   }
   public void logout() {
	   System.out.println("Logged out successfully");
   }
}

