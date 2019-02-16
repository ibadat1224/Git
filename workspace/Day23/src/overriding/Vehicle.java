package overriding;

public class Vehicle {
	private Vehicle() {
		System.out.println("Vehicle constractor..");
	}

	private String make;

	public void move() {
		System.out.println(make + ":Vehicle is moving...");
	}

	public void addGas(int gallons) {
		System.out.println("adding" + gallons + "gallons");
	}

	public void addGas(String gallons) {
		System.out.println("adding" + gallons + "gallons");
	}

	public String getMake() {
		return make;

	}

	public void setMake(String make) {
		this.make = make;
	}
}
