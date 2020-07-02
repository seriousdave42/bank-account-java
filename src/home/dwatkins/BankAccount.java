package home.dwatkins;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts;
	private static double totalBalance;
	
	public BankAccount() {
		accountNumber = createAccountNumber();
		numberOfAccounts++;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public double getTotalBalance() {
		return checkingBalance + savingsBalance;
	}
	
	private String createAccountNumber() {
		String randomNumber = "";
		Random r = new Random();
		for (int i = 1; i <= 10; i++) {
			randomNumber += r.nextInt(10);
		}
		return randomNumber;
	}
	
	public void deposit(double checkingDeposit, double savingsDeposit) {
		this.checkingBalance += checkingDeposit;
		this.savingsBalance += savingsDeposit;
		System.out.format("Current checking balance = $%,.2f%n", this.checkingBalance);
		System.out.format("Current savings balance = $%,.2f%n", this.savingsBalance);
	}
	
	public void withdrawChecking(double withdrawAmount) {
		if (withdrawAmount <= this.checkingBalance) {
			this.checkingBalance -= withdrawAmount;			
			System.out.format("Current checking balance = $%,.2f%n", this.checkingBalance);
		}
		else {
			System.out.println("Insufficient balance. Sorry.");
		}
	}

	public void withdrawSavings(double withdrawAmount) {
		if (withdrawAmount <= this.savingsBalance) {
			this.savingsBalance -= withdrawAmount;			
			System.out.format("Current savings balance = $%,.2f%n", this.savingsBalance);
		}
		else {
			System.out.println("Insufficient balance. Sorry.");
		}
	}
}
 