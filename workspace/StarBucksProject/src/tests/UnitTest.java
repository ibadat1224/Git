package tests;

import beans.Coffee;
import beans.Drink;
import beans.Tea;

public class UnitTest {

	public static void main(String[] args) {

		Coffee coffee = new Coffee("FRESHLY BREWED COFFEE", "tall", 5, 1.75);
		System.out.println(coffee.toString());

		Drink drink = new Drink("Water", "tall", 2, 3.75);
		System.out.println(drink.toString());

		Tea tea = new Tea("PEACH GREEN TEA LEMONADE", "grande", 130, 3.25);
		System.out.println(tea.toString());

	}

}
