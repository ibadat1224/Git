package loops;

public class ModifyingArray {

	public static void main(String[] args) {
		// create a double array of 5 times
		// get the value from user using scanner
		// double the value and print it out
		// example if you have 2 you should get 4.0

		double[] prices = { 1.2, 1.3, 1.4, 1.5, 1.6 };

		for (int i = 0; i < prices.length; i++) {
			prices[i] = prices[i] * 2;
			System.out.println(prices[i] * 2);

			for (int i1 = 0; i1 < prices.length; i1++) {
				System.out.println(prices[i1]);
			}
		}
	}
	//
	// double[] ds = new double[5];
	// ds[0] = 1.2;
	// ds[1] = 1.3;
	// ds[2] = 1.4;
	// ds[3] = 1.5;
	// ds[4] = 1.6;
	// System.out.println(ds[0] * 2);
	// System.out.println(ds[1] * 2);
	// System.out.println(ds[2] * 2);
	// System.out.println(ds[3] * 2);
	// System.out.println(ds[4] * 2);

	// System.out.println((ds.length) * 2);
}
