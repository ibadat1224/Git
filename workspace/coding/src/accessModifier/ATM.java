package accessModifier;

public class ATM {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.accountNumber = 1234567989;
		acc.pin = 123;
		acc.printSomething();
	}

}
