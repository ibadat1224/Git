package mypakcage;

public class Calculator {

	public static double add(double d1, double d2) {
		return d1 + d2;

	}

	public static double subtract(double d1, double d2) {
		return d1 - d2;
	}

	public static double multiply(double d1, double d2) {
		return d1 * d2;
	}

	public static double devide(double d1, double d2) {
		return d1 / d2;
	}

	public static void main(String[] args) {
		System.out.println(Calculator.add(30, 15));
		System.out.println(Calculator.subtract(30, 15));
		System.out.println(Calculator.multiply(30, 15));
		System.out.println(Calculator.devide(30, 15));

		Calculator c = null;
		c.add(30, 15);

	}
}