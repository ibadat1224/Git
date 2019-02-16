package trycatch;

public class TryCatch3 {

	public static void main(String[] args) throws Exception {

		System.out.println("begining");

		try {
			// throw new RuntimeException();
			System.out.println("trying");
			throw new IndexOutOfBoundsException();

		} catch (Throwable e) {

			System.out.println("catch block");
			throw new Exception();

		} finally {

			System.out.println("finally");

			// swallowing exception
			throw new NullPointerException();
		}

	}

}
