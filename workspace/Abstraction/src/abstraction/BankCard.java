package abstraction;

public abstract class BankCard {

	String name;
	long cardNumber;
	double balance;

	public BankCard(String name, long cardNumber, double balance) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}

	public abstract double withdraw(int amount);

	public double deposit(int amount) {
		return amount + balance;
	}
}