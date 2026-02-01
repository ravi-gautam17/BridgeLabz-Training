package com.day10.avl.gamingapp;
import java.util.*;

public class GamingAppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AVLGaming game = new AVLGaming();

        //  Scenario 1: Insert / Update Players
        game.root = game.insert(game.root, "Ravi", 1200);
        game.root = game.insert(game.root, "Ritesh", 1500);
        game.root = game.insert(game.root, "Swaraj", 900);
        game.root = game.insert(game.root, "Mukesh", 1800);
        
        List<PlayerNode> topPlayers = new ArrayList<>();
        game.getTopPlayers(game.root, topPlayers);
        
        for (int i = 0; i < topPlayers.size(); i++) {
            PlayerNode p = topPlayers.get(i);
            System.out.println((i + 1) + ". " + p.name + " - " + p.points + " pts");
        }
        
	}

}
