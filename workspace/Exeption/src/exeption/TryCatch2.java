package exeption;

public class TryCatch2 {

	public static void main(String[] args) {
		String s = null;
		try {
			s.concat("123345");

		} catch (NullPointerException e) {
			System.out.println("null pointer exeption");

			try {
				System.out.println(6 / 0);
			} catch (ArithmeticException e2) {
				System.out.println("Exeption inside null pointer exeption catch block");
			}

		} catch (ArithmeticException e) {

		}
		System.out.println("abc");
	}

}