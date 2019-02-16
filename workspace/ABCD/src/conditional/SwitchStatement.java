package conditional;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day name:");

		Scanner scanner = null;
		String dayName = scanner.next();

		switch (dayName) {
		case "Monday":
			System.out.println(1);
			break;
		case "Tuesday":
			System.out.println(2);
			break;

		default:
			System.out.println("some other day");

		}

	}
}