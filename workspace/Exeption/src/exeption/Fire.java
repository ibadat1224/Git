package exeption;

public class Fire {

	public static void main(String[] args) {

		try {
			playWithFire();

		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		// playWithFire();
		playWithWater();
	}

	static void playWithWater() throws RuntimeException {
		System.out.println("play with water");
	}

	public static void playWithFire() throws Exception {
		System.out.println("Do something dangerous with fire");
		throw new Exception();

	}

}
