package com.bridgelabz.snakeandladder;

public class SnakeAndLadderProgram  {
	
	public static final int START_POSITION = 0;
	public static final int WINNING_POSITION = 100;
	public static int currentPosition;

	public static void main(String[] args) {

		currentPosition = START_POSITION;
		SnakeAndLadderProgram snakeAndLadderProgram = new SnakeAndLadderProgram();
		snakeAndLadderProgram.diceRolls();

	}

	public void diceRolls() {
		while (currentPosition < WINNING_POSITION) {

			int dieRoll = (int) Math.floor(Math.random() * 6) + 1; // roll the die and get a number between 1 and 6

			int option = (int) Math.floor(Math.random() * 3); // get a random number between 0 and 2 to determine the option
															

			switch (option) {
			case 0: // No Play
				currentPosition += 0;
				break;
			case 1:
				// Ladder: moves Player ahead
				currentPosition += dieRoll;
				
				break;
			case 2:
				// Snake: moves Player behind
				currentPosition -= dieRoll;
				if (currentPosition < 0) {
					currentPosition = START_POSITION;
				}

				break;

			}

		}
		System.out.println(currentPosition);
	}
}
