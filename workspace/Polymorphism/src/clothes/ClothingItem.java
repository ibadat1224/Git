package clothes;

public class ClothingItem {

	String name;
	double price;

	public ClothingItem(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ClothingItem [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {

		// ClothingItem c1= new ClothingItem("general",100);

		// Object o1= c1;

		Object o = new ClothingItem("clothing", 300);
		System.out.println(o.toString());
	}
}
