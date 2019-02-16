package maxscanmer;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		// int[] days = new int[7];
		// int count = 0;
		Random rand = new Random();
		int[] days = new int[8];
		for (int i = 0; i < days.length; i++)
			days[i] = rand.nextInt(7);

		System.out.println(days);

		String str = Arrays.toString(days);
		System.out.println(str);

	}
	// int[] days = new int[8];
	// for (int i = 0; i < days.length; i++) {
	// days[i] = rand.nextInt(6);
	// }
	// for (int day : days) {
	// System.out.print(day + " ");
	// }
}
