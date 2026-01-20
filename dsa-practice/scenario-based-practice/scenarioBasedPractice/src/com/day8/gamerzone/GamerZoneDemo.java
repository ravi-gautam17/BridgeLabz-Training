package com.day8.gamerzone;

public class GamerZoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player[] players = {new Player("Ritesh", 34.9), new Player("Swaraj", 67.3), new Player("Shriyansh", 24.1)};
		QuickSort.quickSort(players, 0, players.length-1);
		
		for(Player player: players) {
			System.out.println(player.playerName + " - " + player.score);
		}
	}

}
