package lec05;

import java.util.Scanner;

public class GetNumber {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Enter a number");
			sc.next();

		}
		n = sc.nextInt();
		System.out.println("The number you entered" + n);
	}

}
