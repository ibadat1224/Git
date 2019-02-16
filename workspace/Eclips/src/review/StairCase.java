package review;

public class StairCase {

	public static void main(String[] args) {
		// for (int i = 1; i <= 8; i++) {
		// for (int j = 1; j <= i; j++) {
		// System.out.print(j);
		// }
		// System.out.println();

		for (int i = 1; i <= 8; i++) {
			System.out.print("i=" + i + "\t");

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (9 - i); j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
