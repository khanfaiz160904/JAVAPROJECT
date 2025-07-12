package CodSoft;

import java.util.Scanner;

class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. New balance: " + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}
}

public class ATM {
	private BankAccount bankAccount;

	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void displayMenu() {
		System.out.println("Welcome to the ATM");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
	}

	public void processOption(int option) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		switch (option) {
		case 1:
			System.out.print("Enter amount to withdraw: ");
			double withdrawAmount = scanner.nextDouble();
			bankAccount.withdraw(withdrawAmount);
			break;
		case 2:
			System.out.print("Enter amount to deposit: ");
			double depositAmount = scanner.nextDouble();
			bankAccount.deposit(depositAmount);
			break;
		case 3:
			System.out.println("Current balance: " + bankAccount.getBalance());
			break;
		case 4:
			System.out.println("Thank you for using the ATM. Goodbye!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option.");
		}
	}

	public static void main(String[] args) {
		BankAccount userAccount = new BankAccount(1000); // Starting balance
		ATM atm = new ATM(userAccount);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			atm.displayMenu();
			System.out.print("Enter your choice: ");
			int option = scanner.nextInt();
			atm.processOption(option);

		}
	}
}
