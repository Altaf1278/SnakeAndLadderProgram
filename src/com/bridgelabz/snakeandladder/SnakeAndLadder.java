package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {

		// Player starting position is 0.
		int current_Position = 0;
		System.out.println("Player starting position: " + current_Position);
		Random input = new Random(); // create a new Random object
		int diceRoll = (int) Math.floor(Math.random() * 6) + 1; // roll the die and get a number between 1 and 6
		int option = (int) Math.floor(Math.random() * 3); // get a random number between 0 and 2 to determine the option

		switch (option) {
		case 0: // No Play
			System.out.println("No play, player stays at position " + current_Position);
			break;
		case 1:
			// Ladder: moves Player ahead
			current_Position += diceRoll;
			System.out
					.println("Ladder! Player moves ahead by " + diceRoll + " positions to position " + current_Position);
			break;
		case 2:
			// Snake: moves Player behind
			current_Position -= diceRoll;
			System.out.println("Snake! Player moves back by " + diceRoll + " positions to position " + current_Position);
			break;

		}

	}
}
