package wrapper;

public class Truck {

	private String name;
	private int year;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Truck(String name) {
		this.name = name;
	}

	public Truck(String name, int year, double price) {
		this.name = name;
		this.year = year;
		this.price = price;
	}

	public String toString() {
		return "Truck [name=" + name + ",year=" + year + ",price=" + price + "]";
	}

	public void doMonsterThings() {

	}

}
