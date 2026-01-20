package com.oops.day10.BagBallOrganizer;

public class BagBallApp {

	public static void main(String[] args) {

		Bag bag1 = new Bag("BAG101", "Red", 3);
		Bag bag2 = new Bag("BAG102", "Blue", 2);

		Ball b1 = new Ball("BALL1", "Red", "Small");
		Ball b2 = new Ball("BALL2", "Blue", "Medium");
		Ball b3 = new Ball("BALL3", "Green", "Large");
		Ball b4 = new Ball("BALL4", "Yellow", "Small");

		bag1.addBall(b1);
		bag1.addBall(b2);
		bag1.addBall(b3);
		bag1.addBall(b4); // should fail (capacity)

		bag2.addBall(b4);

		bag1.display();
		bag2.display();

		bag1.removeBall("BALL2");
		bag1.display();

		System.out.println("\nAll Bags Summary:");
		System.out.println("Bag1 Ball Count: " + bag1.getBallCount());
		System.out.println("Bag2 Ball Count: " + bag2.getBallCount());
	}
}
