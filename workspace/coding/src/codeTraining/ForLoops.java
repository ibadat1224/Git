package codeTraining;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {

		// read some positive integers from keyboard,
		// add them together
		// stop when you read -1
		// print the sum

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int sum = 0;
		System.out.println("Enter the numbers:");

		// while (n >= 0) {
		// sum += n;
		// n = sc.nextInt();

		int count = 0;
		do {
			sum += n;
			count++;

			n = sc.nextInt();
		} while (n > 0);
		count--;

		System.out.println("Sum:" + sum);
		double avg = sum / (count * 1.0);
		System.out.println("Avarege:" + avg);
		sc.close(); /// close the scanner

	}

}
