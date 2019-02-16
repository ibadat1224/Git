package set;

import java.util.HashSet;
import java.util.Set;

public class Task {

	static Set<String> names = new HashSet<>();

	public static void main(String[] args) {

		// Set<String> names = new HashSet<>();

		addValue("BMW");
		addValue("Mers");
		addValue("Lexus");
		addValue("Tayota");
		addValue("Lexus");
	}

	public static void addValue(String name) {

		if (names.contains(name)) {
			System.out.println("Name: " + name + " Already exist in the set");
			throw new RuntimeException();
		}
		System.out.println("Adding the name: " + name);
		names.add(name);
	}

	public static String getName(String name) {
		for (String n : names) {
			if (n.equals(name)) {
				return n;
			}

		}
		return name;
	}

}
