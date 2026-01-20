package com.day7.fitnesstracker;

public class FitnessTrackerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User[] users = {new User("Ritesh", 3400), new User("Ravi", 6700), new User("Swaraj", 2100)};
		BubbleSort.bubbleSort(users);
		
		for (User user : users) {
            System.out.println(user.name + " - " + user.steps + " steps");
        }
	}

}
