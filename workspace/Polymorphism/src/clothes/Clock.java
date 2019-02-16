package clothes;

public class Clock implements TimeTeller {

	static boolean CAN_TELL_TIME = false;

	@Override
	public void tellTime() {
		System.out.println("Telling time");

	}

	public void runClock() {
		System.out.println("running");
	}

	public static void main(String[] args) {

		// Clock c = new Clock();

		TimeTeller d = new Clock();
		System.out.println(CAN_TELL_TIME);
		System.out.println(TimeTeller.CAN_TELL_TIME);
		d.tellTime();
		// d.runClock();
	}

}

interface TimeTeller {

	boolean CAN_TELL_TIME = true;

	default void tellTime() {
		System.out.println("default");
	}

}
