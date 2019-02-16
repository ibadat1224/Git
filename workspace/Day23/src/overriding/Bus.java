package overriding;

public class Bus extends Vehicle {
	private Bus() {

	public void move() {
		System.out.println(getMake() + ":Bus is moving...");
	}

	@Override
	public String toString() {
		return "hello";
	}
}
