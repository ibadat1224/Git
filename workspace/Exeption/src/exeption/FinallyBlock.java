package exeption;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("beginning of programm");

		int i = 8;
		int j = 0;

		try {
			System.exit(0);
			System.out.println(i / j);

			// System.exit(0);
		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());
			System.out.println("Exxeption caught");

			// Finally block is a block that always run wether you caught the
			// exeption or not unless Sytem.exit(0); is called before
		} finally {
			System.out.println("Running finally clean up");
		}
		System.out.println("End of devide");

	}
}