package reverse;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String line = scan.nextLine();

		char[] letters = line.toCharArray();
		// line = null;
		int s = 0;
		int t = 0;

		for (int i = 0; i < letters.length; i++) {
			while (i < letters.length && letters[i] == '-') {
				i++;
			}
			s = i;
			while (i < letters.length && letters[i] != '-') {
				i++;

			}
			t = i - 1;
			while (s < t) {
				char temp = letters[s];
				letters[s] = letters[t];
				letters[t] = temp;
				s++;
				t--;

			}
		}
		System.out.print("Output: ");
		for (char c : letters) {
			System.out.print(c);
		}
	}
}
