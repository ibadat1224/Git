package maxscanmer;

import java.util.Scanner;

public class MaxNumberPractice {

	public static void main(String[] args) {

		int[] number = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 numbers : ");

		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();

		}
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];

			}
		}
		System.out.println("Max number is : " + max);
	}

}
