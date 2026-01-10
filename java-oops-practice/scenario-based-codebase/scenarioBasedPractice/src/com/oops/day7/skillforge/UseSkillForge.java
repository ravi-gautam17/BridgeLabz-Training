package com.oops.day7.skillforge;

import java.util.Arrays;

public class UseSkillForge {
    public static void main(String[] args) {
    	String[] mod1= {"ER Diagram", "SQL", "ACID","Transaction"};
    	String[] mod2= {"OSI Layers", "DLL", "TCP/IP","Protocols"};
    	String[] mod3= {"Control Flow", "DSA", "Collections"};
    	Course a=new Course("DBMS","Ramesh",Arrays.asList(mod1),5,8);
    	Course b=new Course("CN","Mahesh",Arrays.asList(mod2),4,9);
    	Course c=new Course("Programming","Suresh",Arrays.asList(mod3),3,6);
    	c.updateRating(7);
    	System.out.println("Internal reviews of b "+b.getInternalReviews());	
    	
    	Instructor instr1=new Instructor(101, "Vishal sir","vishal@123","v@123");
    	instr1.createCourse(a);
    	instr1.uploadModule(a, "Loops");
    	instr1.uploadCourseContent();
    	  
    	Instructor instr2=new Instructor(103, "Bhuvan sir","bhuvan@123","b@123");
    	instr2.createCourse(b);
    	instr2.uploadModule(b, "Arrays");
    	instr2.uploadCourseContent();
    	
    	Student stud1=new Student(1,"Ravi", "ravi101", "r@123");
    	Student stud2=new Student(2,"Ritesh", "ritesh102","rit@123");
    	stud1.enrolCourse(a);
    	stud1.enrolCourse(b);
    	stud2.enrolCourse(c);
    	stud2.enrolCourse(a);
    	
    	stud1.updateProgress(a, 80);
    	stud2.updateProgress(b, 60);
    	
    	stud2.updateProgress(c, 75);
    	stud2.updateProgress(a, 10);
    	
    	stud1.calculateGrade(a);
    	stud1.calculateGrade(b);
    	
    	stud2.calculateGrade(c);
    	
    	stud1.requestCertificate(a);
    	stud2.requestCertificate(c);
    	
    }
}
