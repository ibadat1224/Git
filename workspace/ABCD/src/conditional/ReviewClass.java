package conditional;

import java.util.Scanner;

public class ReviewClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		System.out.println("from 0 to 99");

		Scanner scanner = null;
		int age = scanner.nextInt();

		if (age > 18) {
			System.out.println("adult");

		} else if (age <= 18 && age > 12) {
			System.out.println("teen");

		} else if (age <= 12 && age > 6) {
			System.out.println("Child");

		} else {
			System.out.println("not at school age");
		}
	}

}
