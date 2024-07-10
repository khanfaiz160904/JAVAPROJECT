package Oasis;

import java.util.Scanner;

//Main class
public class ATMSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Prompt user for user ID and PIN
     System.out.println("Welcome to the ATM system.");
     System.out.print("Enter your user ID: ");
     int userId = scanner.nextInt();
     System.out.print("Enter your PIN: ");
     int pin = scanner.nextInt();
     
     // Authenticate user
     AuthenticationService authService = new AuthenticationService();
     boolean isAuthenticated = authService.authenticate(userId, pin);
     
     if (isAuthenticated) {
         // Unlock ATM functionalities
         ATM atm = new ATM(userId);
         atm.start();
     } else {
         System.out.println("Authentication failed. Exiting...");
     }
     
     scanner.close();
 }
}

//AuthenticationService class
class AuthenticationService {
 // Dummy authentication logic
 public boolean authenticate(int userId, int pin) {
     // In a real system, you would validate the userId and pin against a database
     // For demonstration purposes, let's assume authentication is successful for userId 1234 and pin 5678
     return userId == 1234 && pin == 5678;
 }
}

//ATM class
class ATM {
 private int userId;
 
 public ATM(int userId) {
     this.userId = userId;
 }
 
 public void start() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Welcome, User " + userId + ".");
     
     // Display menu options
     System.out.println("1. View Transaction History");
     System.out.println("2. Withdraw");
     System.out.println("3. Deposit");
     System.out.println("4. Transfer");
     System.out.println("5. Quit");
     System.out.print("Enter your choice: ");
     
     int choice = scanner.nextInt();
     
     switch (choice) {
         case 1:
             TransactionHistory history = new TransactionHistory();
             history.displayTransactionHistory(userId);
             break;
         case 2:
             Withdrawal withdrawal = new Withdrawal();
             withdrawal.withdraw(userId);
             break;
         case 3:
             Deposit deposit = new Deposit();
             deposit.deposit(userId);
             break;
         case 4:
             Transfer transfer = new Transfer();
             transfer.transfer(userId);
             break;
         case 5:
             System.out.println("Exiting ATM. Thank you for using our services.");
             break;
         default:
             System.out.println("Invalid choice. Please try again.");
     }
     
     scanner.close();
 }
}

//TransactionHistory class
class TransactionHistory {
 public void displayTransactionHistory(int userId) {
     // Dummy method to display transaction history
     System.out.println("Transaction history for User " + userId + ": [Dummy data]");
 }
}

//Withdrawal class
class Withdrawal {
 public void withdraw(int userId) {
     // Dummy method for withdrawal
     System.out.println("Withdrawal functionality for User " + userId + " is not implemented yet.");
 }
}

//Deposit class
class Deposit {
 public void deposit(int userId) {
     // Dummy method for deposit
     System.out.println("Deposit functionality for User " + userId + " is not implemented yet.");
 }
}

//Transfer class
class Transfer {
 public void transfer(int userId) {
     // Dummy method for transfer
     System.out.println("Transfer functionality for User " + userId + " is not implemented yet.");
 }
}

