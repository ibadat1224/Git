package multidimention;

public class MakingPizza {

	public static void main(String[] args) {
		String[][] pizza = { { "Mushroom", "Black olives", "Green pepper" }, { "Spinach", "Green pepper", "Mushroom" },
				{ "Black olives", "Black olives", "Spinach" }, { "Mushroom", "Mushroom", "Red pepper" },
				{ "Banana pepper", "Spinach", "Red pepper" }, { "Mushroom", "Green pepper", "Green pepper" },
				{ "Spinach", "Green pepper", "Green pepper" }, };

		// System.out.println(Arrays.deepToString(pizza));
		Outer: for (int i = 0; i < pizza.length; i++) {
			System.out.print(" slice " + (i + 1) + " toppings are : ");

			for (int j = 0; j < pizza[i].length; j++) {

				// // throw away slice if you come to black olive topping while
				// biting

				// if (pizza[i][j].equals("Black olives"))
				// break;

				// /// if you see red pepper stop eating the whole pizza

				if (pizza[i][j].equals("Red pepper")) {
					break Outer;
				}
				System.out.print(pizza[i][j] + ",");
			}

			System.out.println();

		}

	}

}
