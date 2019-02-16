package superstuff;

public class Truck {

	public Truck() {
		// super(); first line of constractor is always super();

		System.out.println("bbb");

	}

	public Truck(String name) {
		this();
		System.out.println("1 arg");
	}

	public Truck(String name, int year) {
		this();
		System.out.println("2 arg");
	}

}
