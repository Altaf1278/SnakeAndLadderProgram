package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	public static void main(String[] args) {

		int player_Position = 0;
		System.out.println("Player's starting position is: " + player_Position);

		// simulate rolling the die 6 times
		for (int i = 0; i < 5; i++) {

			// After rolling a dice player gets random number between 1 to 6
			int dice = (int) Math.floor(Math.random() * 6) + 1;
			System.out.println("After rolling a dice, we get : " + dice);
		}
	}
}
