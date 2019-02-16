package vararg;

public class VarArg {

	public static void main(String[] args) {

		// add(3);
		// add(1.3 , 2.1 );
		add(1, 23, 4, 5);
		add(23, 33, 34, 56, 54, 2, 12, 34, 78);
		add(34, 3, 45, 56, 43, 67, 12, 13, 10, 34, 34, 45);

	}

	public static void add(int... numbers) {
		// System.out.println(" var arg");
		// }

		// for (int eachArg : numbers) {
		// System.out.print(eachArg + " ");

		// }
		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");

		}
		System.out.println();

	}

	public static void add(int i) {
		System.out.println(" adding " + i);
	}

	public static void add(double d1, double d2) {
		System.out.println(" sum " + (d1 + d2));

	}
}
