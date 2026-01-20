package com.oops.day10.BagBallOrganizer;

import java.util.*;

public class Bag implements Storable {

	private String bagId;
	private String color;
	private int capacity;
	private List<Ball> balls;

	public Bag(String bagId, String color, int capacity) {
		this.bagId = bagId;
		this.color = color;
		this.capacity = capacity;
		this.balls = new ArrayList<>();
	}

	public boolean addBall(Ball ball) {
		if (balls.size() >= capacity) {
			System.out.println("Bag " + bagId + " is full!");
			return false;
		}
		balls.add(ball);
		return true;
	}

	public void removeBall(String ballId) {
		Iterator<Ball> it = balls.iterator();
		while (it.hasNext()) {
			if (it.next().getId().equals(ballId)) {
				it.remove();
				System.out.println("Ball removed from Bag " + bagId);
				return;
			}
		}
		System.out.println("Ball not found.");
	}

	public int getBallCount() {
		return balls.size();
	}

	@Override
	public void display() {
		System.out.println("\nBag ID: " + bagId + ", Color: " + color + ", Capacity: " + capacity + ", Current Balls: "
				+ balls.size());

		for (Ball b : balls) {
			b.display();
		}
	}
}
