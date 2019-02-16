package codeTraining;

public class BankActivity {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		account.name = "Ibadat";
		account.accountNumber = 123456789L;
		account.balance = 100000;

		account.displayCardInfo();
		account.deposit(100000);

		System.out.println(account.balance);

		account.withdraw(50000);
		bouble newBalance = account.getBalance();
		System.out.println("Final balance is " + newBalance);
	}

}
