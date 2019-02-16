package arraylist;

import java.util.ArrayList;
import java.util.List;

public class RestrictedArrayList {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("banana");
		fruits.add("apples");
		fruits.add("watermelon");

		for (String fruit : fruits) {
			System.out.println("I like " + fruit);

		}

		ArrayList<Double> prices = new ArrayList<>();
		// Array--> double[] pricesAr;
		prices.add(123.50);
		prices.add(10.99);
		prices.add(12.99);
		double total = 0.0;
		for (Double price : prices) {
			total += price;
			System.out.println(price);

		}

		System.out.println("_____");
		System.out.println("Total:" + total);

		// create a list that can take only characters
		List<Character> chars = new ArrayList<>();
		// WebDriver driver=new ChromeDriver;
		chars.add('!');
		chars.add('@');
		chars.add('%');
		chars.add('$');
		chars.add('&');
		System.out.println(chars);
	}

}
