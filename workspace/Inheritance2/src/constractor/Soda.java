package constractor;

public class Soda extends Drink {

	static int sodaType;

	public Soda(String name, int type, double size) {
		super(name, type, size);
		this.name = name;
		this.type = type;
		this.size = size;
	}

	public Soda(String name, int type) {
		super(name, type);
		this.name = name;
		this.type = type;
		System.out.println("2 arg constractor from Soda");
	}

	public static void main(String[] args) {
		Soda s = new Soda(name, sodaType);

	}
}
