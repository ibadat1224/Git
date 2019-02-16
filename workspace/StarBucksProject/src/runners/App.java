package runners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import beans.Coffee;
import beans.Tea;

public class App {
	private static List<Coffee> coffeeList = new ArrayList<>();
	private static List<Tea> teaList = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);

	static {
		coffeeList.add(new Coffee("FRESHLY BREWED COFFEE", "tall", 5, 1.75));
		coffeeList.add(new Coffee("FRESHLY BREWED COFFEE", "grande", 5, 2.10));
		coffeeList.add(new Coffee("FRESHLY BREWED COFFEE", "venti", 5, 2.35));

		coffeeList.add(new Coffee("ICED COFFEE", "tall", 60, 2.25));
		coffeeList.add(new Coffee("ICED COFFEE", "grande", 90, 2.65));
		coffeeList.add(new Coffee("ICED COFFEE", "venti", 130, 2.95));

		coffeeList.add(new Coffee("CAFE AMERICANO", "tall", 10, 2.25));
		coffeeList.add(new Coffee("CAFE AMERICANO", "grande", 15, 2.25));
		coffeeList.add(new Coffee("CAFE AMERICANO", "venti", 20, 2.95));

		coffeeList.add(new Coffee("FLAT WRITE", "tall", 170, 3.75));

		coffeeList.add(new Coffee("CARAMEL MACHIATO", "tall", 180, 3.65));
		coffeeList.add(new Coffee("CARAMEL MACHIATO", "venti", 240, 4.25));
		coffeeList.add(new Coffee("CARAMEL MACHIATO", "grande", 300, 4.65));

		// --- LOAD TEA OBJECTS TO ARRAYLIST
		// teaList.add(new Tea());

	}

	public static void run() {
		System.out.println("===========WELCOME TO STARBUCKS==========");
		System.out.println();
		System.out.println("============OUR COFFEE MENU");

		System.out.println(coffeeList.toString());

		double totalPrice = 0;
		int totalCalories = 0;

		System.out.println("Your Budget: ");
		double cash = scan.nextDouble();

		System.out.println("Your Calories Limit:");
		int caloriesLimit = scan.nextInt();

		while (true) {
			System.out.println("PLEASE SELECT YOUR COFFEE:");
			int selection = scan.nextInt(); // 3

			if (selection <= 0 || selection > coffeeList.size()) {
				System.out.println("Invalid Selection. Please try another option");
				continue;
			}
			Coffee coffee = coffeeList.get(selection - 1);
			System.out.println(coffee.toString());

			if (totalPrice + coffee.getPrice() > cash || totalCalories + coffee.getCalories() > caloriesLimit) {
				if (totalPrice + coffee.getPrice() > cash) {
					System.out.println("CANNOT PROCESS REQUEST. BUDGET IS OVER LIMIT");
				} else {
					System.out.println("CANNOT PROCESS REQUEST. CAL: CALORIES IS OVER LIMIT");

				}

				System.out.println("Total Price: " + totalPrice);
				System.out.println("Total Calories: " + totalCalories);
				break;
			}

			totalPrice += coffee.getPrice();
			totalCalories += coffee.getCalories();

			System.out.println("Total Price: " + totalPrice);
			System.out.println("Total Calories: " + totalCalories);

		}
	}
}
