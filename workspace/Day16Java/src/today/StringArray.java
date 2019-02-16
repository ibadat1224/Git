package today;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String[] names = new String[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 names:");

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}
		// names[0] = sc.nextLine();
		// names[1] = sc.nextLine();
		// names[2] = sc.nextLine();
		// names[3] = sc.nextLine();

		for (int i = 0; i < names.length; i++) {

			// System.out.println("character is " + names[i]);
			System.out.println("First character is " + names[i].charAt(0));
		}

	}

}
