package accessModifier;

public class BankAccount {

	public static void main(String[] args) {
	// access modifier:public, private,default,protected
	// public---accessible anywhere
	// private--only accessible in the same class
	// default--(no access modifier)==only accessible in same package

	private int accountNumber;
	private int pin;

	public void printSomething() {
		System.out.println("just a print from bank account");
	}

	// getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int newNumber) {
		accountNumber = newNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int newVal) {
		pin = newVal;

	}

}