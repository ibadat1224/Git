package doWhileLoop;

public class DoWhile {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);

		int counter = 0;
		while (counter < 5) {
			System.out.println("counting" + counter);
			counter++;
		}

		int counter2 = 3;
		do {
			System.out.println("counting" + counter2);
			counter2++;
		} while (counter2 < 5);

		int until = 10;

		while (until > 0)
			;

		System.out.println(until);

		until--;
		// until = until - 2;
		// until -= 2;
		if (until % 2 != 0) {
			System.out.println(until);
		}
		until--;
	}

}
