package maxscanmer;

import java.util.Scanner;

public class MaxScanner {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers finding the max:");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();

		}
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];

			}

		}
		System.out.println("Max is : " + max);
	}
}