package newpackage;

public class BankAccount {

	String name;
	int accountNumber;
	double balance;

	public BankAccount(String name, int accountNumber, double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	protected double Withdraw(int amount) {

		return balance - amount;
	}

}
