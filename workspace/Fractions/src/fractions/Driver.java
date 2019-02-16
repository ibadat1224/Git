package fractions;

public class Driver {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(4, 5);
		Fraction f2 = new Fraction(400, 500);
		Fraction f3 = new Fraction(800, 1000);

		if (f1.equals(f2)) {
			System.out.println(" are equal ");
		} else {

			System.out.println(" are not equal ");
		}

	}

}
