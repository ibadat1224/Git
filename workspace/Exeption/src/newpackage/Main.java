package newpackage;

public class Main {

	public static void main(String[] args) {

		try {
			throw new InvalidCardException();
		} catch (InvalidCardException e) {
			// System.out.println("catching the exception");
			// e.printStackTrace();

		}
		throw new InsufficientFundsExxception("No money");
		// throw new InvalidPinCodeException("Costco card not accepted");
	}

}