package beans;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends Drink {

	public Coffee(String name, String size, int calories, double price) {
		super(name, size, calories, price);

	}

	private static List<String> options;
	//
	static {
		options = new ArrayList<>();
		options.add("FRESHLY BREWED COFFEE");
		options.add("ICED COFFEE");
		options.add("CAFFE AMERICANO");
		options.add("FLAT WHITE");
		options.add("CAFFE LATTEE");
		options.add("CARAMEL MACHIATO");
		options.add("WHITE CHOCALATE MOCHA");
		options.add("CAFFE MOCHA");

	}

	@Override
	public void setName(String name) {
		if (name.contains(name.toUpperCase())) {
			super.setName(name);

		} else {
			System.out.println("CoffeeNameNotFoundExeption : " + name);
		}

	}

	@Override
	public String toString() {
		return "\nCoffee [name=" + getName() + ", size=" + getSize() + ", calories=" + getCalories() + ", price="
				+ getPrice() + "]";
	}
}
