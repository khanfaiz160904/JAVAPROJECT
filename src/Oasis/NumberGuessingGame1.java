package Oasis;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int minRange = 1;
		int maxRange = 100;
		int maxAttempts = 5;
		int score = 0;

		System.out.println("Welcome to the Number Guessing Game!");

		boolean playAgain = true;
		while (playAgain) {
			int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
			System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Guess what it is!");
			System.out.println("You have only " + maxAttempts + " chances to guess the correct number!!");
			int attempts = 0;
			boolean guessedCorrectly = false;

			while (!guessedCorrectly && attempts < maxAttempts) {
				System.out.print("Enter your guess: ");
				int guess = scanner.nextInt();
				attempts++;

				if (guess == targetNumber) {
					System.out.println(
							"Congratulations! You've guessed the correct number in " + attempts + " attempts.");
					score++;
					guessedCorrectly = true;
				} else if (guess < targetNumber) {
					System.out.println("Too low! Try again.");
				} else {
					System.out.println("Too high! Try again.");
				}
			}

			if (!guessedCorrectly) {
				System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
			}

			System.out.print("Do you want to play again? (y/n): ");
			String playChoice = scanner.next();
			if (!playChoice.equalsIgnoreCase("y")) {
				playAgain = false;
				System.out.println("Thanks for playing! Your total score is: " + score);
			}
		}
		scanner.close();
	}
}
