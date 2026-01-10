package com.oops.day7.skillforge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends User{
   List<Course> enrolledCourses=new ArrayList<>();
   Map<Course,Integer> progressPercentage=new HashMap<>();
   Map<Course, Integer> grades=new HashMap<>();
   
   public Student(int userId, String name, String email, String password) {
	   super(userId, name, email, password);
   }
   public void enrolCourse(Course c) {
	   enrolledCourses.add(c);
   }
   public void updateProgress(Course c, int percent) {
	   progressPercentage.put(c,percent );
   }
   public void calculateGrade(Course c) {
	   if (!progressPercentage.containsKey(c)) {
           System.out.println("Progress not updated for course: " + c.title);
           return;
       }
	   int per=progressPercentage.get(c);
	   if(per>90) {
		   grades.put(c, 5);
	   }
	   else if(per>70) {
		   grades.put(c,4);
	   }
	   else if(per>50) {
		   grades.put(c,3);
	   }
	   else if(per>30) {
		   grades.put(c,2);
	   }
	   else {
		   grades.put(c, 1);
	   }	   
   }
   public void requestCertificate(Course c) {
	   System.out.println("Certificate :");
	   System.out.println("Course Title : "+c.title);
	   System.out.println("Course Instructor : "+c.instructor);
	   System.out.println("Course Level : "+c.level);
	   for(Course crs:progressPercentage.keySet()) {
		   if(crs.equals(c)) {
			   int per=progressPercentage.get(c);
			   System.out.println("Percentage : "+per);
		   }
	   }
	   for(Course crs:grades.keySet()) {
		   if(crs.equals(c)) {
			   int grade=grades.get(c);
			   System.out.println("Grades : "+grade);
		   }
	   }
   }
}
