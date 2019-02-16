package sort3;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {

		int n = 0;
		int sum = 0;
		int t = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers");
		n = sc.nextInt();
		n = 5;
		int c = 0;
		while (c < n) {
			System.out.println("Enter a number");
			t = sc.nextInt();
			sum += t;
			c++;

		}
	}

}
