package maxscanmer;

public class Person {

	// Attribute
	// name, age, gender
	// Java
	// field
	String name;
	int age;
	char gender;

	// Behavior
	// eat,read, run, sleep,sayHello
	public void eat() {

		if (gender == 'M')
			System.out.println(name + " is reading and he is " + age + " years old");

		else if (gender == 'F')
			System.out.println(name + "is reading and she is " + age + "years old");
		else
			System.out.println(name + "is reading");
	}

	public void goHome(String destination, int distance) {
		System.out.println(" going to " + destination + "distance is  " + distance);
	}

	public double addNumbers(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}

	public void sayHelloTo(String target) {
		System.out.println("Hello , " + target);

	}

	public int run() {
		System.out.println("run 1 mile");
		return 10;
	}

	public char getInitial() {
		// char c =name.charAt(0);
		// return c;
		return name.charAt(0);
	}

	public int getBirthYear() {
		return 2018 - age;
	}

}

// public void read() {
// System.out.println(name + " is reading");
// }
//
// public void run() {
// System.out.println(name + " is running");
// }
//
// public void sleep() {
// System.out.println(name + " is sleeping");
// }
// }
