package array;

public class SearchItemInArray {

	public static void main(String[] args) {
		String[] products = new String[] { "apple", "banana", "pear", "bread", "pie" };

		for (int i = 0; i < products.length; i++) {
			if (products[i].contains("p") == true) {
				System.out.println("item " + products[i] + " Found at Location :" + i);

			}

		}
	}
}
