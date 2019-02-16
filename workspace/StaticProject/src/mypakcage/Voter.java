package mypakcage;

public class Voter {

	static int count;
	private String name;
	private int age;
	static int countOfGetNameCall;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		countOfGetNameCall++;

		this.age = age;

	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Voter(String name, int age) {

		this.name = name;
		this.age = age;
	}
}