package boat;

public class RowBoat extends Boat {

	int paddleCount;

	public void row() {
		System.out.println("rowing a boat");
	}

	@Override
	public void afloat() {
		System.out.println("Row Boat Float");

	}

	@Override
	public void move() {
		System.out.println("Row Boat moving");

	}
}
