package superstuff;

public class Phone {
	private String brand;
	protected double size;

	public String getBrand() {
		return brand;
	}

	public double getSize() {
		return size;
	}

	public Phone(String brand, double size) {
		// super();
		this.brand = brand;
		this.size = size;
		System.out.println("2 arg constractor from phone");
	}

	protected void makeCall() {
		System.out.println("makin Call");
	}

}
