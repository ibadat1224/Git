package overloading;

public class Overloading {

	public static void main(String[] args) {
		doSomething(15);
		// doSomething(new Long(12345));

	}

	static void doSomething(long l) {
		System.out.println("primitive long");
	}

	static void doSomething(double l) {
		System.out.println("primitive double");
	}

	static void doSomething(Integer inte) {
		System.out.println("integer type");
	}
	// static void doSomething(Long l) {
	// System.out.println("Wrapper long");
	// }
	//

}
