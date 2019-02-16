package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class Person {

	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.name.equals(p.name) && this.age == p.age;

	}

	@Override
	public int hashCode() {
		return 100;

	}

	public static void main(String[] args) {

		Set<Person> personSet = new HashSet<>();
		personSet.add(new Person("Adam", 26));

		personSet.add(new Person("Adam", 26));

		personSet.add(new Person("Adam", 26));
		personSet.add(new Person("Adam", 26));

		System.out.println(personSet.size());
	}

}
