package exeption;

public class CheckedExxeption {

	public static void main(String[] args) {
		// This is a code that throw Exxeption : type InterruptedExeption

		System.out.println("Starting");
		try {

			for (int i = 1; i < 6; i++) {

				System.out.println("counting " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {

			System.out.println("Exxeption ocuured");

			// e.printStackTrace();
		}
		System.out.println("The end");
	}

}