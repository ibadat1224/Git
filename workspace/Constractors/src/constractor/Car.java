package constractor;

public class Car {
	private String make;
	private String model;
	private String color;
	private int year;
	private double price;

	public Car() {
		this("Unknown", "ToBeDecided", 2020);
		System.out.println("NO arg constractor");
	}



		System.out.println("3 arg constarctor");
	

	public Car(String make, String model, int year, String color, double price) {
		// this(make,model,year);
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		System.out.println("5 arg constractor");
	}

	public void display() {
		System.out.println(make + " " + model + " " + year + " " + color + " " + price);
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
