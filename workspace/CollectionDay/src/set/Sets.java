package set;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// SEt-->HashSet
		Set<String> values = new HashSet<>();
		values.add("School");
		values.add("Car");
		values.add("Cat");
		values.add("Cat");

		// values.clear();

		boolean schoolCheck = values.contains("Car");
		System.out.println("Check: " + schoolCheck);
		System.out.println(values);

		for (String each : values) {
			System.out.println(each);
		}
		System.out.println("Size: " + values.size());
	}

}
