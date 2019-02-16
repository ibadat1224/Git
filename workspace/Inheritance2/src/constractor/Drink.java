package constractor;

public class Drink {
	static String name;
	int type;
	double size;

	public Drink(String name, int type, double size) {
		super();
		this.name = name;
		this.size = size;
		this.type = type;
		System.out.println("3 arg constractor from Drink");
	}

	public Drink(String name, int type) {
		super();
		this.name = name;
		this.size = size;
		System.out.println("2 arg constractor from Drink");
	}

}
