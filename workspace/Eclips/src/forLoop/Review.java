package forLoop;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for (int c = 0; c < name.length(); c++) {
			char eachChar = name.charAt(c);
			System.out.print(eachChar);
			if (c != name.length() - 1) {
				System.out.print(",");
			}

		}

	}
}