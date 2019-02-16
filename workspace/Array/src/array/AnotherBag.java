package array;

public class AnotherBag {

	public static void main(String[] args) {
		String[][] bag = new String[3][3];
		bag[0][0] = "The followship of ring";
		bag[0][1] = "Tolkien";
		bag[0][2] = "fantasy";

		bag[1][0] = "fantasy";
		bag[1][1] = "Orwell";
		bag[1][2] = "1984";

		bag[2][0] = "Three man and a boat";
		bag[2][1] = "Smith";
		bag[2][2] = "Drama";

		// find the author of "Three men and a boat

		String expectedTitle = "The followship of ring";
		// i---> number of rows
		outer:

		for (int i = 0; i < bag.length; i++) {

			/// j------> number of columns
			for (int j = 0; j < bag[i].length; j++) {
				System.out.print(i + " ");
				System.out.println(j);

				/// find the expected title
				if (bag[i][j].equals(expectedTitle)) {

					for (String string : bag[i]) {
						System.out.println(string);
					}
					break outer; // will break the loop with a label
				}
			}
		}

	}

}
