package beans;

import java.util.ArrayList;
import java.util.List;

public class Tea extends Drink {

	public Tea(String name, String size, int calories, double price) {
		super(name, size, calories, price);

	}

	private static List<String> options;
	//
	static {
		options = new ArrayList<>();
		options.add("CINNAMON CHAI LATTE");
		options.add("CLASSISC CHAI TEA LATTE");
		options.add("PEACH GREEN TEA LEMONADE");
		options.add("SHAKEN ICED TEA");
		options.add("VERY BERY HIBISCUS");

	}

	@Override
	public void setName(String name) {
		if (name.contains(name.toUpperCase())) {
			super.setName(name);

		} else {
			System.out.println("TeaNameNotFoundExeption : " + name);
		}
	}

	@Override
	public String toString() {
		return "Tea [name=" + getName() + ", size=" + getSize() + ", calories=" + getCalories() + ", price="
				+ getPrice() + "]";
	}

}
