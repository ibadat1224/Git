package polymorphism;

public class ReferenceTypeParameter {

	public static void main(String[] args) {
		printStuff(new String("abc"));

		Object o = new String("efg");
		printStuff(o);
		printStuff(new Integer(4));

		long l = 10;

		printNumber();
	}

	static void printNumber() {

	}

	static void printStuff(String s) {
		System.out.println("String method " + s.charAt(0));
	}

	static void printStuff(Object o) {
		System.out.println("Object method");

	}
}
