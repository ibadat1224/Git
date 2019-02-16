package abstraction;

public class CreditCard extends BankCard {

	public CreditCard(String name, long cardNumber, double balance) {
		super(name, cardNumber, balance);

	}

	@Override
	public double withdraw(int amount) {
		// TODO Auto-generated method stub
		return balance - amount * 1.1;
	}

	public static void main(String[] args) {

		// BankCard b =new BankCard("a",123,100);
		CreditCard c = new CreditCard("Akbars Card", 12345678, 100);
		System.out.println(c.balance);
		System.out.println(c.withdraw(30));
	}

}
