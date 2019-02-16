package abstraction;

public class DebitCard extends BankCard {

	public DebitCard(String name, long cardNumber, double balance) {
		super(name, cardNumber, balance);

	}

	@Override
	public double withdraw(int amount) {

		return balance - amount;
	}

}