package trycatch;

public class TryCatchDay2 {

	public static void main(String[] args) {

		System.out.println("begining");
		System.out.println(reverse("abc"));
		reverse(null);
		System.out.println("end");

	}

	static String reverse(String s) {

		try {
			if (s == null) {

				throw new NullPointerException();

			}
			StringBuilder sb = new StringBuilder(s);

			return sb.reverse().toString();

		} catch (NullPointerException e) {
			System.out.println("Null pointer exception is caught");
		}
		return s;

	}

}

//
// System.out.println("begining");
//
//
// try {
// //throw keyword is used to throw an exception programatically
// throw new ArithmeticException();
//
// } catch (NullPointerException e) {
//
// System.out.println("Handling");
// }
// System.out.println("End");
// }
//
// }
