package newpackage;

public class ATM {

	public static void insertCard(String cardType) throws InvalidCardException {
		if (!(cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("master card")
				|| cardType.equalsIgnoreCase("american express"))) {

			throw new InvalidCardException("Invalid card type - " + cardType);
		} else {
			System.out.println("Card accepted - " + cardType);

		}

	}

}