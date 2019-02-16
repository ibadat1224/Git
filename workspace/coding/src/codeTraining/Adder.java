package codeTraining;

import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {
		// read n numbers from keyboard, find the largest

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers?");
		int n = sc.nextInt();
		int largest = 0;
		int current = 0;
		for (int i = 0; i < n - 1; i++) {
			current = sc.nextInt();

			if (current > largest) {
				largest = current;

				System.out.println("The largest number is:" + largest);
			}
		}

	}

}
