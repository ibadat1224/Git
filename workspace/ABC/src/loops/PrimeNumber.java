package loops;

public class PrimeNumber {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			if (row == 3)
				continue;

			for (int col = 1; col <= 3; col++) {
				if (col == 2)
					continue;

				// System.out.print("\t\t");

				System.out.print("Cell(" + row + "," + col + ")\t");

			}
			System.out.println();

		}
	}
}
