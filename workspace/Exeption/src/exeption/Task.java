package exeption;

public class Task {

	public static void main(String[] args) {

		System.out.println("beginning of programm");

		long i = 10;
		byte b = (byte) i;

		try {
			System.out.println(b != i);
		} catch (ClassCastException e) {

			System.out.println("ClassCastExeption ");
		}
		System.out.println("done");
	}

}