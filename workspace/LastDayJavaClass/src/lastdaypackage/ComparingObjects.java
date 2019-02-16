package lastdaypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingObjects {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Adam", "Dave", "Bob", "Adam", "Bob");

		Collections.sort(names);
		System.out.println(names);
		// Map<String, Integer> freMap = new HashMap<>();

		System.out.println(new Person("Adam", 22));

		List<Person> people = new ArrayList<>();

		people.add(new Person("Adam", 22));
		people.add(new Person("Dave", 34));
		people.add(new Person("Bod", 45));
		people.add(new Person("Bod", 20));
		people.add(new Person("Zaim", 32));
		Collections.sort(people);
		System.out.println(people);

		String s1 = "A";
		String s2 = "B";

		String s3 = "C";

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));

	}

}
