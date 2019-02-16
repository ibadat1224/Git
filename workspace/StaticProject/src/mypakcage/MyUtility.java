package mypakcage;

public class MyUtility {

	static double price;

	/// Access modifiers: public,default,protected,private
	/// non access modifiers: static,final,abstract

	public static void printMessage() {
		System.out.println("static message");
	}

	public static void main(String[] args) {

		printMessage();

		System.out.println(price);
		// System.out.println(Character.isDigit('a'));
		// System.out.println(Character.isAlphabetic('a'));
		//
		// System.out.println(Integer.parseInt("123123"));
		// System.out.println(Math.pow(10, 3));
	}

}
