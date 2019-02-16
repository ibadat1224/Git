package multidimention;

public class WarmUp {

	public static void main(String[] arg) {

		String[] name = { "Bob", "Kate", "Ann", "Jack", "Mike" };

		// OUTER: for (int i = 0; i < name.length; i++) {
		// char[] letters = name[i].toCharArray();
		//
		// INNER: for (int j = 0; j < letters.length; j++) {
		// if (letters[j] == 'c') {
		// break;
		// }
		// System.out.print(letters[j] + " ");
		// }
		// System.out.println();
		// }
		// continue the outer loop whenever you see a letter h
		OUTER: for (int i = 0; i < name.length; i++) {
			char[] letters = name[i].toCharArray();

			INNER: for (int j = 0; j < letters.length; j++) {
				if (letters[j] == 'c') {
					System.out.println();
					continue OUTER;
				}
				System.out.print(letters[j] + " ");
			}
			System.out.println();
		}
	}

}
