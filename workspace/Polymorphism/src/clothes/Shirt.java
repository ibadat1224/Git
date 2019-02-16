package clothes;

public class Shirt extends ClothingItem {

	char size;

	public Shirt() {
		super("Unknown", 0);

	}

	public Shirt(String name, double price, char size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public String toString() {
		return "Shirt [name=" + name + ", price=" + price + "]";
	}

	public void printShirtInfo() {
		System.out.println("Printing shirt info");

	}

	public static void main(String[] args) {

		Shirt s = new Shirt("Polo", 100, 'm');
		ClothingItem c1 = s;

		ClothingItem c2 = new Shirt("Tommy", 200, 'L');

		ClothingItem c3 = new ClothingItem("General", 105);
		System.out.println(c2.toString());
		System.out.println(c3.toString());

	}
}
