package newpackage;

public class SavingAccount extends BankAccount {

	public SavingAccount(String name, int accountNumber, double balance) {
		super(name, accountNumber, balance);

	}

	@Override
	protected double Withdraw(int amount) {

		// return super.Withdraw(amount);
		return (int) (balance - amount * 1.05);
		// return new Double(123123);
	}

	public static void main(String[] args) {

		SavingAccount s = new SavingAccount("Ibadat", 12345, 1000000);
		System.out.println(s.name);
		System.out.println(s.accountNumber);
		System.out.println(s.balance);

		double remaining = s.Withdraw(100000);
		System.out.println(remaining);
	}
}
