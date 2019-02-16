package codeTraining;

public class Dog {

	public static void main(String[] args) {

	}

	public String name;
	public int size;

	public void bark() {
		if (size > 20) {
			System.out.println(name + "woof woof woof");
		} else if (size > 10) {
			System.out.println(name + "ruff ruff");
		} else {
			System.out.println(name + "No barking today");
		}
	}

	public int play(String location) {
		if (location.equalsIgnoreCase("park")) {
			return 1;
		} else {
			return 0;
		}
	}

}
