package com.oops.day7.skillforge;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User{
      
	public Instructor(int userId, String name, String email, String password) {
		super(userId, name, email, password);
		
	}
	List<Course> createdCourses=new ArrayList<>();
	
	public void createCourse(Course c) {
		createdCourses.add(c);
	}
	public void uploadModule(Course c, String module) {
		for(Course crs:createdCourses) {
              if(crs.equals(c)) {
            	  crs.modules.add(module);
            	  break;
              }
		}
	}
	public void uploadCourseContent() {
		for(Course crs:createdCourses) {
			 System.out.println("Course name "+crs.title);
			 System.out.print("Modules : ");
			 for(String mod:crs.modules) {
				  System.out.print(mod+" ");
			 }
			 
		}
		System.out.println("Uploaded course content successfully");
	}
}
