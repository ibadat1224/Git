package interfaces;

public interface Autonomous {

	public abstract void selfDrive();

	public static final boolean HAS_SENSORS = true;

	public default void accelerate() {
		System.out.println("Default accelerate");
	}

	public static void selfPark() {
		System.out.println("Self parking car");
	}
}
