package com.headfirst.game;

public class GuessGame {

	Player firstPlayer;
	Player secondPlayer;
	Player thirdPlayer;

	public void startGame() {
		firstPlayer = new Player();
		secondPlayer = new Player();
		thirdPlayer = new Player();

		int guessFirstPlayer = 0;
		int guessSecondPlayer = 0;
		int guessThirdPlayer = 0;

		boolean firstPlayerIsRight = false;
		boolean secondPlayerIsRight = false;
		boolean thirdPlayerIsRight = false;

		int targetNumber = (int) (Math.random() * 10);

		System.out.println("I`m thinking of a number between 0 and 9...");

		while (true) {
			System.out.println("Number to guess is " + targetNumber);

			firstPlayer.guess();
			secondPlayer.guess();
			thirdPlayer.guess();

			guessFirstPlayer = firstPlayer.number;
			System.out.println("Player one guesed " + guessFirstPlayer);
			guessSecondPlayer = secondPlayer.number;
			System.out.println("Player two guesed " + guessSecondPlayer);
			guessThirdPlayer = thirdPlayer.number;
			System.out.println("Player third guesed " + guessThirdPlayer);

			if (guessFirstPlayer == targetNumber) {
				firstPlayerIsRight = true;
			}
			if (guessSecondPlayer == targetNumber) {
				secondPlayerIsRight = true;
			}
			if (guessThirdPlayer == targetNumber) {
				thirdPlayerIsRight = true;
			}
			if (firstPlayerIsRight || secondPlayerIsRight || thirdPlayerIsRight) {
				System.out.println("We have a winner!!!");
				System.out.println("Player one got it right? " + firstPlayerIsRight);
				System.out.println("Player two got it right? " + secondPlayerIsRight);
				System.out.println("Player third got it right? " + thirdPlayerIsRight);
				System.out.println("GAME OVER!!");
				break;
			} else {
				System.out.println("Players will have to try again");
			}
		}
	}
}
