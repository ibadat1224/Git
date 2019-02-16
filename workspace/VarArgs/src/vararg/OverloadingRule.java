package vararg;

public class OverloadingRule {

	public static void main(String[] args) {
		add(10, 12);

	}
	//
	// public static void add(int i, int j) {
	// System.out.println("2 ints");
	// }

	public static void add(long i, int j) {
		System.out.println("1 long, 1 int");
	}

	public static void add(Integer i, Integer j) {
		System.out.println("2 Integers");
	}

	public static void add(Object o1, Object o2) {
		System.out.println("2 Objects");
	}

	public static void add(int... nums) {
		System.out.println("int Var args");
	}

	public static void add(long... nums) {
		System.out.println("long Var args");
	}
}
