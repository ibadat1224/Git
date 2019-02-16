package array;

import java.util.Scanner;

public class ArrayReview {

	public static void main(String[] args) {
		// groccery shopping
		// create an array of String called items
		// add 5 items to the array
		// create an array of double with capacity prices with capacityof 5
		// use scanner to get the prices from the user
		// then print out each items with the prices in below format
		// Your item is :SOMETHING . the price is :6.12

		// get the sum of your grocery shopping and print out
		String[] products = new String[5];
		products[0] = "apple";
		products[1] = "banana";
		products[2] = "pear";
		products[3] = "bread";
		products[4] = "pie";

		double[] prices = new double[5];
		// String[]producs1=new String[]{"apple', "banana", "pear",
		// "bread","pie"};

		Scanner sc = new Scanner(System.in);
		double sum = 0;

		for (int i = 0; i < products.length; i++) {
			System.out.println("Enter price for " + products[i]);
			prices[i] = sc.nextDouble();
			sum += prices[i];
			System.out.println("Your price for " + products[i] + " is " + prices[i]);

		}
		System.out.println("Your balance is:  " + sum);
	}

}
