package maxscanmer;

import java.util.Arrays;

public class ArrayAction {

	public static void main(String[] args) {

		// long[] longs = { 1L, 33L, 44L, 55L };
		// String str = Arrays.toString(longs);
		// System.out.println(str);
		//
		// create an double array and print out value using Arrays.toString(your
		// array)

		double[] d = { 1.12, 2.21, 3.10, 4.32 };
		Arrays.sort(d);
		int indexOf432 = Arrays.binarySearch(d, 4.32);

		System.out.println(" index of 4.32 is " + indexOf432);

		String str = Arrays.toString(d);
		System.out.println(str);

	}

}
