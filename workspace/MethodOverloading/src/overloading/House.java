package overloading;

public class House {
	private String type;
	private int HouseNumber;
	private double price;

	static String neighbourhood;

	public String getType() {
		return type;
	}

	public int getHouseNumber() {
		return HouseNumber;
	}

	public double getPrice() {
		return price;
	}

	public House() {
		System.out.println(" empty house ");
	}

	public House(int HouseNumber) {
		this.HouseNumber = HouseNumber;
	}

	public House(String type, int HouseNumber, double price) {
		this(HouseNumber);
		this.type = type;
		// this.HouseNumber=HouseNumber;
		this.price = price;

	}
}
