package boat;

public class SailBoat extends Boat {

	double width;

	public void sail() {
		System.out.println("sailing...");
	}

	@Override
	public void afloat() {
		System.out.println("afloat sail boat");
	}

	@Override
	void move() {
		System.out.println("move sail boat");

	}

}
