package Oasis;

import java.util.Scanner;

public class ATM1 {
	private static final int PIN_ATTEMPTS = 3;
	@SuppressWarnings("unused")
	private static final int PIN_LENGTH = 4;

	private static class User {
		@SuppressWarnings("unused")
		private String userId;
		@SuppressWarnings("unused")
		private String pin;
		private double balance;

		public User(String userId, String pin, double balance) {
			this.userId = userId;
			this.pin = pin;
			this.balance = balance;
		}

		public double getBalance() {
			return balance;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User user = null;
		int pinAttempts = 0;

		while (true) {
			System.out.println("1. Login");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			if (choice == 1) {
				System.out.print("Enter user ID: ");
				String userId = scanner.next();
				System.out.print("Enter PIN: ");
				String pin = scanner.next();

				user = login(userId, pin);

				if (user != null) {
					System.out.println("Login successful.");
					pinAttempts = 0;

					while (true) {
						System.out.println("\n1. Check balance");
						System.out.println("2. Withdraw");
						System.out.println("3. Deposit");
						System.out.println("4. Transfer");
						System.out.println("5. Logout");
						System.out.print("Enter your choice: ");
						int transactionChoice = scanner.nextInt();

						if (transactionChoice == 1) {
							System.out.println("Your balance is: " + user.getBalance());
						} else if (transactionChoice == 2) {
							System.out.print("Enter amount to withdraw: ");
							double amount = scanner.nextDouble();
							withdraw(user, amount); // Corrected
						} else if (transactionChoice == 3) {
							System.out.print("Enter amount to deposit: ");
							double amount = scanner.nextDouble();
							deposit(user, amount); // Corrected
						} else if (transactionChoice == 4) {
							System.out.print("Enter user ID to transfer to: ");
							String transferUserId = scanner.next();
							System.out.print("Enter amount to transfer: ");
							double amount = scanner.nextDouble();
							transfer(user, transferUserId, amount); // Corrected
						} else if (transactionChoice == 5) {
							break;
						} else {
							System.out.println("Invalid choice. Please try again.");
						}
					}
				} else {
					pinAttempts++;
					System.out.println("Invalid user ID or PIN. Please try again.");

					if (pinAttempts == PIN_ATTEMPTS) {
						System.out.println("Too many failed attempts. Exiting.");
						break;
					}
				}
			} else if (choice == 2) {
				System.out.println("Exiting.");
				break;
			} else {
				System.out.println("Invalid choice. Please try again.");
			}
		}

		scanner.close();
	}

	private static void withdraw(User user, double amount) {
		// Method body for withdrawal
	}

	private static void deposit(User user, double amount) {
		// Method body for deposit
	}

	private static void transfer(User user, String transferUserId, double amount) {
		// Method body for transfer
	}

	private static User login(String userId, String pin) {
		// Replace this with actual database lookup
		if (userId.equals("1234") && pin.equals("1234")) {
			return new User(userId, pin, 1000);
		}
		// Corrected: Removed recursive call to login method
		return null;
	}
}
