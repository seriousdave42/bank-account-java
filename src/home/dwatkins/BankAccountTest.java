package home.dwatkins;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount dave = new BankAccount();
		
		dave.deposit(1500, 500);
		dave.withdrawChecking(250);
		dave.withdrawSavings(750);
		System.out.println(dave.getAccountNumber());
		System.out.format("Total balance = $%,.2f%n", dave.getTotalBalance());
	}

}
