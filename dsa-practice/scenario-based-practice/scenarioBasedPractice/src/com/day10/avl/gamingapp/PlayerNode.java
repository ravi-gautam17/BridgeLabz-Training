package com.day10.avl.gamingapp;

public class PlayerNode {

	String name;
	int points, height;
	PlayerNode left, right;
	
	PlayerNode(String name, int points){
		this.name = name;
		this.points = points;
		this.height = 1;
	}
}
