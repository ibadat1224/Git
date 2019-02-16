package finalmethod;

public class StaticBlockOrder {

	public static final String ORDER;
	static int num = 10;

	public StaticBlockOrder() {
		System.out.println("message from constractor");
	}

	static {

		System.out.println("static block 1");
		ORDER = "12";
	}

	static {

		System.out.println("static block 2");
	}

	public static double doubleTheNumber() {
		System.out.println("original number" + num);
		return num + num;
	}

}
