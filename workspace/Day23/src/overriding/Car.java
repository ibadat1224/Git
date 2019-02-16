package overriding;

public class Car extends Vehicle {
	public Car() {
		System.out.println("Car constractor...");
	}

	public Car(String make) {
		setMake(make);
		System.out.println("Car constractor...");
	}

	public void move() {
		System.out.println(getMake() + ":Car is moving...");
	}

	private void stop() {
		System.out.println("Car is stopping...");
	}
}
