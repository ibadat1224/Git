package array;

public class NumberGame {

	public static void main(String[] args) {

		// create an array that have 7 item
		// assign value for all the items
		// get the sum of thr items that more than 10
		// task2

		int[] ints = { 1, 2, 3, 14, 25, 56, 72 };
		int sum = 0;
		int result = 1;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > 10) {
				sum += ints[i];
			}
			if (ints[i] % 2 == 0 && ints[i] % 3 == 0) {
				result *= ints[i];

				System.out.println(sum);
				System.out.println(result);

				int max = 0;
				for (int i1 = 1; i1 < ints.length; i1++) {

					if (ints[i1] > max) {
						max = ints[i1];
					}
				}
				System.out.println("max is :" + max);
			}
		}

	}

}
