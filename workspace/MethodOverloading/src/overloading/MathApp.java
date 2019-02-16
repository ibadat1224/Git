package overloading;

public class MathApp {
	// The rule for instance final field is
	// 1 , it needs to get initialized on some lane
	// 2, or it needs to get initialized before constractor finish

	// final int num1=4;
	final int num1;
	int num2 = 12;

	static final int NUM3 = 10;
	static int num4;

	public MathApp(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public static void main(String[] args) {

		MathApp app = new MathApp(5, 6);
		System.out.println(app.num1);
		System.out.println(app.num2);

		// app.num1=123;
		app.num2 = 22;
		System.out.println();
	}

}
