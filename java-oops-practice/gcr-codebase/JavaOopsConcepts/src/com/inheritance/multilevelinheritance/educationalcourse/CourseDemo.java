package com.inheritance.multilevelinheritance.educationalcourse;

public class CourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Object of base class
        Course c1 = new Course("Java Basics", 30);
        c1.displayCourse();

        System.out.println();

        // Object of OnlineCourse
        OnlineCourse c2 = new OnlineCourse(
                "Web Development",
                45,
                "Coursera",
                true
        );
        c2.displayCourse();

        System.out.println();

        // Object of PaidOnlineCourse
        PaidOnlineCourse c3 = new PaidOnlineCourse(
                "Full Stack Development",
                60,
                "Udemy",
                true,
                4999,
                20
        );
        c3.displayCourse();
	}

}
