package codeTraining;

public class BankAccount {

	public static void main(String[] args) {
		String name;
		long accountNumber;
		double balance;

	}

	public void displayCardInfo() {
		System.out.println("Account holder name: " + name + "|  Account number is : " + accountNumber);

	}

	public void deposit(double addedMoney) {
		double balance = balance + addedMoney;
		return;
	}

	public void withdraw(int moneyTakenAway) {
		balance = balance - moneyTakenAway;
	}

	public void getBalance() {
		return balance;
	}

	public boolean checkForLoweBalance() {
		if (balance < 1000) {
			return true;
		} else {
			return false;
		}
	}
}