package array;

import java.util.Arrays;

public class Bags {

	public static void main(String[] args) {

		String[][] bag = new String[3][3];
		System.out.println(Arrays.deepToString(bag));

		bag[0][0] = "OCA";
		bag[0][1] = "Tolkien";
		bag[0][2] = "fantasy";

		bag[1][0] = "1984";
		bag[1][1] = "Orwell";
		bag[1][2] = "fantasy";

		bag[2][0] = "Three man and a boat";
		bag[2][1] = "Smith";
		bag[2][2] = "Drama";

		// System.out.println(Arrays.deepToString(bag));

		// for (String[] book : bag) {
		// for (String bookInfo : book) {
		// // System.out.println(bookInfo);
		// if (bookInfo.equals("fantasy")) {
		// // System.out.println("Found it");
		// } else {
		// // System.out.println("Not found");
		// }
		//
		// }
		// -----------------------------------------------
		for (String[] book : bag) {
			String genre = book[2];
			if (genre.equals("fantasy")) {
				System.out.println(Arrays.toString(book));
			}

		}

		System.out.println("******************");

		for (int i = 0; i < bag.length; i++) {
			String[] book = bag[i];
			String genre = book[2];
			if (genre.equals("fantasy")) {
				System.out.println(Arrays.deepToString(book));
			}
		}
	}

}
