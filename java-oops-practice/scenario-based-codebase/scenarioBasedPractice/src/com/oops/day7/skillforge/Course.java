package com.oops.day7.skillforge;

import java.util.ArrayList;
import java.util.List;

public class Course {
     String title;
     String instructor;
     
     List<String> modules=new ArrayList<>();
     int level;
     protected double rating;
     private String internalReviews;
     
     public Course(String title,String instructor, List<String> module,int level,double rating) {
    	 this.title=title;
    	 this.instructor=instructor;
    	 modules.addAll(module);
    	 this.level=level;
    	 this.rating=rating;
    	 this.setInternalReviews(updateInternalReviews(rating));
    	 
     }
     protected void updateRating(double newRating) {
    	 this.rating=newRating;
    	 setInternalReviews(updateInternalReviews(this.rating));
     }
      private String updateInternalReviews(double rating) {
    	 if(rating>8) {
    		 return "Excellent";
    	 }
    	 else if(rating>6) {
    		 return "Good";
    	 }
    	 else if(rating>5) {
    		 return "Average";
    	 }
    	 else {
    		 return "Flop";
    	 }
     }
	 protected String getInternalReviews() {
		return internalReviews;
	 }
	 private void setInternalReviews(String internalReviews) {
		this.internalReviews = internalReviews;
	 }
     
}
