package arraylist;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList shoppingList = new ArrayList();
		shoppingList.add("Bread");
		shoppingList.add("Water");
		shoppingList.add("Salt");
		shoppingList.add("Flowers");
		shoppingList.add("Wooden spoon");
		shoppingList.add("Milk");
		shoppingList.add(1000);

		System.out.println("Total items: " + shoppingList.size());
		System.out.println(shoppingList);
		System.out.println(shoppingList.get(0) + " is in the cart");
		shoppingList.remove("Bread");

		System.out.println(shoppingList.get(2) + " are in the cart");
		shoppingList.remove(2);
		System.out.println("Still in shopping list: " + shoppingList);

		for (Object str : shoppingList) {
			System.out.println(str);
		}

		for (int i = 0; i < shoppingList.size(); i++) {
			System.out.println(shoppingList.get(i));
		}

	}

}
