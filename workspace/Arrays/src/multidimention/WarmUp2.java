package multidimention;

import java.util.Arrays;

public class WarmUp2 {

	public static void main(String[] args) {

		int[][][][] fourD;
		long[][][] threeD = new long[4][3][2];

		double[][] priceTags = new double[3][];
		priceTags[0] = new double[] { 1.2, 12, 3, 4 };
		priceTags[1] = new double[] { 2.2, 32, 13, 24 };
		priceTags[2] = new double[] { 77 };

		double[][] priceTags1 = { { 1.2, 12, 3, 4 }, { 2.2, 32, 13, 24 }, { 77 } };

		// System.out.println(Arrays.toString(priceTags[0]));
		System.out.println(Arrays.deepToString(priceTags));

		for (int i = 0; i < priceTags.length; i++) {
			System.out.println("Level " + (i + 1) + " have " + priceTags[i].length + " Items, they are : ");

			for (int j = 0; j < priceTags[i].length; j++) {
				System.out.print(priceTags[i][j] + " ");
			}
			System.out.println();

		}

	}

}
